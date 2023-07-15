package Lac_9;
public class global {
    static int val= 100;
    public static void main(String[] args) {
        System.out.println("Hey");
        int a= 8;
        int b=7;
        System.out.println(val);
        System.out.println(add(a,b));
        System.out.println(val);
    }
    public static int add(int a, int b) {
        int c= a+b;
        int val=80;
        global.val= val+5; //here the global.val will change the global value of val from 100 to 85;
        return c; // this will return the value of c= 8+7=15;
    }
}
