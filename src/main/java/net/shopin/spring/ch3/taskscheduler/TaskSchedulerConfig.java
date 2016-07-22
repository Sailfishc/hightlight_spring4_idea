package net.shopin.spring.ch3.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by travis on 2016/7/22.
 */
@Configuration
@ComponentScan("net.shopin.spring.ch3.taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {

}
