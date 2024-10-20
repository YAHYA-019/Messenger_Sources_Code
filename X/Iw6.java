package X;

/* loaded from: Iw6.class */
public final class Iw6 implements Runnable {
    public static final String __redex_internal_original_name = "CowatchAdControllerImpl$appModelListener$1$onModelUpdate$1";
    public final /* synthetic */ Hql A00;
    public final /* synthetic */ 2JS A01;

    public Iw6(Hql hql, 2JS r303) {
        this.A00 = hql;
        this.A01 = r303;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
    
        if (r0.insertionPoints.isEmpty() != false) goto L6;
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
            X.Hql r0 = r0.A00
            r302 = r0
            r0 = r301
            X.2JS r0 = r0.A01
            r303 = r0
            X.2JQ r0 = com.facebook.rsys.cowatchad.gen.CowatchAdModel.CONVERTER
            r1 = r303
            java.lang.Object r0 = X.GOo.A0p(r0, r1)
            com.facebook.rsys.cowatchad.gen.CowatchAdModel r0 = (com.facebook.rsys.cowatchad.gen.CowatchAdModel) r0
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L2c
            r0 = r304
            java.util.ArrayList r0 = r0.insertionPoints
            r304 = r0
            r0 = r304
            boolean r0 = r0.isEmpty()
            r305 = r0
            r0 = 1
            r306 = r0
            r0 = r305
            if (r0 == 0) goto L31
        L2c:
            r0 = 0
            r306 = r0
            r0 = 0
            r303 = r0
        L31:
            r0 = r302
            boolean r0 = r0.A0A
            r305 = r0
            r0 = r306
            r1 = r305
            if (r0 == r1) goto L6a
            r0 = r302
            r1 = r306
            r0.A0A = r1
            r0 = r302
            X.1Br r0 = r0.A0F
            r304 = r0
            r0 = r304
            android.os.Handler r0 = X.DKE.A0K(r0)
            r307 = r0
            r0 = r302
            X.IqC r0 = r0.A0J
            r308 = r0
            r0 = r306
            if (r0 == 0) goto L6b
            r0 = r302
            long r0 = r0.A0B
            r309 = r0
            r0 = r307
            r1 = r308
            r2 = r309
            boolean r0 = r0.postDelayed(r1, r2)
        L6a:
            return
        L6b:
            r0 = r307
            r1 = r308
            r0.removeCallbacks(r1)
            r0 = r304
            android.os.Handler r0 = X.DKE.A0K(r0)
            r303 = r0
            r0 = r302
            X.IqB r0 = r0.A0I
            r304 = r0
            r0 = r303
            r1 = r304
            r0.removeCallbacks(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Iw6.run():void");
    }
}
