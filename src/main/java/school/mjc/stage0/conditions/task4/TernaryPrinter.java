package school.mjc.stage0.conditions.task4;

public class TernaryPrinter {
    public void printWhichIsBigger(int first, int second) {
        int max = 0;
        first > second?
            max = first:
            max = second;
        System.out.println(max);
    }
}
