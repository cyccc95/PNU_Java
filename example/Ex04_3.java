import java.util.Arrays;
import java.util.Scanner;

public class Ex04_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[2*n];

        for (int i = 0; i < a.length;i++){
            a[i] = (int)(Math.random()*10);
        }
        for (int i = 0; i < b.length;i++){
            b[i] = (int)(Math.random()*10);
        }

        for (int i = 0; i < c.length; i+=2){
            c[i] = a[i/2];
            c[i+1] = b[i/2];
        }
        System.out.println("a : " + Arrays.toString(a));
        System.out.println("b : " + Arrays.toString(b));
        System.out.println("c : " + Arrays.toString(c));


    }
}

// 배열 합치기