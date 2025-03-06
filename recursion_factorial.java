import java.util.Scanner;
public class recursion_factorial 
{
    static int factorial (int n){
        if (n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int n=s.nextInt();
        s.close();
        System.out.println(factorial(n));
    }

}