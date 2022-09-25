import java.util.Locale;
import java.util.Scanner;

public class Ex04_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] strArray = str.toUpperCase().toCharArray();

        String mo = "AEIOU";
        String ja = "BCDFGHJKLMNPQRSTVWXYZ";
        char[] moArray = mo.toCharArray();
        char[] jaArray = ja.toCharArray();
        int moNum = 0;
        int jaNum = 0;

        for (int i = 0; i < strArray.length; i++){
            for (int j = 0; j < moArray.length; j++){
                if (strArray[i] == moArray[j]){
                    moNum++;
                }
            }
            for (int j = 0; j < jaArray.length; j++){
                if(strArray[i] == jaArray[j]){
                    jaNum++;
                }
            }
        }
        System.out.println(str + " => 자음 " + jaNum + "개, 모음 " + moNum + "개");

    }
}

//  자모 계산
