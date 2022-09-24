import java.util.Scanner;

public class Ex03_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        if (num >= 10 && num <= 100){
            System.out.println("입력 값 : " + num);
            for (int i = 1; i < num/2 ; i++){
                for (int j = 1; j < num/3 ; j++){
                    for (int k = 1; k < num/5; k++){
                        if( i*2 + j*3 + k*5 == num){
                            count++;
                            System.out.printf("(%d,%d,%d)",i,j,k);
                        }
                    }
                }
            }
            System.out.println(" : " + count);
        } else {
            System.out.println("잘못입력함");
        }
    }
}

// 경우의 수
