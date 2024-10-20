package X;

import androidx.lifecycle.Observer;

/* renamed from: X.9qk, reason: invalid class name */
/* loaded from: 9qk.class */
public final class C9qk implements Observer {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C9qk(int i, int i2, Object obj) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0089, code lost:
    
        if (X.2Gt.A08(r305) == false) goto L13;
     */
    @Override // androidx.lifecycle.Observer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void onChanged(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.A00
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L4c
            r0 = r302
            X.8Kn r0 = (X.8Kn) r0
            r302 = r0
            r0 = r301
            java.lang.Object r0 = r0.A02
            X.A9D r0 = (X.A9D) r0
            r304 = r0
            r0 = r304
            X.9K6 r0 = r0.A04
            r305 = r0
            r0 = r301
            int r0 = r0.A01
            r303 = r0
            r0 = r302
            r1 = r304
            r2 = r303
            com.google.common.collect.ImmutableMultimap r0 = X.A9D.A01(r0, r1, r2)
            r304 = r0
            r0 = r305
            com.facebook.messaging.msys.thread.reactions.reactors.fragment.MessageReactorsFragment r0 = r0.A00
            r305 = r0
            r0 = r305
            com.facebook.litho.LithoView r0 = r0.A01
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L44
            java.lang.String r0 = "lithoView"
            X.11T.A0L(r0)
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        L44:
            r0 = r305
            r1 = r304
            com.facebook.litho.LithoView r0 = com.facebook.messaging.msys.thread.reactions.reactors.fragment.MessageReactorsFragment.A05(r0, r1)
            return
        L4c:
            r0 = r302
            com.facebook.messaging.data.repository.threadsummary.interfaces.ThreadSummaryDataModel r0 = (com.facebook.messaging.data.repository.threadsummary.interfaces.ThreadSummaryDataModel) r0
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L74
            r0 = 0
            r305 = r0
        L58:
            r0 = 0
            r307 = r0
        L5b:
            r0 = r301
            java.lang.Object r0 = r0.A02
            X.Alb r0 = (X.C1557Alb) r0
            r304 = r0
            com.facebook.messaging.send.trigger.NavigationTrigger r0 = X.C1557Alb.A1B
            r306 = r0
            r0 = r304
            X.5xF r0 = r0.A0C
            r1 = r305
            r2 = r307
            r0.A04(r1, r2)
            return
        L74:
            r0 = r302
            com.facebook.messaging.model.threads.ThreadSummary r0 = r0.A00
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L58
            r0 = r305
            boolean r0 = X.2Gt.A08(r0)
            r303 = r0
            r0 = 1
            r307 = r0
            r0 = r303
            if (r0 != 0) goto L5b
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9qk.onChanged(java.lang.Object):void");
    }
}
