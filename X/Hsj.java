package X;

/* loaded from: Hsj.class */
public final class Hsj {
    public int A00;
    public long A01;
    public long A02;
    public long A04;
    public long A05;
    public String A07 = "";
    public String A06 = "";
    public long A03 = -1;

    public final String A00() {
        String str;
        synchronized (this) {
            str = this.A07;
        }
        return str;
    }

    public final void A01(String str) {
        synchronized (this) {
            11T.A0F(str, 0);
            this.A07 = str;
        }
    }
}
