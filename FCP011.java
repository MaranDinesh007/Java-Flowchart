import java.util.Scanner;
 public class FCP011{
 public static void main (String args[]){
 Scanner D = new Scanner (System.in);
int num = D.nextInt();
if(num % 2 == 0){
System.out.println("Even");
}
else{
System.out.println("Odd");
}
}}