interface Vehicle{
    String name = "a";
    int maxPassengers = 0;
    double maxSpeed = 160;
}

interface LandVehicle extends Vehicle{
    int numWheels = 4;

    public void drive();
}

interface SeaVessel extends Vehicle{
    int displacement = 0;

    public void launch();
}

interface isEmergency{
    public void soundSiren();
}

public class Jeep implements LandVehicle{
    public void drive(){
        System.out.println("Vroooom");
    }
    public void soundHorn(){
        System.out.println("beep");
    }
}

public class Hovercraft implements LandVehicle, SeaVessel{
    public void drive(){
        System.out.println("Woooooosh");
    }
    public void launch(){
        System.out.println("WOOOOOOOOOOOOSH");
    }
    public void enterLand(){
        System.out.println("Entering land...");
    }
    public void enterSea(){
        System.out.println("Entering sea...");
    }
}

public class Frigate implements SeaVessel{
    public void launch(){
        System.out.println("*boat sounds*");
    }
    public void fireGun(){
        System.out.println("Pew pew!");
    }
}

public class PoliceCar implements isEmergency, LandVehicle{
    public void soundSiren(){
        System.out.println("weewooweewooweewoo");
    }
    public void drive(){
        System.out.println("vroooom");
    }
    public void chase(){
        System.out.println("WEEEWOOWEEWOOWEEWOO *bang* *bang* WEEWOOWEEWOO");
    }
}

