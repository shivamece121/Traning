public class CarMaintainence extends Car {

    public CarMaintainence(int doors,String type,String engine,String colour,int carAge){
        super(doors,type,engine,colour,carAge);
    }
   int d = getDoors();

   String type = getType();

   String eng = getEngine();

   int carage = getcarAge();

   public String maintainance(int doors, int carage){

       int amount = 1000*doors + carage*5000;

       return "amount of car type"+type+"and "+doors +"doors"+"with age"+carage+"is = "+amount;
   }


}
