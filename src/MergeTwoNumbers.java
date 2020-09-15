import java.util.Arrays;
import java.util.Comparator;

public class MergeTwoNumbers {
     public static void mergeNumbers(TwoNumbers arr[]) {
    	 
    	// Sort intervals
    	 Arrays.sort(arr, new Comparator<TwoNumbers>() {
			public int compare(TwoNumbers n1, TwoNumbers n2) {
				// TODO Auto-generated method stub
	            if(n1.start == n2.start) {
	               return n1.end - n2.end;
	            }
				   return n1.start - n2.start;
			} 
    	 });
    	 
    	 int index = 0; //index of last element
    	 for (int i =1; i < arr.length; i++) {
    		 // If this is not first Interval and overlaps  
             // with the previous one 
    		 if(arr[index].end >= arr[i].start) {
    			 // Merge previous and current Intervals 
    			 arr[index].end = Math.max(arr[index].end,arr[i].end);
    			 arr[index].start = Math.min(arr[index].start, arr[i].start);
    		 }
    		 else {
    			 index++;
    			 arr[index] = arr[i];
    		 }
    	 }
    	 System.out.println("Output result: ");
    	 for (int i = 0; i <= index; i++) {
    		 System.out.println("[" + arr[i].start + "," + arr[i].end + "]");
    	 }
     }
     
   // overlapping and print the result 
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoNumbers arr[] = new TwoNumbers[4];
		arr[0]=new TwoNumbers(25,30); 
//		arr[0]=new TwoNumbers(100,490);
        arr[1]=new TwoNumbers(2,19); 
        arr[2]=new TwoNumbers(14,23); 
        arr[3]=new TwoNumbers(4,8); 
		mergeNumbers(arr);
	}

}

