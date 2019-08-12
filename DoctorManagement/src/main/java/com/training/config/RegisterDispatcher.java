package com.training.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class RegisterDispatcher extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {				// Classes related to ApplicationContext ie Core Java related thing
		// TODO Auto-generated method stub
		return null;											// Since in this project we don't have any core class so returning null
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {			// Classes related to Servlet mapping or MVC files
		// TODO Auto-generated method stub
		return new Class[] {WebConfig.class};			
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};							// tells that any request starting with / will be handled by dispatcher servlet and every request has / in beginning. So all req. go to DS	
	}														// So dispatcher now goes to the handler mapping in the controller file and sees the path and calls the method

	
}
