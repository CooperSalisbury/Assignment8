public class App{
    static int fib(int n){
        if (n <= 1)
        return n;
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String args[]){
        int n;
        if (args.length > 0) {
            try {
                n = Integer.parseInt(args[0]);
                System.out.println(fib(n));
             } catch (NumberFormatException e) {
                System.err.println("Argument" + args[0] + " must be an integer.");
                System.exit(1);
            }
        }
    }
 }