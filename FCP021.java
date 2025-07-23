import java.util.Scanner;
 public class FCP021{
  public static void main (String args[]){
    Scanner D = new Scanner (System.in);
System.out.print("Enter num1 :  ");
int a = D.nextInt();
System.out.print("Enter num2 :  ");
int b = D.nextInt();
System.out.print("Enter num3 :  ");
int c = D.nextInt();
System.out.print("Enter num4 :  ");
int d = D.nextInt();
System.out.print("Enter num5 :  ");
int e = D.nextInt();
System.out.print("Enter num6 :  ");
int f = D.nextInt();
System.out.print("Enter num7 :  ");
int g = D.nextInt();
System.out.print("Enter num8 :  ");
int h = D.nextInt();

int m1,m2;
if(a>b){
 m1=a;m2=b;}

else{
 m1=b;m2=a;}

if(m2>c){}
 else if (c<m1){m2=c;}
    else{m1=c;m2=a;}

if(m2>d){}
 else if (d<m1){m2=d;}
    else{m1=d;m2=b;}

if(m2>e){}
 else if (e<m1){m2=e;}
    else{m1=e;m2=c;}

if(m2>f){}
 else if (f<m1){m2=f;}
    else{m1=f;m2=d;}

if(m2>g){}
 else if (g<m1){m2=g;}
    else{m1=g;m2=e;}

if(m2>h){}
 else if (h<m1){m2=h;}
    else{m1=h;m2=g;}
System.out.print("The Second Maximum number is "  +  m2 );
}}



   
   
    
 



 