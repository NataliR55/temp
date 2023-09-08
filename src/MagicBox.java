public class MagicBox implements Comparable<MagicBox> {
    int value;

    public MagicBox(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(MagicBox o) {
        if (value > o.value) {
            return 42;
        } else {
            return -42;
        }
    }
}