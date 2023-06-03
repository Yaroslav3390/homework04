public class main {
    public static void main(String[]args){

        Car car = new Car();
        car.startEngine();
        car.stopEngine();
        car.brand = "Toyota";
        car.model = "Avensis";
        car.year = 2022;
        System.out.println("brand: " + car.brand);
        System.out.println("model: " + car.model);
        System.out.println("year: " +car.year);
    }

}