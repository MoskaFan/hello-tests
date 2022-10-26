package FizzFuzz;

public class FizzFuzz {
    public static String fizzbuzz(int number){
        if(number == 0){
            return "0";
        }
         if(number%3==0 && number%5==0){
            return "fizzbuzz";
        }
        if(number%3==0){
            return "fuzz";
        }
        if(number%5==0){
            return "buzz";
        }

        return String.valueOf(number);

    }
}
