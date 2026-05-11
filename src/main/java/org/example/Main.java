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

    static void main() {




      Vector<Integer> v = new Vector<>();
      v=getNumbers();
      print(v);
        }
    }

