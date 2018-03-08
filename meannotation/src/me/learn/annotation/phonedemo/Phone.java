package me.learn.annotation.phonedemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * �ֻ�ע��
 * @author wei.sun02
 *
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Phone {
	//�����ֻ�Ʒ������
	enum PhoneBrand{XIAOMI,HUAWEI,APPLE}
	PhoneBrand phoneBrand() default PhoneBrand.HUAWEI;
	
	//�����ֻ��ͺ�����
	String phoneName() default "";
}
