/*
int his quesstion you have given a string  such that if the first two letters are p &&i then add the value of 3.14 with it andd make the string like p3.14rit3.14esh
something like this*/


public static String replacePi(String s){
  if(s.length() <=1){
    return s;
  }
  if(s.charAt(0)=='p' && s.charAt(1)=='i'){
    String smallOutput = replacePi(s.subString(2));
    return "3.14"+smallOutput;
  }
  else{
    String smallOutput = replacePi(s.subString(1));
    return s.charAt(0)+smallOutput;
  }
    
