package com.heaven.progress.rmi;

import java.rmi.Remote;

/**
 * Created by whd@zizizizizi.com on 2016/6/22.
 */
public interface HelloService extends Remote{
    String sayHello(String name);
}
