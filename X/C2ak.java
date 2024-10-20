package X;

import kotlin.jvm.functions.Function2;

/* renamed from: X.2ak, reason: invalid class name */
/* loaded from: 2ak.class */
public abstract class C2ak extends C2a1 implements C2a2, 0DR, 2aI {
    public final 0DE A00;

    public C2ak(0DE r302, boolean z) {
        this._state$volatile = z ? C2a4.A00 : C2a4.A01;
        A0K((C2a2) r302.get(C2a2.A00));
        this.A00 = r302.plus(this);
    }

    @Override // X.C2a1
    public String A0F() {
        return AnonymousClass001.A0X(this);
    }

    public final void A0Q(Integer num, Object obj, Function2 function2) {
        Object invoke;
        int intValue = num.intValue();
        if (intValue == 0) {
            C2an.A00(obj, this, function2);
            return;
        }
        if (intValue == 2) {
            11T.A0F(function2, 0);
            0DT.A02(0DT.A01(obj, this, function2)).resumeWith(04S.A00);
            return;
        }
        if (intValue != 3) {
            if (intValue != 1) {
                throw 1BK.A1F();
            }
            return;
        }
        try {
            0DE r0 = this.A00;
            Object A00 = C2as.A00(null, r0);
            try {
                if (function2 instanceof 0DQ) {
                    C0B7.A04(function2, 2);
                    invoke = function2.invoke(obj, this);
                } else {
                    invoke = 0DT.A00(obj, this, function2);
                }
                C2as.A02(A00, r0);
                if (invoke != 0Ds.A02) {
                    resumeWith(invoke);
                }
            } catch (Throwable th) {
                C2as.A02(A00, r0);
                throw th;
            }
        } catch (Throwable th2) {
            resumeWith(new 0DV(th2));
        }
    }

    public void A0R(Object obj) {
    }

    public void A0S(Object obj) {
        A0H(obj);
    }

    public void A0T(Throwable th, boolean z) {
    }

    public final 0DE getContext() {
        return this.A00;
    }

    public 0DE getCoroutineContext() {
        return this.A00;
    }

    public final void resumeWith(Object obj) {
        Throwable A00 = 0DU.A00(obj);
        if (A00 != null) {
            obj = new C2s6(A00, false);
        }
        Object A0C = A0C(obj);
        if (A0C != C2a4.A04) {
            A0S(A0C);
        }
    }
}
