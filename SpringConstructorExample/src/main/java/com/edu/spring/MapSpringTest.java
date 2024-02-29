package com.edu.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MapSpringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r = new ClassPathResource("utils.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		MapSpring s = (MapSpring) factory.getBean("mp");
		s.display();

	}

}
