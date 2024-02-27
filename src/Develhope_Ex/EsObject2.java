package Develhope_Ex;

public class EsObject2 {
    public static void main(String[] args) {
        Car firstCar = new Car("Peugeot", "206", "1.4", "AB123CD");
    }

    public static class Car {
        private String brand;
        private String model;
        private String cylinderCapacity;
        private String plate;

        public Car(String brand, String model, String cylinderCapacity, String plate) {
            this.brand = brand;
            this.model = model;
            this.cylinderCapacity = cylinderCapacity;
            this.plate = plate;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setCylinderCapacity(String cylinderCapacity) {
            this.cylinderCapacity = cylinderCapacity;
        }

        public void setPlate(String plate) {
            this.plate = plate;
        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public String getCylinderCapacity() {
            return cylinderCapacity;
        }

        public String getPlate() {
            return plate;
        }
    }
}
