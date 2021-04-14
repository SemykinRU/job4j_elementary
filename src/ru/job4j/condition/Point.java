package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
      /*  double rsl = Math.sqrt((Math.pow((x2-x1),2)+(Math.pow((y2-y1),2)))); */
        double firstStep = x2 - x1;
        double secondStep = y2 - y1;
        double thirdStep = Math.pow(firstStep,2);
        double fourthStep = Math.pow(secondStep,2);
        double fifthStep = thirdStep + fourthStep;
        double rsl = Math.sqrt(fifthStep);

        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2,0 );
        double result1 = Point.distance(1, 1, 1,1 );
        double result2 = Point.distance(10, 6, 7,2 );
        double result3 = Point.distance(1, 5, 3,3 );
        System.out.println("result (0, 0) to (2, 0) = " + result);
        System.out.println("result (1, 1) to (1, 1) = " + result1);
        System.out.println("result (10, 6) to (7, 2) = " + result2);
        System.out.println("result (1, 5) to (3, 3) = " + result3);

    }
}
