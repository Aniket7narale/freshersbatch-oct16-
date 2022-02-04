import java.util.Scanner;

public class Tax {
    static double CalculateTax(int ctc, double amount){
        if (ctc<=180000){
            amount=ctc;
        
        }else if (ctc>180000 && ctc <=300000){
            amount= ctc-ctc*0.1;

        }else if ( ctc>300000 && ctc <=500000){
            amount= ctc-ctc*0.2;

        }else{
            amount=ctc-ctc*0.3;
        }
        return amount;
    }
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)){
            int income = sc.nextInt();
            double amount = sc.nextDouble();
            double tax_amount = CalculateTax(income,amount);
            System.out.println("Taxable amount:"+tax_amount);
        }
    }
    
}
