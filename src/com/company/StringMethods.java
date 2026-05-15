package com.company;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Jayendra";

        /* name.length(); defines the length of string, name is the variable assigned to String it may be anyting i.e.(String jay = "jayendra"; ) then we write jay.length(); ,
         (String friend = "jayendra"; ) then we write friend.length(); , etc.... */
        int value = name.length();
        System.out.println(value);
// this will return 8 because word "jayendra" has 8 characters.

        String lstring = name.toLowerCase();
        System.out.println(lstring);
//This will write whole word in lower case including words in upper case such as we written "Jayendra" here J is capital hence this will return jayendra here j is in lower case.

        String ustring = name.toUpperCase();
        System.out.println(ustring);
//This will write whole word in capital letters.

        String nonTrimmedString = "      Kasera    ";
        System.out.println(nonTrimmedString);
//This will not remove(trim) spaces.
        //System.out.println(nonTrimmedString.trim());
        /* or */   //The purpose and meaning of 24th and 25th,26th line is same just the way of writing it different.
        String trimmedstring = nonTrimmedString.trim();
        System.out.println(trimmedstring);
        //This will remove(trim) spaces.

        System.out.println(name.substring(3));

        System.out.println(name.substring(4,7));
// it prints characters from word from index.
// index of name Jayendra is  0 1 2 3 4 5 6 7 , index of string always start from 0.

        System.out.println(name.replace('J' ,'V'));
        System.out.println(name.replace("Jay", "vij"));
        System.out.println(name.replace("a", "ka"));
// this replaces choosen character with a new given character.
// targeted character or targeted part of word is case sensetive, i.e. String name = "Jayendra" , then if want to replace J write it in capital because capital word written in string.

        System.out.println(name.startsWith("jay"));
        System.out.println(name.startsWith("Jay"));
// return true if string starts with Jay otherwise it will return false

        System.out.println(name.endsWith("dra"));
        System.out.println(name.endsWith("rk"));
// it checks the ending of string, working is same as startsWith

        System.out.println(name.charAt(2));
// return character at a given index position. Y in this case!

        System.out.println(name.indexOf("ye"));
        System.out.println(name.indexOf("a"));

        String modifiedName = "Harryrry";
        //System.out.println(modifiedName.indexOf("rry"));
        System.out.println(modifiedName.indexOf("rry" , 4));
// indexOf starts finding targeted word from begining.
        System.out.println(modifiedName.lastIndexOf("rry"));
        System.out.println(modifiedName.lastIndexOf("rry", 4));
// lastIndexOf starts finding targeted word from end.

        System.out.println(name.equals("Jayendra"));
        System.out.println(name.equals("jayendra"));
// returns true if given String is equal to "Jayendra" otherwise false [case sensitive]

        System.out.println(name.equalsIgnoreCase("jayendra"));
// This is same as name.equals but it is not case sensetive.


                          /* Escape Sequence */

       //  System.out.println("I am escape sequence " jayendra ");
        System.out.println("I am escape sequence \" jayendra ");
        System.out.println("I am escape sequence \n jayendra ");
        System.out.println("I am escape sequence \t jayendra ");
        System.out.println("I am escape sequence \r jayendra ");
// above line will give error, \ is used to print double quote(") , backslash(\), for more make a google search -----> java oracle escape sequences

 /*      Escape Sequence	                      Description
              \t                	Insert a tab in the text at this point.
              \b	                Insert a backspace in the text at this point.
              \n	                Insert a newline in the text at this point.
              \r	                Insert a carriage return in the text at this point.
              \f	                Insert a form feed in the text at this point.
              \'	                Insert a single quote character in the text at this point.
              \"                  	Insert a double quote character in the text at this point.
              \\	                Insert a backslash character in the text at this point.                 */
    }
}
