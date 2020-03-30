package com.qiaochengjie.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		//���� ���������Сֵ�����ֵ֮�� ������0
		for (int i = 0; i < 10; i++) {
			 int k = RandomUtil.random(1, 3);
		     System.out.println(k);
		}
    
	}

	@Test
	public void testSubRandom() {
		//���� ������ɵ�int��������
	int[] random = RandomUtil.subRandom(1, 10, 10);
	for (int i : random) {
		System.out.println(i);
	}

	}

	@Test
	public void testRandomCharacter() {
		//������������ַ�
		for (int i = 0; i < 10; i++) {
			char c = RandomUtil.randomCharacter();
		System.out.println(c);
		}
	
	}

	@Test
	public void testRandomString() {
		//������������ַ���
         String string = RandomUtil.randomString(5);
         System.out.println(string);
	}

}
