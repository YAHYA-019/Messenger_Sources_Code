package X;

import com.google.common.util.concurrent.SettableFuture;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.1hm, reason: invalid class name */
/* loaded from: 1hm.class */
public final /* synthetic */ class C1hm implements Runnable {
    public static final String __redex_internal_original_name = "QuickPerformanceLoggerImpl$$ExternalSyntheticLambda16";
    public final /* synthetic */ 1Qb A00;
    public final /* synthetic */ 1Jm A01;
    public final /* synthetic */ SettableFuture A02;

    public /* synthetic */ C1hm(1Qb r302, 1Jm r303, SettableFuture settableFuture) {
        this.A01 = r303;
        this.A00 = r302;
        this.A02 = settableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        1Jm r0 = this.A01;
        C03b c03b = this.A00;
        SettableFuture settableFuture = this.A02;
        try {
            1Kc r02 = 1Jm.A06(r0).A03;
            if (r02 != null) {
                03Z r03 = ((1Qb) c03b).A0G;
                int i = 0;
                if ((r03 == null ? r02.A02(c03b.getMarkerId(), 0) : r02.A02(r03.A00, 0) | r02.A02(r03.A01, 0)) != 0) {
                    C0mi[] c0miArr = ((1Kb) r02).A02;
                    if (c0miArr != null) {
                        while (true) {
                            if (i >= c0miArr.length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
            Iterator it = ((Collection) r0.A0C.get()).iterator();
            while (it.hasNext()) {
                ((C1ib) it.next()).D9w(c03b);
            }
        } finally {
            settableFuture.set(c03b);
        }
    }
}
