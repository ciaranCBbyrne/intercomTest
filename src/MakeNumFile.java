package intercomTest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.stream.LongStream;
/*
 * Class to create random numbers and
 * place them in a file line by line
 */
public class MakeNumFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long mill = 1000000; // Amount of numbers required
		long track = 1;
		Random rand = new Random();
		
		try{
			BufferedWriter output = new BufferedWriter(new FileWriter(new File("NumbersFile.txt")));
			
			while(track <= mill){
				long number = rand.nextInt(1000000);
				String strNum = String.valueOf(number);
				output.write(strNum + '\n');
				track ++;
			}
			System.out.println();
			System.out.println("Complete");
			output.close();
			
		}catch(IOException e){
			System.out.println(e);
		}
	}

}
