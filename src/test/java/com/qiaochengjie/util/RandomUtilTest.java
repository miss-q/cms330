package com.qiaochengjie.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		//测试 随机数在最小值到最大值之间 不包括0
		for (int i = 0; i < 10; i++) {
			 int k = RandomUtil.random(1, 3);
		     System.out.println(k);
		}
    
	}

	@Test
	public void testSubRandom() {
		//测试 随机生成的int类型数组
	int[] random = RandomUtil.subRandom(1, 10, 10);
	for (int i : random) {
		System.out.println(i);
	}

	}

	@Test
	public void testRandomCharacter() {
		//测试生成随机字符
		for (int i = 0; i < 10; i++) {
			char c = RandomUtil.randomCharacter();
		System.out.println(c);
		}
	
	}

	@Test
	public void testRandomString() {
		//测试随机生成字符串
         String string = RandomUtil.randomString(5);
         System.out.println(string);
	}

}
