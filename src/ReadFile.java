package intercomTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue;
/*
 * Iterator to find highest N numbers in a large file
 * which will be stored in a queue
 */
public class ReadFile {
	
	// Store highest numbers in a priority-queue
	private static PriorityQueue<Long> queue = new PriorityQueue<Long>();

	// Getter called from main method when file read complete
	public PriorityQueue<Long> getQueue(){
		return queue;
	}

	public void ReadInput(File file, int Nnumbers){

		try{
			//open buff reader to file
			BufferedReader reader = new BufferedReader(new FileReader(file));
			System.out.println("Starting sort....");
			
			//populate queue to begin
			for(long i = 0 ; i < Nnumbers ; i ++){
				queue.add(i);
			}
			
			//read each line and check if higher than lowest in list and swap
			String fileLine = reader.readLine();
			while(fileLine != null){
				
				// control blank lines
				if(fileLine == " "){
					fileLine = "0";
				}
				
				long check = Long.valueOf(fileLine);
				if(check > queue.peek()){
					queue.remove();
					queue.add(check);

				}
				//read next line
				fileLine = reader.readLine();
			}
			System.out.println("File complete!!");
			//close buff reader
			reader.close();

		}catch(IOException e){
			System.out.println(e);
		}
	}
}
