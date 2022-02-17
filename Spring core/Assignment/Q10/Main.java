package AssignmentQ10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
    private static ApplicationContext context;

	public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("AssignmentQ10.xml");
        Test example1 = context.getBean("example1", Test.class);
        System.out.println(example1);
    }
}

