package test.main;

import test.mypac.Pen;

public class MainClass06 {
	public static void main(String[] args) {
		//Pen ��ü�� �����ؼ� write() �޼ҵ带 ȣ���� ������
		Pen a=new Pen("pink");
		a.write().write().write();
		
		Pen p2=new Pen("blue");
		p2.write().draw().write();
		
	}
}
