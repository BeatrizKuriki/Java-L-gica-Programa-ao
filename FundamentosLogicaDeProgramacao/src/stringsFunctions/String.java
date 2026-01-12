package stringsFunctions;

import java.util.Arrays;

public class String {

	public static void main(java.lang.String[] args) {
		
		java.lang.String original = "abcde FGHIJ ABC abc DEFG   ";
		
		
		java.lang.String s01 = original.toLowerCase();
		java.lang.String s02 = original.toUpperCase();
		java.lang.String s03 = original.replace('a', 'B');
		int s04 = original.lastIndexOf('A');//12
		int s05 = original.indexOf('b');//o primeiro index com a string será mostrado, se houver dois .
		java.lang.String s06 = original.substring(2, 9);
	    java.lang.String s07 = original.substring(5);
	    java.lang.String s08 = original.trim();
	    java.lang.String s = "potato apple lemon";
	    java.lang.String[] vect = s.split(" ");
	    
	    
		
		System.out.println("ORIGINAL: ["+original +"]" );
		System.out.println("toLowerCase:["+ s01 +"]");
		System.out.println("toUpperCase: ["+ s02+"]");
		System.out.println("REPLACE: ["+ s03+"]");
		System.out.println("LAST INDEX: ["+ s04+"]");
		System.out.println("INDEX: ["+ s05+"]");
		System.out.println("SUBSTRING: ["+ s07+"]");
		System.out.println("TRIM:["+ s08+ "]");
		System.out.println("Sub: ["+s06+"]");
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		
		
		

	}

}
