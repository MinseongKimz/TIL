/*===========================================
■■■ 자바 기본 프로그래밍 ■■■
=============================================*/

// 변수와 자료형
// 실수형 데이터 타입의 정밀도 테스트 실습

public class Test022
{
	public static void main(String[] args)
	{
		//주요변수 선언
		float a = 0;
		double b = 0;
	
		//연산 및 처리
		// 연산을 10만번 반복해보자. for문 배우지 않았지만 확인용..
		for (int i=1; i<=100000; i++)
		{
			a += 100000;	// a 를 10만 만큼 증가시켜라
			b += 100000;	// b 를 10만 만큼 증가시켜라
		}




		//결과 출력
		System.out.println("float a : " + a/100000);
		System.out.println("double b : " + b/100000);
		
	}
		
}

/* 출력 결과
float a : 99996.055					//????
double b : 100000.0
계속하려면 아무 키나 누르십시오 . . .

double 이 정확하다..
*/