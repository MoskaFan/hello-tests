public class NewCheckNumbers {

    public static int sumSquareOrSubstract(int number1, int number2){
        boolean result = false;
        if(number1>number2){
            result = true;
            return (number1+number2);
        }
        return number1*number2;
    }
}
