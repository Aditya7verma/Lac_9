package Lac_9;

import java.util.Scanner;

public class is_Armstrong_no_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       System.out.println(countofdigit(n));
        System.out.println(Armstrong_no(n));

    }
    public static boolean Armstrong_no(int n){
        int cod= countofdigit(n);
        int sum=0;
        int p=n;
        while (n>0){
            int rem= n%10;
            sum= (int)(sum + Math.pow(rem,cod));
            n/=10;
        }
        if (sum== p) {
            return true;
        } else {
            return false;
        }

    }
    public static int countofdigit(int n){
        int count= 0;
        while (n>0){
            count++;
            n/=10;
        }
        return count;
    }

}
