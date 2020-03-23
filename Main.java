package com.company;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Dragon Rising", 300, 5);
        Book book2=new Book("A Blade in the dark",300,4);
        Weapon weapon1 = new Weapon(TypeOfWeapon.GUN, 5, 10);
        Food food1 = new Food("Cabbage", 2);
        Food food2 = new Food("Rabbit", 2);
        Knapsack knapsack=new Knapsack("knapsack1",10);

        // System.out.println(food1.getValue());
        //System.out.println(book1.getWeight());
        //System.out.println(weapon1.getName());
       // knapsack.addItem(weapon1);
        //knapsack.addItem(book1);
        //knapsack.addItem(food1);
       // System.out.println("The total value is: "+ knapsack.totalValue());
        Knapsack knapsack2=new Knapsack("knapsack2",10);
        Greedy greedyMethod= new Greedy(knapsack2);
        greedyMethod.addItems(book1);
        greedyMethod.addItems(book2);
        greedyMethod.addItems(weapon1);
        greedyMethod.addItems(food1);
       // greedyMethod.addItems(food2);
       // greedyMethod.printInfo();
        //greedyMethod.printAllItems();
        greedyMethod.doTheAlgorithm();
       // greedyMethod.printAllItems();

    }
}
