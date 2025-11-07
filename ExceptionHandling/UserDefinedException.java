package ExceptionHandling;

import java.util.Scanner;

public class UserDefinedException
{
  public static void checkAge(int age) throws InvalidAgeException
  {
    if(age < 18)
    {
      throw new InvalidAgeException("Age must be 18 or above to vote");
    }
    
    else
    {
      System.out.println("Eligible to vote");
    }
  }



public static void main(String[] args)
{
  Scanner sc = new Scanner(System.in);
  
  System.out.println("enter your age: ");
  int age = sc.nextInt();
  
  try
  {
    checkAge(age);
  }
  catch(InvalidAgeException e)
  {
    System.out.println("Caught Exception: "+e.getMessage());
  }
  sc.close();
  
}
}

