package net.shopin.spring.ch3.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * Created by travis on 2016/7/22.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration  //元注解
@ComponentScan  //元注解
public @interface WiselyConfigutation {

    String [] value() default {};
}
