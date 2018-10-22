#Laboratorijske vežbe – dvočas br. 1

##Zadatak 1
*(radi ga laborant u saradnji sa studentima)*

Napraviti klasu **Televizor** u paketu **zadatak1**. Ova klasa bi trebalo da ima: 

1. Atribut **jacinaTona**. Početna vrednost za jačinu tona je 0 (smatra se da je ton isključen tj. nula).

2. Atribut **ukljucen**. Početna vrednost za atribut uključen je false (smatra se da je televizor na početku ugašen).

3. Atribut **program**. Početna vrednost za program je 1.

4. Metodu **pojacajTon** koja, kada se pozove, pojačava ton televizora za jedan. 

5. Metodu **smanjiTon** koja, kada se pozove, smanjuje ton televizora za jedan. 

6. Metodu **iskljuciTon** koja potpuno utišava ton (smanjuje vrednost jačine tona na 0).

7. Metodu **ukljuci** koja postavlja vrednost atributa uključen na true (tj. uključuje televizor)

8. Metodu **iskljuci** koja postavlja vrednost atributa uključen na false (tj. isključuje televizor)

9. Metodu **daLiJeUkljucen** koja vraća vrednost atributa uključen

10. Metodu **vratiJacinuTona** koja vraća trenutnu vrednost jačine tona

11. Metodu **promeniProgram** koja kao parametar dobija novu vrednost za program i postavlja vrednost atributa program na unetu vrednost.

12. Metodu **ispisi** koja ispisuje na ekranu trenutne vrednosti svih atributa uz odgovarajuću poruku

Napraviti i klasu **ProbaTelevizor** u paketu **zadatak1** koja u main metodi kreira jedan objekat klase Televizor i poziva njegove metode: pojacajTon, ispisi, iskljuci i vratiJacinuTona. Dodeliti atributu program vrednost 5.


##Zadatak 2
*(studenti rade sami)*

Napraviti klasu **Radio** u paketu **zadatak2**. Ova klasa bi trebalo da ima:

1. Atribut **ukljucen**.Početna vrednost za atribut ukljucen je false (smatra se da je radio na početku ugašen).

2. Atribut **trenutnaFrekvencija**. Početna vrednost za trenutnu frekvenciju je 87.5 (megaherca).

3. Metodu **promeniFrekvencijuNavise** koja povećava trenutnu frekvenciju za 0.1 megaherca (npr .ako je trenutna frekvencija 100.7 onda menja na 100.8)

4. Metodu **promeniFrekvencijuNanize** koja smanjuje trenutnu frekvenciju za 0.1 megaherca (npr .ako je trenutna frekvencija 99.3 onda menja na 99.2)

5. Metodu **postaviFrekvenciju** koja kao parametar dobija novu vrednost za frekvenciju i postavlja vrednost atributa trenutnaFrekvencija na unetu vrednost.

6. Metodu **vratiTrenutnuFrekvenciju** koja vraća trenutnu frekvenciju na koju je radio podešen

7. Metodu **ukljuci** koja postavlja vrednost atributa ukljucen na true (tj. uključuje radio)

8. Metodu **iskljuci** koja postavlja vrednost atributa ukljucen na false (tj. isključuje radio)

9. Metodu **daLiJeUkljucen** koja vraća vrednost atributa ukljucen

10. Metodu **ispisi** koja ispisuje na ekranu trenutne vrednosti oba atributa uz odgovarajuću poruku

Napraviti i klasu **ProbaRadio** u paketu **zadatak2** koja u main metodi kreira jedan objekat klase Radio i poziva sve njegove metode. Posle poziva svake metode pozvati metodu ispisi i uočiti razlike u trenutnim vrednostima atributa.