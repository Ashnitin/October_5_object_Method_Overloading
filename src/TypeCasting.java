import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        byte a,b;
        System.out.println("Enter First Byte value: ");
        a=sc.nextByte();
        System.out.println("Enter Second Byte value: ");
        b=sc.nextByte();
        int num1=(int) a;
        int num2=(int) b;
        int sum=num1+num2;
        System.out.println("Addition is:"+sum);
    }
}
