/*
 * Class tuesday/thursday
 * Description: Practice with methods via math functions and return statments
 * Name: Alex Zaste
 * ID: 921392612
 * Class: CSC 211-02
 * Semester: spring 21

 * */

import java.util.Scanner;
public class ExpressionEvaluator {
// main takes inputs from user then calls methods depending on users input.
    public static void main(String[] args){
        double  A1;
        double  B1;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an operand");
    A1 = input.nextDouble();
    System.out.println("Enter a Operand");
    B1 = input.nextDouble();
    System.out.println("Enter an operator [+,-,*,/,^]");
    input.nextLine();
    String operator = input.nextLine();


    if(isValidOperator(operator)){
        double result=0.0;
        switch(operator){
            case "*":
           result = multiply(A1,B1);
            break;
            case"/":
           result = divide(A1,B1);
            break;
            case"-":
              result =  subtract(A1,B1);
                break;
            case"+":
             result =   add(A1,B1);
                break;
            case"^":
             result =   power(A1,B1);
                break;

        }
        System.out.println(getResultText(A1,B1,operator, result));
    }else{
        System.out.printf("'%s' is not a valid operator.\n",operator);
    }
        System.out.println("Ending program");
    }

    // simple functions that use return statements to return doubles to the main
    //grabs a and b then returns them added to each others
    public static double add(double a, double b){return a+b;}
   //grabs a and b then returns a-b
    public static double subtract(double a,double b){return a-b;}
    //grabs a and b then returns  a multiplied by b
    public static double multiply(double a, double b){return a*b;}
    //grabs a and then b then retuns a/b
    public static double divide(double a, double b){return a/b;}


    //grabs a and b if pow is =0 return 1 else loop it return a
    public static double power(double a, double pow) {
        double base=a;
        if (pow == 0) return 1;
        for (int i = 1; 0 < pow; i++)
            a *= base;
        return a;

    }

        public static boolean isValidOperator(String op){
            return op.equals("*")||op.equals("/")|| op.equals("^")||op.equals("+")||op.equals("-");

        }


        public static String getResultText(double opd1,double opd2, String op,double results){
            return opd1 +op+opd2+"="+results;
        }

}
