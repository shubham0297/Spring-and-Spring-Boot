// To set the dependencies

package com.training;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		// Left side is a interface   ---->  RHS is class   RHS extends LHS so we can write like this
		
		//Doctor ram = (Doctor)ctx.getBean("abcd");		// Calling by id
		//Doctor ram = ctx.getBean(Doctor.class);		// Calling by class  if only one method of that class else RTE
		
		Doctor ram = (Doctor)ctx.getBean("abcd");		// Calling by class
		System.out.println(ram);
		
		Doctor shyam = (Doctor)ctx.getBean("surgeon");
		System.out.println(shyam);
		
		/* TO check whether beans are singleton or not, create another bean from surgeon and check....both will have same hashcode
		eg. Doctor shyamlal = (Doctor)ctx.getBean("surgeon");
		at a time only one will be created
		*/
		
		Customer shubham = ctx.getBean(Customer.class);
		System.out.println(shubham);
		
		ctx.close();

	}

}
