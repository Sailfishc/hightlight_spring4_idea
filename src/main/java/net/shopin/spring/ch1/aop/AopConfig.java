package net.shopin.spring.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by travis on 2016/7/21.
 */
@Configuration
@ComponentScan("net.shopin.spring.ch1.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}
