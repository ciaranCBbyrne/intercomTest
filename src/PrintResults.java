package intercomTest;

import java.util.PriorityQueue;
/*
 * Class to print out results.
 */

public class PrintResults {
	
	public PrintResults(PriorityQueue<Long> mainQ, int Nnumbers){
		
		// Remove the lowest terms that aren't required
		while(mainQ.size() > Nnumbers){
			mainQ.remove();
		}
		
		/* Get the N terms in the correct order for printing
		 * Array will hold contents of queue
		 */
		long[] reverseOrder = new long[mainQ.size()];
		for(int i = 0 ; i < reverseOrder.length ; i++){
			reverseOrder[i] = mainQ.poll();
		}
		
		// Print contents of array in descending order
		int marker = 1;
		for(int j = reverseOrder.length - 1 ; j >= 0 ; j--){
			System.out.println(marker + ")" + reverseOrder[j]);
			marker ++;
		}
	}
}
