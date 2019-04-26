package boundaries;

import java.util.*;

public class PlayerCheckForm {
public int check(Scanner sc) {
	int player;
	System.out.println("\nWhich player are you? (1 or 2)");
	player = sc.nextInt();
	return player;
}
}
