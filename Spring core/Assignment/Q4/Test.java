package AssignmentQ4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import AssignmentQ4.Config;

public class Test {

    private static ApplicationContext context;

	public static void main(String[] args) {

		context = new AnnotationConfigApplicationContext(Config.class);

        BankAccountController controller = (BankAccountController) context.getBean("controller");

        System.out.println(controller.getBalance(5498));
        System.out.println(controller.deposit(5498,5000));
        System.out.println("**************************************************");

        System.out.println(controller.withdraw(5498,10000));
        System.out.println(controller.getBalance(5498));
        System.out.println("**************************************************");

        System.out.println(controller.fundTransfer(5498,5496,10000));
        System.out.println(controller.getBalance(5498));
        System.out.println(controller.getBalance(5496));


    }

}
