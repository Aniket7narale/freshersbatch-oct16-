package Java11_Assignments;

import java.util.Scanner;

public class Assignment8Q5 {
    public static String ordinal(int i) {
        String[] suffixes = new String[]{"th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th"};
        switch (i % 100) {
            case 11:
            case 12:
            case 13:
                return i + "th";
            default:
                return i + suffixes[i % 10];

        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int count = 0;
            int price,total = 0;
            int choice;

            do{
                System.out.println("1) INSERT NEW PRICE");
                System.out.println("2) VIEW PURCHASE TOTAL");
                System.out.println("3) EXIT");
                System.out.print(" \n ENTER YOUR CHOICE: ");
                choice = sc.nextInt();
                switch (choice){
                    case 1:
                        String s = "Yes";
                        do{
                            System.out.print("Insert "+ordinal(count+1)+" price: ");
                            price = sc.nextInt();
                            total += price;
                            System.out.println("Price has been saved to the file");
                            System.out.print("Do you want to enter price for more items? (Yes/No): ");
                            s = sc.next();
                            count++;
                            System.out.println();
                        }while(s.equalsIgnoreCase("Yes"));
                        break;
                    case 2:
                        System.out.println("Total Price of all items is: "+total);
                        break;
                    case 3: System.exit(0);
                    default : System.out.println("PLEASE ENTER THE CORRECT CHOICE!");
                }
            }while(choice!=3);
        }

    }
}
