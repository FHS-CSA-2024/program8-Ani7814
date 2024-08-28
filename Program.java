//import stuff here
import java.util.Scanner;
//Your code here

public class Program8{
    public static void main(String[] args){
        //input
        Scanner calc = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Enter number 1: ");
        num1 = calc.nextInt();
        System.out.println("Enter number 2: ");
        num2 = calc.nextInt();
        
    }
    
    
     //calculate
    public int sum(int number1, int number2){
        return number1+number2;
    }
    
    public int difference(int number1, int number2){
        return(number1-number2);
    }
    public int product(int number1, int number2){
        return(number1*number2);
    }
    public double average(int number1, int number2){
        return (double)number1+(double)number2/2.0;
    }
    public int max(int number1, int number2){
        if (number1>number2){
            return number1; 
        }
        
        else if(number1<number2){
            return number2;
        }
    }
    public int min(int number1, int number2){
        if(number1>number2){
            return number2;
        }
        else if(number1<number2){
            return number1;
        }
    }
    
    }
    
    

//Paste console output below:
/*


*/
