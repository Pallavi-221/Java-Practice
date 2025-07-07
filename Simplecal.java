import java.util.Scanner;
public class Simplecal {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter first number:");
        double num1=input.nextDouble();
        System.out.print("enter second number:");
        double num2=input.nextDouble();
        System.out.print("enter operation to be performed(+,-,*,/)");
        char op=input.next().charAt(0);
        double result=0;
        if(op=='+'){
            result=num1+num2;
        }else if(op=='-'){
            result=num1-num2;
        }else if(op=='*'){
            result=num1*num2;
        }else if(op=='/'){
            if(num2==0){
            System.out.println("cannot divisible by zero");
            return;
            }
            System.out.println("invalid operator");
            return;
        }
        System.out.println("result"+ result);

        
        }
    }

