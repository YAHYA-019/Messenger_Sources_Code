package X;

/* renamed from: X.6d5, reason: invalid class name */
/* loaded from: 6d5.class */
public abstract class C6d5 extends C6d6 {
    public JDT A00;

    public void A0j(JDT jdt) {
        if (!(this instanceof 6dL)) {
            this.A00 = jdt;
            return;
        }
        6dL r0 = (6dL) this;
        r0.A00 = jdt;
        for (C6d6 c6d6 : r0.A01) {
            if (c6d6 instanceof C6d5) {
                ((C6d5) c6d6).A0j(jdt);
            }
        }
    }
}
