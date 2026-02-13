package Expressions;

public class Number implements Expression {
    int value;

    public Number(int value) {
        this.value = value;
    }

    public int calculate() {
        return value;
    }
}
