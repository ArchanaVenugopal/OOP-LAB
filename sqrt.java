import java.util.Scanner;
class sqrt {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=reader.nextInt();
        System.out.print("The square root of "+num+" is "+Math.sqrt(num)); 
    }
}