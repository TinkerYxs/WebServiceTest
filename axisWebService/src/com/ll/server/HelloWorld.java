package com.ll.server;
 
public class HelloWorld {
    public String sayHello(String username){ 
		PerInfo perInfo = new PerInfo();
        perInfo.setName("Ԫ��˧");
		return spake() + "hello, " + username + perInfo.name;
    } 
    public String spake(){
        return "������HelloWorld���spake����";
    }
}