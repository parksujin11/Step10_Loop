package test.main;

import test.dto.MemberDto;

public class MainClass09 {
	public static void main(String[] args) {
		System.out.println("���� �޼ҵ尡 ���� �Ǿ����ϴ�");
		/*
		 * MemberDto ��ü�� ���� �� �ִ� �� 3�� ¥�� �迭 ��ü�� �����ؼ� 
		 * 3���� ȸ�� ������ ���� ������ ������.
		 */
		MemberDto[] member=new MemberDto[3];
		
		MemberDto dto1=new MemberDto(1, "�豸��", "��ŵ�");
		MemberDto dto2=new MemberDto(2, "�ڼ���", "�뷮��");
//		MemberDto dto3=new MemberDto(3, "������", "���｣");
		
		member[0]=dto1;
		member[1]=dto2;
		member[2]=new MemberDto(3, "������", "���｣");
			
		for(int i=0; i<member.length; i++) {
			MemberDto tmp=member[i];
			showInfo(tmp);
		}
		for(MemberDto tmp:member) {
			showInfo(tmp);
		}
				
	}
		//static �ɹ� �޼ҵ�
		public static void showInfo(MemberDto dto) {
			System.out.println("��ȣ:"+dto.getNum());
			System.out.println("�̸�:"+dto.getName());
			System.out.println("�ּ�:"+dto.getAddr());
			System.out.println("-------------------");
			
		}

}