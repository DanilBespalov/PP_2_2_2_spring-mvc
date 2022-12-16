package web.model;


public class Car {
    private String modelCar;
    private String driversName;
    private int seriesCar;

    public Car() {
    }

    public Car(String model, String driversName, int seriesCar) {
        this.modelCar = model;
        this.driversName = driversName;
        this.seriesCar = seriesCar;
    }


    public String getModel() {
        return modelCar;
    }

    public void setModel(String model) {
        this.modelCar = model;
    }

    public String getDriversName() {
        return driversName;
    }

    public void setDriversName(String driversName) {
        this.driversName = driversName;
    }

    public int getSeriesCar() {
        return seriesCar;
    }

    public void setSeriesCar(int seriesCar) {
        this.seriesCar = seriesCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "web.model='" + modelCar + '\'' +
                ", driversName='" + driversName + '\'' +
                ", seriesCar=" + seriesCar +
                '}';
    }
}
