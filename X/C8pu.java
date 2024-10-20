package X;

/* renamed from: X.8pu, reason: invalid class name */
/* loaded from: 8pu.class */
public final class C8pu extends 2Yv {
    public int A00;
    public C62j A01;
    public java.util.Map A02;
    public boolean A03;

    /* JADX WARN: Type inference failed for: r305v0, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r305v2, types: [java.lang.Object, X.66W] */
    public void A02(C2l4 c2l4) {
        boolean z;
        66W r305;
        int i = c2l4.A00;
        if (i == 0) {
            ?? obj = new Object();
            ((66W) obj).A00 = Boolean.valueOf(this.A03);
            z = true;
            r305 = obj;
        } else {
            if (i != 1) {
                return;
            }
            ?? obj2 = new Object();
            ((66W) obj2).A00 = Boolean.valueOf(this.A03);
            z = false;
            r305 = obj2;
        }
        Boolean valueOf = Boolean.valueOf(z);
        r305.A00 = valueOf;
        this.A03 = valueOf.booleanValue();
    }
}
