package com.company;

public class StringPracticeSet01 {
    public static void main(String[] args) {

// write a java convert a String to lowercase
        String name = "Jayendra Kasera";
        name = name.toLowerCase();
        System.out.println(name);

// write a java programe to replace spaces with underscore.
        String JK = "Jayenddra Kasera    RATLAM";
        JK = JK.replace(" " , "_");
        System.out.println(JK);

// problem 3 video https://youtu.be/MO3GfaHwHsw?list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q
           String letter = "Dear <|name|> , Thanks a lot!";
           letter = letter.replace("<|name|>" , "Jayendra");
           System.out.println(letter);

// write a java programme to detect double and triple spaces in a String.
           //String newString = "This line contains   double and triple spaces"; // this has double and triple space both.
           String newString = "This line contains  double and triple spaces"; // this has only double space.
        System.out.println(newString.indexOf("  ")); // this is used to check index of double space.
        System.out.println(newString.indexOf("   ")); // this is used to check index of triple space.
       // uncomment line 22 and commentout line 23 then also run and check difference.
        // As line 23 does not contain triple space it return -1 for that.

// problem 5 video ----> https://youtu.be/MO3GfaHwHsw?list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q
        String letter2 = "Dear Harry,\n\t This java course is Nice.\n Thanks!";
        System.out.println(letter2);

    }
}
