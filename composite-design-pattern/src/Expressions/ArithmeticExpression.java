package Expressions;

public class ArithmeticExpression implements Expression {
    Expression leftExpression;
    Expression rightExpression;
    Operation operation;

    public ArithmeticExpression(Expression leftExpression, Expression rightExpression, Operation operation) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operation = operation;
    }

    public int calculate() {
        int value = 0;
        switch (operation) {
            case ADD:
                value =  leftExpression.calculate() + rightExpression.calculate();
                break;
            case SUBTRACT:
                value = leftExpression.calculate() - rightExpression.calculate();
                break;
            case MULTIPLY:
                value = leftExpression.calculate() * rightExpression.calculate();
                break;
            case DIVIDE:
                value = leftExpression.calculate() / rightExpression.calculate();
                break;
        }
        return value;
    }
}
