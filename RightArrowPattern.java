package patternPrograms;

public class RightArrowPattern {

	public static void main(String[] args) {
		
		int n = 7;
		
		 int k1 = (n - 1) / 2 ; //2 
		 
		 int k2 =  3 * n / 2 - 1;  //6
		  
		    for (int i = 0; i < n; i++)  
		    { 
		        for (int j = 0; j < n; j++)  
		        { 
		  
		            if (j - i == k1 ||  i + j == k2 || i == k1 )  
		            	
		                System.out.print("* "); 
		            else 
		                System.out.print("  "); 
		        } 
		        
		        System.out.println(" "); 
		    } 
		    
	}
}

//output   
//    *
//      *
//* * * * *  
//      *
//    *
     

