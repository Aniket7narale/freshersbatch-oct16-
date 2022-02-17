package AssignmentQ9;

import org.springframework.beans.BeansException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("Testbeans.xml")) {
			context.registerShutdownHook();

			Test beanLifeCycle=(Test) context.getBean("LifeCycle");
			beanLifeCycle.display();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
