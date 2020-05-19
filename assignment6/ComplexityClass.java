//p. 888 ex. 4, 5 Complexity classes. Be sure to explain your reasoning for full credit. 
//Write the answers as comments on top of your java file where you solved the following problem. - 40 points
//Code a solution and a test for p. 890, ex 18 Write a modified version sort a selection sort algorithm - 60 points
//David Barnette
//05/19/2020

//*******************************************************************************************************************
//ex4. To which complexity class does the following algorithm belong? Consider N to be the length or size of the array or collection passed to 
//the method. explain your reasoning     

//Answer : O(N)
// The code contains a single for loop (N) with no constants, two
// O(1) statements, and outside of it are two O(1) statements (2N+2)
	public static int[] mystery1(int[] list) {
		int[] result = new int[2 * list.length];
		for (int i=0; i <list.length; i++) {
			result[2*i] = list[i] / 2 + list[i] %2;
			result[2*i+1] = list[i] /2;
		}
		return result;
	}

//*******************************************************************************************************************	
//ex5. To which complexity class does the following algorithm belong?
	
//Answer : O(N)
// The code contains only a single for loop with no constants and
// four O(1) statements inside of it (4N)
	public static void mystery2(int[] list) {  
		for(int i=0; i<list.length /2; i++) { 
			int j = list.length - 1 - i;
			int temp = list[i];
			list[i] = list[j]; 
  			list[j] = temp;
		}
	}

//*******************************************************************************************************************
// write a modified version of the selection sort algorithm that selects the largest element each time and moves it to the end of the array, rather
//than selecting the smallest element and moving it to the beginning. Will this algorithm be faster than the standard selection sort?
//what will its complexity class (big-Oh) be?

//Answer : O(N^2), selection sort is used 2 for loop to return the result. 
//its speed will be the same as standard selection sort, which is also O(N^2). 
	public static int[] modifiedSelectionSort(int[] list){
	     for (int i = 0; i < list.length - 1; i++) {
	    	 int max = i;
	    	 for (int j = i + 1; j < list.length; j++) {
	                if (list[j] < list[max]) {
	                	max = j;
	                }
	    	 }
	    	 int temp = list[i];  
	    	 list[i] = list[max];
	    	 list[max] = temp;
	     }
	     return list;
	}
	
//Test
	public static void main(String[] args){
        int[] num = {10,5,33,52,47,7,81,55};
        int[] test = modifiedSelectionSort(num);
        for(int i : test){
            System.out.print(i + " ");
        }
    }
