package com.nareshit;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
public static void main(String[] args) {
	Resource resource=new ClassPathResource("applicationcontext.xml");
	BeanFactory factroy=new XmlBeanFactory(resource);
	Question question=(Question)factroy.getBean("questions");
question.answerInfo();
}
}
