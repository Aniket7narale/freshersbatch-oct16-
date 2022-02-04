import java.util.Scanner;
public class Login {
    static String Userid = "Aniket";
    static String Password = "password";
    static boolean Login(String user, String pass) {
        if (Userid.equals(user) && Password.equals(pass)){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String []args){
        try(Scanner sc = new Scanner(System.in)){
            String user, pass;
            int attempt = 0;

            do {
                System.out.println("Enter Userid:");
                user = sc.next();
                System.out.println("enter password:");
                pass=sc.next();
                boolean ans = Login(user,pass);
                if (ans == true){
                    System.out.println("Welcome Aniket");
                    break;

                }else if (ans == false && attempt<3){
                   System.out.println("you have entered wrong credential, please enter the right credential.\n");
                   attempt+=1; 
                }

            }while(attempt!=3);
            if (attempt>=3){
                System.out.println("\nyou have entered wrong 3 times\n");
                
            }
        }
    }
}
