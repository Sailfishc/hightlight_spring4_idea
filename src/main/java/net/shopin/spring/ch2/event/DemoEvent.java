package net.shopin.spring.ch2.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by travis on 2016/7/22.
 */
public class DemoEvent extends ApplicationEvent {
    private static final long serialVersionUID = 1L;
    private String msg;

    public DemoEvent(Object source, String msg){
        super(source);
        this.msg = msg;
    }


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
