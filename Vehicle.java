public class abstract Vehicle{



    String brand ="";
    int kilometers=0;

  public Vehicle( String marque, int km){

        brand = marque;
        kilometers = km ;
        

  }

    public void setBrand(String brand) {
        
    }
    public String getBrand() {
        return brand;
    }
    public void setKm(int km) {
        kilometers = km;
    }
    public  int getKm() {
        return kilometers;
    }


     public abstract String doStuff(){


        return "";
    }



}
