import java.util.*;

class factorial
{
public static void main (String args[])
{
    int i, num, fact=1;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number: ");

    num = sc.nextInt(); 

    for(i=1; i<=num; i++)
    {
        fact = fact * i;
    }
    System.out.println("Factorial is "+fact);

    sc.close();
}
}
