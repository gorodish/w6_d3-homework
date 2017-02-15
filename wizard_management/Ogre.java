package wizard_management;

import behaviours.Protected;

public class Ogre extends MythicalBeast implements Protected {
  
  public Ogre(String name){
    super(name);
  }

  public String protect() {
    return "Lumbers over and headbutts";
  }

}