public class Ex04_7 {
    public static void main(String[] args) {
        int[][] a = new int[3][4];
        int[][] b = new int[4][3];
        int[][] c = new int[3][3];

        // 각 행렬 선언
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                a[i][j] = (int)(Math.random()*10);
            }
        }
        for (int i = 0; i < b.length; i++){
            for (int j = 0; j < b[i].length; j++){
                b[i][j] = (int)(Math.random()*10);
            }
        }

        // 각 행렬 출력
        System.out.println("a");
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("b");
        for (int i = 0; i < b.length; i++){
            for (int j = 0; j < b[i].length; j++){
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }

        // 곱 출력
        System.out.println("a * b");
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < b[i].length; j++){
                for (int k = 0; k < a[i].length; k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

// 행렬 곱