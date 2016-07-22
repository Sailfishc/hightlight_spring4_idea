package net.shopin.spring.ch2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by travis on 2016/7/21.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ELConfig.class);
        ELConfig el = context.getBean(ELConfig.class);
        el.outPutResource();

        context.close();
    }
}
