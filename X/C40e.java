package X;

import org.apache.http.impl.client.RequestWrapper;

/* renamed from: X.40e, reason: invalid class name */
/* loaded from: 40e.class */
public final class C40e implements C40b {
    public final C40f A00;

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v3 ??, still in use, count: 2, list:
          (r303v3 ??) from 0x001d: PHI (r303v2 ??) = (r303v1 ??), (r303v3 ??) binds: [B:6:0x000e, B:10:0x001a] A[DONT_GENERATE, DONT_INLINE]
          (r303v3 ?? I:X.40f) from 0x001a: SPUT (r303v3 ?? I:X.40f) A[Catch: all -> 0x0025] X.40f.A01 X.40f
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
    public C40e() {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            java.lang.Class<X.40f> r0 = X.C40f.class
            r302 = r0
            r0 = r302
            monitor-enter(r0)
            X.40f r0 = X.C40f.A01     // Catch: java.lang.Throwable -> L25
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L1d
            X.40f r0 = new X.40f     // Catch: java.lang.Throwable -> L25
            r303 = r0
            r0 = r303
            r0.<init>()     // Catch: java.lang.Throwable -> L25
            r0 = r303
            X.C40f.A01 = r0     // Catch: java.lang.Throwable -> L25
        L1d:
            r0 = r302
            monitor-exit(r0)
            r0 = r301
            r1 = r303
            r0.A00 = r1
            return
        L25:
            r303 = move-exception
            r0 = r302
            monitor-exit(r0)
            r0 = r303
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40e.<init>():void");
    }

    @Override // X.C40b
    public int B4q() {
        return (-1) >>> 1;
    }

    @Override // X.C40b
    public void CZ9(AnonymousClass409 anonymousClass409, RequestWrapper requestWrapper) {
        synchronized (C40i.class) {
        }
    }
}
