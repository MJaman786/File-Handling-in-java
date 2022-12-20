import java.io.*;

public class WriteFile {

	public static void main(String[] args) {
		
		try 
		{
			FileWriter f = new FileWriter("C:\\Users\\DELL\\eclipse-workspace\\FILE_HANDLING_IN_JAVA+\\src\\CreateFile.txt");
			try
			{
				f.write("Java Programming is for OOP");
				
			}
			finally
			{
				f.close();
			} 
			System.out.println("Succesfully Data is Entered");
		}
		catch(IOException i)
		{
			System.out.println("File not found");
		}

	}

}
