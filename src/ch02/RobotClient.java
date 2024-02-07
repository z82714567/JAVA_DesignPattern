package ch02;

import java.security.PublicKey;

public class RobotClient {

	public static void main(String[] args) {
		
		
		Robot robot = new Robot.Builder()
				.head("메탈")
				.arms("티타늄")
				.legs("시멘트")
				.torso("실리콘")
				.build();
		
		System.out.println(robot);
	}
}
