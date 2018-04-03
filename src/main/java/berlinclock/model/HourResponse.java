package berlinclock.model;

public class HourResponse {


    private int fh;
    private int h;
    private int qm;
    private int m;
    private int s;

    public HourResponse(int fh, int h, int qm, int m, int s) {
        this.fh = fh;
        this.h = h;
        this.qm = qm;
        this.m = m;
        this.s = s;
    }

    public int getFh() {
        return fh;
    }

    public void setFh(int fh) {
        this.fh = fh;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getQm() {
        return qm;
    }

    public void setQm(int qm) {
        this.qm = qm;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }
}
