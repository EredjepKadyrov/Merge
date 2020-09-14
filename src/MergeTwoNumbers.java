import java.util.Arrays;
import java.util.Comparator;

public class MergeTwoNumbers {
     public static void mergeNumbers(TwoNumbers arr[]) {
    	 
    	 Arrays.sort(arr, new Comparator<>() {

		
			public int compare(TwoNumbers n1, TwoNumbers n2) {
				// TODO Auto-generated method stub
				return n2.start - n1.start;
			} 
    	 });
    	 
    	 int index = 0;
    	 for (int i =1; i < arr.length; i++) {
    		 if(arr[index].end >= arr[i].start) {
    			 arr[index].end = Math.max(arr[index].end,arr[i].end);
    			 arr[index].start = Math.max(arr[index].start, arr[i].start);
    		 }
    		 else {
    			 index++;
    			 arr[index] = arr[i];
    		 }
    	 }
    	 System.out.println("Output");
    	 for (int i = 0; i <= index; i++) {
    		 System.out.println("[" + arr[i].start + "," + arr[i].end + "]");
    	 }
     }
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoNumbers arr[] = new TwoNumbers[4];
		arr[0]=new TwoNumbers(25,30); 
        arr[1]=new TwoNumbers(2,19); 
        arr[2]=new TwoNumbers(14,23); 
        arr[3]=new TwoNumbers(4,8); 
		mergeNumbers(arr);
	}

}

