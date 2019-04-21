package boundaries;

import java.util.Scanner;

public class ChooseYourYPositionForm {
public int choose(int player, Scanner sc) {
	int y;
	System.out.printf("Player #%d choose your y position: \n", player); 
	y = sc.nextInt();
	return y;
}
}
