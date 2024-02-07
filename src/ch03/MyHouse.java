package ch03;

public class MyHouse {

	// 전기 연결(어떤 가전이든지 220v 스펙 맞추면 다 쓸 수 있음)
	public static void homeConnect(IElectronic220v iElectronic220v) {
		iElectronic220v.connect();
	}
	
	public static void main(String[] args) {
		
		HairDryer hairDryer = new HairDryer();
		AirConditioner airConditioner = new AirConditioner();
		Cleaner cleaner = new Cleaner();
		
		// 전기 연결 동작 시키기
		homeConnect(airConditioner);
		
		//homeConnect(hairDryer, cleaner); --> 연결 불가 스펙(110v)이 다름 --> 어댑터 필요!
		// 어댑터 클래스 구해오자
		ElectronicAdapter hairDryerAdapter = new ElectronicAdapter(hairDryer);
		homeConnect(hairDryerAdapter);
		
		// 청소기 연결
		ElectronicAdapter cleanerAdapter = new ElectronicAdapter(cleaner);
		homeConnect(cleanerAdapter);
		
	}
}
