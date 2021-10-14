public enum NDS {
    BEZNDS(0),
    NDS_0(0),
    NDS_10(10),
    NDS_20(20);

    private final int percent;

    private NDS(int percent){
        this.percent = percent;
    }

    public int getPercent() {
        return percent;
    }
}
