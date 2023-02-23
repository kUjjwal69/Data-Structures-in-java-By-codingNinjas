/*Given a string, compute recursively a new string where all 'x' chars have been removed.
Input format :
String S
Output format :
Modified String
Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string S. 
Sample Input 1 :
xaxb
Sample Output 1:
ab
Sample Input 2 :
abc
Sample Output 2:
abc
Sample Input 3 :
xx
Sample Output 3:*/






public class solution {

	// Return the changed string
	public static String removeX(String input){

    return remove_X( input);

	}

	public static String remove_X(String input){

		 if(input.length()==0){

		 return "";

	 }
	 if(input.charAt(0)=='x'){
		 return remove_X(input.substring(1));
	 }
	 	return input.charAt(0) +
				remove_X(input.substring(1));

	}

}
