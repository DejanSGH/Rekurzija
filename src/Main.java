public class Main {

    public static void main(String[] args) {

        System.out.println( faktorijal(5));

        for (int i = 0; i < 10; i++) {
            System.out.println(fibonaci(i));
        }
    }

    public static long faktorijal(int n){
        if(n <= 1) return 1;
        return n * faktorijal(n-1);
    }

    public static long fibonaci(int n){
        if(n <= 1) return 1;
        return fibonaci(n-1) + fibonaci(n-2);
    }
}
