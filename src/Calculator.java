import java.util.Scanner;

public class Calculator {
    int a,b;
    double res;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First no: ");
        a=sc.nextInt();
        System.out.println("Enter Second no: ");
        b=sc.nextInt();
    }
    public void add(){
        res=a+b;
        System.out.println("Addition is "+res);
    }
    public void sub(){
        res=a-b;
        System.out.println("Substraction is "+res);
    }
    public void mul(){
        res=a*b;
        System.out.println("Multiplication is "+res);
    }
    public void div(){
        res=a/b;
        System.out.println("Division is "+res);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Choice: \n1)Addition\n2)Substraction\n3)Multiplication\n4)Division");
        Calculator ob=new Calculator();
        int ch=sc.nextInt();
        switch(ch){
            case 1:
                ob.input();
                ob.add();
                break;
            case 2:
                ob.input();
                ob.sub();
                break;
            case 3:
                ob.input();
                ob.mul();
                break;
            case 4:
                ob.input();
                ob.div();
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
