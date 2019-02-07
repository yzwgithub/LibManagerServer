package org.andios.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Constant {
    public static ApplicationContext context;

    public static ApplicationContext getContext(){
        if (context==null){
            context=new ClassPathXmlApplicationContext("org/andios/config/applicationContext.xml");
        }
        return context;
    }

    public static int toInt(String s){
        int data=Integer.parseInt(s);
        return data;
    }
}
