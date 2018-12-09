package main.algorithms;

/**
 * Tower of Hanoi is a mathematical puzzle where we have three rods and n disks. The objective of the puzzle is to move the entire stack to another rod, obeying the following simple rules:
 * 1) Only one disk can be moved at a time.
 * 2) Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack i.e. a disk can only be moved if it is the uppermost disk on a stack.
 * 3) No disk may be placed on top of a smaller disk.
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * Approach :
 * <p>
 * Take an example for 2 disks :
 * Let rod 1 = 'A', rod 2 = 'B', rod 3 = 'C'.
 * <p>
 * Step 1 : Shift first disk from 'A' to 'B'.
 * Step 2 : Shift second disk from 'A' to 'C'.
 * Step 3 : Shift first disk from 'B' to 'C'.
 * <p>
 * The pattern here is :
 * Shift 'n-1' disks from 'A' to 'B'.
 * Shift last disk from 'A' to 'C'.
 * Shift 'n-1' disks from 'B' to 'C'.
 * <p>
 * Image illustration for 3 disks :
 * https://cdncontribute.geeksforgeeks.org/wp-content/uploads/tower-of-hanoi.png
 */

public class ToweOfHanoi {

    public void move(int numberOfDisksToBeMoved, char towerFrom, char towerTo, char intermediateTower) {
        if (numberOfDisksToBeMoved == 1) {
            System.out.println("moving Disc 1 From " + towerFrom + " to " + towerTo);
        } else {
            move(numberOfDisksToBeMoved - 1, towerFrom, intermediateTower, towerTo);
            System.out.println(" Disc " + (numberOfDisksToBeMoved) + " Moved From " + towerFrom + " to " + towerTo);
            move(numberOfDisksToBeMoved - 1, intermediateTower, towerTo, towerFrom);
        }
    }
}
