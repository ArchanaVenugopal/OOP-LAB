import java.util.Scanner;
public class matAdd {
        public static void main(String[] args) {
            int row1,col1,i,j;
            Scanner reader = new Scanner(System.in);
            System.out.print("Enter number of rows:");
            row1 = reader.nextInt();
            System.out.print("Enter number of colums:");
            col1 = reader.nextInt();

            int a[][] = new int[row1][col1];
            int b[][]=new int[row1][col1];
            int c[][]=new int[row1][col1];
            System.out.println("Enter the elements of MAT1:");
            for ( i = 0; i < row1; i++)
            {
                for(j=0; j<col1; j++)
                {
                    a[i][j] = reader.nextInt();
                }
            }
            System.out.print("MATRIX 1 :\n");
            for ( i = 0; i < row1; i++)
            {
                for (j =0; j < col1; j++)
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("Enter the elements of MAT2:");
            for ( i = 0; i < row1; i++)
            {
                for(j=0; j<col1; j++)
                {
                    b[i][j] = reader.nextInt();
                }
            }
            System.out.print("MATRIX 2:\n");
            for (i = 0; i < row1; i++)
            {
                for (j =0; j< col1;j++)
                {
                    System.out.print(b[i][j]+" ");
                }
                System.out.println();
            }

            for(i=0;i<row1;i++)
            {
                for(j=0;j<col1;j++)
                {
                    c[i][j]=a[i][j]+b[i][j];
                }
            }
            System.out.print("\nSUM:\n");
            for (i = 0; i <row1; i++)
            {
                for (j =0;j<col1;j++)
                {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }

        }
    }