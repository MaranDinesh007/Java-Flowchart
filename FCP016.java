import java.util.Scanner;
public class FCP016{
public static void main (String args[]){
Scanner D = new Scanner (System.in);
System.out.print( "Enter the year:  " );
int a = D.nextInt();

if(a % 400 == 0){System.out.println("yes");}
  else if (a % 4 ==0){
            if(a % 100 != 0 ){System.out.println("yes");}
              else{System.out.println("no");}}
       else{System.out.print("no");
}}}
     
 
   
 