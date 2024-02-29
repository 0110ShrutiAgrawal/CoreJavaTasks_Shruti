package com.edu.setter;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.edu.spring.Addition;
import com.edu.spring.Subtraction;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		Customer s = (Customer) factory.getBean("customer");
		System.out.println(s.getCustName());
		System.out.println(s.getCustomerId());

	}

}
