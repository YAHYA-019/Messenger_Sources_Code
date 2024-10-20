package X;

import java.util.Collection;

/* renamed from: X.3ha, reason: invalid class name */
/* loaded from: 3ha.class */
public final class C3ha implements Runnable {
    public static final String __redex_internal_original_name = "AbstractWeakListenersManager$scheduleCallingListeners$1";
    public final /* synthetic */ 1D3 A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ Collection A02;

    public C3ha(1D3 r302, Object obj, Collection collection) {
        this.A00 = r302;
        this.A02 = collection;
        this.A01 = obj;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r306v4 ??, still in use, count: 2, list:
          (r306v4 ??) from 0x0359: PHI (r306v5 ??) = (r306v4 ??), (r306v7 ??) binds: [B:271:0x036d, B:117:0x0359] A[DONT_GENERATE, DONT_INLINE]
          (r306v4 ?? I:java.lang.Object) from 0x036f: INVOKE (r0v273 ?? I:java.util.Set), (r306v4 ?? I:java.lang.Object) INTERFACE call: java.util.Set.add(java.lang.Object):boolean A[Catch: all -> 0x0543, MD:(E):boolean (c)]
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
            Method dump skipped, instructions count: 1418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3ha.run():void");
    }
}
