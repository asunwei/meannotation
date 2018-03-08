package me.learn.annotation.demo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation demo
 *
 * @author wei.sun02
 *
 */
//���Ԫע��
@Retention(RetentionPolicy.RUNTIME)
//TYPE��ʾ�ɱ�ע������
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface TestAnnotation {
	/*
	 * 1.�Զ������Է���,���¸�ʽΪĬ��ֵ
	 * 2.������Աֻ���û�������byte,short,char,int,long,float,double,boolean���ֻ�����������
	 *   ��String��Enum��Class��annotations����������,�Լ���һЩ���͵�����
	 * 3.�����default������ֱ��дע�⣬���ø�ֵ
	 */
	
	public int id() default 1;
	
	public String name() default "";
	
	//����enum��ʽ
	public enum Location {SHANGHAI,BEIJING,GUANGZHOU};
	public Location location() default Location.SHANGHAI;
	
}
