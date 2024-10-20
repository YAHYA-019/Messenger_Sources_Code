package X;

import com.facebook.messaging.business.bmop.plugins.bmopcomposerlifecycle.BmopComposerLifeCycleImplementation;

/* loaded from: D8p.class */
public final class D8p implements Runnable {
    public static final String __redex_internal_original_name = "BmopComposerLifeCycleImplementation$assembleCallBack$1$1$1";
    public final /* synthetic */ BmopComposerLifeCycleImplementation A00;
    public final /* synthetic */ 6fA A01;
    public final /* synthetic */ boolean A02;

    public D8p(BmopComposerLifeCycleImplementation bmopComposerLifeCycleImplementation, 6fA r303, boolean z) {
        this.A00 = bmopComposerLifeCycleImplementation;
        this.A01 = r303;
        this.A02 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003c, code lost:
    
        if (r305 != null) goto L8;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r301 = this;
            r0 = r301
            com.facebook.messaging.business.bmop.plugins.bmopcomposerlifecycle.BmopComposerLifeCycleImplementation r0 = r0.A00
            r302 = r0
            r0 = r302
            X.1Br r0 = r0.A03
            X.1Ql r0 = X.1Br.A08(r0)
            r303 = r0
            r0 = r302
            X.1G2 r0 = r0.A05
            r304 = r0
            r0 = r301
            X.6fA r0 = r0.A01
            com.facebook.messaging.model.threads.ThreadSummary r0 = r0.A03
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L66
            r0 = r305
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A0n
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L66
            r0 = r305
            long r0 = r0.A05
            r306 = r0
            r0 = r306
            java.lang.String r0 = X.7zO.A0q(r0)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L66
        L3f:
            r0 = r304
            r1 = r305
            X.1G2 r0 = X.1G3.A01(r0, r1)
            r308 = r0
            r0 = r301
            boolean r0 = r0.A02
            r309 = r0
            r0 = r303
            r1 = r308
            r2 = r309
            X.1Ql.A01(r0, r1, r2)
            r0 = r302
            com.facebook.litho.LithoView r0 = r0.A00
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L65
            r0 = r305
            r0.requestLayout()
        L65:
            return
        L66:
            java.lang.String r0 = "unknown"
            r305 = r0
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D8p.run():void");
    }
}
