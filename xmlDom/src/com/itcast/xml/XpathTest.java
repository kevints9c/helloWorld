package com.itcast.xml;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * @author ic
 *
 */
public class XpathTest {

	public static void main(String[] args) {

		/*try {
			SAXReader reader = new SAXReader();
			Document document = reader.read(new File("src/xml/desElement.xml"));
			Element rootElement = document.getRootElement();
			Element nameElement = (Element) rootElement.selectSingleNode("//name");
//			System.out.println(nameElement.getText());
			List<Element> list = rootElement.selectNodes("//name");
			for (Element element : list) {
				System.out.println(element.getText());
			}
		} catch (DocumentException e) {
			
			e.printStackTrace();
		}*/
		
		try {
			SAXReader reader = new SAXReader();
			Document document = reader.read(new File("src/xml/desElement.xml"));
			
			Element rootElement = document.getRootElement();
			Element name=(Element) rootElement.selectSingleNode("//name");
			System.out.println(name.getText());
			
			List<Element> names = rootElement.selectNodes("//name");
			for (Element element : names) {
				
				System.out.println(element.getText());
			}
			
		} catch (DocumentException e) {
			
			e.printStackTrace();
		}
		
		
	}


	
}
//asdwqd++!Wd1
//dasdasdd

