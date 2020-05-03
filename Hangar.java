public class Hangar {

    public static void main(String[] args) {
        
        Car myCar = new Car(" Toyota",200000);
        System.out.println( " The Car : " + myCar.doStuff() );
        Boat myBoat = new Boat(" HoverSpeed",5400);
        System.out.println( " The Boat: " + myBoat.doStuff() );

    }
    
}