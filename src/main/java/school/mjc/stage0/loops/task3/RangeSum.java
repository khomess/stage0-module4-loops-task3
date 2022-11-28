package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int y = 0;
        if(firstBoarder!=secondBoarder){
            for(firstBoarder = firstBoarder;firstBoarder<=secondBoarder;firstBoarder++){
                y = y + firstBoarder;
            }
            System.out.println(y);
        } else {
            System.out.println(firstBoarder);
        }
    }
}
