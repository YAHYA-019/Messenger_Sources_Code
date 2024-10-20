package X;

import com.facebook.msys.mci.NotificationCenter;

/* renamed from: X.1ha, reason: invalid class name */
/* loaded from: 1ha.class */
public final class C1ha {
    public static NotificationCenter A00;

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r302v2 ??, still in use, count: 2, list:
          (r302v2 ??) from 0x001c: PHI (r302v1 ??) = (r302v0 ??), (r302v2 ??) binds: [B:6:0x000a, B:12:0x0019] A[DONT_GENERATE, DONT_INLINE]
          (r302v2 ?? I:com.facebook.msys.mci.NotificationCenter) from 0x0019: SPUT (r302v2 ?? I:com.facebook.msys.mci.NotificationCenter) A[Catch: all -> 0x0020] X.1ha.A00 com.facebook.msys.mci.NotificationCenter
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
    public static com.facebook.msys.mci.NotificationCenter A00() {
        /*
            java.lang.Class<X.1ha> r0 = X.C1ha.class
            r301 = r0
            r0 = r301
            monitor-enter(r0)
            com.facebook.msys.mci.NotificationCenter r0 = X.C1ha.A00     // Catch: java.lang.Throwable -> L20
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L1c
            r0 = 0
            r303 = r0
            com.facebook.msys.mci.NotificationCenter r0 = new com.facebook.msys.mci.NotificationCenter     // Catch: java.lang.Throwable -> L20
            r302 = r0
            r0 = r302
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L20
            r0 = r302
            X.C1ha.A00 = r0     // Catch: java.lang.Throwable -> L20
        L1c:
            r0 = r301
            monitor-exit(r0)
            r0 = r302
            return r0
        L20:
            r303 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r303
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1ha.A00():com.facebook.msys.mci.NotificationCenter");
    }
}
