import java.util.Scanner;

class Ex3{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("enter 1st number");
        int num1= input.nextInt();
        System.out.println("enter 2nd number");
        int num2= input.nextInt();
        int div=num1/num2;
        System.out.println("div is :"+div);
    }
}