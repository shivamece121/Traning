public class Car {
    private int doors;
    private String type;
    private String engine;
    private String colour;
    private int carAge;

    Car(int doors,String type,String engine,String colour,int carAge){
        this.doors=doors;
        this.type=type;
        this.engine=engine;
        this.colour=colour;
        this.carAge=carAge;
    }
    public void setDoors(int doors) {   //getters and setters till line 41

        this.doors = doors;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getDoors() {
        return doors;
    }

    public String getType() {
        return type;
    }

    public String getEngine() {
        return engine;
    }

    public String getColour() {
        return colour;
    }
    public int getcarAge() {
        return carAge;
    }


    Gearbox box;   // use of interface for full data abstraction

    Car(Gearbox box){
        this.box=box;
    }

}



