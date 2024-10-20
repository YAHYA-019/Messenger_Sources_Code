package X;

/* renamed from: X.0u5, reason: invalid class name */
/* loaded from: 0u5.class */
public final class C0u5 extends C0pv {
    public final int A00;
    public final Object A01;

    public C0u5(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r328v2 ??, still in use, count: 2, list:
          (r328v2 ??) from 0x02f9: PHI (r328v1 ??) = (r328v0 ??), (r328v2 ??) binds: [B:68:0x02e0, B:73:0x02f4] A[DONT_GENERATE, DONT_INLINE]
          (r328v2 ?? I:X.15h) from 0x02f6: IPUT (r328v2 ?? I:X.15h), (r0v226 ?? I:X.0hg) A[Catch: all -> 0x03cf] X.0hg.A06 X.15h
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
    @Override // X.C0pv
    public java.lang.Object A00() {
        /*
            Method dump skipped, instructions count: 1835
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0u5.A00():java.lang.Object");
    }
}
