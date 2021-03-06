package com.wmm.spring.services.init;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import javax.annotation.PostConstruct;

@Component
public class SpringStartUpBean implements InitializingBean, ApplicationContextAware, DisposableBean {
    /**
     * Spring上下文。
     */
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    /**
     * afterPropertiesSet 在init-method前执行
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("执行afterPropertiesSet()");
       /* Assert.notNull(applicationContext, "applicationContext不能为null!");
        Map<String, WebAppStartUpLoader> webAppStartUpLoaderMap = this.applicationContext.getBeansOfType(WebAppStartUpLoader.class);
        if (!CollectionUtils.isEmpty(webAppStartUpLoaderMap)) {
            Set<String> beanNameSet = webAppStartUpLoaderMap.keySet();
            for (String beanName : beanNameSet) {
                System.out.println("开始加载["+beanName+"]......");
                webAppStartUpLoaderMap.get(beanName).load();
            }
        }*/
    }

    @PostConstruct
    public void initPostConstruct(){
        System.out.println("执行PostConstruct注解标注的方法");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("执行destroy()");
    }
}
