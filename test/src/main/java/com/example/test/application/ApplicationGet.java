package com.example.test.application;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Function
 *
 * @author zhangd <zhangd@shinemo.com>
 * @date 2019/11/15 14:46
 */
@Component
public class ApplicationGet implements ApplicationContextAware {
    static ApplicationContext context;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context=applicationContext;
    }

    public static ApplicationContext getContext() {
        return context;
    }
}
