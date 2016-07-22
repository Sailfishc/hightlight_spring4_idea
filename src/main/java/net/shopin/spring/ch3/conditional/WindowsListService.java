package net.shopin.spring.ch3.conditional;

/**
 * Created by travis on 2016/7/22.
 */
public class WindowsListService implements ListService {

    @Override
    public String showListCmd() {
        return "dir";
    }
}
