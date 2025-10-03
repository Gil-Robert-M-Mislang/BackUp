import java.util.Scanner;

public class Transpose {
    public static Scanner newInput = new Scanner(System.in);

    public static void matrixPrint(int[][] matrix, int rows, int columns)
    {
        for(int i = 0; i<rows; i++)
        {
            for(int j = 0; j<columns; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void transposedMatrix(int[][] matrix, int[][] transposeMatrix, int rows, int columns)
    {
        for(int i = 0; i<rows; i++)
        {
            for(int j = 0; j<columns; j++)
            {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }
    }

    public static void matrixInput(int[][] matrix, int rows, int columns)
    {
        for(int i = 0; i<rows; i++)
        {
            for(int j = 0; j<columns; j++)
            {
                matrix[i][j] = newInput.nextInt();
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Please enter the size of the Matrix");
        System.out.print("Rows: ");
        int rows = newInput.nextInt();

        System.out.print("Columns: ");
        int columns = newInput.nextInt();

        int[][] matrix = new int[rows][columns];

        matrixInput(matrix, rows, columns);
        matrixPrint(matrix, rows, columns);

        int [][] transposeMatrix = new int[columns][rows];

        transposedMatrix(matrix, transposeMatrix, columns, rows);
        matrixPrint(transposeMatrix, columns, rows);
    }
}