package X;

import java.util.concurrent.Callable;

/* loaded from: J58.class */
public final class J58 implements Callable {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    public J58(Object obj, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A03 = str2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r310v29 ??, still in use, count: 2, list:
          (r310v29 ??) from 0x026a: PHI (r310v28 ??) = (r310v27 ??), (r310v29 ??) binds: [B:134:0x024a, B:143:0x0267] A[DONT_GENERATE, DONT_INLINE]
          (r310v29 ?? I:X.I83) from 0x0267: SPUT (r310v29 ?? I:X.I83) A[Catch: all -> 0x0270] X.HO6.A01 X.I83
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
    public final java.lang.Object call() {
        /*
            Method dump skipped, instructions count: 2084
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J58.call():java.lang.Object");
    }
}
