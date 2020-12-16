/*
* This class creates a jet which is a type of airplane.
*
* @author  Jacob Bonner
* @version 1.0
* @since   2020-12-15
*/

public class Jet extends Airplane {
  // Initializing fields
  private static final int MULTIPLIER = 2;

  /**
   * Setting field values with a constructor.
   */
  public Jet() {
    super();
  }

  /**
   * This method sets the speed of the jet.
   */
  public void setSpeed(int speed) {
    super.setSpeed(speed * MULTIPLIER);
  }

  /**
   * This method accelerates the jet.
   */
  public void accelerate() {
    super.setSpeed(getSpeed() * 2);
  }
}