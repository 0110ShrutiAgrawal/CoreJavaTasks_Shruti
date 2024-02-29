package com.edu.spring;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class MapSetterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r=new ClassPathResource("utils.xml"); //loads xml file into ioc container 

        BeanFactory factory=new XmlBeanFactory(r);  

        MapSetter s1=(MapSetter)factory.getBean("mapsetter");
        System.out.println(s1.getLs());


	}

}
