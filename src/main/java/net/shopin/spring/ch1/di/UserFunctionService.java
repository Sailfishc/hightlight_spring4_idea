package net.shopin.spring.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by travis on 2016/7/21.
 */
@Service
public class UserFunctionService {


    @Autowired
    FunctionService functionService;

    public  String sayHello(String world) {
        return functionService.sayHello(world);
    }
}
