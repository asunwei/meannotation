package me.learn.annotation.phonedemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 手机硬件注解
 * @author wei.sun02
 *
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface PhoneHardware {
	//手机CPU型号
	String cpu() default "";
	//手机像素
	String camera() default "";
}
	
	
