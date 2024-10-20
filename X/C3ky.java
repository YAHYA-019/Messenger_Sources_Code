package X;

import kotlin.jvm.functions.Function2;

/* renamed from: X.3ky, reason: invalid class name */
/* loaded from: 3ky.class */
public final class C3ky extends C3kz {
    public final 0DR A00;

    public C3ky(0DE r302, Function2 function2) {
        super(r302, false);
        this.A00 = 0DT.A01(this, this, function2);
    }

    @Override // X.C2a1
    public void A0G() {
        try {
            C2ar.A00(04S.A00, 0DT.A02(this.A00));
        } catch (Throwable th) {
            resumeWith(new 0DV(th));
            throw th;
        }
    }
}
