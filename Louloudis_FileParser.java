import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Louloudis_FileParser {

	
	public Louloudis_FileParser() 
	{
	}
	
	public ArrayList<String> parseFile(ArrayList<String> L, File file)throws FileNotFoundException{
				
			Scanner input = new Scanner(file);

			while (input.hasNext())
			{
			L.add(input.next());
			}
			input.close();
			return L;

	}
}