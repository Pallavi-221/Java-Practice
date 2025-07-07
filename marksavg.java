import java.util.Scanner;
public class marksavg {
public static void main(String[] args){
Scanner sc =new Scanner(System.in);
System.out.print("enter marks of subject 1");
int m1=sc.nextInt();
System.out.print("enter marks of subject 2");
int m2 =sc.nextInt();
System.out.print("enter marks of subject 3");
int m3 = sc.nextInt();
 
int total=m1+m2+m3;
double average = total/3.0;

System.out.println("total marks" +total);
System.out.println("average marks" +average);
}
}