
public class DmvSimulator {
	public static void main(String[] args) {
		int waitTime = (int)(Math.random()*100);
		boolean keepGoing = true;
		while (keepGoing) {
			System.out.println("Welcome to the DMV! You are " + waitTime + " in line. Please wait until it is your turn. ");
			waitTime -= 1;
			System.out.println("Number " + waitTime + " is next.");
			if(waitTime == 1) {
				System.out.println("It is your turn! It looks like you do not have the required paperwork. See ya later!");	
				keepGoing = false;
			}

		}
	}
}