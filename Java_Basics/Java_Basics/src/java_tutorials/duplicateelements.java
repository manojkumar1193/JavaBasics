package java_tutorials;

public class duplicateelements 
{

	public static void main(String[] args) 
	{
		int [] arr = new int [] {1,3,1,4,5,3,1}; 
		int[] a= new int[arr.length]; 
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) 
        {  
        	boolean flag = false;
            for(int j = i + 1; j < arr.length; j++) 
            {  
                if(arr[i] == arr[j])  
                {
                	a[j]=-1;
                	flag = true;	
                } 
			}
            if(a[i]!=-1) {
            	a[i]=arr[i];
            }
        }
        
        for(int i = 0; i < a.length; i++) {
        	if(a[i]!=-1)
        		System.out.println(a[i]);
        }
	}

}
