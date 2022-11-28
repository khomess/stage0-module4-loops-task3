package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int length = String.valueOf(t).length();
        int y;
        int sum = 0;
        if(t>=0){
            for(int x = 0;x<length;x++){
                y = t % 10;
                sum += +y;
                t = t/10;
            }
            System.out.println(sum);
        } else{
            for(int x = 0;x<length;x++){
                y = t % 10;
                sum += +y;
                t = t/10;
            }
            System.out.println(-sum);
        }
    }
}
