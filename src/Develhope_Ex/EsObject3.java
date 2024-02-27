package Develhope_Ex;

public class EsObject3 {
    public static void main(String[] args) {
        Car car1 = new Car("Peugeot", "206", "1.4", "AB123CD");
        System.out.println(car1.getBrand());
        System.out.println(car1.getModel());
        System.out.println(car1.getCylinderCapacity());
        System.out.println(car1.getPlate());
    }

    public static class Car {
        private String brand;
        private String model;
        private String cylinderCapacity;
        private String plate;

        public Car(String brand, String model, String cylinderCapacity, String plate) {
            setBrand(brand);
            setModel(model);
            setCylinderCapacity(cylinderCapacity);
            setPlate(plate);
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
