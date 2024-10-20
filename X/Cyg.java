package X;

import com.facebook.msys.mca.MailboxCallback;

/* loaded from: Cyg.class */
public final class Cyg implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    public Cyg(Object obj, Object obj2, Object obj3, Object obj4, int i, long j, long j2, long j3) {
        this.A00 = i;
        this.A07 = obj4;
        this.A04 = obj;
        this.A01 = j;
        this.A02 = j2;
        this.A03 = j3;
        this.A05 = obj3;
        this.A06 = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        if (r307 == null) goto L10;
     */
    @Override // com.facebook.msys.mca.MailboxCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void onCompletion(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            r303 = r0
            r0 = r301
            int r0 = r0.A00
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L73
            r0 = r302
            com.facebook.msys.mca.MailboxNullable r0 = (com.facebook.msys.mca.MailboxNullable) r0
            r303 = r0
            r0 = r301
            java.lang.Object r0 = r0.A04
            X.2R2 r0 = (X.2R2) r0
            r305 = r0
            r0 = r305
            X.11T.A0D(r0)
            r0 = r303
            if (r0 == 0) goto L39
            r0 = r303
            java.lang.Object r0 = r0.value
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L39
            r0 = r306
            java.lang.String r0 = r0.toString()
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L3d
        L39:
            java.lang.String r0 = "-1"
            r307 = r0
        L3d:
            r0 = r301
            long r0 = r0.A01
            r308 = r0
            r0 = r301
            long r0 = r0.A02
            r310 = r0
            r0 = r301
            long r0 = r0.A03
            r312 = r0
            r0 = r301
            java.lang.Object r0 = r0.A05
            X.HCX r0 = (X.HCX) r0
            r314 = r0
            r0 = r301
            java.lang.Object r0 = r0.A06
            X.3yg r0 = (X.EnumC03583yg) r0
            r315 = r0
            r0 = r305
            r1 = r315
            r2 = r314
            r3 = r307
            r4 = r308
            r5 = r310
            r6 = r312
            X.IEZ.A05(r0, r1, r2, r3, r4, r5, r6)
            return
        L73:
            r0 = r301
            long r0 = r0.A03
            r316 = r0
            r0 = r301
            long r0 = r0.A01
            r318 = r0
            r0 = r301
            long r0 = r0.A02
            r308 = r0
            r0 = r301
            r1 = 6
            X.Czk r0 = X.Czk.A00(r0, r1)
            r320 = r0
            r0 = 2
            r1 = r316
            r2 = r318
            r3 = r308
            r4 = r302
            r5 = r320
            java.lang.Object r0 = com.facebook.cowatch.mca.MailboxCowatchJNI.dispatchOJJJOO(r0, r1, r2, r3, r4, r5)
            com.facebook.simplejni.NativeHolder r0 = (com.facebook.simplejni.NativeHolder) r0
            r315 = r0
            r0 = r301
            java.lang.Object r0 = r0.A06
            com.facebook.msys.mca.MailboxObservableImpl r0 = (com.facebook.msys.mca.MailboxObservableImpl) r0
            r305 = r0
            r0 = r301
            java.lang.Object r0 = r0.A07
            r306 = r0
            r0 = r305
            r1 = r315
            r2 = r306
            X.AbM.A1O(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cyg.onCompletion(java.lang.Object):void");
    }
}
