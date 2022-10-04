import java.util.Scanner;

public class electioneligibility {
    public static void main(String args[]){
        int age,age1;
        System.out.println("Enter your age=");
        Scanner elect = new Scanner(System.in);
        age=elect.nextInt();
        if(age>18){
            System.out.println("You are eligible to vote!");
        } else if (age==18) {
            System.out.println("you can vote next year!");
        } else if (age<0) {
            System.out.println("Invalid age!");
        } else {
            System.out.println("you are not eligible to vote!");
            age1=18-age;
            System.out.println("you can vote after\t"    +age1   +"\tyears!" );  //years to become 18+
        }
    }
}
