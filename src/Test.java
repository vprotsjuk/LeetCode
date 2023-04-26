package src;

public class Test {
    int factorial(int n) {
        if(n <= 1)  // Базовый случай
        {
            return 1;
        }
        return n  * factorial(n - 1); //рекурсивеый вызов с другим аргументом
    }
    public int product(int x, int y)
    {
        if (y == 0)  // Базовый случай
        {
            return 0;
        }
        return (x + product(x, y-1)); //рекурсивеый вызов с другим аргументом
    }
    public static void main(String[] args) {
//        Test t = new Test();
//        System.out.println(t.factorial(5));
//
//        System.out.println(t.product(5, 3));
        System.out.println(fibo(4));


    }
    static int fibo(int n){
        if (n <= 1){
            return n;
        }
        System.out.println(fibo(n - 1) + fibo(n - 2));
        return fibo(n-1) + fibo(n-2);
    }


}
