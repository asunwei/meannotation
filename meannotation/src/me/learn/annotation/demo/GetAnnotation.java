package me.learn.annotation.demo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class GetAnnotation {
	public static void main(String[] args) throws ClassNotFoundException {
		printAnnotation();
		printMethodAnnotation();
		printFieldAnnotation();
		printConstrunctAnnotation();
	}
	
	
	/*
	 * 获取类上标注的注解
	 */
	public static void printAnnotation() throws ClassNotFoundException {
		Class clazz = Class.forName("me.learn.annotation.demo.AnnotationDemo");
		Annotation[] annotations = clazz.getAnnotations();
		for(Annotation annotation : annotations) {
			TestAnnotation test = (TestAnnotation)annotation;
			System.out.println(test.id()+"/"+test.name()+"/"+test.location());
		}
	}
	
	/*
	 * 获取作用方法上注解
	 */
	public static void printMethodAnnotation() throws ClassNotFoundException {
		Class clazz = Class.forName("me.learn.annotation.demo.AnnotationDemo");
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods) {
			if(method.isAnnotationPresent(TestAnnotation.class)) {
				TestAnnotation test = (TestAnnotation)method.getAnnotation(TestAnnotation.class);
				System.out.println(test.id()+"/"+test.name()+"/"+test.location());
			}
		}
		
	}
	
	/*
	 * 获取作用属性上注解
	 */
	public static void printFieldAnnotation() throws ClassNotFoundException {
		Class clazz = Class.forName("me.learn.annotation.demo.AnnotationDemo");
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields) {
			if(field.isAnnotationPresent(TestAnnotation.class)) {
				TestAnnotation test = (TestAnnotation)field.getAnnotation(TestAnnotation.class);
				System.out.println(test.id()+"/"+test.name()+"/"+test.location());
			}
		}
	}
	
	/*
	 * 获取作用属性上注解
	 */
	public static void printConstrunctAnnotation() throws ClassNotFoundException {
		Class clazz = Class.forName("me.learn.annotation.demo.AnnotationDemo");
		Constructor[] cons = clazz.getConstructors();
		for(Constructor con : cons) {
			if(con.isAnnotationPresent(TestAnnotation.class)) {
				TestAnnotation test = (TestAnnotation)con.getAnnotation(TestAnnotation.class);
				System.out.println(test.id()+"/"+test.name()+"/"+test.location());
			}
		}
	}
}
