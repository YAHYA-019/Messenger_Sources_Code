package X;

import com.facebook.common.callercontext.CallerContext;
import fxcache.model.FxCalAccount;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.21j, reason: invalid class name */
/* loaded from: 21j.class */
public abstract class C21j {
    public C21m A00() {
        return (C21m) ((C21i) this).A00.A00.get();
    }

    public final List A01(CallerContext callerContext, String str, String str2) {
        11T.A0F(callerContext, 1);
        C21m A00 = A00();
        Set singleton = Collections.singleton(str2);
        11T.A0A(singleton);
        return A00.A0A(callerContext, str, singleton);
    }

    public final boolean A02(CallerContext callerContext, String str) {
        11T.A0F(callerContext, 1);
        C21m A00 = A00();
        3zH A05 = A00.A05();
        String str2 = callerContext.A03;
        11T.A0A(str2);
        3zH.A00(A05, "cache_access", str, (List) null, 04R.A05(new 03Y[]{1BK.A1G("caller_class", str2)}));
        if (A00.A0J()) {
            3zH.A00(A00.A05(), "cache_eviction", A00.A08(), (List) null, (java.util.Map) null);
            A00.A0B();
        }
        C21m.A02(A00);
        A00.A0D();
        A00.A0H(str, C21m.A01(A00));
        A00.A05().A06(str, C21m.A01(A00), A00.A09(), A00.A03(), A00.A0I(), A00.A0J());
        List list = A00.A06().A02;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((FxCalAccount) it.next()).A04.equalsIgnoreCase("INSTAGRAM")) {
                return true;
            }
        }
        return false;
    }
}
