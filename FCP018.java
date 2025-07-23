import java.util.Scanner;
public class FCP018{
public static void main (String args[]){
Scanner D = new Scanner (System.in);
int bs= D.nextInt();
if(bs<=10000){System.out.print((bs*0.2)+(bs*0.8)+bs);}
 else if(bs<=20000){System.out.print((bs*0.25)+(bs*0.9)+bs);}
else{System.out.print((bs*0.30)+(bs*0.95)+bs);}
}}
 






