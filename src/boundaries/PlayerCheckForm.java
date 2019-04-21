package boundaries;

import java.util.Scanner;

public class PlayerCheckForm {
public int check() {
	int player;
	Scanner sc = new Scanner(System.in);
	System.out.println("\nWhat player are you?");
	player = sc.nextInt();
	sc.close();
	return player;
}
}
