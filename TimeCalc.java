public class TimeCalc {
    public static void main(String[] args) {
        // The TimeCalc program gets a time input which is given using the 24-hour hh:mm format, and a
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

        int add_min = Integer.parseInt(args[1]);

        int total_min   = (hours*60)+minutes + add_min;
        int total_hours =  total_min   / 60 ;
        int new_hours   =  total_hours % 24 ;
        int new_minutes  =  total_min - (total_hours*60);

        if (new_hours < 10 && new_minutes < 10){
            System.out.println("0"+new_hours+":"+"0"+new_minutes); 
        }
        else if (new_hours<10){
            System.out.println("0"+new_hours+":"+new_minutes); 
        }
        else if (new_minutes<10){
            System.out.println(new_hours+":"+"0"+new_minutes); 
        }
        else{
            System.out.println(new_hours+":"+new_minutes); 
        }

}
}