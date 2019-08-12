package com.training;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger log=Logger.getAnonymousLogger();
		//IOC container is Instantiated by Passing configuration meta data
		GenericApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		
		OrderBook book=ctx.getBean(OrderBook.class);
		book.getProduct().forEach(System.out::println);
		log.info(book.toString());
		ctx.close();						//GRACEFUL SHUTDOWN  If we don't write this...destroy method will not be called (written in OrderBook.java)
		log.info("Bye Bye");				// so before closing the application ...it implements the destroy method and then calls bye bye
	}					

}
