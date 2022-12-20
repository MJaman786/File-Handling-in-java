//import java.io.*;
////import java.io.FileReader;
//
//public class ReadFile {
//
//	public static void main(String[] args) {
//		
//		try
//		{
//			//FileReader class from io package 
//			FileReader f = new FileReader("C:\\Users\\DELL\\eclipse-workspace\\FILE_HANDLING_IN_JAVA+\\src\\CreateFile.txt"); 
//			try
//			{
//				int i;
//				/*
//				 NOW,
//				 i = will store all Ascci value of that character
//				 so we will convert it into charcter
//				 i.e ((char)i) 
//				 */
//				while((i=f.read())!=-1)
//					{
//						System.out.print((char)i);
//					}
//			}
//			finally
//			{
//				f.close();
//			}
//		}
//		catch(IOException i) {
//			System.out.println("Exception is handel");
//		}
//	}
//
//}
