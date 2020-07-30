package java_tutorials;

public class Interview1_2 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int[] b= {8,2,3,7,1,4};
		int counta= a.length;
		int count= b.length;
		for(int i=0;i<count;i++) {
			int j=0;
				if(!(b[i]==a[j])) {
					if(!(b[i]==a[j+1])) {
						if(!(b[i]==a[j+1])) {
							if(!(b[i]==a[j+1])) {
								System.out.println(b[i]+" is not available");
							}
						}
						
					}
				}
				else {
					System.out.println(b[i]+" is available");
				}
				
			}
	}
	}
