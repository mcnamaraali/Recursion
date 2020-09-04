package recursion;

public class TowersOfHanoi {
	
	public static void solveTowers(int disks, int sourceTower, int destTower, int tempTower) {
		
		if (disks == 1) {
			System.out.printf("Disks 1: %n%d --> %d", sourceTower, destTower);
			return;
		}
		
		//recursion call so move disk -1 disks from sourcePeg
		//to tempPeg using destPeg 
		solveTowers(disks - 1, sourceTower, tempTower, destTower);
		
		System.out.printf("%n%d --> %d", sourceTower, destTower);
		
		//move disks -1 disks from tempPeg to destPeg
		solveTowers(disks - 1, sourceTower, tempTower, destTower);
	}

	public static void main(String[] args) {
		int startPeg = 1;
		int endPeg = 3; 
		int tempPeg = 2; //value to indicate tempPeg in output
		int totalDisks = 3;
		
		//initial non-recursive call: move all disks
		solveTowers(totalDisks, startPeg, endPeg, tempPeg);
		

	}

}
