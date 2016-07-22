package net.shopin.spring.ch1.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by travis on 2016/7/21.
 */
@Configuration //这个注解在没有bean注解的情况下加不加好像没有影响
@ComponentScan("net.shopin.spring.ch1.di")
public class DiConfig {

}
