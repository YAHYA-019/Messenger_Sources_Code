package X;

import android.os.Bundle;
import java.util.Collection;
import java.util.List;

/* loaded from: D78.class */
public final class D78 implements Runnable {
    public static final String __redex_internal_original_name = "OpenIDAuth$6$1";
    public final /* synthetic */ D4p A00;
    public final /* synthetic */ List A01;

    public D78(D4p d4p, List list) {
        this.A00 = d4p;
        this.A01 = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        D4p d4p = this.A00;
        CPg cPg = (CPg) d4p.A01;
        List list = this.A01;
        Collection collection = (Collection) d4p.A02;
        Bundle A01 = CPg.A01(cPg, list);
        A01.putStringArrayList("device_emails", 1BK.A17(collection));
        DJV djv = cPg.A09;
        if (djv.AGw(A01)) {
            return;
        }
        djv.C9k(2131958798);
    }
}
