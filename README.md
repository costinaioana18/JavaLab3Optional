# JavaLab3Optional
Laboratorul 3 optional, care rezolva problema knapsack prin metoda Greedy
Am creat interfetele Item (implementata de clasele Book, Weapon, Food) si Algorithm (Implementata de clasele Greedy si Dynamic-- am rezolvat doar partea Greedy)

Clasa Knapsack are metode precum addItem, prin care adaugam (dupa ce verificam daca este posibil) un obiect la knasack si-i actualizam caracteristicile precum valorea si greutatea obiectelor aflate in el.
Algoritmul Greedy functioneaza infelul urmator: primeste un knapskack (care are o anumita capacitate, desigur), si niste obiecte pe care le tine intr-un array list. 
Cand efectuam algoritmul, prorgamul sorteaza arrayList-ul de obiecte descrescator, in functie de valoarea acestora.
Apoi vom adauga pana cand nu ne mai permite capacitatea, cate un obiect la rucsac. 
Astfel, vom adauga mereu obiectele cele mai valoroase posibile, ajungand la un rezultat optim.

Am utilizat aceleasi date oferite si pe site-ul laboratorului, si am ajuns la acelasi rezultat.
Dupa rularea programului, mi se va afisa:
We added GUN . 
We added Dragon Rising .   //items urile adaugate
We added Cabbage . 
Total value= 19          //valoarea totala a obiectelor din rucsac dupa algortmul greedy
Total used weight= 10   // capacitatea utilizata
