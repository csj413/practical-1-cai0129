package practical1;

public class Line {
    private int seqNum;
    private String text;

    Line(int seqNum, String text) {
        this.seqNum = seqNum;
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public int getSeqNum() {
        return this.seqNum;
    }

    @Override
    public String toString() {
        return seqNum + ": " + text;
    }
}
