package com.company;

public class IncreamentOrDecreamentOpratrs {
    public static void main(String[] args) {
      // a++ , ++a ---> increment operators
      // a-- , --a ---> decreament operators
// Quick Quiz --->
// try increment and decrement operators on a java variable.
    // a++ ---> first use the value and then increment
    // ++a ---> first increment the value then use it.
        int i = 56 ;
       // int b = i++ ; // first b is assigned i (56) and then i is incremented.
      //  int j = 67;
      //  int c = ++j ; //first j is incremented and then c is assigned to j (68).

        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

// Quick Quiz
// what will be the value of following expression (x)
        int y = 7 ;
        int x = ++y * 8;
        System.out.println(x);
// another quiz
char ch = 'a';
        System.out.println(++ch);
    }
}
