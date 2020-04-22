package jsjf;
import java.util.Scanner;
/**
 * 
 * @author trentondethy
 *
 */

public class ArrayStackTest{

	public static void main(String[] args){
			
			//creates new stack object
		
			ArrayStack<Integer> kobe = new ArrayStack<Integer>();
			
			//test
			
			String a = "y";
			Scanner  scan = new Scanner(System.in);
			
			while (a.equalsIgnoreCase("y")) {
			//test
			  
			 
			
				//tests isEmpty() method, should be true
				System.out.println("Is stack empty?" + kobe.isEmpty());

					//test tells what number is being pushed
					System.out.println("Pushing 60");
						//pushes the number into the Stack Array
						kobe.push(60);

					System.out.println("Pushing 81");

						kobe.push(81);

					System.out.println("Pushing 4");

						kobe.push(4);

					System.out.println("Pushing 8");

						kobe.push(8);
					
					System.out.println("Pushing 24");

						kobe.push(24);
						
				//tests isEmpty() method again, this time making it false
				System.out.println("Is stack empty?" + kobe.isEmpty());
				//tests stack size() method
				System.out.println("Stack size = " + kobe.size());
				//tests toString() method
				System.out.println("Stack contents = " + kobe.toString());


				
				
				//pops the numbers out of the stack array and prints them
				System.out.println("Pop = " + kobe.pop());

				System.out.println("Pop = " + kobe.pop());

				System.out.println("Pop = " + kobe.pop());

				System.out.println("Pop = " + kobe.pop());
				
				System.out.println("Pop = " + kobe.pop());

				
				//test
				System.out.println("Would you like to enter another sentence? (Y/N)");
				a=scan.nextLine();
				//test
				  
				 
					
					}
				}//close main

			}//close class
