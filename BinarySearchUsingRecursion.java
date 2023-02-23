/*

here we will use the concept of binary search in recursions without the use of loops
also instead using the loops we will use the concepts of recursions here to solve our problems*/

public static int binarySearch(int a[],int si,int ei,int x){
        if(si>ei){
            return -1;
        }
        int midIndex=(si+ei)/2;
        if(a[midIndex]==x){
            return midIndex;
        }else if(a[midIndex]<x){
            return binarySearch(a,midIndex+1,ei,x);
        }else{
            return binarySearch(a,si,midIndex-1,x);
        }
    }
// this is just a method rest of the work is upto you now
