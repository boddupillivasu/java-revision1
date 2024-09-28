package com.charset.day1;

public class Charset {
    public static void main(String[] args) {


        //package ->lowercase case
        //class and variables and methods and constructions->pascal case or camel case

        /*
       In java the charset :-
       the charset is a collection of charectors in java

       the charset can classified in three types:-

       1.ascii(american standard code information interchange)
       -> the acscii charecter contains 7 bits charecterset  that is 128 charecters that includes normal alphabets and both upeer and lower cases

       2.iso-8859(latin-1)

       ->he iso charecter contains 8 bits charecterset  that is 256 charecters and is superset of ascii

        3.unicode
       ->it is used to represent the charcters


         */

        char ascii;
        ascii = 'A';
        int asciivalue;
        asciivalue = (int) ascii;
        System.out.println("the asciivalue of A is:" + asciivalue);

    }
}
