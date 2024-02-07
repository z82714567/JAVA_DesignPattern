package ch01;

// 싱글톤 패턴으로 만들어 보기
public class CoffeeMaker {

	// 2. 자신의 참조 값을 저장할 수 있는 static변수를 선언한다.
	private static CoffeeMaker instance;

	// 1. 외부에서 생성자를 바로 호출할 수 없게 설계 한다.
	private CoffeeMaker() {} // private 접근제한자

	// 3. 객체를 메모리에 올릴 코드를 작성, 외부에서 접근할 수 있는 메서드를 만들어 준다.
	// 단, 정적 메서드를 만들어 줘야 함.(? 클래스. 으로 접근 = 정적 메서드)

	public static CoffeeMaker getInstance() {
		if (instance == null) { // 싱글톤은 애플리케이션이 시작될 때 클래스가 최초 한번만 메모리에 할당, 없으면 new해준다. 
			instance = new CoffeeMaker();
		}
		return instance;
	}
	
	/*
	 * synchronized (동기화) : 멀티스레드 상황에서 다른스레드 접근을 잠깐 막아주는 잠금
	 * public static synchronized CoffeeMaker getInstance() {
	 *  if (instance == null) { instance =
	 * new CoffeeMaker(); 
	 * } 
	 * return instance; }
	 */
	
	public void makeCoffee() {
		System.out.println("커피가 만들어 졌습니다!");
	}

}
