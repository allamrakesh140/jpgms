import java.util.Scanner;
public class lcm{
public static void main(String []args)
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
    for(int i=m;i<=m*n;i=i+m)
    {
         if(i%m==0 && i%n==0)
          {
           System.out.println(i);
 break;
          }
     
     }



}
}