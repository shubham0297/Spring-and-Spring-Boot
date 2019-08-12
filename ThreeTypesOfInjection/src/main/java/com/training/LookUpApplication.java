package com.training;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LookUpApplication {
 
	public static void main(String[] args) {
		
		Logger log = Logger.getAnonymousLogger();
		
		// IOC container is Instantiated by passing conf. meta data
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(LookUpConfig.class);
		
		DiscountService service = ctx.getBean(DiscountService.class);
		DiscountNotification notifyBean = service.getDiscount("tV");
		log.info(Double.toString(notifyBean.showDiscount()));
	}
}
