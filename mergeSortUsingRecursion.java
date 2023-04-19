/*
Sort an array A using Merge Sort.
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
2 1 5 2 3
Sample Output 2 :
1 2 2 3 5 */

public class solution {

	public static void merge(int[]s1,int[]s2,int[]d){
        int i=0;
        int j=0;
        int k=0;
        while(i<s1.length && j<s2.length){
            if(s1[i]<=s2[j]){
                d[k]=s1[i];
                i++;
                k++;
            }else{
                d[k]=s2[j];
                k++;
                j++;
            }
        }
        if(i<s1.length){
            while(i<s1.length){
                d[k]=s1[i];
                i++;
                k++;
            }
        }
        if(j<s2.length){
            while(j<s2.length){
                d[k]=s2[j];
                k++;
                j++;
            }
        }
    }
    public static void mergeSort(int a[]){
        if(a.length<=1){
            return;
        }
        int b[]=new int[a.length/2];
        int c[]=new int[a.length-b.length];
        for(int i=0;i<a.length/2;i++){
            b[i]=a[i];
        }
        for(int i=a.length/2;i<a.length;i++){
            c[i-a.length/2]=a[i];
        }
        mergeSort(b);
        mergeSort(c);
        merge(b,c,a);
    }

// 	public static void mergeSort(int[] input){

// 		// Write your code here

// 		return mergeSort(input,0,input.length);

		
// 	}
// 		public static void mergeSort(input,si,ei){

// 			int mid = (input[si]+input[ei])/2;

// 			// now we have to start sorting from two halves, the first one is before mid value and the second one is
// 			// from mid value

			
// 			int [] smallArray1 = new int[mid];

// 			// let's  store previous values
// 			for(int i = 0;i<smallArray1.length;i++){

// 				smallArray1[i] = input[i];

// 			}

// 			// sort on the first half 

// 			Arrays.sort(smallArray1);

// 		// now let's work on the second half

// 			int smallArray2 = new int[input.length-mid];

// 			// let's start storing the value

// 		for(int i = smallArray1.length;i<input.length;i++){

// 			smallArray2[i-smallArray1.length] = input[i];

// 		}

// 			// here we sorted the second half
// 			Arrays.sort(smallArray2);

// 			merge(smallArray1,smallArray2,input);
// }

// public static void merge(int []arr1, int []arr2, int []input){

// 	int i = 0;
// 	int j = 0;
// 	int k = 0;
// 	while(i<arr1.length&&j<arr2.length){
// 		if(arr1[i]<=arr2[j]){
// 			input[k]=arr1[i];
// 			i++;
// 			k++;
// 		}
// 		else{
// 			input[k] = arr2[j];
// 			j++;
// 			k++;
// 		}
// 	}

// 	if(i<arr1.length){
// 		while(i<arr1.length){
// 			input[k]=arr1[i];
// 			i++;
// 			k++;
// 		}
// 	}
// 	if(j<arr2.length){
// 		while(j<arr2.length){
// 			input[k] = arr2[j];
// 			j++;
// 			k++;
// 		}
// 	}



// }

