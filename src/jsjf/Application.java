
package jsjf;
import java.util.Scanner;

/**
 * 
 * @author trentondethy
 *
 */


public class Application{

	public static void main(String[] args){ 
		
		//initialize variables
				
				String a = "y";
				
				while (a.equalsIgnoreCase("y")) {
					String test, r = ""; 
					// creates a stack that can hold characters
					ArrayStack<Character> lion = new ArrayStack<Character>();
				
					//initializes scanner
					Scanner  scan = new Scanner(System.in);
				
					
					System.out.println("Type in a phrase;");
					
					//scanner for user to input a phrase
					test = scan.nextLine();
				
					
					// converts the string to array of characters
					char input[] = test.toCharArray();
				  
					// loops over each char of the string
						for(int i = 0; i < test.length(); i++){
							if(input[i] != ' '){
								
								lion.push(input[i]);
							}
							else{
								// pops the characters from the stack
								while(!lion.isEmpty())
									r += lion.pop();
									// creates a space in between each word
									r += " ";
								}
						}
						// pops the characters from the stack 
						while(!lion.isEmpty())
							r += lion.pop();
				  
						// print the output
						System.out.println("");
						System.out.println("Phrase with all words reversed is");
						System.out.println(r);
				
						//Spacer Line
						System.out.println("");
						//lets the user type in another sentence
						System.out.println("Would you like to enter another sentence? (Y/N)");
						a=scan.nextLine();
					}
					System.out.println("<GOODBYE>");
				}
	}
	

	

		
		
	

		
		
		
		
		
		