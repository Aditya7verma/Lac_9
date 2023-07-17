package Lac_9;

public class return_type_no_parameters {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("hey");
        System.out.println("bye");
        addition(); //calling of function.
        System.out.println(addition());
    }

    public static int addition() {
        int a = 1;
        int b = 4;
        int c = a + b;
        System.out.println(sub());
        return c;
    }

    public static int sub() {
        int a=1;
        int b=4;
        int c= a-b;
        return c;

    }
}
