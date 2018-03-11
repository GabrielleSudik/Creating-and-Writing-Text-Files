import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

//writing files is similar to reading files
//this code will look a lot like the Try-With lesson

public class Application {

	public static void main(String[] args) {

		//this creates the file you want to write
		File file3 = new File("testthree.txt");

		//this says what the text doc will have in it (surrounded by a try block)
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file3))) {
			//System.out.println("Can't find file: " + file3.toString());
			bw.write("This is line one.");
			bw.write("This is line two.");
			bw.newLine();
			bw.write("Final line");
		} 
		
		//that all created a text doc
		//called testthree.txt
		//it will appear in the project's folder
		//you'll need to refresh it to see, but it's there.
		
		//we didn't study catch in this lesson, it's just left in from before
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Unable to read file: " + file3.toString());
		}

	}

}
