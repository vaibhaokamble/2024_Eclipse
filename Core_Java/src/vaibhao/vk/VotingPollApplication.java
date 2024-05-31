package vaibhao.vk;

class Candidate {
	private int id;
	private String name;
	private String partyName;
	private String logo;
	private int predicateVote;

	public Candidate(int id, String name, String partyName, String logo) {
		this.id = id;
		this.name = name;
		this.partyName = partyName;
		this.logo = logo;
		this.predicateVote = 0; // Initialize predicateVote to 0
	}

	// Getters and setters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPartyName() {
		return partyName;
	}

	public String getLogo() {
		return logo;
	}

	public int getPredicateVote() {
		return predicateVote;
	}

	public void setPredicateVote(int predicateVote) {
		this.predicateVote = predicateVote;
	}
}

class Area {
	private int id;
	private String name;
	private int totalVote;

	public Area(int id, String name) {
		this.id = id;
		this.name = name;
		this.totalVote = 0; // Initialize totalVote to 0
	}

	// Getters and setters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getTotalVote() {
		return totalVote;
	}

	public void setTotalVote(int totalVote) {
		this.totalVote = totalVote;
	}
}

class NewsChannel {
	public void showPrediction(Area area, Candidate... candidates) {
		System.out.println("Prediction for Area: " + area.getName());
		System.out.println("-----------------------------------------");
		System.out.println("Candidate\tParty\t\tPrediction");
		for (Candidate candidate : candidates) {
			System.out.println(
					candidate.getName() + "\t\t" + candidate.getPartyName() + "\t\t" + candidate.getPredicateVote());
		}
		System.out.println("-----------------------------------------");
	}
}

public class VotingPollApplication {
	public static void main(String[] args) {
		// Create candidates
		Candidate candidate1 = new Candidate(1, "John Doe", "Party A", "Logo A");
		Candidate candidate2 = new Candidate(2, "Jane Smith", "Party B", "Logo B");
		Candidate candidate3 = new Candidate(3, "Alice Johnson", "Party C", "Logo C");

		// Create an area
		Area area1 = new Area(101, "Area 1");

		// Set some random prediction votes for each candidate
		candidate1.setPredicateVote(5000);
		candidate2.setPredicateVote(4500);
		candidate3.setPredicateVote(3000);

		// Instantiate NewsChannel
		NewsChannel newsChannel = new NewsChannel();

		// Show prediction for the area
		newsChannel.showPrediction(area1, candidate1, candidate2, candidate3);
	}
}
