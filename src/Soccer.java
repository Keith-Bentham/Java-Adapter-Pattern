interface Prototype_Soccer {
	public void win();

	public void printDetails();

	public void loss();

	public void draw();
}

public class Soccer implements Prototype_Soccer {
	private Team t;
	private int played;

	Soccer(String n) {
		t = new Team(n);
		played = 0;
	}

	public void win() {
		played++;
		t.addPoints(3);
	}

	public void draw() {
		played++;
		t.addPoints(1);

	}

	public void loss() {
		played++;
	}

	public void printDetails() {
		System.out.println("Team Details");
		System.out.println("------------");
		System.out.println("Name: " + t.readName());
		System.out.println("Points: " + t.readPoints());
		System.out.println("Matches Played: " + played);
	}
}
