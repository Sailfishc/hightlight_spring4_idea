package net.shopin.spring.ch2.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by travis on 2016/7/22.
 */
public class Main {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        System.out.println(context.getEnvironment());
        context.getEnvironment().setActiveProfiles("dev2");
        context.register(ProfileConfig.class);
        context.refresh();


        DemoBean demoBean = context.getBean(DemoBean.class);


        System.out.println(demoBean.getContent());


        context.close();
    }
}
