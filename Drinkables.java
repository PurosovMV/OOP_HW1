//Класс напитков
public class Drinkables extends Product {
    private Double volume;

    public Drinkables(String name, Double price, Double volume) {
        super(name, price);
        this.volume = volume;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        if (volume > 0)
            this.volume = volume;
        else
            System.out.println("Объем напитка должен быть больше нуля!");
    }

    @Override
    public String toString() {
        return super.toString() + "объем = " + volume + " ";
    }

}
