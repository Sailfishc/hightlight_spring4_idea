package net.shopin.spring.ch3.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by travis on 2016/7/22.
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {

    private String beanName;
    private ResourceLoader loader;

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }


    public void outputResult(){
        System.out.println("Bean的名称为："+beanName);
        //String s = ;
        Resource resource = loader.getResource("classpath:net/shopin/spring/ch3/aware/test.txt");
        try {
            //resource.getInputStream()会抛出异常。
            System.out.println(resource.toString());
            System.out.println("ResourceLoader加载的文件内容是："+ IOUtils.toString(resource.getInputStream()));
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
