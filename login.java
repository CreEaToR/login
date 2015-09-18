
import java.util.Scanner;

public class login{

        public static void main(String args[]){



	        //variables used for when the user enters their username and password
	String username2 = null;

        String password2 = null;
        
	Scanner input = new Scanner(System.in); //import scanner for user input


	 System.out.println("Creating a account...."); 
	 
	 System.out.println("Enter a USERNAME"); //Create username

         String username = input.next();

	System.out.println("Enter a PASSWORD"); //Create password

	String password = input.next();

       System.out.println("Welcome! Please enter your Username and password");

      System.out.print("Username: "); //enter username

	username2 = input.next();

       System.out.print("Password: ");  //enter password

       password2 = input.next();
																
	if(username == username2 && password == password2) // checks if the username and password matches
																        {


																	        System.out.println("Welcome "+ username);

//result 1


																		        }
																		        else
																			        {


																			System.out.println("Wrong Username or Password");
//result2
																						        }

																							}


																							}

