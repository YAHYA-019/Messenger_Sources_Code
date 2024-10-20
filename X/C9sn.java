package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: X.9sn, reason: invalid class name */
/* loaded from: 9sn.class */
public final class C9sn implements C2k6 {
    public final 1Iw A00;
    public final C9bp A01 = new C9bp();

    public C9sn(1Iw r302) {
        this.A00 = r302;
    }

    public static C9sn A00(1Iw r301) {
        return new C9sn(r301);
    }

    public static final void A01(1LI r301, C9sn c9sn, Object obj) {
        c9sn.A01.A00(r301, obj, false);
    }

    public static void A02(C9sn c9sn, Iterable iterable, Object obj, Function1 function1, int i) {
        A04(c9sn, iterable, function1, new AW4(obj, i));
    }

    public static final void A03(C9sn c9sn, Iterable iterable, Function1 function1, Function1 function12, Function1 function13, Function2 function2) {
        11T.A0F(iterable, 0);
        C9sl c9sl = new C9sl(c9sn.A00);
        for (Object obj : iterable) {
            c9sn.A01.A01(function1.invoke(obj), new 85O(20, c9sl, function2, obj), (Object[]) function12.invoke(obj), function13 != null ? 7zM.A00(function13.invoke(obj)) : -1.0f, false);
        }
    }

    public static final void A04(C9sn c9sn, Iterable iterable, Function1 function1, Function2 function2) {
        11T.A0F(iterable, 0);
        C9sl c9sl = new C9sl(c9sn.A00);
        for (Object obj : iterable) {
            c9sn.A01.A00((1LI) function2.invoke(c9sl, obj), function1.invoke(obj), false);
        }
    }

    @Override // X.C2k6
    public 1Iw AeS() {
        return this.A00;
    }

    @Override // X.C2k7
    public C1qo B7k() {
        C1qo c1qo = AeS().A0E;
        11T.A0A(c1qo);
        return c1qo;
    }
}
