/*
Given two integers M & N, calculate and return their multiplication using recursion. You can only use subtraction and addition for your calculation. No other operators are allowed.
Input format :
Line 1 : Integer M
Line 2 : Integer N
Output format :
M x N
Constraints :
0 <= M <= 1000
0 <= N <= 1000
Sample Input 1 :
3 
5
Sample Output 1 :
15
Sample Input 2 :
4 
0
Sample Output 2 :
0*/


// public class solution {

// 	public static int multiplyTwoIntegers(int m, int n){
		// Write your code here
	// if(n==0){
	// 	return 0;
	// }
	// if(m==0){
	// 	return -1;
	// }

	// int value = m*n-1;
	// return multiplyTwoIntegers(value+m, n);
	
	// }
	public class solution {
    public static int multiplyTwoIntegers(int m, int n) {
        if (n == 0) {
            return 0;
        } else if (n > 0) {
            return m +multiplyTwoIntegers(m, n - 1);
        } else {
            return -multiplyTwoIntegers(m, -n);
        }
    }
}
	
