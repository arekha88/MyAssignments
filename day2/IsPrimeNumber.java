package week1.day2;

public class IsPrimeNumber {

	
	    public void isPrime(int n)
	    
	    {
	    	int i=2;
	        if (n == 0 ||n == 1 ) 
	        
	            System.out.println("0 and 1 are Prime");
	     
	        
	       //for (i = 2; i <= n/2; i++)
	            else if (n % i == 0)
	                System.out.println(+n + " is Non Prime ");
	       else
	            	System.out.println(+n + " is prime");
	       	    
	    }
	    public static void main(String args[])
	    
	    {
	     IsPrimeNumber lm = new IsPrimeNumber();
	     lm.isPrime(9);
	     
	    	
	    }
	}