package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Есть два списка с буквами. Определить, является ли один список циклическойверсией другого.
        //Например, для списков {a, b, c, d} и {c, d, a, b} результат будет true, а для {d, e, f} и {d, f, e} - false.

        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");

        List<String> list2 = new ArrayList<>();
        list2.add("c");
        list2.add("d");
        list2.add("a");
        list2.add("b");



        //циклическая версия - когда элементы расположены в одном порядке с каким то шагом
        int shag = list2.indexOf(list1.get(0));
        if (shag==-1) {
            System.out.println("Списки не циклические!");
            return;
        }


       Boolean Rez = true;
       for(int i=0; i<=list1.size()-1;i++) {
           int newind = i+shag;
           if (i+shag>=list1.size()) {
              newind = i+shag-list1.size();
           }

           System.out.println(i + ": " + list1.get(i));
           System.out.println(newind+ ": " + list2.get(newind));

           if (list1.get(i)!=list2.get(newind) ) {
               Rez = false;
               break;
           }

       }

       if (Rez==true) {
           System.out.println("Списки циклические!");
       }
       else {
           System.out.println("Списки НЕ циклические!");
       }

    }
}
