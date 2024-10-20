package X;

/* loaded from: It6.class */
public final class It6 implements Runnable {
    public static final String __redex_internal_original_name = "RtcAudioOutputManagerImpl$setupTelephonyManagerForBluetooth$$inlined$Runnable$1";
    public final /* synthetic */ Gyj A00;

    public It6(Gyj gyj) {
        this.A00 = gyj;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r305v2 ??, still in use, count: 2, list:
          (r305v2 ??) from 0x003c: PHI (r305v1 ??) = (r305v0 ??), (r305v2 ??) binds: [B:10:0x0022, B:15:0x0037] A[DONT_GENERATE, DONT_INLINE]
          (r305v2 ?? I:android.telephony.PhoneStateListener) from 0x0039: IPUT (r305v2 ?? I:android.telephony.PhoneStateListener), (r0v2 ?? I:X.Gyj) A[Catch: IllegalStateException -> 0x0049] X.Gyj.A00 android.telephony.PhoneStateListener
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0049: THROW (r0 I:java.lang.Throwable), block:B:24:0x0049 */
    @Override // java.lang.Runnable
    public final void run() {
        /*
            r301 = this;
            r0 = r301
            X.Gyj r0 = r0.A00     // Catch: java.lang.IllegalStateException -> L49
            r302 = r0
            r0 = r302
            X.01i r0 = r0.A0A     // Catch: java.lang.IllegalStateException -> L49
            r303 = r0
            r0 = r303
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.IllegalStateException -> L49
            r304 = r0
            r0 = r304
            X.1qC r0 = (X.1qC) r0     // Catch: java.lang.IllegalStateException -> L49
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L48
            r0 = r302
            android.telephony.PhoneStateListener r0 = r0.A00     // Catch: java.lang.IllegalStateException -> L49
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L3c
            r0 = 0
            r306 = r0
            r0 = 0
            r303 = r0
            X.GTV r0 = new X.GTV     // Catch: java.lang.IllegalStateException -> L49
            r305 = r0
            r0 = r305
            r1 = r302
            r2 = 0
            r0.<init>(r1, r2)     // Catch: java.lang.IllegalStateException -> L49
            r0 = r302
            r1 = r305
            r0.A00 = r1     // Catch: java.lang.IllegalStateException -> L49
        L3c:
            r0 = 32
            r306 = r0
            r0 = r304
            r1 = r305
            r2 = r306
            r0.A0F(r1, r2)     // Catch: java.lang.IllegalStateException -> L49
        L48:
            return
        L49:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.It6.run():void");
    }
}
