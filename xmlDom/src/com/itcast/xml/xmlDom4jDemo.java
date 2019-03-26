package com.itcast.xml;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class xmlDom4jDemo {

	public static void main(String[] args) {
		
		try {
			//创建SAX读取对象
			SAXReader reader = new SAXReader();
			//指定解析的XML文件
			Document document = reader.read(new File("src/xml/desElement.xml"));
			System.out.println(document.getName());
			//获得元素
			Element rootElement = document.getRootElement();
			//获得子元素下的子元素
			System.out.println(rootElement.element("stu").element("age").getName());
			System.out.println(rootElement.element("stu").element("age").getStringValue());
			System.out.println(rootElement.element("stu").element("age").getText());
			
			//获得根元素下的所有子元素
			List<Element> elements = rootElement.elements();
			for (Element element : elements) {
				String name = element.element("name").getText();
				String age = element.element("age").getText();
				System.out.println("name="+name +"  age="+age);
			}
			
		} catch (DocumentException e) {
			
			e.printStackTrace();
		}
	}

}
