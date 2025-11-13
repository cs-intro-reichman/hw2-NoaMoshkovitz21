// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		double pi_approx = 0;
		int    number_of_sum = Integer.parseInt(args[0]);
		for(int i=0; i<number_of_sum;i++){
			if (i%2==0){
				pi_approx= pi_approx + ((double)1/(2*i+1));
			}
			else{
				pi_approx= pi_approx - ((double)1/(2*i+1));
			}

		}
		pi_approx = pi_approx * 4 ;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:"+"     "+ pi_approx);
	}
}
