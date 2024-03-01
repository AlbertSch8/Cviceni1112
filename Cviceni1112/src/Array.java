public class Array<E> {

    private E prvek;
    private int pocet = 0;
    private int index = 0;

    E[] array = (E[]) new Object[10];

    public Array(E prvek) {
        this.prvek = prvek;
        this.pocet = pocet;
        this.index = index;
    }

    public E getPrvek() {
        return prvek;
    }

    public void setPrvek(E prvek) {
        this.prvek = prvek;
    }

    public int getPocet() {
        return pocet;
    }

    public void setPocet(int pocet) {
        this.pocet = pocet;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void addPrvek(E prvek){
        for (int i = 0; i < 10;i++){
            System.out.println(i);;
        }
    }
    public void Vypis(){
        for (int i = 0; i < 10; i++){
            System.out.println(prvek);
        }
    }


    @Override
    public String toString() {
        return "Array{" +
                "prvek=" + prvek +
                ", pocet=" + pocet +
                ", index=" + index +
                '}';
    }
}
