class Main{
    public static void main(String[] args) {
        Car car = new Car("Volvo", "xc12");
        GetInfo getInfo = new GetInfo();
        getInfo.getInfo(car);
        Lada lada = new Lada("2110", "Best");
        getInfo.getInfo(lada);
        GetFullInfo getFullInfo = new GetFullInfo();
        getFullInfo.getFullInfo(lada);
        car.beep();
        lada.beep();
    }
}