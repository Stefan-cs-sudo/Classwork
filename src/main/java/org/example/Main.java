package org.example;

import java.util.Vector;

import static java.lang.IO.print;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static Vector<Integer> getNumbers()
    {

        Vector<Integer> v = new Vector<>();
        for(int i=0;i<100;i++)
        {
            v.add(i);
        }

   return v;
    }

    public static Vector<Integer> filterEvenNumbers(Vector<Integer> v) {
        Vector<Integer> v2 = new Vector<>();
        for (Integer a : v) {

        if (a % 2 == 0) {
            v2.add(a);

        } //povesti din foclorul maghiar


    }
      return v2;
    }

    public static Vector<Integer> filterOddNumbers(Vector<Integer> v) {
        Vector<Integer> v2 = new Vector<>();
        for (Integer a : v) {

            if (a % 2 == 1) {
                v2.add(a);

            }


        }
        return v2;
    }

    static void main() {




      Vector<Integer> v = new Vector<>();
      v=getNumbers();
      print(v);
      v.stream().forEach(System.out::println);
      v= filterEvenNumbers(v);
      System.out.println();
      print(v);
      v=getNumbers();
      v= filterOddNumbers(v);
      System.out.println();
      print(v);
     v =getNumbers();
     v= filterEvenNumbers(v);



        }
    }

