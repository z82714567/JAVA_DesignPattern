package ch03;

// 어탭터 클래스 만들기
// 1. 기존 사용하는 스펙을 구현
public class ElectronicAdapter implements IElectronic220v {

	// 2. 변환 하고자 하는 기능을 포함 관계로 만들어 준다.
	private IElectronic110v iElectronic110v;
	
	// 3. 생성자 주입을 통해서 의존 주입 받을 수 있도록 설계한다.
	public ElectronicAdapter(IElectronic110v electronic110v) {
		this.iElectronic110v = electronic110v;
	}
	
	
	@Override
	public void connect() {
		// 4. 호환처리
		iElectronic110v.connect();
		
	}

	
	
}
