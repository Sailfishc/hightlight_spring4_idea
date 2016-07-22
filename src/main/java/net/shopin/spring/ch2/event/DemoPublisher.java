package net.shopin.spring.ch2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by travis on 2016/7/22.
 */
@Component
public class DemoPublisher {

    @Autowired
    ApplicationContext applicationContext;


    public void publish(String msg){
        //在这里进行注入的
        applicationContext.publishEvent(new DemoEvent(this, msg));
    }
}
