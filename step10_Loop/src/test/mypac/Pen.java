package test.mypac;

public class Pen {
	//�ɹ��ʵ�
	public String color;
	//������
	public Pen(String color) {
		this.color=color;
	//this-> �� �������� �ڱ� �ڽ��� �������� ����Ű�� �����
	//������ �������� color �� �����Ƿ� this. ���� ���� 
	}
	//�ɹ� �޼ҵ�
	public Pen write() {
		System.out.println(this.color+" �� Pen ���� �ʱ⸦ �ؿ�");
		return this;
		
	}
	public Pen draw() {
		System.out.println(color+" �� Pen ���� �׸��� �׷���");
		return this;
	}
	
}
