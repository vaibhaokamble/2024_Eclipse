package vaibhao.vk;

import java.util.*;

class Player {
	int id;
	String name;
	int run;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}
}

public class PlayerApplication {

	public static void main(String[] args) {
		Scanner v = new Scanner(System.in);
		Player player = new Player();
		System.out.println("Enter the id: ");
		int id = v.nextInt();
		System.out.println("Enter the name: ");
		String name = v.next();
		System.out.println("Enter the run: ");
		int run = v.nextInt();

		player.setId(id);
		player.setName(name);
		player.setRun(run);

		System.out.println(player.getId() + "\t" + player.getName() + "\t" + player.getRun());
	}

}
