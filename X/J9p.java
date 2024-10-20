package X;

/* loaded from: J9p.class */
public final class J9p extends C00q implements C00m {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J9p(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C01h A00(Object obj, int i) {
        return C01g.A01(new J9p(obj, i));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r305v30 ??, still in use, count: 2, list:
          (r305v30 ??) from 0x0361: PHI (r305v29 ??) = (r305v28 ??), (r305v30 ??) binds: [B:43:0x034e, B:48:0x035e] A[DONT_GENERATE, DONT_INLINE]
          (r305v30 ?? I:X.I9W) from 0x035e: SPUT (r305v30 ?? I:X.I9W) A[Catch: all -> 0x08e9] X.I9W.A04 X.I9W
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
    @Override // X.C00m
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            Method dump skipped, instructions count: 2302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J9p.invoke():java.lang.Object");
    }
}
