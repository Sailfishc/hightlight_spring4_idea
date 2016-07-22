package net.shopin.spring.ch2.prepost;

/**
 * Created by travis on 2016/7/22.
 */
public class BeanwWayService {


    public void init(){
        System.out.println("@Bean-init-method");
    }

    public BeanwWayService(){
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }

    public void destory(){
        System.out.println("@Bean-destory-method");
    }
}
