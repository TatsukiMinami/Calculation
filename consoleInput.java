import java.io.Console;

class studio {
  
  public static void main(String[] Args){
    int firstNumber = inputNumber("Please enter number");
    System.out.println(firstNumber);
    String operator = operator("Please enter operator");
    System.out.println(operator);
    int secondNumber = inputNumber("Please enter 2ndnumber");
    System.out.println(secondNumber);
    int result = calculation(firstNumber, secondNumber, operator);
    System.out.println(result);
  }

  private static int inputNumber(String msg){
    int number =0;
    try{
        System.out.print(msg);
        number = Integer.parseInt(System.console().readLine());
      }
    catch(Exception e){
        number = inputNumber(msg);
      }
      return number;
    }

  private static String operator(String msg) {
    String operator = "";
      System.out.print(msg);
      operator = System.console().readLine();
      if(!(operator.equals("+")) && !(operator.equals("-")) && !(operator.equals("*")) && !(operator.equals("/"))){
        operator = operator(msg);
      }
      return operator;
  }
  private static int calculation(int firstNumber,int secondNumber,String operator){
    int sum =0;
    if(operator.equals("+")){
      sum = firstNumber + secondNumber; 
    }
    else if(operator.equals("-")){
      sum = firstNumber - secondNumber;
    }
    else if(operator.equals("*")){
      sum = firstNumber * secondNumber;
    }
    else if(operator.equals("/")){
      try{
        sum= firstNumber / secondNumber;
      }
      catch(Exception e){
        System.out.print("Devide by zero!");
      }
    }
    return sum;   
  }
}
