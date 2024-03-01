public class Trida<T> {

    private T vlastnost;

    public Trida(T vlastnost) {
        this.vlastnost = vlastnost;
    }

    public T getVlastnost() {
        return vlastnost;
    }

    public void setVlastnost(T vlastnost) {
        this.vlastnost = vlastnost;
    }

    @Override
    public String toString() {
        return "Trida" + "vlastnost=" + vlastnost;

    }
}
