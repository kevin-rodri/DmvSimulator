
public class DmvSimulator {
	public static void main(String[] args) {
		int waitTime = (int)(Math.random()*100);
		boolean keepGoing = true;
		boolean keep = true;
		System.out.println("Welcome to the DMV! You are " + waitTime + " in line. Please wait until it is your turn. ");
		for (int wait = waitTime + 1; wait < 100; wait ++) {
			System.out.println("Number " + wait + " is next.");
		
			}
		for(int i = 0; i <= waitTime ; i ++) {
				System.out.println("Number " + i+ " is next.");
				if(i == waitTime) {
					System.out.println("It is your turn! It looks like you do not have the required paperwork. So go home and leave us alone!");	
					}
			 	}
			}
	}
	