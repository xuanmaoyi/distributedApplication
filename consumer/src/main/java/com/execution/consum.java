package com.execution;

import com.service.inf.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by maoyi.xuan on 2017/4/25.
 */
public class consum {
    public  static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:settings/dubbo-consumer.xml"});
        context.start();
        HelloService helloService = (HelloService)context.getBean("helloService"); // 获取远程服务代理
        helloService.sayHello(); // 执行远程方法
    }
}
