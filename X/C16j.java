package X;

/* renamed from: X.16j, reason: invalid class name */
/* loaded from: 16j.class */
public final class C16j {
    public int A00;
    public int A01;
    public 17B A02;
    public 17B A03;
    public final AnonymousClass171 A04 = new Object();

    public void A00() {
        while (true) {
            17B r0 = this.A03;
            if (r0 == null) {
                this.A02 = null;
                this.A01 = 0;
                this.A00 = 0;
                return;
            } else {
                this.A03 = r0.A01;
                AnonymousClass171 anonymousClass171 = this.A04;
                r0.A01 = anonymousClass171.A00;
                anonymousClass171.A00 = r0;
            }
        }
    }
}
