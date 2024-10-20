package X;

import java.util.Map;

/* renamed from: X.4qa, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4qa.class */
public final class RunnableC09504qa implements Runnable {
    public static final String __redex_internal_original_name = "DefaultEvictionPluginController$2";
    public final /* synthetic */ 2Jw A00;
    public final /* synthetic */ Map.Entry A01;

    public RunnableC09504qa(2Jw r302, Map.Entry entry) {
        this.A00 = r302;
        this.A01 = entry;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r306v5 ??, still in use, count: 5, list:
          (r306v5 ??) from 0x0949: PHI (r306v2 ??) = (r306v1 ??), (r306v5 ??), (r306v5 ??) binds: [B:357:0x0944, B:260:0x08a6, B:291:0x0949] A[DONT_GENERATE, DONT_INLINE]
          (r306v5 ??) from 0x0949: PHI (r306v2 ??) = (r306v1 ??), (r306v5 ??), (r306v5 ??) binds: [B:357:0x0944, B:260:0x08a6, B:291:0x0949] A[DONT_GENERATE, DONT_INLINE]
          (r306v5 ?? I:java.util.AbstractMap) from 0x07e5: INVOKE (r0v428 ?? I:java.lang.Object), (r306v5 ?? I:java.util.AbstractMap), (r0v320 ?? I:int) STATIC call: X.001.A1A(java.lang.Object, java.util.AbstractMap, int):void A[Catch: all -> 0x0ae4, MD:(java.lang.Object, java.util.AbstractMap, int):void (m)]
          (r306v5 ?? I:java.util.AbstractMap) from 0x0896: INVOKE (r306v5 ?? I:java.util.AbstractMap), (r0v400 ?? I:java.lang.Object), (r0v403 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractMap.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x0ae4, MD:(K, V):V (c)]
          (r306v5 ?? I:java.util.AbstractMap) from 0x093d: INVOKE (r306v5 ?? I:java.util.AbstractMap), (r0v362 ?? I:java.lang.Object), (r0v364 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractMap.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x0ae4, MD:(K, V):V (c)]
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
    public void run() {
        /*
            Method dump skipped, instructions count: 2824
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC09504qa.run():void");
    }
}
