package X;

import android.content.Context;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* renamed from: X.7Zo, reason: invalid class name */
/* loaded from: 7Zo.class */
public abstract class C7Zo {
    public static final C09364pw A00() {
        ExecutorService executorService = (ExecutorService) 1Bi.A03(16449);
        ExecutorService executorService2 = (ExecutorService) 1Bi.A03(33053);
        Boolean bool = (Boolean) 1Bn.A0E((Context) null, (1BY) null, 67334);
        1BQ A01 = 1BQ.A01();
        HashSet A0v = AnonymousClass001.A0v();
        A0v.addAll(1Bi.A06(64));
        A0v.addAll((Set) 1Bn.A0E((Context) null, (1BY) null, 79));
        if (bool.booleanValue()) {
            executorService = executorService2;
        }
        return new C09364pw(A0v, executorService, A01);
    }
}
