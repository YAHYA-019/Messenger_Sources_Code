package X;

/* loaded from: Fn0.class */
public final class Fn0 implements GFi {
    public GFi A00;
    public final Fmx A01;
    public final Fmy A02;
    public final Fmz A03;

    public Fn0() {
        Fmy fmy = (Fmy) 1Bn.A0B(99289);
        Fmz fmz = (Fmz) 1Bn.A0B(99288);
        Fmx fmx = (Fmx) 1Bn.A0B(99287);
        this.A02 = fmy;
        this.A03 = fmz;
        this.A01 = fmx;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if ((r304 instanceof X.GNv) != false) goto L6;
     */
    @Override // X.GFi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.GFh BK3(android.view.View r302, android.view.ViewGroup r303, java.lang.Object r304) {
        /*
            r301 = this;
            r0 = r304
            boolean r0 = r0 instanceof com.facebook.payments.p2p.model.PaymentTransaction
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = r305
            if (r0 != 0) goto L1f
            r0 = r304
            boolean r0 = r0 instanceof X.GNv
            r307 = r0
            r0 = 0
            r308 = r0
            r0 = 0
            r309 = r0
            r0 = r307
            if (r0 == 0) goto L22
        L1f:
            r0 = 1
            r308 = r0
        L22:
            r0 = r308
            com.google.common.base.Preconditions.checkArgument(r0)
            r0 = r305
            if (r0 == 0) goto L7b
            r0 = r304
            r309 = r0
            r0 = r304
            com.facebook.payments.p2p.model.PaymentTransaction r0 = (com.facebook.payments.p2p.model.PaymentTransaction) r0
            com.facebook.payments.p2p.model.CommerceOrder r0 = r0.A03
            r309 = r0
            r0 = r309
            if (r0 == 0) goto L7b
            r0 = r301
            X.Fmx r0 = r0.A01
            r309 = r0
        L43:
            r0 = r301
            r1 = r309
            r0.A00 = r1
            r0 = r309
            r1 = r302
            r2 = r303
            r3 = r304
            X.GFh r0 = r0.BK3(r1, r2, r3)
            r310 = r0
            r0 = r310
            boolean r0 = r0 instanceof com.facebook.payments.p2p.messenger.core.prefs.transactions.UserMessengerPayHistoryItemView
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L6d
            r0 = r310
            boolean r0 = r0 instanceof com.facebook.payments.p2p.messenger.core.prefs.transactions.ProductMessengerPayHistoryItemView
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L70
        L6d:
            r0 = 1
            r306 = r0
        L70:
            r0 = r306
            com.google.common.base.Preconditions.checkArgument(r0)
            r0 = r310
            X.GFh r0 = (X.GFh) r0
            return r0
        L7b:
            r0 = r304
            boolean r0 = r0 instanceof X.GNv
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L8f
            r0 = r301
            X.Fmz r0 = r0.A03
            r309 = r0
            goto L43
        L8f:
            r0 = r301
            X.Fmy r0 = r0.A02
            r309 = r0
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fn0.BK3(android.view.View, android.view.ViewGroup, java.lang.Object):X.GFh");
    }
}
