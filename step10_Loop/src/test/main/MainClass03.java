package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 * 방 10 개 짜리 int[] 객체를 만들고 각각의 방에 순서대로 1..10을 넣어 보세요
		 */
		int[] nums=new int[10];
		for(int i=0; i<nums.length; i++) {
			nums[i]=i+1;
		}
	}
}
