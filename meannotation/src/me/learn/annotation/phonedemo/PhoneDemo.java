package me.learn.annotation.phonedemo;

import me.learn.annotation.phonedemo.Phone.PhoneBrand;

/**
 * 注解使用类 
 * @author wei.sun02
 *
 */
public class PhoneDemo {
	@Phone(phoneBrand=PhoneBrand.XIAOMI,phoneName="MIX2")
	private String Phone;
	@PhoneHardware(cpu="骁龙845",camera="1300万")
	private String phoneHardware;
	public PhoneDemo() {
		super();
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getPhoneHardware() {
		return phoneHardware;
	}
	public void setPhoneHardware(String phoneHardware) {
		this.phoneHardware = phoneHardware;
	}
}
