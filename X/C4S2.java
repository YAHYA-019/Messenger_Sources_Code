package X;

/* renamed from: X.4S2, reason: invalid class name */
/* loaded from: 4S2.class */
public final class C4S2 {
    public int A00;
    public int A01;
    public long A02;
    public String A03;
    public byte[] A04;
    public byte[] A05;

    public boolean A00() {
        boolean z = false;
        if (System.currentTimeMillis() > this.A02) {
            z = true;
        }
        return !z && this.A01 + 1 <= this.A00;
    }
}
