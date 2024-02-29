package com.edu.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ConstTest {

	public static void main(String[] args) {
		Resource r = new ClassPathResource("utils.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		ConstListExample s = (ConstListExample) factory.getBean("ls");
		s.display();
	}

}
