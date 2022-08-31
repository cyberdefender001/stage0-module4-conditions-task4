package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        
        int max1 = first >= second ?
            first;
            second;
        int max = max1 >= third ?
            max1:
            third;
        System.out.println(max);
    }
}
