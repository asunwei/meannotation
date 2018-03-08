package me.learn.annotation.phonedemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * �ֻ�Ӳ��ע��
 * @author wei.sun02
 *
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface PhoneHardware {
	//�ֻ�CPU�ͺ�
	String cpu() default "";
	//�ֻ�����
	String camera() default "";
}
	
	
