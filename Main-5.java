import java.util.Scanner; 
// we are using this class to get and store the users inputs

class Main {
  public static void main(String[] args) {
    
    char operator;
    
    double number1, number2, result; 
    // declaring our variables


    Scanner input = new Scanner (System.in); 
    // declaring our class type
    
    System.out.println("Choose one of the following operators: +, -, *, or /");
    
    operator = input.next().charAt(0); 
    // the operator is set to a 'char' and using that the program will know to run one of the four operations 

    System.out.println("Enter first number"); 
    //takes users first input
    
    number1 = input.nextDouble();

    System.out.println("Enter second number"); 
    // takes users second input
    
    number2 = input.nextDouble();

    switch (operator) {

      case '+': // adding the numbers
        
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

      case '-': // subtracting the numbers
        
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      case '*': // multiplying the numbers
        
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

      case '/': // dividng numbers
        
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

      default: // if the user selects an operator that is not one of the four given it will result in an error and will keep running until the user selects one of the four operators
        
        System.out.println("Invalid operator!");
        break;
    }
  }
}