import java.util.*;
class Raju
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print("Enter Lower value: ");
int m=s.nextInt();
System.out.print("Enter Upper value: ");
int n=s.nextInt();
System.out.print("Enter Skip value: ");
int k=s.nextInt();
for(int i=m;i<=n;i=i+k+1)
{
 System.out.print(i+" ");
}
}
}
