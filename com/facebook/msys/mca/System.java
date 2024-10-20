package com.facebook.msys.mca;

import X.1Vt;
import X.C1ha;
import com.facebook.msys.mci.NotificationCenter;
import com.facebook.simplejni.NativeHolder;

/* loaded from: System.class */
public class System {
    public static System sInstance;
    public final NativeHolder mNativeHolder;
    public final NotificationCenter mNotificationCenter;

    static {
        1Vt.A00();
    }

    public System() {
        NotificationCenter A00 = C1ha.A00();
        this.mNotificationCenter = A00;
        this.mNativeHolder = initNativeHolder(A00);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r302v3 ??, still in use, count: 2, list:
          (r302v3 ??) from 0x0019: PHI (r302v2 ??) = (r302v1 ??), (r302v3 ??) binds: [B:6:0x000a, B:10:0x0016] A[DONT_GENERATE, DONT_INLINE]
          (r302v3 ?? I:com.facebook.msys.mca.System) from 0x0016: SPUT (r302v3 ?? I:com.facebook.msys.mca.System) A[Catch: all -> 0x001d] com.facebook.msys.mca.System.sInstance com.facebook.msys.mca.System
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
    public static com.facebook.msys.mca.System getInstance() {
        /*
            java.lang.Class<com.facebook.msys.mca.System> r0 = com.facebook.msys.mca.System.class
            r301 = r0
            r0 = r301
            monitor-enter(r0)
            com.facebook.msys.mca.System r0 = com.facebook.msys.mca.System.sInstance     // Catch: java.lang.Throwable -> L1d
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L19
            com.facebook.msys.mca.System r0 = new com.facebook.msys.mca.System     // Catch: java.lang.Throwable -> L1d
            r302 = r0
            r0 = r302
            r0.<init>()     // Catch: java.lang.Throwable -> L1d
            r0 = r302
            com.facebook.msys.mca.System.sInstance = r0     // Catch: java.lang.Throwable -> L1d
        L19:
            r0 = r301
            monitor-exit(r0)
            r0 = r302
            return r0
        L1d:
            r302 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r302
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mca.System.getInstance():com.facebook.msys.mca.System");
    }

    public static native NativeHolder initNativeHolder(NotificationCenter notificationCenter);
}
