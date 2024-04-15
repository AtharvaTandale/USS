import java.util.Scanner;

class MatrixDemo1
{

    public static void main(String [] args)
    {
        int [][] a = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements in 3 x 3 matrix");
        for(int i=0;i<3; i++)
        {
            for(int j=0; j<3;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        MatrixDemo1 m1 = new MatrixDemo1();
        m1.show(a);
        m1.transpose(a);
        m1.addition(a);
        m1.ldiagonal(a);
        m1.rdiagonal(a);
        
    }

    public void transpose(int [][]a)
    {
        System.out.println("\nThe transpose of matrix is \n");

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
            System.out.printf("%4d",a[j][i]);
            }
            System.out.println();
        }
    }

     public void addition(int [][]a)
    {
        System.out.println("\nThe rowwise sum of matrix is \n");

        int sum;
        for(int i=0;i<3;i++)
        {
            sum = 0;
            for(int j=0;j<3;j++)
            {
                System.out.printf("%4d",a[i][j]);
                sum = sum + a[i][j];
            }
            System.out.printf("%4d",sum);
            System.out.println();
        }
    }

    public void show(int [][]a)
    {
        System.out.println("\nThe given matrix is \n");

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.printf("%4d",a[i][j]);
            }
            System.out.println();
        }
    }

    public void ldiagonal(int [][]a)
    {
        System.out.println("\nThe left diagonal is \n");

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {   
                if(j==i)
                {
                    System.out.printf("%4d",a[i][j]);
                }
            }
            System.out.println();
        }
    }

    public void rdiagonal(int [][]a)
    {
        System.out.println("\nThe right diagonal is \n");

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {   
                if(j+i==2)
                {
                    System.out.printf("%4d",a[i][j]);
                }
            }
            System.out.println();
        }
    }

}