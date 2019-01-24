package com.heaven.progress.rmi;

/**
 * Created by whd@zizizizizi.com on 2016/6/22.
 */
public class HelloServiceImpl implements HelloService{
    public String sayHello(String name) {
        return "hello:"+name;

    }
}
