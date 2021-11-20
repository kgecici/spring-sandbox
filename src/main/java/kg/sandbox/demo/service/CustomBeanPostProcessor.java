package kg.sandbox.demo.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof  LifeCycleBean){
            ((LifeCycleBean)bean).beforeInit();
        }
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof  LifeCycleBean){
            ((LifeCycleBean)bean).afterInit();
        }

        return bean;
    }
}

