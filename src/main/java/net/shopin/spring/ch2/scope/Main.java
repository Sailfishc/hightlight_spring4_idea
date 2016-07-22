package net.shopin.spring.ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by travis on 2016/7/21.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);

        DemoSigletonService s1 = context.getBean(DemoSigletonService.class);
        DemoSigletonService s2 = context.getBean(DemoSigletonService.class);


        System.out.println("s1是否和s2相等"+s1.equals(s2));
        System.out.println("p1是否和p2相等"+p1.equals(p2));


        context.close();

    }
}
