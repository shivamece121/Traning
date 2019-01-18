public class HondaGearBox implements Gearbox {

    @Override
    public String operate(Car c) {
        double topSpeed = 180;
        double AvgMilage = 50;
        String carEngine= c.getEngine();
        return "top speed of car engine "+carEngine+" with Honda gear box is "+topSpeed+"and milage is "+AvgMilage;
    }
}
