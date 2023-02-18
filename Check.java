import java.util.Scanner;
public class Check
{
    public static void main(String args[])
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number :");
        num = sc.nextInt();
        if(num<0)
        {
            System.out.println("Number is nagative");
        }
        else if(num>0)
        {
            System.out.println("Number is positive");
        }
        
    }
}