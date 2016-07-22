package net.shopin.spring.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by travis on 2016/7/21.
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {


}
