package vaibhao.vk;

import java.util.ArrayList;
import java.util.Collections;

class Player implements Comparable {
	private int id;
	private String name;

	public Player() {
		 	
	}

	public Player(String name, int id, int run) {
		this.name = name;
		this.id = id;
		this.run = run;
	}

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

	private int run;

	@Override
	public int compareTo(Object o) {
		Player p = (Player) o;
		if (this.run > p.run) {
			return 1;
		} else if (this.run < p.run) {
			return -1;
		} else {
			return 0;
		}
	}
}

public class PlayerSortingApplication {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		Player p1 = new Player("ABC", 1, 10000);
		Player p2 = new Player("MNO", 2, 5000);
		Player p3 = new Player("PQR", 4, 9000);
		Player p4 = new Player("STV", 3, 12000);
		Player p5 = new Player("XYZ", 5, 11000);
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		al.add(p5);
		System.out.println("Before Sorting of Player Data");
		for (Object obj : al) {
			Player p = (Player) obj;
			System.out.println(p.getId() + "\t" + p.getName() + "\t" + p.getRun());
		}
		Collections.sort(al);
		System.out.println("After Sorting of Player Data");
		for (Object obj : al) {
			Player p = (Player) obj;
			System.out.println(p.getId() + "\t" + p.getName() + "\t" + p.getRun());
		}
	}
}
