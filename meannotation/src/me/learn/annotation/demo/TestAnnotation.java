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
//添加元注解
@Retention(RetentionPolicy.RUNTIME)
//TYPE表示可标注在类上
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface TestAnnotation {
	/*
	 * 1.自定义属性方法,以下格式为默认值
	 * 2.参数成员只能用基本类型byte,short,char,int,long,float,double,boolean八种基本数据类型
	 *   和String、Enum、Class、annotations等数据类型,以及这一些类型的数组
	 * 3.如果是default，可以直接写注解，不用给值
	 */
	
	public int id() default 1;
	
	public String name() default "";
	
	//设置enum格式
	public enum Location {SHANGHAI,BEIJING,GUANGZHOU};
	public Location location() default Location.SHANGHAI;
	
}
