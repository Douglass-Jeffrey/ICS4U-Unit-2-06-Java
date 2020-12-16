/*
* This program prints values that correlate with flight tests for a biplane and
* a boeing jet.
*
* @author  Jacob Bonner
* @version 1.0
* @since   2020-12-15
*/

public class FlyTest {
  /**
   * This function runs flight tests for a biplane and a boeing jet and prints
   * the values of the test.
   */
  public static void main(String[] args) {
    // Creating a biplane and setting its speed
    Airplane biplane = new Airplane();
    biplane.setSpeed(212);
    System.out.println(biplane.getSpeed());

    // Creating a boeing jet and setting its speed
    Jet boeing = new Jet();
    boeing.setSpeed(422);
    System.out.println(boeing.getSpeed());

    // Setting counter variable
    int counter = 0;

    // Loop that tests acceleration on each aircraft
    while (counter < 4) {
      // Accelerating boeing plane
      boeing.accelerate();
      System.out.println(boeing.getSpeed());
      if (boeing.getSpeed() > 5000) {
        // Accelerating the biplane should the boeing plane speed be over 5000
        biplane.setSpeed(biplane.getSpeed() * 2);
      } else {
        // Accelerating the boeing aircraft
        boeing.accelerate();
      }

      // Increasing the counter by 1
      counter++;
    }

    // Printing out the final speed of the biplane
    System.out.println(biplane.getSpeed());
  }
}