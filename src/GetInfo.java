public class GetInfo implements ICarGetInfo { // принцип S - отцепил дисплей инфо от Car
    // принцип O - интерфейс на все случаи жизни запилен

    @Override
    public void getInfo(Car car) {
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
    }
}
