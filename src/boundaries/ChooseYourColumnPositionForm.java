package boundaries;

import java.util.Scanner;

public class ChooseYourColumnPositionForm {
public int choose(int player, Scanner sc) {
	int col;
	System.out.printf("Player #%d choose your column position: \n", player); 
	col = sc.nextInt();
	return col;
}
}
