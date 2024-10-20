package X;

/* loaded from: ERl.class */
public final class ERl extends Exception {
    public final int reason;

    public ERl(String str) {
        super(str);
        this.reason = 2;
    }

    public ERl(String str, Throwable th, int i) {
        super(str, th);
        this.reason = i;
    }
}
