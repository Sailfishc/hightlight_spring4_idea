package net.shopin.spring.ch1.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by travis on 2016/7/21.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        String javaconfig = useFunctionService.sayHello("javaconfig");
        System.out.println(javaconfig);
        context.close();
    }
}
