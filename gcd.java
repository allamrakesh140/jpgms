import java.util.Scanner;
public class gcd{
public static void main(String  []args)
{
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int n=sc.nextInt();

if(m>n)
{
int temp=m;
m=n;
n=temp;
}


for(int i=n;i>=m;i--)
{
   if(n%i==0 && m%i==0)
  {
    System.out.print("gcd :"+i);
     break;
   }
 }
}
}