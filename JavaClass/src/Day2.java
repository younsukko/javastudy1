import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i1, i2, i3, i4;

		System.out.println("�й��� ������ �Է��Ͻÿ�.\n");

		System.out.print("���ġ �й� : ");
		i1 = scanner.nextInt();

		System.out.print("���ġ ���� : ");
		i2 = scanner.nextInt();

		System.out.print("\n���� �й� : ");
		i3 = scanner.nextInt();

		System.out.print("���� ���� : ");
		i4 = scanner.nextInt();

//		System.out.printf("\n���ġ �й��� %03d, ������ " + i2 + "���Դϴ�.", i1);
//		System.out.printf("\n���� �й��� %03d, ������ " + i4 + "���Դϴ�.", i3);
		
		System.out.printf("\n���ġ �й��� %03d, ������ %d���Դϴ�.", i1, i2);
		System.out.printf("\n���� �й��� %03d, ������ %d���Դϴ�.", i3, i4);
		
		System.out.print("\n\n����Ϸ��� �ƹ�Ű�� �����ÿ�.");
		
		scanner.close();
		

	}

}
