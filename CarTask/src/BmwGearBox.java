public class BmwGearBox implements Gearbox{
    @Override
    public String operate(Car c) {
        double topSpeed = 200;
        double AvgMilage = 100;
        return "top speed of with Honda gear is "+topSpeed+"and milage is "+AvgMilage;
    }
}
