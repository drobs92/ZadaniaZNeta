package Kolekcje.ArrayLista;

import java.util.ArrayList;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();//powołanie array listy mającej integery
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);//5 elementów dodanych o wartościach 1 2 3 4 5
        arrayList.add(0, 100); //dodany 6 element ale na miejscu pierwszym
        System.out.println(arrayList.size());//wielkość 6
        System.out.println(arrayList.contains(6));//false nie ma takiego elementu
        System.out.println(arrayList.get(4));//podaj wartość indeksu 4
        arrayList.remove(Integer.valueOf(3));//usuń pierwszą napotkaną 3
        arrayList.remove(2);//usuń indeks 2
        System.out.println("rozmiar po usunięciu "+ arrayList.size());
        for (Integer i:arrayList){
            System.out.print(i+ " ");//elementy tablicy
        }
    }
}
