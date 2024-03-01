public class Interval<T extends Comparable> {

    private T dolni;

    private T horni;

    public Interval(T dolni, T horni) throws IntervalException {
        if (dolni.compareTo(horni) > 0){
            throw new IntervalException();
        }
        this.dolni = dolni;
        this.horni = horni;
    }

    public boolean leziV(T hodnota){
        return hodnota.compareTo(dolni) >= 0 && hodnota.compareTo(horni) <= 0;
    }

    @Override
    public String toString() {
        return "Interval{" +
                "dolni=" + dolni +
                ", horni=" + horni +
                '}';
    }
}
