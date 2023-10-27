public class PassingArgumentUsingMethodOverloading {
    static int add(int x,int y){
        return x+y;
    }
    static int add(int x,int y,int z){
        return x+y+z;
    }
    static  int add(int x,int y,int z,int p){
        return x+y+z+p;
    }

    public static void main(String[] args) {
       int TwoPara= add(4,5);
        int Threepara=add(8,5,2);
        int FourPara=add(7,5,3,9);
        System.out.println(TwoPara);
        System.out.println(Threepara);
        System.out.println(FourPara);
    }
}
