package net.shopin.spring.ch2.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by travis on 2016/7/22.
 */
@Configuration
@ComponentScan("net.shopin.spring.ch2.prepost")
public class PrePostConfig {


    @Bean(initMethod = "init", destroyMethod = "destory")
    BeanwWayService beanwWayService(){
        return new BeanwWayService();
    }

    @Bean
    JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }
}
