public class PrimeCheck{
public static boolean isPrime(int num) {
if (num<=1) {
return false;
}
for (int i=2;i<=Math.sqrt(num); i++) {
if (num% i==0) {
return false;
}
}
return true;
}
public static void main(String[] args) {
if (args.length==0) {
System.out.println("please provide a number as a command-line argument.");
return;
}
try{
int num=Integer.parseInt(args[0]);
if(isPrime(num)) {
System.out.println(num+"is a prime number.");
}else{
System.out.println(num+"is not a prime number.");
}
}catch(NumberFormatException){
System.out.println("invalid input! please enter a valid integer.");
}
}
}