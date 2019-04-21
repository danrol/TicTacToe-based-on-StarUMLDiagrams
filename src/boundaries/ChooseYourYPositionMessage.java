package boundaries;

import java.util.Scanner;

public class ChooseYourYPositionMessage {
public int choose(int player) {
	int y;
	Scanner sc = new Scanner(System.in); 
	System.out.printf("Player #%d choose your y position: \n", player); 
	y = sc.nextInt();
	sc.close();
	return y;
}
}
