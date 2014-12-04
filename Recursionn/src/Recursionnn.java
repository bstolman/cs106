import java.io.Console;

public class Recursionnn {
	 
	    public static void main(String[] args) {  
	    	
	    	System.out.println(countSum (10));
	    }  
	      
	    public static void countUp(int n) {  
	        if (n > 1) {  
	           countUp(n-1);  
	        }  
	        System.out.println(n);  
	   
	   }
	
	    public static int countSum(int max) {
       
	    	if(max>1)

		   return max + countSum(max-1); 
	    
	    
	return 1;	
	    }
}


		