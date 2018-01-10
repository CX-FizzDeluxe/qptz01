package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
            String output = "";
            if(number % 3 == 0){
                output+="fizz ";
            }
            
            if(number % 5 == 0){
                output+="buzz";
            }
            
            if(output.length() == 0){
                output+=number;
            }
            return output;
    }

}
