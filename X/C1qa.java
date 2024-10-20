package X;

import com.facebook.messaging.analytics.perf.MessagingPerformanceLogger;
import java.util.Set;

/* renamed from: X.1qa, reason: invalid class name */
/* loaded from: 1qa.class */
public final class C1qa implements Runnable {
    public static final String __redex_internal_original_name = "MsysThreadListAdapter$1$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ 1Wp A01;
    public final /* synthetic */ 1qY A02;
    public final /* synthetic */ 1qW A03;
    public final /* synthetic */ Set A04;
    public final /* synthetic */ boolean A05;

    public C1qa(1Wp r302, 1qY r303, 1qW r304, Set set, int i, boolean z) {
        this.A01 = r302;
        this.A03 = r304;
        this.A02 = r303;
        this.A00 = i;
        this.A04 = set;
        this.A05 = z;
    }

    public static void A00(1UX r301) {
        ((MessagingPerformanceLogger) r301.A0G.get()).A0d("msys_fetch_tl_end");
        ((1Tw) r301.A0H.get()).A00("msys_fetch_tl_end");
    }

    public static void A01(1UX r301, Object obj, Object obj2) {
        if (obj == obj2) {
            C00i c00i = r301.A0A;
            ((1SG) c00i.get()).A0L("thread_list");
            ((1SG) c00i.get()).A0L("contact_list");
            ((1SG) r301.A04.get()).A0L("thread_list");
            ((1SG) r301.A0B.get()).A0L("thread_list");
            ((1SG) r301.A0C.get()).A0L("thread_list");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x03db, code lost:
    
        if (r317 == null) goto L174;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 2786
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1qa.run():void");
    }
}
