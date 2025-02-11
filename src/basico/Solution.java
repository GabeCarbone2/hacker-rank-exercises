package basico;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String i = scan.nextLine();
        String d = scan.nextLine();
        String s = scan.nextLine();


        System.out.println("String: " + s);
        System.out.println("Double: " + Double.valueOf(d));
        System.out.println("Int: " + Integer.valueOf(i));

        scan.close();
    }
}
