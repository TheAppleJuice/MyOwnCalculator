package se.lexicon;

import com.sun.org.apache.xalan.internal.xsltc.dom.SortingIterator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App 
{                                                       public static void main( String[] args )
    {
        System.out.println("Welcome to this basic calculator");
        Scanner scannersb = new Scanner(System.in);

        boolean isActivated = true;
        while (isActivated){
            System.out.println("Enter the first number:");
            int number1 = scannersb.nextInt();;
            System.out.println("Enter the second number:");
            int number2 = scannersb.nextInt();

            System.out.println("Now choose the operation type: +. -, * or /");
            String operationTypE= scannersb.next();
            switch (operationTypE)
            {
                case "+":
                    int resultSum = addition(number1, number2);
                    System.out.println("The sum is " + resultSum);
                    break;
                case "-":
                    int resultSub = subtraction(number1,number2);
                    System.out.println("The difference is " + resultSub);
                    break;
                case "*":
                    int resultMult = multiplication(number1,number2);
                    System.out.println("the product is " + resultMult);
                    break;
                case "/":
                    int resultDiv = division(number1,number2);
                    System.out.println("The quotient is " + resultDiv);
                    break;
            }
            System.out.println(" ");
            System.out.println("Do you want to use the calculator again?");
            String answer = scannersb.next();
            if (answer.equalsIgnoreCase("no")){
                isActivated = false;
            }
        }
    }

    public static int addition(int number1, int number2) {
        int result=number1+number2;
        return result;
    }
    public static int subtraction(int number1, int number2){
        int result=number1-number2;
        return result;
    }
    public static int division(int number1, int number2){
        int result=number1/number2;
        return result;
    }
    public static int multiplication(int number1, int number2){
        int result= number1*number2;
        return result;
    }

}
