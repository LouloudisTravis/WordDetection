import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Louloudis_SpellChecker {

	
	public static void main(String[] args){
		
		//Instantiating the objects I need.
	
		Louloudis_FileParser parse = new Louloudis_FileParser();
		
		ArrayList<String> dictionaryList = new ArrayList<String>();
		
		ArrayList<String> compareList = new ArrayList<String>();
		
		//Asking user for file path to "dictionary" .txt file
		
		System.out.println("Enter the file path for your dictionary text: ");
		
		Scanner input = new Scanner(System.in);
		
		File file1 = new File(input.nextLine());
			
		try {
		parse.parseFile(dictionaryList, file1);
			}
			catch (Exception e)
					{
						System.out.println("Dont forget '.txt'!, Because your file wasn't found.");
					}
		
		System.out.println("Enter the file path for your Comparable text: ");
		
				File file2 = new File(input.nextLine());
		
		try {
			parse.parseFile(compareList, file2);
				}
				catch (Exception e)
						{
							System.out.println("Dont forget '.txt'!, Because your file wasn't found.");
						}
		
		input.close();
		compareList.removeAll(dictionaryList);
		
		for(String word: compareList){
			
		System.out.print(" " + word + " " + "is an unknown word. \n");
		}
	}
}
