package com.reskov;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.annotation.Authowired;
import org.springframework.beans.factory.stereotype.Service;

import javax.annotations.PostConstruct;

@Service
public class ProductService implements BeanFactoryAware {
    private BeanFactory beanFactory;

    @Authowired
    private PromotionsService promotionsService;

    public ProductService() {
    }

    public ProductService(PromotionsService promotionsService) {
        this.promotionsService = promotionsService;
    }

    @Override
    public void setFactory(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    public BeanFactory getFactoryName() {
        return beanFactory;
    }

    public PromotionsService getPromotionsService() {
        return promotionsService;
    }

    public void setPromotionsService(PromotionsService promotionsService) {
        this.promotionsService = promotionsService;
    }
}
