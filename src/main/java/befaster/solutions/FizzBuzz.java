package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        for(int i = 1; i<=100; ++i){
            String output = "";
            if(i % 3 == 0){
                output+="fizz ";
            }
            
            if(i % 5 == 0){
                output+="buzz";
            }
            
            if(output.length() == 0){
                output+=i;
            }
            return output;
        }
    }

}
