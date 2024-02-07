package ch03;

// 일본용(110v) 청소기
// 집에 연결해
public class Cleaner implements IElectronic110v{

	@Override
	public void connect() {
		System.out.println("청소기 연결 110v ON");
		
	}
	
	
}
