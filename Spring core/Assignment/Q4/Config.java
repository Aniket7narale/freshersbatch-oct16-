package AssignmentQ4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "AssignmentQ4")
public class Config {
	
    @Bean
    public BankAccount getBankAccount(){
        BankAccount bankAccount1 = new BankAccount(5498,"Sanket Bolamwar","Saving",100000);
        return bankAccount1;
    }

    @Bean
    public BankAccount getBankAccount1(){
        BankAccount bankAccount1 = new BankAccount(5496,"Prajwali Sukhadeve","Current",80000);
        return bankAccount1;
    }

}