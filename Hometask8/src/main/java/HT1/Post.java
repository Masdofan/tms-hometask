package HT1;

public enum Post {

    Director(2),
    Worker(1);

    private int ratio;

    Post(int ratio) {
        this.ratio = ratio;
    }

    public int getRatio() {
        return ratio;
    }
}
