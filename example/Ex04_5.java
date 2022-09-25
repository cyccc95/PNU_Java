import java.util.Scanner;

public class Ex04_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int mul = 1;

        System.out.printf("입력 : %d -> %d! = ",num,num);
        for (int i = num; i > 1; i--){
            mul *= i;
            System.out.printf("%d * ",i);
        }
        System.out.printf("1 = %d",mul);
    }
}

// 팩토리얼