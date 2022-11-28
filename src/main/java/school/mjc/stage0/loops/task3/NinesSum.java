package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int x = 0;
        if(lengthOfLastNumber>0) {
            for (int i = 1; i <= lengthOfLastNumber; i++) {
                x = x*10 + 9;
                sum = sum + x;
            }
            System.out.println(sum);
        } else{
            System.out.println(0);
        }
    }
}
