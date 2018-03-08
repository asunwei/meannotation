package me.learn.annotation.phonedemo;

import me.learn.annotation.phonedemo.Phone.PhoneBrand;

/**
 * ע��ʹ���� 
 * @author wei.sun02
 *
 */
public class PhoneDemo {
	@Phone(phoneBrand=PhoneBrand.XIAOMI,phoneName="MIX2")
	private String Phone;
	@PhoneHardware(cpu="����845",camera="1300��")
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
