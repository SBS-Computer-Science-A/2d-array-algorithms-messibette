public class ShiftDown {
    public static void shiftDown(int[][] mat, int steps){
        int rows = mat.length;
        int cols = mat[0].length;

        for (int i = 0; i < cols; i++) {
            int[] temp = new int[rows];

            for (int j = 0; j < rows; j++) {
                int newRow = (j + steps) % rows;
                temp[newRow] = mat[j][i];
            }

            for (int k = 0; k < rows; k++) {
                mat[k][i] = temp[k];
            }


        }

    }

}
