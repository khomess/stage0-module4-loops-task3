package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int y = 0;
        int x = 1;
        int a;
        System.out.println(y);
        System.out.println(x);
        for(int z = 2;z<lastFibonacci;z++){
            a = y + x;
            System.out.println(a);
            y = x;
            x = a;
        }
    }
}
