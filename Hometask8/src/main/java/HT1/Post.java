package HT1;

public enum Post {

    Director(30),
    Worker(15);

    private int ratio;

    Post(int ratio) {
        this.ratio = ratio;
    }

    public int getRatio() {
        return ratio;
    }
}
