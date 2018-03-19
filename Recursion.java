import java.util.Scanner;

public class Recursion{

  public static int Summation (int n){
    if(n<=0){
      return 0;
    }
    else{
      return n + Summation(n-1);
    }
  }

  public static int Factorial(int n){
    if (n<=1){
      return 1;
    }
    else{
      return n * Factorial(n-1);
    }
  }

  public static int Exponentiation(int n, int p){
    if (p<=0){
      return 1;
    }
    else{
      return n * Exponentiation(n,p-1);
    }
  }

  public static void main (String[] args){

    Scanner scan = new Scanner(System.in);
    System.out.print("Please enter a value for Summation: ");
    int sum = scan.nextInt();
    System.out.print("Please enter a value for Factorial: ");
    int factorial = scan.nextInt();
    System.out.print("Please enter base value for Exponentiation: ");
    int base = scan.nextInt();
    System.out.print("Please enter exponent value for Exponentiation: ");
    int expon = scan.nextInt();
    scan.close();

    System.out.println("Summation of numbers from " + sum + " to 0 is: " + Summation(sum));
    System.out.println("Factorial of " + factorial + " is: " + Factorial(factorial));
    System.out.println("Exponentiation result of " + base + "^" + expon + " is: " + Exponentiation(base,expon));
  }

}
