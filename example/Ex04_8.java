import java.util.Scanner;

public class Ex04_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 좌표 : ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.print("입력 각도 : ");
        double deg = sc.nextDouble();
        double radian = Math.toRadians(deg);

        double x2 = x*Math.cos(radian) - y*Math.sin(radian);
        double y2 = x*Math.sin(radian) + y*Math.cos(radian);
        System.out.printf("출력 좌표 : %.2f %.2f",x2,y2);
    }
}

// 2차원 회전 변환 행렬