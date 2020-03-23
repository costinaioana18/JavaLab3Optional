package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Greedy implements Algorithm {

    int usedW=0; // retine greutatea utilizata a obiectelor aflate in rucsac
    int tVal;//retine valoarea totala a obiectelor aflate in rucsac
    Knapsack knapsack;
    List<Item> items=new ArrayList<Item>(); //lista obiectelor aflate in rucsac

    public Greedy(Knapsack ghiozdan){ //constructor
        this.knapsack=ghiozdan;

    }


    public void printInfo(){
        System.out.println(" The knapsack is: "+ this.knapsack.getName());
    }

    public void addItems(Item item){ //incrcam sa adaugam un obiect in rucsac
        items.add(item);

    }

    public void printAllItems(){//printam toate obiectele aflate in rucsac in urma algoritmului

        for (Item i: items){
            System.out.println(i.getName());
        }
    }

    public void doTheAlgorithm(){ //efectuarea propriu zisa a algoritmului
      Collections.sort(items); //sortam itrems urile in functie de valoare
      for( Item i : items){ //agaugam din vectorul sortat cate un item, pana cand nu ne mai permite capacitatea
//astfel, vom adauga initial cele mai valoroase obiecte (in asta consta algoritmul greedy)
         if(knapsack.capacity>=usedW+i.getWeight()) {
             knapsack.addItem(i);
             usedW = usedW + i.getWeight();//actualizam
         }
      }
        System.out.println("Total value= "+ knapsack.totalValue());
        System.out.println("Total used weight= "+ usedW);




    }

    @Override
    public int getValue() {
        return this.tVal;
    }

    @Override
    public int getUsedW() {
        return this.usedW;
    }



}
