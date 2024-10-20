package X;

/* renamed from: X.0M6, reason: invalid class name */
/* loaded from: 0M6.class */
public final class C0M6 implements Cloneable {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public 0C3 A05;
    public 0C3 A06;
    public 0C3 A07;

    public C0M6() {
        0C3 r0 = 0C3.A01;
        this.A06 = r0;
        this.A07 = r0;
        this.A05 = r0;
    }

    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public C0M6 clone() {
        try {
            C0M6 c0m6 = (C0M6) super.clone();
            c0m6.A06 = this.A06;
            c0m6.A07 = this.A07;
            c0m6.A05 = this.A05;
            c0m6.A03 = this.A03;
            c0m6.A01 = this.A01;
            c0m6.A02 = this.A02;
            c0m6.A00 = this.A00;
            return c0m6;
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }
}
