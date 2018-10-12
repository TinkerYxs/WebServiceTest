package com.ll.server;
 
public class HelloWorld {
    public String sayHello(String username){ 
		PerInfo perInfo = new PerInfo();
        perInfo.setName("元晓帅");
		return spake() + "hello, " + username + perInfo.name;
    } 
    public String spake(){
        return "调用了HelloWorld类的spake方法";
    }
}