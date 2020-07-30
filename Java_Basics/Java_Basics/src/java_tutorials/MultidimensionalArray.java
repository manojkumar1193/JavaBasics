package java_tutorials;

	import java.util.Scanner;
	public class MultidimensionalArray {
	    int a[][]=new int[3][3];
	    Scanner s=new Scanner(System.in);
	    int[][] Arr()
	    {
	        for(int i = 0;i < a.length;i++)
	        {
	            for(int j = 0;j < a.length;j++)
	            {
	                a[i][j] = s.nextInt();
	            }
	        }
	        return(a);
	    }
	    public static void main(String[] args) {
	    	MultidimensionalArray f = new MultidimensionalArray();
	        int c[][]=new int[3][3];
	        c=f.Arr();
	        for(int i=0;i<c.length;i++)
	        {
	            for(int j=0;j<c.length;j++)
	            {
	                System.out.println(c[i][j]);
	            }
	        }
	    }
	}

