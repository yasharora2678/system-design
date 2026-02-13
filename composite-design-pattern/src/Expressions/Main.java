package Expressions;

public class Main {
    public static void main(String[] args) {
        Number firstNumber = new Number(2);

        Number thirdNumber = new Number(6);
        Number fourthNumber = new Number(4);

        Expression secondExpression = new ArithmeticExpression(thirdNumber, fourthNumber, Operation.MULTIPLY);
        Expression firstExpression = new ArithmeticExpression(firstNumber, secondExpression, Operation.ADD);
        int result = firstExpression.calculate();
        System.out.println("Result is " + result);
    }
}
