import java.util.Scanner;
class sici
{
    public static void main (String argu[ ])
{
    double principle, rate,simple,compound, time;
    Scanner sc=new Scanner (System. in);
    System.out.println("Enter the amount:");
    principle=sc.nextDouble();
    System. out. println("Enter the No.of years:");
    time=sc.nextDouble();
    System. out. println("Enter the Rate of  interest");
    rate=sc.nextDouble();
    simple=(principle * time * rate)/100;
    compound=principle* Math.pow(1.0+rate/100.0,time) - principle;
    System.out.println("Simple Interest="+simple);
    System.out. println("Compound Interest="+compound);
   }
}