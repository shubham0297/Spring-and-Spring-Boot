package com.training;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class LookUpConfig {

	@Bean
	@Scope(scopeName=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public DiscountNotification notification() {
		return new DiscountNotification();
	}
	
	@Bean
	@Scope(scopeName=ConfigurableBeanFactory.SCOPE_SINGLETON)
	public DiscountService service() {
		return new DiscountService() {
			
			@Override
			public DiscountNotification getDiscount(String itemName) {
				// TODO Auto-generated method stub
				return new DiscountNotification(itemName);
			}
		};
	}

}
