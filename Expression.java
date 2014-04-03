package laba3; 

/*
 * 4.	� ������ ����� �������� ����� �������� ��������� ����������, ����� ������� ����� �� ��������� � ������ �����.
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expression {

	public static boolean test(String str) {
		Pattern p = Pattern.compile(".*,|.*\\.|.*\\?|.*!");
		Matcher m = p.matcher(str);
		return m.matches();
	}

	public static void main(String[] args) {
		String str = "���� ���� ��� � ����, � ���� � ��� ������� ����.";
		String replacement = "replace";
		String[] s1 = str.split(" ");
		int n;
		Scanner inp = new Scanner(System.in);
		System.out.println("����� ����� ����� �� ������ ��������?");
		n = inp.nextInt();
		for (int i = 0; i < s1.length; i++)
			if (s1[i].length() == n) {
				if (test(s1[i]) == false)
					s1[i] = replacement;
			} else if (s1[i].length() - 1 == n) {
				if (test(s1[i]) == true)
					s1[i] = replacement;
			}
		str = "";
		for (int i = 0; i < s1.length; i++)
			str += s1[i] + " ";
		System.out.println(str);
	}
}
