package X;

import java.lang.ref.WeakReference;

/* renamed from: X.7sW, reason: invalid class name */
/* loaded from: 7sW.class */
public final class C7sW {
    public Khs A00;
    public Khs A01;
    public WeakReference A02;
    public WeakReference A03;
    public final String A04;

    public C7sW(String str) {
        this.A04 = str;
    }

    public final void A00(Khs khs) {
        JXt jXt;
        JXt jXt2;
        WeakReference weakReference = this.A02;
        if (weakReference == null || (jXt2 = (JXt) weakReference.get()) == null) {
            this.A00 = khs;
        } else {
            jXt2.A06(khs);
        }
        WeakReference weakReference2 = this.A03;
        if (weakReference2 == null || (jXt = (JXt) weakReference2.get()) == null) {
            this.A01 = khs;
        } else {
            jXt.A06(khs);
        }
    }
}
