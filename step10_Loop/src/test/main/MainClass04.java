package test.main;

import java.util.Random;

public class MainClass04 {
	public static void main(String[] args) {
		//Random �� ���� �� �� �ִ� Random ��ü ����
		Random ran=new Random();
		
		/*
		 * 1. int �� ������ �� �ִ� �� 5��¥�� int[] ��ü�� �����ؼ� 0~9 ������ ������ ������ ������ ������.
		 * 
		 */
		//������ ���ڸ� ������ int[] ��ü ����
		int[] nums=new int[5];
		
		//�迭�� ���� ������ƴ �ݺ��� ���� 
		for(int i=0; i<nums.length; i++) {
			//0~9 ������ ������ ���� ����
			int ranNum=ran.nextInt(10);
			//i ��° �濡 �����ϱ�
			nums[i]=ranNum;
		}

	}

}
