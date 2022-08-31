package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public static void printGreatest(int first, int second, int third) {
        int max = 0;
        int max1 = 0;
        first > second ?
            max1 = first;
            max1 = second;
        max1 > third ?
            max = max1:
            max = third;
        System.out.println(max);
    }
}
