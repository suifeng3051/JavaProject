package com.heaven.progress.thread;

public class Customer implements Runnable{
	SteamBreadStack sbs = null;  
    public Customer(SteamBreadStack sbs) {  
        super(); 
        this.sbs = sbs;  
    }  
 
    public void run() {  
       while(true){//开始消费馒头  
        	
            SteamBread stb = sbs.popBread();  
            System.out.println("消费了馒头"+stb);  
        }  
    }     
}
