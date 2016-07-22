package net.shopin.spring.ch1.di;

import org.springframework.stereotype.Service;

/**
 * Created by travis on 2016/7/21.
 */
@Service
public class FunctionService {


    public String sayHello(String world) {
        return "hello" + world + "!";
    }
}

