package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzz {
    
    private static Boolean findNumber(int number){
        
        while(number != 0){
            if(number % 10 == number){
                return true;
            }
            number/=10;
        }
        
        return false;
    }

    public static String fizzBuzz(Integer number) {
            String output = "";
            if(number % 3 == 0 || findNumber(3) == true){
                output+="fizz";
            }
            
            if(output.length() > 0){ 
                if(number % 5 == 0 || findNumber(5) == true){
                    output+=" buzz";
                }
            } else if(number % 5 == 0 || findNumber(5) == true){
                    output+="buzz";
            }
                
            if(output.length() == 0){
                output+=number;
            }
            return output;
    }

}
