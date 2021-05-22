package LearnJavaTrailPackage;

import java.io.File;
import java.io.IOException;

public class Experiments {
	
	public static void main (String[] args) {
	
	File f = new File("a.txt") ;
	
	try {
		if (f.createNewFile()) {
			System.out.println("new file created");
			
		}
		
		else {
			System.out.println("already exists");
			System.out.println("File name" + f.getName());
			System.out.println("Path" + f.getAbsolutePath());
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	System.out.println(f.canExecute());
	System.out.println(f.canRead());
	System.out.println(f.canWrite());
	
	}
}
