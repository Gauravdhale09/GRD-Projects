import java.util.Scanner;

public class calculator {
    public static void main(String args[]){
        int a,b,op;
        System.out.println("Enter which type of operation you want to do?");
        System.out.println("press key for:-");
        System.out.println("addition=1");
        System.out.println("subtraction=2");
        System.out.println("multiplication=3");
        System.out.println("division=4");
        Scanner calci = new Scanner(System.in);
        System.out.println("Enter key number=\t");
        op=calci.nextInt();
        System.out.println("pressed key="+op);
        if (op==1){
            System.out.println("you choosed addition operation");
        } else if (op==2) {
            System.out.println("you choosed subtraction operation");
        } else if (op==3) {
            System.out.println("you choosed multiplication operation");
        } else if (op==4) {
            System.out.println("you choosed division operation");
        }
        else {
            System.out.println("Invalid operation");
        }
        System.out.println("Enter values of a and b");
        a=calci.nextInt();
        b=calci.nextInt();
        switch (op){
            case 1:
                System.out.println("addition=" + (a+b));
            break;
            case 2:
                if (a>b){
                    System.out.println("addition=" + (a-b));
                }
                else {
                    System.out.println("addition=" + (b-a));
                }
            break;
            case 3:
                System.out.println("product=" + (a*b));
            break;
            case 4:
                if (a>b){
                    System.out.println("addition=" + (a/b));
                }
                else {
                    System.out.println("addition=" + (b/a));
                }
            break;
            default:
                System.out.println("Invalid operation!");
            break;
        }

    }
}
