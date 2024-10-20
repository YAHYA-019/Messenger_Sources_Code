package X;

/* renamed from: X.5hx, reason: invalid class name */
/* loaded from: 5hx.class */
public abstract class C5hx extends C5hy {
    public final C5i3 A00;

    public C5hx() {
        C5hz c5hz = C5hz.A08;
        if (c5hz == null) {
            C5i0 c5i0 = new C5i0();
            c5hz = new C5hz(c5i0);
            C5hz.A08 = c5hz;
            c5i0.A01 = c5hz;
        }
        C5i3 c5i3 = new C5i3(c5hz);
        this.A00 = c5i3;
        C5i5 c5i5 = new C5i5(this);
        if (c5i3.A00 != null) {
            throw AnonymousClass001.A0T("Overriding existing listener!");
        }
        c5i3.A00 = c5i5;
    }
}
