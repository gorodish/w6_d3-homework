package wizard_management;

import behaviours.Flyable;
import behaviours.Protected;


public class Dragon extends MythicalBeast implements Flyable, Protected {

  public Dragon(String name){
    super(name);
  }

  public String fly() {
    return "Standing up tall, beating wings, lift off!";
  }

  public String protect() {
    return "Swoosh in from a great height";
  }

}