package X;

/* renamed from: X.8p2, reason: invalid class name */
/* loaded from: 8p2.class */
public final class C8p2 extends 2Yv {
    public boolean A00;

    /* JADX WARN: Type inference failed for: r305v0, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r305v2, types: [java.lang.Object, X.66W] */
    public void A02(C2l4 c2l4) {
        boolean z;
        66W r305;
        int i = c2l4.A00;
        if (i == 0) {
            ?? obj = new Object();
            ((66W) obj).A00 = Boolean.valueOf(this.A00);
            z = true;
            r305 = obj;
        } else {
            if (i != 1) {
                return;
            }
            ?? obj2 = new Object();
            ((66W) obj2).A00 = Boolean.valueOf(this.A00);
            z = false;
            r305 = obj2;
        }
        Boolean valueOf = Boolean.valueOf(z);
        r305.A00 = valueOf;
        this.A00 = valueOf.booleanValue();
    }
}
