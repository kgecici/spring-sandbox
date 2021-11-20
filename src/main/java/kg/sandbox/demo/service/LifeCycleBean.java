package kg.sandbox.demo.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware , ApplicationContextAware {

    @PostConstruct
    public void postConst() {
        System.out.println("Post Contructor");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Pre Destroy");
    }


    public void beforeInit() {
        System.out.println("Before Init");
    }

    public void afterInit() {
        System.out.println("After Init");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("setBeanName:" + s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext");
    }

}
