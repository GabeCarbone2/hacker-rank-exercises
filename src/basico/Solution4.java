package basico;

import java.util.Scanner;

public class Solution4 {
    public static void main(String []argh){
        Scanner sc = new Scanner(System.in);
        int queries=sc.nextInt();
        for(int i=0;i<queries;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int result = a;

            for(int j =0; j < n; j++){
                result = result + (int)(Math.pow(2, j))*b;
                System.out.printf("%d ", result);
            }
            System.out.println();
        }
        sc.close();
    }
}
