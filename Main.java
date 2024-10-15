public class Main {
public static int factorial(int n){
    if(n<= 1)
        return 1;
    else
        return n*factorial(n-1);
}
public static int fib(int n){
    if(n==1||n==2)
        return 1;
    else
        return fib(n-2)+fib(n-1);
}


    public static void main(String[] args) {
        int fact = factorial(5);
        System.out.println(fact);
        int fib = fib(5);
        System.out.println(fib);
    }
}
