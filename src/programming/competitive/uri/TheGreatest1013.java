package programming.competitive.uri;

import java.util.Scanner;


/**
 * Created by Moshiur on 10/29/2018.
 */
public class TheGreatest1013 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	int a = scanner.nextInt();
	int b = scanner.nextInt();
	int c = scanner.nextInt();
	int temp = a;
	if (a < b || a < c) {
		if (b > c){
			temp = b;
		}else {
			temp = c;
		}
	}
//	System.out.println(temp + " eh o maior\n");
	System.out.printf("%d eh o maior\n", temp);




}
}
