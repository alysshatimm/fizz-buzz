package project;

public class FizzBuzz {


    public String interpret(int numberToSay) {
        if(numberToSay % 3 == 0 && numberToSay % 5 ==0){
            return "FizzBuzz";
        }
        if(numberToSay % 3 == 0){
            return "Fizz";
            //if number is 3, it will exit the method. if not, code proceeds to the below
        }
        if(numberToSay % 5 == 0){
            return "Buzz";
        }
        return "" + numberToSay;
        //concatenates empty string to int value to produce number
    }
}
