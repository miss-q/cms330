package com.qiaochengjie.util;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() throws UnsupportedEncodingException {
		Calendar c = Calendar.getInstance();
		c.set(2010, 0, 1);
		
	  for (int i = 0; i < 10000; i++) {
		Person person = new Person();
		person.setName(StringUtil.generateChineseName());
		person.setAge(RandomUtil.random(1, 120));
		person.setAbout(StringUtil.randomChineseString(140));
		person.setCreated(DateUtil.randomDate(c.getTime(), new Date()));
		System.out.println(person);
	}
	}

}
