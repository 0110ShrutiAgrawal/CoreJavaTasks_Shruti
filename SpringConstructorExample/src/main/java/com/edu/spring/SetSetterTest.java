package com.edu.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SetSetterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r = new ClassPathResource("utils.xml"); // loads xml file into
															// ioc container

		BeanFactory factory = new XmlBeanFactory(r);

		SetSetter s1 = (SetSetter) factory.getBean("setsetter");
		System.out.println(s1.getLs());

	}

}
