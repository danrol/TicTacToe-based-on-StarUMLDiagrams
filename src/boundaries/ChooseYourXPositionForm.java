package boundaries;

import java.util.Scanner;

public class ChooseYourXPositionForm {
public int choose(int player, Scanner sc) {
	int x;
	System.out.printf("Player #%d choose your x position: \n", player); 
	x = sc.nextInt();
	return x;
}
}
