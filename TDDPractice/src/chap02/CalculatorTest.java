package chap02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	//Test 어노테이션 :  Junit을 이용한 테스트 함수임
	@Test
	void plus(){
		int result = Calculcator.plus(1,2);
		assertEquals(3,result);  //assertEquals(a,b) 함수는 a와 b가 같은지 검증함
	}
}
