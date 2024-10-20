package X;

/* loaded from: It5.class */
public final class It5 implements Runnable {
    public static final String __redex_internal_original_name = "RtcAudioOutputManagerImpl$cleanAudioStates$1";
    public final /* synthetic */ Gyj A00;

    public It5(Gyj gyj) {
        this.A00 = gyj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0028: THROW (r0 I:java.lang.Throwable), block:B:16:0x0028 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r301 = this;
            r0 = r301
            X.Gyj r0 = r0.A00     // Catch: java.lang.IllegalStateException -> L28
            r302 = r0
            r0 = r302
            X.01i r0 = r0.A0A     // Catch: java.lang.IllegalStateException -> L28
            r303 = r0
            r0 = r303
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.IllegalStateException -> L28
            r304 = r0
            r0 = r304
            X.1qC r0 = (X.1qC) r0     // Catch: java.lang.IllegalStateException -> L28
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L27
            r0 = r302
            android.telephony.PhoneStateListener r0 = r0.A00     // Catch: java.lang.IllegalStateException -> L28
            r302 = r0
            r0 = 0
            r303 = r0
            r0 = r304
            r1 = r302
            r2 = 0
            r0.A0F(r1, r2)     // Catch: java.lang.IllegalStateException -> L28
        L27:
            return
        L28:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.It5.run():void");
    }
}
