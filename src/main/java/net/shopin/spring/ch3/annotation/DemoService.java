package net.shopin.spring.ch3.annotation;

import org.springframework.stereotype.Service;

/**
 * Created by travis on 2016/7/22.
 */
@Service
public class DemoService {

    public void outputResult(){
        System.out.println("从组合注解配置照样活得bean");
    }
}
