public class FizzBuzz {
	public static void main(String args[]) {
		System.out.println(fizzBuzz(625));
	}

	public static String fizzBuzz( int num ) {
	      String a="";
	      for( int i=1; i <= num ; i++) {
			       	if ( i % 5 == 0 && i % 3 == 0 )
					        a+="fizzbuzz";
				else if ( i % 5 ==0 )
					  a+="buzz";
				else if ( i % 3 == 0 )
					a+="fizz";
				else 
					a+=i;
			}
	        return a;
	    
	}
}
