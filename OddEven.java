import java.util.Scanner;
class program{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number ");
        int num= input.nextInt();
        System.out.println("the number you entered is :"+num);
        if(num%2==0 ){
           System.out.println("the num is even");
       }
else{
           System.out.println("the num is odd");
    }
}}

