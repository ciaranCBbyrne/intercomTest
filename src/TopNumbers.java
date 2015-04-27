package intercomTest;

/* This program will take a file of numbers
 * and return N-amount of the highest numbers
 * to the console 
 */
import java.io.File;
import java.util.PriorityQueue;

public class TopNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		// NumberFile.txt is 1.3GB
		// Nnumbers is the amount of numbers required back
		File file = new File("NumberFile.txt");
		int Nnumbers = 20;
		
		// Stores returned queue
		PriorityQueue<Long> queue = new PriorityQueue<Long>(); 
		
		//start timer and heap-size
		long startTime = System.currentTimeMillis();
		Runtime runtime = Runtime.getRuntime();
		long space = runtime.freeMemory();
		
		/*ReadFile connects to the file through buffered reader
		 * and reads each line, putting the highest in an ordered
		 * list
		 */
		ReadFile readfile = new ReadFile();
		readfile.ReadInput(file,Nnumbers);
		queue = readfile.getQueue();
		
		//Print results of program to console
		new PrintResults(queue, Nnumbers);
		
		long timeTaken = System.currentTimeMillis() - startTime;
		long spaceUsed =  space - runtime.freeMemory();
		System.out.println("Total time taken using BuffReader: " + timeTaken + "ms");
		System.out.println("Space used: " + spaceUsed / (1024 * 1024) + "MB");
	}
}
