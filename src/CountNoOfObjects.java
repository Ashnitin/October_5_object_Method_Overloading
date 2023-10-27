public class CountNoOfObjects {
    public static int count=0;

    public CountNoOfObjects() {
        count++;
    }

    public static void main(String[] args) {
        CountNoOfObjects ob1=new CountNoOfObjects();
        CountNoOfObjects ob2=new CountNoOfObjects();
        CountNoOfObjects ob3=new CountNoOfObjects();
        CountNoOfObjects ob4=new CountNoOfObjects();

        System.out.println("Total number of objects: "+count);
    }
}
