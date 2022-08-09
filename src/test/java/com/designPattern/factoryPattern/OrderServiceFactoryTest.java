package com.designPattern.factoryPattern;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;


@SpringBootTest
class OrderServiceFactoryTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void test(){

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();

        for(String bean: beanDefinitionNames){
            System.out.println(bean);
        }
    }

/*    @Autowired
    private OrderServiceFactory orderServiceFactory;

    @Test
    void getOrderService(){

        OrderService baminOrderService = orderServiceFactory.getOrderService(OrderType.BAEMIN);
        OrderService yogiyoOrderService = orderServiceFactory.getOrderService(OrderType.YOGIYO);
        OrderService naverOrderService = orderServiceFactory.getOrderService(OrderType.NAVER);


        baminOrderService.orderFood();
        yogiyoOrderService.orderFood();
        naverOrderService.orderFood();


    }*/

}