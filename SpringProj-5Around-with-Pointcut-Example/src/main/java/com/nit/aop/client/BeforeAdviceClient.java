package com.nit.aop.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.aop.services.CustomerService;

public class BeforeAdviceClient {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/nit/aop/cfgs/myBean.xml");
		CustomerService service=context.getBean("customerServiceProxy",CustomerService.class);
		service.printName();
		service.printURL();
		try{
		service.printException();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		

	}

}
