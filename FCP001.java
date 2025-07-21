import java.util.Scanner;

public class FCP001{
  public static void main(String a[]){
     Scanner D = new Scanner(System.in);
System.out.print("Enter your birth date ");
     int num1 = D.nextInt();
 D.nextLine(); // We can't get string value after int , so we Implement nextLine()


System.out.print("Enter your birth month ");
      String num2 = D.nextLine();

System.out.print("Enter your birth year ");
     int num3 = D.nextInt();
D.close(); //To close the scanner 

System.out.println(num1);
System.out.println(num2);
System.out.println(num3);
}}