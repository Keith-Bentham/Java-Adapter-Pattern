public class SoccerTest {
	public static void main(String[] args) {
		Soccer s = new Soccer("Colechester Utd");

		int choice = 1;

		while (choice != 5) {
			System.out.println();
			System.out.println("1.win");
			System.out.println("2.draw");
			System.out.println("3.loss");
			System.out.println("4.PrintDetails");
			System.out.println("5.Exit");

			choice = Console.readInt("Please enter a value-->");
			if (choice == 1) {
				s.win();
			}

			else if (choice == 2) {
				s.draw();

			} else if (choice == 3) {
				s.loss();

			} else if (choice == 4) {
				s.printDetails();
			}
		}
	}
}