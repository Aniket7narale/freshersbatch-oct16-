package Java11_Assignments;

interface SimpleInterest{
    public double Si(int principal,int time,double rate);
}

public class Assignment8Q1 {
    public static void main(String[] args) {

        SimpleInterest simpleInterest = ((principal, time, rate) -> (principal*time*rate)/100 );

        System.out.println("Simple Interest\nPrincipal = 10000\nRate of interest = 10\nTime = 6");
        System.out.println("Simple interest = "+simpleInterest.Si(10000,6,10));

        //not required
        double amount = 10000+simpleInterest.Si(10000,6,10);
        System.out.println("Total Amount = "+amount);
    }
}