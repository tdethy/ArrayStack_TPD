import java.util.Scanner;

public class Hold.java

		//initialize variables
		String test, r = "", a = "y";
		
		while (a.equalsIgnoreCase("y")) {
		
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
		
		
		
		
public static String reverseString(String s){  
			
			//initialize variables
			String test, r = "", a = "y";
			
			//creates stack object
			ArrayStack<Character> lion = new ArrayStack<Character>();
			
		    StringBuilder sb = new StringBuilder(s);  
		    
		    //scans in a phrase to be later reversed
		    Scanner scan = new Scanner(System.in);
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
			
			
		 
			sb.reverse();  
		    
		    return sb.StringBuilder;
		    
		    
		    
		 // prompt for input
		    Scanner kb = new Scanner(System.in);
		    System.out.print("Enter a sentence: ");
		    String sentence = kb.nextLine();

		    // print it reversed
		    Scanner chopper = new Scanner(sentence);
		    while(chopper.hasNext())
		    {
		    System.out.print(reverse(chopper.next())+" ");
		    }
		    }

		    public static String reverse(String s)
		    {
		    Stack<Character> stack = new Stack<Character>();

		    for(char c : s.toCharArray())
		    stack.push(c);

		    String output = "";

		    while(!stack.isEmpty())
		    output += stack.pop();

		    return output;
		    }
		    
		    
		    
		    
		    
		    
		    