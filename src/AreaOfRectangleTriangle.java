import java.util.Scanner;

public class AreaOfRectangleTriangle {
    double area;
    public void AreaTriangle(int x,int y){
        area=(x*y)/2;
        System.out.println("Area of triangle is: "+area);
    }
    public void AreaRectangle(int a,int b){
        area=a*b;
        System.out.println("Area of Rectangle is: "+area);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        AreaOfRectangleTriangle ob=new AreaOfRectangleTriangle();
            //input for area of triangle
        System.out.println("**************Area of Triangle**************");
        System.out.println("Enter Base: ");
        int x=sc.nextInt();
        System.out.println("Enter height: ");
        int y=sc.nextInt();
        ob.AreaTriangle(x,y);
             //input for area of Rectangle
        System.out.println("**************Area of Rectangle**************");
        System.out.println("Enter Breath: ");
        int a=sc.nextInt();
        System.out.println("Enter height: ");
        int b=sc.nextInt();
        ob.AreaRectangle(a,b);
    }
}

