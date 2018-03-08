package me.learn.annotation.demo;

import me.learn.annotation.demo.TestAnnotation.Location;
/**
 * 使用自定义注解
 * @author wei.sun02
 *
 */
@TestAnnotation(id=11,name="CLASS",location = Location.SHANGHAI)
public class AnnotationDemo {
	
	@TestAnnotation(id=13,name="field1",location = Location.BEIJING)
	private int id;
	@TestAnnotation(id=1,name="field2",location = Location.BEIJING)
	private String name;
	
	@TestAnnotation(id=13,name="construnct",location = Location.SHANGHAI)
	public AnnotationDemo() {
		super();
	}
	@TestAnnotation(id=12,name="method1",location = Location.GUANGZHOU)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@TestAnnotation(id=15,name="method2",location = Location.GUANGZHOU)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
