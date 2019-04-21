package boundaries;

import java.util.Scanner;

public class ChooseYourXPositionMessage {
public int choose(int player) {
	int x;
	Scanner sc = new Scanner(System.in); 
	System.out.printf("Player #%d choose your x position: \n", player); 
	x = sc.nextInt();
	sc.close();
	return x;
}
}
