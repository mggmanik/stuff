package com.stackroute.test.operations;

public class OperationsImpl extends Operations{

    @Override
    public int add(int a, int b) {
        int sum = a+b;
        return sum;
    }

    @Override
    public int subtract(int a, int b) {
        int subtract = a-b;
        return subtract;
    }

    @Override
    public int multiply(int a, int b) {
        int multiply = a*b;
        return multiply;
    }

    @Override
    public int divide(int a, int b) {
        int divide = a/b;
        return divide;
    }

}
