//if number ends in 0 return 'zero'. if number ends in 5 return 'five'. If number ends in 0 and is even, return 'even'. If number ends in 15 and is odd, return 'odd';

public class oddeven{

    public oddeven(){}

    public String challenge (Integer my_number){

        if (my_number % 2 == 0){
            return (my_number % 10 == 0) ? "zero" : "even";
        }

        if (my_number % 2 != 0) {
            return (my_number % 10 == 5) ? "five" : "odd";
        }

        return "unknown";
    }
}