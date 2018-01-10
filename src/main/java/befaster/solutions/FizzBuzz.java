package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzz {
    
    private static Boolean findNumber(int number,int numberToFind){
        
        while(number != 0){
            if(number % 10 == numberToFind){
                return true;
            }
            number/=10;
        }
        
        return false;
    }
    
    private static Boolean isIdentical(int number){
        int firstNumber = number%10;
        number/=10;
        while(number != 0){
            if(number % 10 != firstNumber){
                return false;
            }
            number/=10;
        }
        return true;
    }

    public static String fizzBuzz(Integer number) {
            String output = "";
            if(number % 3 == 0 || findNumber(number,3) == true){
                output+="fizz";
            }
            
            if(output.length() > 0){ 
                if(number % 5 == 0 || findNumber(number,5) == true){
                    output+=" buzz";
                }
            } else if(number % 5 == 0 || findNumber(number,5) == true){
                    output+="buzz";
            }
            
            if(output.length() > 0){
                if(isIdentical(number) == true && number > 10){
                    if(number % 2 == 1){
                        output+=" fake deluxe";
                    } else {
                        output+=" deluxe"; 
                    }
                }
            } else if(isIdentical(number) == true && number > 10){
                    if(number % 2 == 1){
                        output+="fake deluxe";
                    } else {
                        output+="deluxe"; 
                    }
            }
                
            if(output.length() == 0){
                output+=number;
            }
            return output;
    }

}
