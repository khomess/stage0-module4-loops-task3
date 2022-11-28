package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int y = 1;
        if(first != 0 && second != 0) {
            for (int x = 1; x <= second && x <= first; x++) {
                if (first % x == 0 && second % x == 0) {
                    y = x;
                }
            }
            System.out.println(y);
        } else if(first == 0){
            System.out.println(second);
        } else{
            System.out.println(first);
        }
    }
}
