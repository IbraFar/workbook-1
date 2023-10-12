public class MathApp {
    public static void main(String[] args) {
        System.out.println("Question 1");
        int bobSalary = 3_200_000, garySalary = 650_000;
        System.out.printf("The highest salary is $%d\n", Math.max(garySalary, bobSalary));

        System.out.println("Question 2");
        int carPrice = 50_000, truckPrice = 500_000;
        System.out.printf("The cheaper vehicle is $%d\n", Math.min(carPrice, truckPrice));

        System.out.println("Question 3");
        double radius = 7.25;
        double areaOfCircle = Math.PI * Math.pow(radius, 2);
        System.out.printf("The circle has a radius of %.3f and its area is %.3f\n", radius, areaOfCircle);

        System.out.println("Question 4");
        double num = 5.0;
        double numSquared = Math.sqrt(num);
        System.out.printf("The square root of %.3f is %f\n", num, numSquared);

        System.out.println("Question 5");
        int x1 = 5, y1 = 10, x2 = 85, y2 = 50;
        double distanceBetweenPoints = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("The distance between (%d,%d) and (%d,%d) is %.3f\n", x1, y1, x2, y2, distanceBetweenPoints);

        System.out.println("Question 6");
        double numPreAbs = -3.8;
        double absValueOfNum = Math.abs(numPreAbs);
        System.out.printf("The absolute value of %.3f is %.3f\n", numPreAbs, absValueOfNum);

        System.out.println("Question 7");
        double randomNumber = Math.random();
        System.out.printf("Your lucky random number is %.4f\n", randomNumber);
    }
}