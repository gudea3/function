package com.oophomework;

public class Main {
    public static void main(String[] args) {
        Person[] persoane = new Person[4];

        persoane [0] = new Person("Andrei", "Pop", 28);
        persoane [1] = new Person("Ioana", "Sas", 25);
        persoane [2] = new Person("Alin", "Baidoc", 31);
        persoane [3] = new Person("Lehel", "Cojan", 22);

        PersonSorter sorter = new PersonSorter();
        sorter.descrescator(persoane);

        for (int i=0;i<persoane.length;i++){
            System.out.println(persoane[i].getFirstName() + " " + persoane[i].getLastName() + " " + persoane[i].getAge());
        }

        System.out.println("-----------------------------");

        sorter.crescator(persoane);
        for (int i=0;i<persoane.length;i++){
            System.out.println(persoane[i].getFirstName() +" " + persoane[i].getLastName() +  " " + persoane[i].getAge());
        }

    }


}

