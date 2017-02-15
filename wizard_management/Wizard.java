package wizard_management;

import behaviours.Flyable;
import behaviours.Protected;

public class Wizard {
  String name;
  private Flyable ride;
  private Protected protect;

  public Wizard(String name, Flyable ride, Protected protect) {
    this.name = name;
    this.ride = ride;
    this.protect = protect;
  }

  public String getName(){
    return this.name;
  }

  public Flyable getRide(){
    return this.ride;
  }

  public String fly(){
    return this.ride.fly();
  }

  public void setRide(Flyable ride) {
    this.ride = ride;
  }

  public String protect() {
    return this.protect.protect();
  }

  public void setProtected(Protected protect) {
    this.protect = protect;
  }

}