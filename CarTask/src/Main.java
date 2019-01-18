public class Main {

    public static void main(String[] args) {

        Car car = new Car(4,"family car","bmw","blue",5);
        Gearbox honda = new HondaGearBox();
        Car car1 = new Car(honda);
        CarInsurence ins = new CarInsurence(6,"sports car","porsche","black",2);
        System.out.println(honda.operate(car));

        System.out.println(ins.CalInsurence()); //input time



    }


}

