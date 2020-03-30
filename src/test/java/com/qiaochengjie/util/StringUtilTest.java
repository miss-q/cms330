package com.qiaochengjie.util;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		//测试string类型的值是否符合要求
		String s="请我";
     boolean length = StringUtil.hasLength(s);
     System.out.println(length);
	}

	@Test
	public void testHasText() {
		//测试string类型的值是否符合要求
	 boolean b = StringUtil.hasText("啥第三方");
	 System.out.println(b);
	}

	@Test
	public void testRandomChineseString() throws UnsupportedEncodingException {
      //测试随机长度的字符
		String string = StringUtil.randomChineseString(5);
     System.out.println(string);
	}

	@Test
	public void testGenerateChineseName() throws UnsupportedEncodingException {
        //测试创建姓名
		String name = StringUtil.generateChineseName();
        System.out.println(name);
	}

}
