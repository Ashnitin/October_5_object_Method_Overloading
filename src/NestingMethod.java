import java.util.Scanner;

public class NestingMethod {
    public static int l,b,h;
    public static void main(String[] args) {
        input();
        volum();
    }

    private static void volum() {
        double volume=l*b*h;
        System.out.println("Volum is: "+volume);
        area();
    }

    private static void area() {
        double area=2*((l*b)+(b*h)+(h*l));
        System.out.println("Area is: "+area);
        perimiter();
    }

    private static void perimiter() {
        double perimeter=4*(l+b+h);
        System.out.println("Perimeter is: "+perimeter);
    }

    private static void input() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length: ");
        l=sc.nextInt();
        System.out.println("Enter Breadth: ");
        b=sc.nextInt();
        System.out.println("Enter height: ");
        h=sc.nextInt();
    }
}
