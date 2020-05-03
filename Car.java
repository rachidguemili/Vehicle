public class Car extends Vehicle{


    public Car(String name , int km){
        super(name, km);
    }
    public  String doStuff(){

    return "I am " +  this.brand + " and I do  Vroom Vroom ! ";
    }


    
}