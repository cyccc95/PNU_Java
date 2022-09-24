import java.util.Arrays;

public class Ex04_2 {
    public static void main(String[] args) {
        int[] rNum = new int[7];

        for (int i = 0; i < rNum.length; i++){
            rNum[i] = (int)(Math.random()*45);
        }
        System.out.print("입력 : " + Arrays.toString(rNum));
        Arrays.sort(rNum);
        System.out.println();
        System.out.print("입력 : " + Arrays.toString(rNum));

    }
}

// 정렬 기초