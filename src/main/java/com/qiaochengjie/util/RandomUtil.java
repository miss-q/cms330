package com.qiaochengjie.util;

import java.util.Random;

public class RandomUtil {
	//����1������min-max֮����������������min��maxֵ�������緵��1-3֮������������ô����1��2��3������ȷ�ģ�����4�Ͳ��ԡ� (5��)
	public static int random(int min, int max){
		Random random = new Random();	
		int num=random.nextInt(max)+1;
		return num;
	//TODO ʵ�ִ���
	}
	//����2������Сֵmin�����ֵmax֮���ȡsubs�����ظ����������������1-10֮��ȡ3�����ظ����������
	//��ô[2,6,9]�ǶԵģ�[3,5,5]�򲻶ԣ���Ϊ5�ظ��ˡ�Ӧ�ó�������100ƪ���������ȡ10ƪ���£��¿����ܻ�ʹ�õ��� (8��)
	public static int[] subRandom (int min, int max, int subs){
		//����int���͵����鳤��
		int str[] = new int[subs];
		for (int i = 0; i < subs; i++) {
			str[i]=random(min, max);
		}
		return str;
	//TODO ʵ�ִ���
	}
	//����3������1��1-9,a-Z֮�������ַ��� (8��)
	public static char randomCharacter (){
	String str ="01234567989qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
	char c = str.charAt(random(0, 61));
		return c;
	//TODO ʵ�ִ���
	}
	//����4�����ز���length���ַ���(5��)�������ڲ�Ҫ����randomCharacter()���� (4��)
	public static String randomString(int length){
		String str = "";
		for (int i = 0; i < length; i++) {
			str+=randomCharacter();
		}
		return str;
	//TODO ʵ�ִ���
	}
}
