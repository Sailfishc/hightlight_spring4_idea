package net.shopin.spring.ch3.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by travis on 2016/7/22.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        DemoService demoService = context.getBean(DemoService.class);

        demoService.outputResult();

        context.close();
    }
}
