package test.main;

import test.dto.MemberDto;

public class MainClass09 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작 되었습니다");
		/*
		 * MemberDto 객체를 담을 수 있는 방 3개 짜리 배열 객체를 생성해서 
		 * 3명의 회원 정보를 각각 저장해 보세요.
		 */
		MemberDto[] member=new MemberDto[3];
		
		MemberDto dto1=new MemberDto(1, "김구라", "행신동");
		MemberDto dto2=new MemberDto(2, "박수진", "노량진");
//		MemberDto dto3=new MemberDto(3, "용지희", "서울숲");
		
		member[0]=dto1;
		member[1]=dto2;
		member[2]=new MemberDto(3, "용지희", "서울숲");
			
		for(int i=0; i<member.length; i++) {
			MemberDto tmp=member[i];
			showInfo(tmp);
		}
		for(MemberDto tmp:member) {
			showInfo(tmp);
		}
				
	}
		//static 맴버 메소드
		public static void showInfo(MemberDto dto) {
			System.out.println("번호:"+dto.getNum());
			System.out.println("이름:"+dto.getName());
			System.out.println("주소:"+dto.getAddr());
			System.out.println("-------------------");
			
		}

}