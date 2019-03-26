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
			//����SAX��ȡ����
			SAXReader reader = new SAXReader();
			//ָ��������XML�ļ�
			Document document = reader.read(new File("src/xml/desElement.xml"));
			System.out.println(document.getName());
			//���Ԫ��
			Element rootElement = document.getRootElement();
			//�����Ԫ���µ���Ԫ��
			System.out.println(rootElement.element("stu").element("age").getName());
			System.out.println(rootElement.element("stu").element("age").getStringValue());
			System.out.println(rootElement.element("stu").element("age").getText());
			
			//��ø�Ԫ���µ�������Ԫ��
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
