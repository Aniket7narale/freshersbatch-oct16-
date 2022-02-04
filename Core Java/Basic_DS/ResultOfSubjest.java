import java.util.Scanner;

public class ResultOfSubjest {
    static String result(double sub1, double sub2, double sub3){
        if (sub1>=60.0 && sub2>=60.0 && sub3>=60.0){
            return "Passed";
        }else if((sub1>=60.0 && sub2>=60.0 && sub3<60.0)||
                (sub1>=60.0 && sub2<60.0 && sub3>=60.0)||
                (sub1<60.0 && sub2>=60.0 && sub3>=60.0)){
                    return "Promoted";
        }else{
            return "failed";
        }
    }
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
            double sub1= sc.nextDouble();
            double sub2= sc.nextDouble();
            double sub3= sc.nextDouble();

            System.out.println(result(sub1, sub2, sub3));
        }
    }
    
}
