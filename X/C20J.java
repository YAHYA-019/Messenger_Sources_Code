package X;

import com.facebook.inject.FbInjector;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.20J, reason: invalid class name */
/* loaded from: 20J.class */
public final class C20J {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final java.util.Map A03;
    public final java.util.Map A04;
    public final 1BP A05;

    public C20J() {
        1Br A00 = 1Bq.A00(16385);
        this.A00 = A00;
        this.A05 = FbInjector.A00;
        this.A01 = 1Bq.A00(16957);
        this.A02 = 1Bq.A00(49650);
        boolean AZk = ((2yD) A00.A00.get()).AZk(36310911951832552L);
        this.A04 = AZk ? new ConcurrentHashMap() : new HashMap();
        this.A03 = AZk ? new ConcurrentHashMap() : new HashMap();
    }
}
