package X;

import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.3y1, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3y1.class */
public final /* synthetic */ class RunnableC03433y1 implements Runnable {
    public static final String __redex_internal_original_name = "QuickPerformanceLoggerImpl$$ExternalSyntheticLambda15";
    public final /* synthetic */ int A00;
    public final /* synthetic */ C02q A01;
    public final /* synthetic */ 1Qb A02;
    public final /* synthetic */ 1Jm A03;
    public final /* synthetic */ C00371aw A04;
    public final /* synthetic */ 2Lc A05;
    public final /* synthetic */ SettableFuture A06;

    public /* synthetic */ RunnableC03433y1(C02q c02q, 1Qb r303, 1Jm r304, C00371aw c00371aw, 2Lc r306, SettableFuture settableFuture, int i) {
        this.A03 = r304;
        this.A04 = c00371aw;
        this.A00 = i;
        this.A05 = r306;
        this.A06 = settableFuture;
        this.A02 = r303;
        this.A01 = c02q;
    }

    @Override // java.lang.Runnable
    public final void run() {
        1Jm r0 = this.A03;
        C00371aw c00371aw = this.A04;
        int i = this.A00;
        2Lc r02 = this.A05;
        final SettableFuture settableFuture = this.A06;
        1Qb r03 = this.A02;
        C02q c02q = this.A01;
        try {
            2Lh A00 = c00371aw.A00(i);
            if (r02 != null && !A00.BS6(r02)) {
                settableFuture.set((Object) null);
                return;
            }
            int B5R = A00.B5R();
            AnonymousClass042 anonymousClass042 = r03.A0I;
            Object obj = anonymousClass042 == null ? null : anonymousClass042.get(B5R);
            AnonymousClass042 anonymousClass0422 = r03.A0J;
            Object obj2 = anonymousClass0422 == null ? null : anonymousClass0422.get(B5R);
            0Gn AxQ = r03.AxQ();
            String B5Q = A00.B5Q();
            0Gn.A00(AxQ);
            AxQ.A01.add(B5Q);
            A00.AMK(r03, A00.BC4().cast(obj), A00.BBP().cast(obj2)).addListener(new Runnable() { // from class: X.487
                public static final String __redex_internal_original_name = "QuickPerformanceLoggerImpl$$ExternalSyntheticLambda14";

                @Override // java.lang.Runnable
                public final void run() {
                    SettableFuture.this.set((Object) null);
                }
            }, c02q);
        } catch (Exception unused) {
            if (r0.A07.A02()) {
                settableFuture.set((Object) null);
            }
        }
    }
}
