public class Main {
	public static void main(String[] args) { // main method ���� �޼���(���α׷� ���� ~ ����)�� �ǹ�
		char ch = 'A'; // char : ������ Ÿ������ 2byte. 4byte�� int�� ȣȯ
		// char st[]="abcd"; // ���ڿ��� C�� �޸� �迭�� ���� �Ұ�
		int c = 3;
		String str = "���� ���̴�\n" + // String : ���ڿ� ���� Ŭ����
				"�ϴ� �Ʒ��� \"�ʿ�\" �����-" + c + "ȸ\n"; // '+' �����ڸ� ���� ���ڿ��̳� ������ ������ ����.

		System.out.println(str + ch + ch + "Ŭ��\n" + str);
	}
}