import java.util.Scanner;
public class FCP020{
public static void main (String args[]){
Scanner D = new Scanner (System.in);
System.out.print( "Enter num1:  " );
int a = D.nextInt();

System.out.print( "Enter num2:  " );
int b = D.nextInt();

System.out.print( "Enter num3:  " );
int c = D.nextInt();

System.out.print( "Enter num4:  " );
int d = D.nextInt();

int m1,m2;
if(a>b){
  m1 = a;
  m2 = b;
}

else{
  m1 = b;
  m2 = a;
}

if(m1>c){
  if(m2>c){}
   else{m2=c;}
}else{m2 = m1;m1 = c;}
 


if(m1>d){
  if(m2>d){}
   else{m2=d;}
}else{m2 = m1;m1 = d;}
 

 

System.out.print("Second Largest number is: "  + m2); 
}}








  



