//by mschro67

package h2;

import java.util.Arrays;

public class H2_main{
    public static int[] cache = new int[1000];
    public static int count = 0;

    public static void main(String[] args){
        clear();
        for (int x=0;x<=20;x++){
            System.out.println("Estimated time: "+benchmark(x)+"\n");
        }
    }

    public static void clear(){
        for (int index=0;index<cache.length;index++) {
           cache[index]=Integer.MIN_VALUE;
        }
        cache[0]=0;
        cache[1]=1;
        count=0;
    }

    public static int fibonacci(int n) {
        if (n==0) return 0;
        else if (n==1) return 1;

        int a = 0;
        int b = 1;
        int c;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static int fibonacciCached(int n){
        int a = cache[0];
        int b = cache[1];
        int c;

        for (int i = 2; i <= n; i++){
            if (cache[i]==Integer.MIN_VALUE) {
                c = a + b;
                a = b;
                b = c;
                cache[i] = Integer.valueOf(b);
            }else{
                a = cache[i-1];
                b = cache[i-2] + cache[i-1];
                return cache[i];
            }
        }

        return b;
    }

    static long benchmark(int n){
        long before = System.nanoTime();
        int f=fibonacci(n);
        long after = System.nanoTime();
        System.out.println("fibbonacci("+n+") = "+f);
        return after-before;
    }
}