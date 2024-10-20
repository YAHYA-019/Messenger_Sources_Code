package com.facebook.msys.mca;

import X.1W5;
import X.C1y2;
import X.C1y3;
import com.facebook.msys.mci.SessionedNotificationCenter;
import com.facebook.simplejni.NativeHolder;

/* loaded from: StandaloneDatabaseHandle.class */
public class StandaloneDatabaseHandle implements 1W5 {
    public final NativeHolder mNativeHolder;
    public C1y3 mNotificationCenterCallbackManager;

    public StandaloneDatabaseHandle(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    private native SessionedNotificationCenter getSessionedNotificationCenterNative();

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r302v2 ??, still in use, count: 2, list:
          (r302v2 ??) from 0x001e: PHI (r302v1 ??) = (r302v0 ??), (r302v2 ??) binds: [B:6:0x0008, B:11:0x001a] A[DONT_GENERATE, DONT_INLINE]
          (r302v2 ?? I:X.1y3) from 0x001b: IPUT (r302v2 ?? I:X.1y3), (r301v0 'this' ?? I:com.facebook.msys.mca.StandaloneDatabaseHandle A[IMMUTABLE_TYPE, THIS]) A[Catch: all -> 0x0022] com.facebook.msys.mca.StandaloneDatabaseHandle.mNotificationCenterCallbackManager X.1y3
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
    public X.C1y3 getNotificationCenterCallbackManager() {
        /*
            r301 = this;
            r0 = r301
            monitor-enter(r0)
            r0 = r301
            X.1y3 r0 = r0.mNotificationCenterCallbackManager     // Catch: java.lang.Throwable -> L22
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L1e
            r0 = r301
            com.facebook.msys.mci.SessionedNotificationCenter r0 = r0.getSessionedNotificationCenterNative()     // Catch: java.lang.Throwable -> L22
            r303 = r0
            X.1y2 r0 = new X.1y2     // Catch: java.lang.Throwable -> L22
            r302 = r0
            r0 = r302
            r1 = r303
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L22
            r0 = r301
            r1 = r302
            r0.mNotificationCenterCallbackManager = r1     // Catch: java.lang.Throwable -> L22
        L1e:
            r0 = r301
            monitor-exit(r0)
            r0 = r302
            return r0
        L22:
            r303 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r303
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mca.StandaloneDatabaseHandle.getNotificationCenterCallbackManager():X.1y3");
    }

    public C1y2 getSessionedNotificationCenterCallbackManager() {
        return (C1y2) getNotificationCenterCallbackManager();
    }
}
