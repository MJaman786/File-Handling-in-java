import java.io.*;

public class fileInfo {

	public static void main(String[] args)throws IOException {
		
		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\FILE_HANDLING_IN_JAVA+\\src\\CF2.txt");
		
		if(f.exists()){
			
			//This are methods for file 
			System.out.println("File Name "+f.getName());
			System.out.println("File Path "+f.getAbsolutePath());
			System.out.println("File Writable "+f.canWrite());
			System.out.println("File Readable "+f.canRead());
			System.out.println("File Size Data "+f.length());
			//to delete file after exicution
			System.out.println("File Remove(delete)"+f.delete());
			
		}
		else {
			
			System.out.println("File Does not Exists");
		}
	}

}

/*
 ======================================output=======================================
 File Name CF2.txt
File Path C:\Users\DELL\eclipse-workspace\FILE_HANDLING_IN_JAVA+\src\CF2.txt
File Writable true
File Readable true
File Size Data 0
File Remove(delete)true

 */
