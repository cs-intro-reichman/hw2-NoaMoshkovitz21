// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int  seed = Integer.parseInt(args[0]);
		String mode = args[1];
		int count = 1;
		int number ; 
		boolean reach_one  = false ; 
		boolean first_time = true ;
		boolean verbose    = false ;

		if(mode.equals("v")){
			verbose = true ;
		}

		for (int i=1 ; i<=seed ; i++){
			number = i ;
			while (!reach_one) {
				if(verbose){
					System.out.print(number + " ");
				}
				
				if(number == 1 && !first_time){
					reach_one = true ;
					if(verbose)
					{System.out.println("("+ count + ")");}
					count = 0 ;


				} 
				if(number % 2 == 0 ){
					number /= 2 ;
				} 
				else { 
					number = (number*3) +1 ;
				}
				first_time = false ;
				count++;
				
			}
			reach_one = false ;
		}

		System.err.println("Every one of the first " + seed + " hailstone sequences reached 1.");
	}
}
