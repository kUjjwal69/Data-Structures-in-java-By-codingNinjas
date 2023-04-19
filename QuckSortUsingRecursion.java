/*Sort an array A using Quick Sort.
Change in the input array itself. So no need to return or print anything.


Input format :
Line 1 : Integer n i.e. Array size
Line 2 : Array elements (separated by space)
Output format :
Array elements in increasing order (separated by space)
Constraints :
1 <= n <= 10^3
Sample Input 1 :
6 
2 6 8 5 4 3
Sample Output 1 :
2 3 4 5 6 8
Sample Input 2 :
5
1 5 2 7 3
Sample Output 2 :
1 2 3 5 7 */

/*
	To apply the method explained in the hint video, we have to add two more parameters in the function call. This can be done by calling a helper function from given function. The helper function can have three parameters: array, start index, end index.  
	Skeleton code to achieve this:	 */
	public class Solution {
		public static int partition(int input[], int startIndex, int endIndex){
			int pivot = input[startIndex];
			int count = 0;
			for(int i = startIndex+1;i<=endIndex;i++){
				if(input[i]<=pivot){
					count++;
				}
			}
				// now we will replace it with that function

			int pivotIndex = startIndex +count;
			input[startIndex]=input[pivotIndex];
			input[pivotIndex ]=pivot;
				// these will swap the pivot value i.e is required

				// now here we will start the left and right wala part


			int i = startIndex;
			int j = endIndex;
			while(i<j){
				while(i<=endIndex && input[i]<= pivot){
					i++;
				}
				while(input[j]>pivot){
					j--;
				}
				if(i<=j){
					int temp=input[i];
					input[i]=input[j];
					input[j]=temp;
					i++;
					j--;
				}
			}
			return pivotIndex;
		}
		public static void quickSort(int[]input, int startIndex, int endIndex){
			if(startIndex>= endIndex){
				return;
			}
			int partitionIndex=partition(input, startIndex, endIndex);
			quickSort(input , startIndex,partitionIndex-1);
			quickSort(input,partitionIndex+1,endIndex);

		}
		public static void quickSort(int[]input){
			quickSort(input,0,input .length-1);
	}	
}

	
