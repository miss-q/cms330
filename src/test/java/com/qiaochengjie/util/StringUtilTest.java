package com.qiaochengjie.util;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		//����string���͵�ֵ�Ƿ����Ҫ��
		String s="����";
     boolean length = StringUtil.hasLength(s);
     System.out.println(length);
	}

	@Test
	public void testHasText() {
		//����string���͵�ֵ�Ƿ����Ҫ��
	 boolean b = StringUtil.hasText("ɶ������");
	 System.out.println(b);
	}

	@Test
	public void testRandomChineseString() throws UnsupportedEncodingException {
      //����������ȵ��ַ�
		String string = StringUtil.randomChineseString(5);
     System.out.println(string);
	}

	@Test
	public void testGenerateChineseName() throws UnsupportedEncodingException {
        //���Դ�������
		String name = StringUtil.generateChineseName();
        System.out.println(name);
	}

}
