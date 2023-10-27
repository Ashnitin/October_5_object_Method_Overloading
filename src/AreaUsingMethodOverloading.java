public class AreaUsingMethodOverloading {
    public static double p=3.14;
    public static void area( double side){
        double AreaSquare=side*side;
        System.out.println("Area of Square: "+AreaSquare);
    }
    static void area(double length,double breadth){
        double AreaRect=length*breadth;
        System.out.println("Area of Rectangle:"+AreaRect);
    }
    static  void area(int r){

        double circleArea=p*r*r;
        System.out.println("Area of circle is:"+circleArea);
    }

    public static void main(String[] args) {
        AreaUsingMethodOverloading ao = new AreaUsingMethodOverloading();
        ao.area(4.5);
        ao.area(8,8);
        ao.area(4);
    }
}
