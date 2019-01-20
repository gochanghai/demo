package com.gochanghai.leadservice.common.annotation;

import java.lang.annotation.*;

/**
 * <pre>
 *  系统日志注解
 * </pre>
 * <small> 2019年1月14日 | Changhai</small>
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Log {
    String value() default "";
}
