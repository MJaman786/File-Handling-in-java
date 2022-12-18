import java.io.*;

public class CreateFile2 {

	public static void main(String[] args)throws IOException {
		
		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\FILE_HANDLING_IN_JAVA+\\src\\CF2.txt");
		
		if(f.createNewFile())
		{
			System.out.println("File Created Successfully");
		}
		else
		{
			System.out.println("File Already Exist");
		}
		
	}

}
