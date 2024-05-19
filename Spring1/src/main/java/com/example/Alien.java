package com.example;


public class Alien {

    private int age = 0;
    private Computer com;


    public Alien(){
        System.out.println("Object Created");
    }
//    public Alien(int age, Computer com){
//        System.out.println("Para Constructor Called");
//        this.age = age;
//    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public Computer getCom() {
        return this.com;
    }
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("Coding");
    }
}
