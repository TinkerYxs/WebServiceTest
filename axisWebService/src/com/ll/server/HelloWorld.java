package com.ll.server;
 
public class HelloWorld {
    public String sayHello(String username){ 
        return spake()+"hello, " + username; 
    } 
    public String spake(){
        return "调用了HelloWorld类的spake方法";
    }
}