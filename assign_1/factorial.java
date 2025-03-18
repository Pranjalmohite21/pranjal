import java.util.Scanner;
public class Factorial{
public static long 
factorialIterative(int n) {
long fact = 1;
for (int i=1;i<=n;i++){
fact*=i;
}
return fact;
}
public static long
factorialRecursive(int n) {
if (n==0 || n==1) {
return 1;
}
return n* factorialRecursive(n-1);
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("enter a number:");
int num=scanner.nextInt();
long iterativeResult=factorialIterative(num);
long recursiveResult=factorialRecursive(num);
System.out.println("Factorial using iteration:"+iterativeResult);
System.out.println("Factorial using recursion:"+ recursiveResult);
scanner.close();
}
}