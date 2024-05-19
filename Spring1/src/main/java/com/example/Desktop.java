package com.example;

import org.springframework.beans.factory.BeanFactory;

public class Desktop implements Computer{

    public Desktop(){
        System.out.println("Desktop Object Created..");
    }
    @Override
    public void compile() {
        System.out.println("Compiling using desktop");
    }

}
