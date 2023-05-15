package com.reskov;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.stereotype.Component;

import javax.annotations.PostConstruct;

@Component
public class PromotionsService implements BeanNameAware, InitializingBean {
    private String beanName;

    @Override
    public void afterPropertiesSet() {
        System.out.println("PropertiesSet : " + this.getClass());
    }
    @PostConstruct
    public void postConst() {
        System.out.println("PostConstruct : " + this.getClass());
    }
    @Override
    public void setBeanName(String name) {
        beanName = name;
    }

    public String getBeanName() {
        return beanName;
    }
}
