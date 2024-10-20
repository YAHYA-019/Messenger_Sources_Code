package X;

import android.content.Intent;

/* loaded from: J24.class */
public final class J24 implements Runnable {
    public static final String __redex_internal_original_name = "BroadcastFlowIntentModelParser$parseIntent$1";
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ CEt A01;
    public final /* synthetic */ Bhs A02;
    public final /* synthetic */ C5X A03;

    public J24(Intent intent, CEt cEt, Bhs bhs, C5X c5x) {
        this.A01 = cEt;
        this.A00 = intent;
        this.A02 = bhs;
        this.A03 = c5x;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r306v13 ??, still in use, count: 2, list:
          (r306v13 ??) from 0x0302: PHI (r306v12 ??) = (r306v10 ??), (r306v13 ??) binds: [B:135:0x07ce, B:85:0x02fd] A[DONT_GENERATE, DONT_INLINE]
          (r306v13 ?? I:X.HFE) from 0x02ff: IPUT (r0v231 ?? I:java.lang.String), (r306v13 ?? I:X.HFE) A[Catch: Exception -> 0x0832] X.HFE.A01 java.lang.String
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
            Method dump skipped, instructions count: 2984
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J24.run():void");
    }
}
