import java.util.Scanner;

public class arr01 {
    public static void spiralmatrix(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol) {
            //top row
            for (int j = startRow; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");

            }
            //left col
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            //bottom row
            for (int j = endCol; j >= startCol; j++) {
                System.out.print(matrix[endRow][j] + " ");
            }
            for (int i = endRow - 1; i >= startRow + 1; i++) {
                System.out.print(matrix[i][startCol] + " ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;

        }
        System.out.println();
    }
    public static int diagonalsum(int matrix[][]){
        int sum =0;
        for(int i=0; i<=matrix.length;i++){
            sum+=matrix[i][i];
            if(i!=matrix.length-1-i)
            sum+= matrix[i][matrix.length-i-1];
        }
        return sum;
    }
    public static boolean sotedmatrix(int matrix[] [], int key) {
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("found key at(" + row + "," + col + ")");
                return true;
            }else if(key<matrix[row][col]){
                col--;

            }else{
                row++;
            }

        }
        System.out.println("key not found");
        return false;

    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12,},{13,14,15,16}};
        int key=15;
        sotedmatrix(matrix,key);

    }
}
