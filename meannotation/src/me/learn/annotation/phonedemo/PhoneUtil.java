package me.learn.annotation.phonedemo;

import java.lang.reflect.Field;
/**
 * 处理注解的工具类
 * @author wei.sun02
 *
 */
public class PhoneUtil {
	public static void main(String[] args) throws ClassNotFoundException {
		getPhoneInfo();
	}
	public static void getPhoneInfo() throws ClassNotFoundException {
		Class clazz = Class.forName("me.learn.annotation.phonedemo.PhoneDemo");
		Field[] fields = clazz.getDeclaredFields();
		for(Field field:fields) {
			if(field.isAnnotationPresent(Phone.class)) {
				Phone phone = (Phone)field.getAnnotation(Phone.class);
				System.out.println(phone.phoneBrand()+"/"+phone.phoneName());
			} else if(field.isAnnotationPresent(PhoneHardware.class)) {
				PhoneHardware phoneHardware = (PhoneHardware)field.getAnnotation(PhoneHardware.class);
				System.out.println(phoneHardware.cpu()+"/"+phoneHardware.camera());
			}
		}
	}
}
