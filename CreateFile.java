import java.io.*;
public class CreateFile {

	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\FILE_HANDLING_IN_JAVA+\\src\\CreateFile.txt");
		
		try
		{
			if(f.createNewFile())
			{
				System.out.println("File Created Successfully");
			}
			else
			{
				System.out.println("File Already Exist");
			}
		}
		catch(IOException i)
		{
			System.out.println("Exception is handled");
		}
	}

}
