package X;

import kotlin.jvm.functions.Function2;

/* renamed from: X.2as, reason: invalid class name */
/* loaded from: 2as.class */
public abstract class C2as {
    public static final 0DJ A00 = new 0DJ("NO_THREAD_ELEMENTS");
    public static final Function2 A01 = C2at.A00;
    public static final Function2 A02 = C2au.A00;
    public static final Function2 A03 = C2av.A00;

    public static final Object A00(Object obj, 0DE r302) {
        if (obj == null) {
            obj = A01(r302);
        }
        if (obj == 0) {
            return A00;
        }
        if (obj instanceof Integer) {
            return r302.fold(new 3LM(r302, AnonymousClass001.A03(obj)), A03);
        }
        11T.A0I(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        throw AnonymousClass001.A0Q("updateThreadContext");
    }

    public static final Object A01(0DE r301) {
        Object fold = r301.fold(0, A01);
        11T.A0D(fold);
        return fold;
    }

    public static final void A02(Object obj, 0DE r302) {
        if (obj != A00) {
            if (!(obj instanceof 3LM)) {
                11T.A0I(r302.fold((Object) null, A02), "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
                throw AnonymousClass001.A0Q("restoreThreadContext");
            }
            MRV[] mrvArr = ((3LM) obj).A01;
            int length = mrvArr.length - 1;
            if (length >= 0) {
                11T.A0D(mrvArr[length]);
                throw AnonymousClass001.A0Q("restoreThreadContext");
            }
        }
    }
}
