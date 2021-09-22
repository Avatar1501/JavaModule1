/*
Exp 2:Write a menu driven Java program which will read
a number and should implement the following
methods
1. factorial()
2. testArmstrong()
3. testPalindrome()
4. testPrime()
5. fibonacciSeries()

*/
import java.util.Scanner;
class NumericOps
{
    static int n;
    static void fact()
    {
        long f=1;
        if(n<0)
            System.out.println("Invalid number");
        else if(n<2)
            System.out.println("Factorial:1");
        else
        {
            for(int i = 1; i <= n; i++)
            {
                f *= i;
            }
            System.out.println("Factorial:"+f);
        }
    }

    static int reverse()
    {
        int r=0;
        int temp=n;
        while(temp!=0)
        {
            r = (r*10)+(temp%10);
            temp/=10;
        }
        return r;
    }

    static void armstrong()
    {
        int temp=n;
        int arm=0;
        while(temp!=0)
        {
            arm = arm + (int)Math.pow((double)temp%10,3);
            temp/=10;
        }
        if(arm==n)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }

    static void palindrome()
    {
        if(reverse()==n)
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }

    static void prime()
    {
        int p=1;
        for(int i=2; i<n; i++)
        {
            if(n%i==0)
            {
                p=0;
                break;
            }
        }
        if(p==0)
            System.out.println("Not Prime");
        else
            System.out.println("Prime");
    }

    static void fibonacciSeries()
    {
        int a=0;
        int b=1;
        int c=2;
        System.out.print(a);
        do{
            System.out.print(" " + b);
            a = b;
            b = a+b;
            c++;
        }while(c<=n);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        n=sc.nextInt();
        fact();
        System.out.println("Reverse:"+reverse());
        armstrong();
        palindrome();
        prime();
        fibonacciSeries();
    }
}

