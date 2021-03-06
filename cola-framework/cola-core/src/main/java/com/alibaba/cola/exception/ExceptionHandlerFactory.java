package com.alibaba.cola.exception;

import com.alibaba.cola.common.ApplicationContextHelper;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;

/**
 * ExceptionHandlerFactory
 *
 * @author Frank Zhang
 * @date 2019-01-08 9:51 AM
 */
public class ExceptionHandlerFactory {

    public static ExceptionHandlerI getExceptionHandler(){
        try {
            return ApplicationContextHelper.getBean(ExceptionHandlerI.class);
        }
        catch (NoSuchBeanDefinitionException ex){
            return DefaultExceptionHandler.singleton;
        }
    }

}
