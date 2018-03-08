package me.learn.annotation.phonedemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 手机注解
 * @author wei.sun02
 *
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Phone {
	//定义手机品牌属性
	enum PhoneBrand{XIAOMI,HUAWEI,APPLE}
	PhoneBrand phoneBrand() default PhoneBrand.HUAWEI;
	
	//定义手机型号属性
	String phoneName() default "";
}
