public class Lada extends Car implements IBeep{ // третий L - подстановка Барбары, сделан наследник, который работает)
// IBeep добавлен для 5ого принципа, взят универсальный интерфейс бибиканья, который вынесен за класс
    private static final String brand = "Lada";
    private String engine;
    public Lada(String model, String engine) {
        super(brand, model);
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void beep() {
        System.out.println("Beeep sound");
    }
}
