package X;

import android.os.Handler;

/* loaded from: J0w.class */
public final /* synthetic */ class J0w implements Runnable {
    public static final String __redex_internal_original_name = "SurfaceVideoEncoderImpl$$ExternalSyntheticLambda2";
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ JIk A01;
    public final /* synthetic */ IdT A02;

    public /* synthetic */ J0w(Handler handler, JIk jIk, IdT idT) {
        this.A02 = idT;
        this.A01 = jIk;
        this.A00 = handler;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r309v2 ??, still in use, count: 3, list:
          (r309v2 ??) from 0x0095: PHI (r309v1 ??) = (r309v0 ??), (r309v2 ??) binds: [B:68:0x0112, B:31:0x0090] A[DONT_GENERATE, DONT_INLINE]
          (r309v2 ?? I:X.HDP) from 0x007e: INVOKE (r309v2 ?? I:X.HDP), (r0v54 ?? I:java.lang.String), (r0v58 ?? I:java.lang.String) VIRTUAL call: X.HDP.A03(java.lang.String, java.lang.String):void A[Catch: all -> 0x011d]
          (r309v2 ?? I:X.HDP) from 0x0092: INVOKE (r309v2 ?? I:X.HDP), (r0v60 ?? I:java.lang.String), (r0v62 ?? I:java.lang.String) VIRTUAL call: X.HDP.A03(java.lang.String, java.lang.String):void A[Catch: all -> 0x011d]
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
    @Override // java.lang.Runnable
    public final void run() {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J0w.run():void");
    }
}
