package net.shopin.spring.ch1.javaconfig;

/**
 * Created by travis on 2016/7/21.
 */
public class UseFunctionService {


    FunctionService functionService;

    public void setFunctionService(FunctionService functionService){
        this.functionService = functionService;
    }


    public String sayHello(String world) {
        return functionService.sayHello(world);
    }
}
