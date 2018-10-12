package com.stackroute.test.model;

import java.util.ArrayList;
import java.util.List;

public class Input {

    private int number1;
    private int number2;

    public Input() {
    }

    public Input(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public List<Integer> addition(List<Input> forAddition) {
        int sum;
        List<Integer> sumList = new ArrayList<>();
        for (Input i : forAddition) {
            sum = i.getNumber1() + i.getNumber2();
            sumList.add(sum);
        }
        return sumList;
    }

    public List<Integer> subtraction(List<Input> forDifference) {
        int difference;
        List<Integer> differenceList = new ArrayList<>();
        for (Input i : forDifference) {
            difference = i.getNumber1() - i.getNumber2();
            differenceList.add(difference);
        }
        return differenceList;
    }

    public List<Integer> multiply(List<Input> forMultiplication) {
        int multiply;
        List<Integer> multiplicationList = new ArrayList<>();
        for (Input i : forMultiplication) {
            multiply = i.getNumber1() * i.getNumber2();
            multiplicationList.add(multiply);
        }
        return multiplicationList;
    }

    public List<Integer> divide(List<Input> forDivision) {
        int divide;
        List<Integer> divisionList = new ArrayList<>();
        for (Input i : forDivision) {
            divide = i.getNumber1() / i.getNumber2();
            divisionList.add(divide);
        }
        return divisionList;
    }

}
