import java.util.Scanner;

public class Ex04_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] arr = new int[num];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println("입력 : " + num);
        System.out.print("출력 : ");
        for (int i = 0; i < arr.length-1; i++){
            System.out.printf("%d, ",arr[i]);
        }
        System.out.print(arr[arr.length-1]);
    }
}

// 피보나치 수열
