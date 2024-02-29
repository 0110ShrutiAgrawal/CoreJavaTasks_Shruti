package com.edu.spring;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(r);

        Addition addition = (Addition) factory.getBean("addition");
        System.out.println("Addition result calculated is: " + addition.doAddition());

        Subtraction subtraction = (Subtraction) factory.getBean("subtraction");
        System.out.println("Subtraction result calculated is: " + subtraction.doSubtraction());

	}

}
