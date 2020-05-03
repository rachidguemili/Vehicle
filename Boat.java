public class Boat extends Vehicle{
    

  public Boat(String name , int km){
    super(name, km);

  }

    public  String doStuff(){

        return "I am " +  this.brand + " and I do  Glou Glou ! ";
        }
    
}