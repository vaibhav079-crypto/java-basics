import java.util.Scanner;
//area of rectangle
class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number:");
        int l =sc.nextInt();
        System.out.println("enter second number:");
        int b = sc.nextInt();

        int area = l * b;

        

        System.out.println("area = " + area);


    }
}
