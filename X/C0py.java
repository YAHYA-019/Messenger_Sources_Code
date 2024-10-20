package X;

/* renamed from: X.0py, reason: invalid class name */
/* loaded from: 0py.class */
public final class C0py extends 0YR {
    public long A00;
    public 0YS A01 = new 0YS();
    public 0YQ A02;
    public String A03;

    public 0YR A00(Object obj, String str) {
        this.A01.A00(str, String.valueOf(obj));
        return this;
    }

    public 0YR A01(String str, int i) {
        this.A01.A00(str, Integer.toString(i));
        return this;
    }

    public 0YR A02(String str, long j) {
        this.A01.A00(str, Long.toString(j));
        return this;
    }

    public void A03() {
        0YQ r0 = this.A02;
        long j = this.A00;
        r0.ATP(this.A01, this.A03, j);
    }
}
