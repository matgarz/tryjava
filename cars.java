public class SmallCar{

  //variables
  private int mileage;
  private String company;
  private double time;
  public static String size;
  

  //methods
  public SmallCar(int mileage, String company, double time){
    this.mileage = mileage;
    this.company = company;
    this.time = time;
  }
  public int changeMileage(int newMileage){
    this.mileage = newMileage;
  } 
}
