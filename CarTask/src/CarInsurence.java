import java.util.Scanner;

public class CarInsurence extends Car {

   public CarInsurence(int doors,String type,String engine,String colour,int carAge){
     super(doors,type,engine,colour,carAge);
   }

   Scanner sc = new Scanner(System.in);
  String CarType = getType();
  String CarColour = getColour();

  public  String CalInsurence(){
      System.out.println("enter the time for insurence = ");
      int t=sc.nextInt();

    if(t>1&&t<5){return "insurence of "+CarType+" car is "+5000;}
    else
      return "insurence of"+CarType+"car"+"is"+7000;

  }


}
