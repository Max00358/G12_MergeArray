//START the program
//CREATE while loop to loop the program
	//CONSTRUCT variables
	//ASK the user to input the first array
	//CREATE a while loop that loops when input0 is larger than 0
		//LET input0 equal to the user input
		//IF input0 larger than 0, add input0 into the first array list
		//ELSE terminate the while loop
	//CREATE a while loop that loops when inputNew is larger than 0
		//LET inputNew equal to the user input
		//IF inputNew is larger than 0, then add inputNew into the second array list
		//ELSE terminate the while loop
	//CREATE a for loop to output the first array list 
	//CREATE another for loop to output the second array list
	//CREATE a nested for loop to sort the elements within the first array from smallest to largest
	//CREATE another nested for loop to sort the elements within the second array from smallest to largest
	//COPY the first array into the merged array
	//CREATE a for loop to expand the merged array by putting in elements in the second array
	//CREATE a nest for loop to sort the elements within merged array from the smallest to the largest
	//CREATE a for loop to output the merged array elements by elements in order
	//ASK the user whether they want to try the program again.
	//COLLECT user input
		//IF the answer is yes, then loop the while loop to start the program from the beginning
		//ELSE end the program by ending the while loop

import java.util.*;
import java.io.*;

public class MergeArrays{
	
	public static void main(String[] args)throws IOException{
	
		Scanner userInput = new Scanner(System.in);//Create scanner to scan user inputs
		
		int loop = 1;
		while(loop == 1){//Create a while loop to loop the entire program
			
			//Construct variables
			ArrayList<Integer> list1 = new ArrayList<Integer>();
			ArrayList<Integer> list2 = new ArrayList<Integer>();
			ArrayList<Integer> listMerge = new ArrayList<Integer>();
			int input0 = 1;
			int inputNew = 1;
			int input = 0;
			int inputNew2 = 0;
			int replace1;
			int replace2;
			int replace3;
			int replace4;
			int num = 0;
			int num2 = 0;
			int switch1;
			int switch2;
			String answer;
			
			System.out.print("\033[H\033[2J");//Clear the console for aesthetic purpose
			//Inform the user to enter values for the first array and other basic instructions 
			System.out.println("Enter the values for the FIRST array, up to 10000 values \nMake sure to hit enter after inputting an integer. \nEnter zero or a negative number to quit:");
			
			//Construct a while loop that allows the user to continuously enter positive integers into the arrayList
			while( input0 > 0 ){
				//Create try and catch statement to prevent the user from breaking the code if user accidentally enters letters or other special characters
				try{
					input0 = userInput.nextInt();//Let input0 equal to the user input
					
					//if input0 is larger than 0, then add that input0 value into list1
					if(input0 > 0){
						list1.add(input0);
					}
					
					//else terminate the while loop
					else{
						break;
					}
				}
				//When the user enters special characters or letters, inform user that their inputs are invalid and let them enter again, then scan the incoming input from the user
				catch(Exception ex){
					System.out.print("\033[H\033[2J");
					System.out.println("Invalid input! Your input probably isn't a positive integer. \nEnter again: ");
					userInput.next();
				}
			}
			
			//Clear the console, inform user basic instructions for them to enter values for the second arrayList
			System.out.print("\033[H\033[2J");
			System.out.println("Enter the values for the SECOND array, up to 10000 values. \nMake sure to hit enter after inputting an integer. \nEnter zero or a negative number to quit:");
		
			//Create a while loop that allows the user to enter positive integers into the second arrayList continuously 
			while( inputNew > 0 ){
				//Create try and catch statement to avoid users from entering values that are not integers
				try{
					inputNew = userInput.nextInt();//Store the scanning result into inputNew
					
					//if the user input is a positive integer, then add that input into list2
					if(inputNew > 0){
						list2.add(inputNew);
					}
					//else terminate the while loop
					else{
						break;
					}
				}
				//create catch statement that informs user that their inputs are invalid when the user inputs a non-integer value
				catch(Exception ex){
					System.out.print("\033[H\033[2J");
					System.out.println("Invalid input! Your input probably isn't a positive integer. \nEnter again: ");
					userInput.next();//Read the incoming input from user
				}
			}
			
			System.out.print("\033[H\033[2J");
			System.out.println("First Array: ");
			
			//Create a for loop that repeat as many times as the length/size of list1 to output every element within the arrayList in order
			for(int i = list1.size(); i > 0; i--){
				System.out.print(list1.get(input) + " ");
				input++;
			}
		
			System.out.println("\nSecond Array: ");
			
			//Create a for loop that repeat as many times as the length/size of list2 to output every element within the arrayList in order
			for(int i = list2.size(); i > 0; i--){
				System.out.print(list2.get(inputNew2) + " ");
				inputNew2++;
			}
			
			//Sort list1 elements from smallest to largest by constructing a nested for loop
			for(int a = 0; a < list1.size(); a++){
				for(int b = a; b < list1.size(); b++){
					//if index a value is larger than index b value, then switch the order of the two elements in list1 
					if(list1.get(a) > list1.get(b)){
						replace1 = list1.get(a);
						replace2 = list1.get(b);
						list1.set(b,replace1);
						list1.set(a,replace2);
					}
				}
			}
			
			//Sort list1 elements from smallest to largest by constructing a nested for loop
			for(int a = 0; a < list2.size(); a++){
				for(int b = a; b < list2.size(); b++){
					//if index a value is larger than index b value, then switch the order of the two elements in list2
					if(list2.get(a) > list2.get(b)){
						replace3 = list2.get(a);
						replace4 = list2.get(b);
						list2.set(b,replace3);
						list2.set(a,replace4);
					}
				}
			}
			//let copy all the sorted elements within list1 into listMerge
			listMerge = new ArrayList<Integer>(list1);
			
			//Construct a for loop that repeats as many times as the length/size of list2 to add in all the elements within list2 into listMerge
			for(int i = 0; i < list2.size(); i++){
				listMerge.add(list2.get(num));
				num++;
			}
			
			//Construct an integer named merge that combines the length/size of list1 and list2
			int merge = list1.size() + list2.size();
			
			//Construct a nested for loop to sort listMerge from smallest to largest
			for(int a = 0; a < merge; a++){
				for(int b = a; b < merge; b++){
					//if index a value is larger than index b value, then switch up the order of the two elements in listMerge
					if(listMerge.get(a) > listMerge.get(b)){
						switch1 = listMerge.get(a);
						switch2 = listMerge.get(b);
						listMerge.set(b,switch1);
						listMerge.set(a,switch2);
					}
				}
			}
			
			System.out.println("\nMerged Array: ");
			//Construct a for loop that repeats as many times as the size of int merge to output the elements within the sorted listMerge in order
			for(int i = merge; i > 0; i--){
				System.out.print(listMerge.get(num2) + " ");
				num2++;
			}
			
			//Ask user whether they want to try the program one more time, collect and store user input in a string named "answer"
			System.out.println("\nDo you wish to try this program one more time? (yes / no)");
			answer = userInput.next();
			
			//repeat the program if user answers "yes"
			if(answer.equalsIgnoreCase("yes")){
				loop = 1;
			}
			//else thank the user for trying out the program and end the program(by ending the while loop that loops the entirety of the program)
			else{
				System.out.print("\033[H\033[2J");
				System.out.println("Thank you for trying out this program. Goodbye!");
				loop = 0;
			}
		}
	}
}