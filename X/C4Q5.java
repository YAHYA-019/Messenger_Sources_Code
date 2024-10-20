package X;

/* renamed from: X.4Q5, reason: invalid class name */
/* loaded from: 4Q5.class */
public final class C4Q5 extends 2Yv {
    public C2iw A00;
    public C1373Aff A01;
    public boolean A02;

    /* JADX WARN: Type inference failed for: r305v0, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r305v2, types: [java.lang.Object, X.66W] */
    public void A02(C2l4 c2l4) {
        boolean z;
        66W r305;
        int i = c2l4.A00;
        if (i == 0) {
            ?? obj = new Object();
            ((66W) obj).A00 = Boolean.valueOf(this.A02);
            z = true;
            r305 = obj;
        } else {
            if (i != 1) {
                return;
            }
            ?? obj2 = new Object();
            ((66W) obj2).A00 = Boolean.valueOf(this.A02);
            z = false;
            r305 = obj2;
        }
        Boolean valueOf = Boolean.valueOf(z);
        r305.A00 = valueOf;
        this.A02 = valueOf.booleanValue();
    }
}
