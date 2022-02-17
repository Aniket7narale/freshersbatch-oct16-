package AssignmentQ1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("AssignmentQ1.xml");
		
		System.out.println("****************Using Setter Injection*******************");
		Address address = context.getBean("Address", Address.class);
        System.out.println("Address Class Bean");
        System.out.println(address);

        Customer customer = context.getBean("Customer", Customer.class);
        System.out.println("\n\nCustomer Class Bean ");
        System.out.println(customer);

        
        System.out.println("****************Using Construction Injection*******************");
        
        Address Address1 = context.getBean("Address1", Address.class);
        System.out.println("Address Class Bean");
        System.out.println(Address1);

        
        Customer Customer1 = context.getBean("Customer1", Customer.class);
        System.out.println("Customer Class Bean ");
        System.out.println(Customer1);

     
	}
}

