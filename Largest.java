import java.util.Scanner;
public class Largest{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a first number");
        int a=input.nextInt();
        System.out.print("Enter a second number");
        int b=input.nextInt();
        System.out.print("Enter a third number");
        int c=input.nextInt();
        if(a>=b && a>=c){
            System.out.println(a +"is largest");
        } else if(b>=a && b>=c){
            System.out.println(b+ "is largest");
        }else{
            System.out.println(c+ "is largest");
        }
        }
    }

    

