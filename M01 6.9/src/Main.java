//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {

    //method for feet to meters
    public static double footToMeter(double foot){
        return foot * .305;
    }

    //method for meters to feet
    public static double meterTofoot(double meter){
        return meter * 3.279;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //ask user how many feet they want to convert to meters
        System.out.println("Enter how many feet you want to convert to meters: ");
        int feet = sc.nextInt();

        //calls on method
        double meter = footToMeter(feet);

        //prints result
        System.out.println(feet + " feet is " + meter + " meters");

    }
}