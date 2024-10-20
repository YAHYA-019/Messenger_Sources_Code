package X;

import com.facebook.rsys.litecamera.LiteCameraProxy;

/* loaded from: J5t.class */
public final class J5t implements C15h {
    public Object A00;
    public final int A01;
    public final Object A02;

    public J5t(int i) {
        this.A01 = i;
    }

    public J5t(LiteCameraProxy liteCameraProxy) {
        this.A01 = 8;
        this.A02 = liteCameraProxy;
    }

    public J5t(Object obj, Object obj2, int i) {
        this.A01 = i;
        this.A00 = obj2;
        this.A02 = obj;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r305v8 ??, still in use, count: 2, list:
          (r305v8 ??) from 0x0120: PHI (r305v5 ??) = (r305v4 ??), (r305v8 ??) binds: [B:27:0x00d4, B:44:0x011b] A[DONT_GENERATE, DONT_INLINE]
          (r305v8 ?? I:java.lang.Object) from 0x011d: IPUT (r305v8 ?? I:java.lang.Object), (r301v0 'this' ?? I:X.J5t A[IMMUTABLE_TYPE, THIS]) A[Catch: all -> 0x0126] X.J5t.A00 java.lang.Object
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
    @Override // X.C15h
    public /* bridge */ /* synthetic */ java.lang.Object get() {
        /*
            Method dump skipped, instructions count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J5t.get():java.lang.Object");
    }
}
