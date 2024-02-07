package ch03;

// 추상클래스
// 일본용(110v)
public class HairDryer implements IElectronic110v{

	@Override
	public void connect() {
		System.out.println("헤어드라이기 연결 110v ON");
		
	}

	
	
}
