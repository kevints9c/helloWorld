package jdbcProject;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;
import com.itcast.utils.JDBCUtils;

/**
 * git测试++++++
 * @author ic
 *
 */
public class jdbcStudy {

	private static final Logger LOGGER = LoggerFactory.getLogger(jdbcStudy.class);
	static final String table_name = "student";
	public static void main(String[] args) throws IOException, ClassNotFoundException {

//		methodJdbc1();
//		methodJdbc2();
//		System.out.println(methodJdbc3());
//		methodJdbc4();
//		LOGGER.info("11111111111111111");
		String sql = "update student set age = ? "+" where name = ? ";
//		String sql = "insert into student values('祝海鹏',33,'深圳',null)";
		JDBCUtils.updateDB(sql,18,"祝海鹏");
		
		
	}


	public static void methodJdbc4() throws IOException, FileNotFoundException {
		Connection conn=null;
		Statement st=null;
		ResultSet rs = null;
		OutputStream os = null;
		String sql = " select * from "+table_name;
		try {
			conn = JDBCUtils.getConn();
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			os = new FileOutputStream("tm_config.txt");
			String blank ="";
			while(rs.next()) {
				int id = rs.getInt("id");
				String _key = rs.getString("_key");
				String value = rs.getString("value");
				String entity_class_name = rs.getString("entity_class_name");
				blank = blank+" id= "+id+"  _key="+_key+"  value="+value+"   entity_class_name="+entity_class_name+"\n";
			}
			os.write(blank.getBytes());
			os.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			JDBCUtils.release(conn, st, rs);
		}
	}


	public static List<JSONObject> methodJdbc3() throws IOException {
		List<JSONObject> list = new ArrayList<>();
//		list = null;
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rs = null;
		String sql = "select * from "+ table_name +" where name= ?";
		try {
			conn = JDBCUtils.getConn();
			pst = conn.prepareStatement(sql);
			pst.setString(1, "王五1");
			rs = pst.executeQuery();
			boolean flag = false;
			 while(rs.next()) {
				 JSONObject jsonObject = new JSONObject();
				 for (int i = 1; i < rs.getMetaData().getColumnCount(); i++) {
					 String key = rs.getMetaData().getColumnName(i);
					jsonObject.put(key, rs.getObject(i));
				}
				 flag = true;
				 list.add(jsonObject);
			 }
			 if(!flag) {
				 LOGGER.info("没有查到记录");
			 }
//			System.out.println(list);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			JDBCUtils.release(conn, pst, rs);
		}
		return list;
	}
	

	public static void methodJdbc2() throws IOException {
		String[] fieldArray = null; 
 		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		String sql = "select * from " +table_name;
		try {
			conn = JDBCUtils.getConn();
			
			st = conn.createStatement();
			
			rs = st.executeQuery(sql);
			
			ResultSetMetaData rsmd = rs.getMetaData();
			fieldArray = new String[rsmd.getColumnCount()];
			for (int i = 1; i < rsmd.getColumnCount(); i++) {
				String fieldName = rsmd.getColumnName(i);
				fieldArray[i -1] =fieldName;
			}
			
			System.out.println(Arrays.toString(fieldArray));
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			JDBCUtils.release(conn, st, rs);
				
		}
	}

	public static void methodJdbc1() {
		Connection conn = null;
		Statement st = null;
		ResultSet reslut = null;
		try {
			//1.注册驱动
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			
			//2.建立连接
			 conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
			//3.创建statement,数据库必须要这个对象
			 st = conn.createStatement();
			String sql = "select * from student";
			 reslut = st.executeQuery(sql);
			while(reslut.next()) {
				String name = reslut.getString("name");
				int age = reslut.getInt("age");
				int id = reslut.getInt("id");
				String address = reslut.getString("address");
				System.out.println("id="+id+"  name="+name+ "   age="+age + "  address="+address);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			JDBCUtils.release(conn, st, reslut);
			
		}
	}

}
