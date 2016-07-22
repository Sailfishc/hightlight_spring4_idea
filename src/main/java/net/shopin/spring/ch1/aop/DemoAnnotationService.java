package net.shopin.spring.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * Created by travis on 2016/7/21.
 */
@Service
public class DemoAnnotationService {

    //@Action(name="注解式拦截器的add操作")
    @Action
    public void add(){}
}
