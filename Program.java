//import stuff here
import java.util.Scanner;
//Your code here

public class Program8{
    
    public static void main(String[] args){
        Scanner calc = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Enter number1: ");
        num1 = calc.nextInt();
        System.out.println("Enter number2: ");
        num2 = calc.nextInt();
        System.out.println("Sum = "+sum(num1, num2));
        System.out.println("difference = "+difference(num1,num2));
        System.out.println("product = "+product(num1, num2));
        System.out.println("average = "+average(num1, num2));
        System.out.println("absolute value = "+absoluteValue(num1, num2));
        System.out.println("maximum = "+max(num1, num2));
        System.out.println("minimum = "+min(num1, num2));
    
    }
    
     //calculate
    public static int sum(int number1, int number2){

        return number1+number2;
    }
    
    public static int difference(int number1, int number2){
        return(number1-number2);
    }
    
    public static int product(int number1, int number2){
        return(number1*number2);
    }
    
    public static double average(int number1, int number2){
        double answer = ((double)number1+number2)/2.0;
        return answer;
    }
    
    public static int absoluteValue(int number1, int number2){
        int answer = Math.abs(number1-number2);
        return answer;
    }
    public static int max(int number1, int number2){
        if (number1>number2){
            return number1; 
        }
        
        else if(number1<number2){
            return number2;
        }
        else{
            return (0);
        }
    }
    
    public static int min(int number1, int number2){
        if(number1>number2){
            return number2;
        }
        else if(number1<number2){
            return number1;
        }
        else{
            return (0);
        }
    }
    
    }
    
    

//Paste console output below:
/*
Enter number1: 
13
Enter number2: 
20
Sum = 33
difference = -7
product = 260
average = 16.5
absolute value = 7
maximum = 20
minimum = 13
*/
