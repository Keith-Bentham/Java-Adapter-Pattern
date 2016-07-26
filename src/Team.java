public class Team {
	private String name;
	private int points;

	public Team(String n) {
		name = n;
		points = 0;
	}

	public String readName() {
		return name;
	}

	public int readPoints() {
		return points;
	}

	public void addPoints(int p) {
		points += p;
	}
}
