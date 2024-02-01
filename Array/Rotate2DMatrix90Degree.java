public class Rotate2DMatrix90Degree{
    public static void print(int[][] matrix)
    {
        for(int i = 0; i<matrix.length; i++)
        {
            for(int j = 0; j<matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void rotate90Degree(int[][] matrix)
    {
        int rows = matrix.length;
        int cols = matrix[0].length;
        //Tranpose matrix
        for(int i = 0; i<rows; i++)
        {
            for(int j = i+1; j < cols; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        System.out.println("Tranpose Matrix:");
        print(matrix);
        //Reverse each row
        for(int i = 0; i<rows; i++)
        {
            int start = 0, end = cols-1;
            while(start < end)
            {
                int temp = matrix[i][start];
                matrix[i][start++] = matrix[i][end];
                matrix[i][end--] = temp;
            }
        }
        System.out.println("Reverse each row -> matrix rotate 90 degree:");
        print(matrix);
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("ORIGINAL MATRIX:");
        print(matrix);
        rotate90Degree(matrix);
    }
}


/*
 * 1 2 3         1 4 7      7 4 1
 * 4 5 6  -----> 2 5 8----->8 5 2
 * 7 8 9         3 6 9      9 6 3
 * 
 * 1 2 3 4
 * 5 6 7 8
 * 9 10 11 12
 * 13 14 15 16
 * 
 * 1 5 9 13
 * 2 6 10 14
 * 3 7 11 15
 * 4 8 12 16
 * 
 * 13 9 5 1
 * 14 10 6 2
 * 15 11 7 3
 * 16 12 8 4
 */