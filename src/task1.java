import java.util.Scanner;
public class task1 {
    public static void main(String[] args){
    Scanner num = new Scanner(System.in);
    int min, first, second,third, fourth;
    System.out.print ("Enter the first number: ");
    first = num.nextInt();
    System.out.print("Enter the second number: ");
    second = num.nextInt();
    System.out.print("Enter the third number: ");
    third = num.nextInt();
    System.out.print("Enter the fourth number: ");
    fourth = num.nextInt();
    min = first;

    if(min>second){
        min = second;
    }
    if(min>third){
        min = third;
    }
    if(min>fourth){
        min = fourth;
    }
    System.out.println("Minimal number: "+min);
}}

