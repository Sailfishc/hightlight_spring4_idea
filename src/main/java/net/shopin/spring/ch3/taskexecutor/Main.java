package net.shopin.spring.ch3.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by travis on 2016/7/22.
 */
public class Main {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);

        for(int i=0; i<10; i++){
            asyncTaskService.executeAsynTask(i);
            asyncTaskService.executeAsyncTaskPlus(i);
        }

        context.close();
    }
}
