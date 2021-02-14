package com.oophomework;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    //    private com.oophomework.Person[] persoane = new com.oophomework.Person[4];
//
//    public com.oophomework.Person[] getPersoane() {
//        return persoane;
//    }
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

}
