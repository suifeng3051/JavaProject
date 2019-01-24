package com.heaven.progress.thread;

public class Producer implements Runnable{
	SteamBreadStack sbs = null;  
    Producer(SteamBreadStack sbs){  
        this.sbs = sbs;  
    }  

    public void run() {  
        // 开始生产馒头  
       int i=0;
       while(true){
            SteamBread sb = new SteamBread(i++);  
            System.out.println("生产了馒头："+sb);  
            sbs.pushBread(sb);
        }  
    }  
}
