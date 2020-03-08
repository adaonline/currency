package com.ada.annoations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用来标记为线程安全的类
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE) //编译忽略这个注解
public @interface ThreadSafe {
    String value() default "";
}
