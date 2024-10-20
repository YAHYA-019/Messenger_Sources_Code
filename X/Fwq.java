package X;

/* loaded from: Fwq.class */
public final class Fwq implements GH4 {
    public static final Fwq A00 = new Fwq();

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v3 ??, still in use, count: 2, list:
          (r303v3 ??) from 0x0019: PHI (r303v2 ??) = (r303v1 ??), (r303v3 ??) binds: [B:6:0x000a, B:10:0x0016] A[DONT_GENERATE, DONT_INLINE]
          (r303v3 ?? I:X.F2x) from 0x0016: SPUT (r303v3 ?? I:X.F2x) A[Catch: all -> 0x001d] X.F2x.A00 X.F2x
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
    @Override // X.GH4
    public /* bridge */ /* synthetic */ java.lang.Object get() {
        /*
            r301 = this;
            java.lang.Class<X.F2x> r0 = X.F2x.class
            r302 = r0
            r0 = r302
            monitor-enter(r0)
            X.F2x r0 = X.F2x.A00     // Catch: java.lang.Throwable -> L1d
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L19
            X.F2x r0 = new X.F2x     // Catch: java.lang.Throwable -> L1d
            r303 = r0
            r0 = r303
            r0.<init>()     // Catch: java.lang.Throwable -> L1d
            r0 = r303
            X.F2x.A00 = r0     // Catch: java.lang.Throwable -> L1d
        L19:
            r0 = r302
            monitor-exit(r0)
            r0 = r303
            return r0
        L1d:
            r303 = move-exception
            r0 = r302
            monitor-exit(r0)
            r0 = r303
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fwq.get():java.lang.Object");
    }
}
