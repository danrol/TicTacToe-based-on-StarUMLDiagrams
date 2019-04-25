package boundaries;

import java.util.Scanner;

public class ChooseYourRowPositionForm {
public int choose(int player, Scanner sc) {
	int row;
	System.out.printf("Player #%d choose your row position: \n", player); 
	row = sc.nextInt();
	return row;
}
}
