package com.oophomework;

public class PersonSorter {

    public void descrescator(Person[] array) {
        boolean swapped = true;
        Person temp;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array [i].getAge() < array [i+1].getAge()) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                swapped = true;

            }
        }
    }
    }


    public void crescator(Person[] array) {
        boolean swapped = true;
        Person temp;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i].getAge() > array[i+1].getAge()) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;

                }
            }
        }
    }
}
