package org.javaguru.student_asserman.lesson_1.lessoncode.Calculator;

public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest test = new CalculatorTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.testDouble1();
        test.testDouble2();
        test.testDouble3();
    }

    // -2 -> true

    public void test1() {
        int number = -2;
        Calculator calc = new Calculator();
        boolean realResult = calc.isEven(number);
        if (realResult) {
            System.out.println("Test 1 = OK");
        } else {
            System.out.println("Test 1 = FAIL");
        }
    }

    // 3 -> false
    public void test2() {
        int number = 1245487;
        Calculator calc = new Calculator();
        boolean realResult = calc.isEven(number);
        if (!realResult) {
            System.out.println("Test 2 = OK");
        } else {
            System.out.println("Test 2 = FAIL");
        }
    }

    public void test3() {
        int number = -2;
        Calculator calc = new Calculator();
        boolean realResult = calc.isOdd(number);
        if (!realResult) {
            System.out.println("Test 3 = OK");
        } else {
            System.out.println("Test 3 = FAIL");
        }
    }

    // 3 -> false
    public void test4() {
        int number = 1245487;
        Calculator calc = new Calculator();
        boolean realResult = calc.isOdd(number);
        if (realResult) {
            System.out.println("Test 4 = OK");
        } else {
            System.out.println("Test 4 = FAIL");

        }
    }

    //calc.findAverage()
    //12, 18 -> 15
    //5, 10 -> 7.5
    //1, 1  1.0
    public void testDouble1() {
        double number1 = 12.0;
        double number2 = 18.0;
        Calculator calc = new Calculator();
        Double testResult = (double) calc.findAverage(number1, number2);
        if (Math.abs(testResult - 15.0) < 0.00001) {
            System.out.println("Test Double1 = OK");
        } else {
            System.out.println("Test Double1 = FAIL");
        }
    }
    //5, 10 -> 7.5
    public void testDouble2() {
        double number1 = 5.0;
        double number2 = 10.0;
        Calculator calc = new Calculator();
        Double testResult = (double) calc.findAverage(number1, number2);
        if (Math.abs(testResult - 7.5) < 0.00001) {
            System.out.println("Test Double2 = OK");
        } else {
            System.out.println("Test Double2 = FAIL");
        }
    }
    //1, 1  1.0
    public void testDouble3() {
        double number1 = 1;
        double number2 = 1;
        Calculator calc = new Calculator();
        Double testResult = (double) calc.findAverage(number1, number2);
        if (Math.abs(testResult - 1.0) < 0.00001) {
            System.out.println("Test Double3 = OK");
        } else {
            System.out.println("Test Double3 = FAIL");
        }
    }

}
