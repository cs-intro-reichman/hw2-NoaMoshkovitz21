//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            String word = args[0];
            int repeat = Integer.parseInt(args[1]);
            String an_letters = "AEFHILMNORSX";
            char letter ;

            for(int i=0; i< word.length(); i++){
                letter = word.toUpperCase().charAt(i);
                if (an_letters.indexOf(letter) != -1) {
                        System.out.println("Give me " + "an" + " " + letter + ": " + letter  + "!" );
                }
                else{
                        System.out.println("Give me " + "a" + "  " + letter + ": " + letter  + "!" );
                }
            }

            System.out.println("What does that spell?");

            for(int i=0 ; i< repeat ; i++){
                System.out.println(word.toUpperCase()+"!!!");
            }

        
        }
}
