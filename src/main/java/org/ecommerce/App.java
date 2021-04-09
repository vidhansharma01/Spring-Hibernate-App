package org.ecommerce;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach coach = context.getBean("trachCoach", Coach.class);

        System.out.println(coach.instruction());

        System.out.print(coach.getDailyFortune());


    }
}
