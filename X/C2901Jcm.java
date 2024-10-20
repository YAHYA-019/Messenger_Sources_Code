package X;

import kotlin.jvm.functions.Function1;

/* renamed from: X.Jcm, reason: case insensitive filesystem */
/* loaded from: Jcm.class */
public final class C2901Jcm extends LPR implements MNa {
    public static final KTy A02 = new Object();
    public Function1 A00;
    public final Object A01 = A02;

    public C2901Jcm(Function1 function1) {
        this.A00 = function1;
    }

    public final void A0H(MKq mKq) {
        this.A00.invoke(mKq);
        C2901Jcm c2901Jcm = (C2901Jcm) L5f.A01(this);
        if (c2901Jcm != null) {
            c2901Jcm.A0H(mKq);
        }
    }

    @Override // X.MNa
    public Object BGy() {
        return this.A01;
    }
}
