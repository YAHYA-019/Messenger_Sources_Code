package X;

import java.util.concurrent.Callable;

/* loaded from: DB5.class */
public final class DB5 implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public DB5(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj3;
        this.A04 = obj2;
        this.A02 = obj;
        this.A03 = obj4;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r306v12 ??, still in use, count: 3, list:
          (r306v12 ??) from 0x129b: PHI (r306v13 ??) = (r306v12 ??), (r306v21 ??) binds: [B:144:0x059b, B:739:?] A[DONT_GENERATE, DONT_INLINE]
          (r306v12 ?? I:X.DAs) from 0x059d: INVOKE (r0v218 ?? I:boolean) = (r306v12 ?? I:X.DAs) VIRTUAL call: X.DAs.hasNext():boolean A[Catch: all -> 0x129b, MD:():boolean (m)]
          (r306v12 ?? I:X.DAs) from 0x05a9: INVOKE (r0v934 ?? I:java.lang.Object) = (r306v12 ?? I:X.DAs) VIRTUAL call: X.DAs.next():java.lang.Object A[Catch: all -> 0x129b, MD:():java.lang.Object (m)]
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
    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            Method dump skipped, instructions count: 4928
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DB5.call():java.lang.Object");
    }
}
