/*	
	*작성한날 : 2022.01.03
	*작 성 자 : 김민성
	*파일이름 : Test003.java
	*수정이력 : 2022.01.03 
	*작성목적 : 수업

*/

public class Test003
{
	public static void main(String[] args)
	{
		/* 코드 1)
		System.out.print("첫 번째 출력구문");
		System.out.print("두 번째 출력구문");
		*/
		// 코드 2)
		System.out.print("첫 번째 출력구문\n");
		System.out.print("두 번째 출력구문");
	

		// println 과 print 메소드의 차이는 라인스킵 ( 줄바꿈, 개행) 유무
		// \n을 문자열에 포함하면 라인 스킵 가능 "" 사이(문자열영역)에서 존재해야함.

	}
}

/*
출력결과 1)
첫 번째 출력구문두 번째 출력구문계속하려면 아무 키나 누르십시오 . . .

출력결과 2) 
첫 번째 출력구문
두 번째 출력구문계속하려면 아무 키나 누르십시오 . . .

(첫번 출력구문 뒤에 \n을 넣었더니 줄바꿈이 되었다.)
*/
