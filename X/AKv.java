package X;

/* loaded from: AKv.class */
public final class AKv extends C00q implements C00m {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AKv(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        super(0);
        this.A00 = i;
        this.A02 = obj;
        this.A06 = obj2;
        this.A03 = obj3;
        this.A04 = obj4;
        this.A05 = obj5;
        this.A01 = obj6;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r322v4 ??, still in use, count: 3, list:
          (r322v4 ??) from 0x038d: PHI (r322v3 ??) = (r322v2 ??), (r322v4 ??) binds: [B:28:0x030d, B:56:0x036a] A[DONT_GENERATE, DONT_INLINE]
          (r322v4 ?? I:X.4IE) from 0x034d: INVOKE (r0v317 ?? I:X.4IK), (r322v4 ?? I:X.4IE) DIRECT call: X.4IK.<init>(X.4IE):void A[Catch: IOException -> 0x0370, all -> 0x0393, MD:(X.4IE):void (m)]
          (r322v4 ?? I:X.4IE) from 0x036a: SPUT (r322v4 ?? I:X.4IE) A[Catch: all -> 0x0393] X.4IE.A00 X.4IE
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
            Method dump skipped, instructions count: 1859
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AKv.invoke():java.lang.Object");
    }
}
