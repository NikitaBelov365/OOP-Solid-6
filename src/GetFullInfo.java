public class GetFullInfo implements IGetFullInfo{ //Добавлен доп интерфейс для 4ого принципа и разделения интерфейсов

    @Override
    public void getFullInfo(Lada car) {
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Engine: " + car.getEngine());
    }
}
