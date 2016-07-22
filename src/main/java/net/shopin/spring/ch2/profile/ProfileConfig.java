package net.shopin.spring.ch2.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by travis on 2016/7/22.
 */
@Configuration
public class ProfileConfig {


    @Bean
    @Profile("dev2")
    public DemoBean devDemoBean() {
        return new DemoBean("from dev profile");
    }


    @Bean
    @Profile("prod")
    public DemoBean prodDemoBean() {
        return new DemoBean("from prod profile");
    }
}
