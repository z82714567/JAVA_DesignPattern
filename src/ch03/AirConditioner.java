package ch03;

// 추상클래스
// 한국용(220v)
public class AirConditioner implements IElectronic220v{

	@Override
	public void connect() {
		System.out.println("에어컨 연결 220v ON");
		
	}

	
	
}
