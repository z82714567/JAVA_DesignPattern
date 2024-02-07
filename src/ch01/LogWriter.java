package ch01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// 싱글톤 패턴으로 만들기
public class LogWriter {

	// 2. 자신의 참조값을 담을 정적 변수 선언
	// 시간 --> 파일 생성해서 출력
	private static BufferedWriter writer;
	private static LogWriter instance;
	
	// 1. 외부에서 접근할 수 없는 생성자 만들기
	private LogWriter() {
		// 파일 처리
		try {
			writer = new BufferedWriter(new FileWriter("log.txt", true));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	} 
	
	// 3. 외부에서 접근 가능한 정적 메서드 만들어 주기
	public static LogWriter getInstance() {
		if(instance == null) {
			instance = new LogWriter(); 
		}
		return instance;
	}
	
	// 기능 : 파일에다가 글을 작성할 수 있는 기능
	public void writeLog(String log) {
		try {
			writer.write(log);
			writer.newLine(); // "\n" 개행처리
			writer.flush(); // 데이터 출력
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
