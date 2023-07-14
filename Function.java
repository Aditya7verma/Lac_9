package Lac_9;

public class Function {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("hey");
        System.out.println("bye");
        addition(); //calling of function.

    }

    public static void addition() {
        int a=1;
        int b=4;
        int c= a+b;
        sub();
        System.out.println(c);
    }
    public static void sub() {
        int a=1;
        int b=4;
        int c= a-b;
        System.out.println(c);
    }
}
