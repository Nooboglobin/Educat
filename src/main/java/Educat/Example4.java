package Educat;

public class Example4 {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};

        int[][] twoDimensionalArray = new int[][]{
                {1, 2},
                {3, 4},
                {5, 6}
        };

        int[][] twoDimensionalArray2 = new int[3][2];
        System.out.println(twoDimensionalArray2[1][1]);

        String [][] elems = new String[3][3];
        System.out.println(elems[0][0]);

        for (int byteIndex = 0; byteIndex < arr.length; byteIndex++) {
             arr[byteIndex] = 12;
        }

    }
}