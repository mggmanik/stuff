package com.stackroute.test.operations;

import com.stackroute.test.model.Input;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerformOperations {

    Input inputForMultiInputValues = new Input();
    List<Input> multiInputList = new ArrayList<>();

    //    Function for performing different operations
    public List<Input> performOperations(int iterations) {

        int numberOne;
        int numberTwo;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < iterations; i++) {
            numberOne = input.nextInt();
            numberTwo = input.nextInt();
            inputForMultiInputValues = new Input(numberOne, numberTwo);
            multiInputList.add(inputForMultiInputValues);
        }
        return multiInputList;
    }

    //    Function called by Main class.
    public void calculations() {

        Operations operations = new OperationsImpl();

        int choice;
        int choiceForSingleInput;
        int choiceForMultiInput;
        int numberOne, numberTwo;
        int iterations;


        Scanner input = new Scanner(System.in);

        System.out.println("Enter Single aur Multiple inputs for respective operations!");
        System.out.println("You have following choices:");
        System.out.println("1. Single-Input Operation!");
        System.out.println("2. Multi-Input Operation!");

        choice = input.nextInt();

        switch (choice) {
            case 1: {
//                For Single-Input values
                System.out.println("1. Add");
                System.out.println("2. Subtract");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
                System.out.println("Select from following operations!");
                choiceForSingleInput = input.nextInt();
                switch (choiceForSingleInput) {
                    case 1:
                        System.out.println("Enter the input numbers:");
                        numberOne = input.nextInt();
                        numberTwo = input.nextInt();
                        System.out.println("Result:" + operations.add(numberOne, numberTwo));
                        break;
                    case 2:
                        System.out.println("Enter the input numbers:");
                        numberOne = input.nextInt();
                        numberTwo = input.nextInt();
                        System.out.println("Result:" + operations.subtract(numberOne, numberTwo));
                        break;
                    case 3:
                        System.out.println("Enter the input numbers:");
                        numberOne = input.nextInt();
                        numberTwo = input.nextInt();
                        System.out.println("Result:" + operations.multiply(numberOne, numberTwo));
                        break;
                    case 4:
                        System.out.println("Enter the input numbers:");
                        numberOne = input.nextInt();
                        numberTwo = input.nextInt();
                        System.out.println("Result:" + operations.divide(numberOne, numberTwo));
                        break;
                    default:
                        System.out.println("No operation present!");
                }
                break;
            }
            case 2: {
//            For multi-input values
                System.out.println("1. Add");
                System.out.println("2. Subtract");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
                System.out.println("Select from following operations!");
                choiceForMultiInput = input.nextInt();

                switch (choiceForMultiInput) {
                    case 1:
                        System.out.println("Enter the iterations for multi-input");
                        iterations = input.nextInt();
                        System.out.println("Enter your " + iterations + " set of inputs!");
                        List<Integer> sumSet = inputForMultiInputValues.addition(performOperations(iterations));
                        System.out.println("Respective Sums!");
                        for (Integer i : sumSet) {
                            System.out.println("Add," + i);
                        }
                        break;
                    case 2:
                        System.out.println("Enter the iterations for multi-input");
                        iterations = input.nextInt();
                        System.out.println("Enter your " + iterations + " set of inputs!");
                        List<Integer> subtractionSet = inputForMultiInputValues.subtraction(performOperations(iterations));
                        System.out.println("Respective Sums!");
                        for (Integer i : subtractionSet) {
                            System.out.println("Subtract," + i);
                        }
                        break;
                    case 3:
                        System.out.println("Enter the iterations for multi-input");
                        iterations = input.nextInt();
                        System.out.println("Enter your " + iterations + " set of inputs!");
                        List<Integer> multiplySet = inputForMultiInputValues.multiply(performOperations(iterations));
                        System.out.println("Respective Sums!");
                        for (Integer i : multiplySet) {
                            System.out.println("Multiply," + i);
                        }
                        break;
                    case 4:
                        System.out.println("Enter the iterations for multi-input");
                        iterations = input.nextInt();
                        System.out.println("Enter your " + iterations + " set of inputs!");
                        List<Integer> divisionSet = inputForMultiInputValues.divide(performOperations(iterations));
                        System.out.println("Respective Sums!");
                        for (Integer i : divisionSet) {
                            System.out.println("Division," + i);
                        }
                        break;
                    default:
                        System.out.println("No operation present!");
                }
            }
            break;

            default:
                System.out.println("Sorry! Not an option!");
        }
    }


}
