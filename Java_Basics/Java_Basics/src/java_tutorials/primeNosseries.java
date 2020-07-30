package java_tutorials;

public class primeNosseries {

	public static void main(String[] args) {
		int i=2, j, count = 0;
		while (count < 20) 
		{
			boolean flag = true;
			for (j = 2; j < i; j++) {
				if (i % j == 0)
					flag = false;
			}
			if (flag == true) {
				System.out.print(i + " ");
				count++;
			}
			i++;
		}
	}
}
