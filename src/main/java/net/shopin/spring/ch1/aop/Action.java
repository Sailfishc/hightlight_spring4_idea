package net.shopin.spring.ch1.aop;

import java.lang.annotation.*;

/**
 * Created by travis on 2016/7/21.
 */

//注解和xml类似，本身没有功能，就是元数据：它们是解释数据的数据
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name() default "注解式拦截器的add操作";
}
