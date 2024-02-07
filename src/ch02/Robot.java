package ch02;

// 빌더 패턴 만들어 보기
// this. : 
// this() : 생성자 자기 자신 호출 = super() : 부모 생성자 호출
// return this :
public class Robot {

	// 1. 멤버 변수 정의
	private String head;
	private String arms;
	private String legs;
	private String torso;

	// 2. 생성자를 private 선언 해야 한다.
	private Robot() {
	}

	// 3. 정적 내부 클래스로 Builder클래스를 선언 해야 한다.(외부에서 접근 가능하도록)
	public static class Builder {
		// 4. 외부(아우터클래스) 클래스를 멤버 변수로 가지고 있어야 한다.
		private Robot robot;

		// 5. 생성자 선언 
				public Builder() {
					this.robot = new Robot();
				}
				public Builder head(String head) {
					robot.head = head;
					return this; 
				}
				public Builder arms(String arms) {
					robot.arms = arms;
					return this; 
				}
				public Builder legs(String legs) {
					robot.legs = legs;
					return this; 
				}
				public Builder torso(String torso) {
					robot.torso = torso;
					return this; 
				}
				
				// 핵심 ! - 반드시 build() 메서드를 만들어 주자 
				public Robot build() {
					return robot;
				}
			}
	// 외부 클래스 toString()  alt+shift+s
	@Override
	public String toString() {
		return "Robot [head=" + head + ", arms=" + arms + ", legs=" + legs + ", torso=" + torso + "]";
	}



	
}
