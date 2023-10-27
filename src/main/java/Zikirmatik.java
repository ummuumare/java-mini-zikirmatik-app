public class Zikirmatik {

    private  int id;

    private  int counter;

    public Zikirmatik() {
    }

    public Zikirmatik(int id, int counter) {
        this.id = id;
        this.counter = counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCounter(int count) {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public String toString() {
        return
                "id :" +
                        " counter :";
    }
}
