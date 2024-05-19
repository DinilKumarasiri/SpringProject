package com.example;

import com.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien obj1 = context.getBean(Alien.class);
        obj1.code();
        Desktop dt = context.getBean("com2",Desktop.class);
        dt.compile();
//       ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//       Alien obj =(Alien) context.getBean("alien1");
//       //obj.age = 12;
//       // System.out.println(obj.age);
//       obj.code();
        //Alien obj1 =(Alien) context.getBean("alien1");
       // obj1.code();//
        // System.out.println(obj.age);
        //System.out.println( "Hello World!" );
    }
}
