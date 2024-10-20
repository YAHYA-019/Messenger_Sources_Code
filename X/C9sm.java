package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: X.9sm, reason: invalid class name */
/* loaded from: 9sm.class */
public final class C9sm implements C2k6 {
    public final 1Iw A00;
    public final C9bp A01 = new C9bp();

    public C9sm(1Iw r302) {
        this.A00 = r302;
    }

    public static void A00(1LI r301, C9sm c9sm, Object obj, boolean z) {
        c9sm.A01.A00(r301, Integer.valueOf(obj.hashCode()), z);
    }

    public static final void A01(C9sm c9sm, Iterable iterable, Function1 function1, Function1 function12, Function2 function2) {
        11T.A0F(iterable, 0);
        C9sl c9sl = new C9sl(c9sm.A00);
        for (Object obj : iterable) {
            c9sm.A01.A00((1LI) function2.invoke(c9sl, obj), function1.invoke(obj), function12 != null ? 7zR.A1a(obj, function12) : false);
        }
    }

    public static final void A02(C9sm c9sm, Object obj, Function1 function1, Object[] objArr, boolean z) {
        c9sm.A01.A01(obj, AQc.A00(function1, c9sm, 5), objArr, -1.0f, z);
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
