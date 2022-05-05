import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i1, i2, i3, i4;

		System.out.println("학번과 점수를 입력하시오.\n");

		System.out.print("양아치 학번 : ");
		i1 = scanner.nextInt();

		System.out.print("양아치 점수 : ");
		i2 = scanner.nextInt();

		System.out.print("\n날라리 학번 : ");
		i3 = scanner.nextInt();

		System.out.print("날라리 점수 : ");
		i4 = scanner.nextInt();

//		System.out.printf("\n양아치 학번은 %03d, 점수는 " + i2 + "점입니다.", i1);
//		System.out.printf("\n날라리 학번은 %03d, 점수는 " + i4 + "점입니다.", i3);
		
		System.out.printf("\n양아치 학번은 %03d, 점수는 %d점입니다.", i1, i2);
		System.out.printf("\n날라리 학번은 %03d, 점수는 %d점입니다.", i3, i4);
		
		System.out.print("\n\n계속하려면 아무키나 누르시오.");
		
		scanner.close();
		

	}

}
