public class Main {
	public static void main(String[] args) { // main method 메인 메서드(프로그램 시작 ~ 종료)를 의미
		char ch = 'A'; // char : 문자형 타입으로 2byte. 4byte인 int와 호환
		// char st[]="abcd"; // 문자열은 C와 달리 배열에 저장 불가
		int c = 3;
		String str = "저기 보이는\n" + // String : 문자열 저장 클래스
				"하늘 아래서 \"너와\" 손잡고-" + c + "회\n"; // '+' 연산자를 통해 문자열이나 변수로 연결이 가능.

		System.out.println(str + ch + ch + "클라스\n" + str);
	}
}