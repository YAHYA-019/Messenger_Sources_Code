package com.facebook.msys.mca;

import X.1Vt;
import X.1W5;
import X.C1y2;
import X.C1y3;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.NotificationCenter;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: SlimMailbox.class */
public class SlimMailbox implements 1W5 {
    public static final SlimMailbox $redex_init_class = null;
    public final AccountSession mAccountSession;
    public final Executor mCallbackExecutor;
    public final NativeHolder mNativeHolder;
    public NotificationCenter mNotificationCenter;
    public C1y3 mNotificationCenterCallbackManager;
    public C1y2 mSessionedNotificationCenterCallbackManager;

    static {
        1Vt.A00();
    }

    public SlimMailbox(AccountSession accountSession, NotificationCenter notificationCenter, String str, Executor executor) {
        this.mAccountSession = accountSession;
        this.mNotificationCenter = notificationCenter;
        this.mCallbackExecutor = executor;
        this.mNativeHolder = initNativeHolder(accountSession, notificationCenter, str);
    }

    private native NotificationCenter getNotificationCenterNative();

    private native NativeHolder initNativeHolder(AccountSession accountSession, NotificationCenter notificationCenter, String str);

    private native boolean nativeEquals(SlimMailbox slimMailbox);

    public native void deployEarlyDatabaseConnection(String str, String str2, Database.OpenCallback openCallback, Database.SchemaDeployer schemaDeployer, Database.SchemaDeployer schemaDeployer2, boolean z, Map map, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SlimMailbox) {
            return nativeEquals((SlimMailbox) obj);
        }
        return false;
    }

    public NotificationCenter getNotificationCenter() {
        NotificationCenter notificationCenter;
        synchronized (this) {
            notificationCenter = this.mNotificationCenter;
            if (notificationCenter == null) {
                notificationCenter = getNotificationCenterNative();
                this.mNotificationCenter = notificationCenter;
            }
        }
        return notificationCenter;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r302v2 ??, still in use, count: 2, list:
          (r302v2 ??) from 0x0023: PHI (r302v1 ??) = (r302v0 ??), (r302v2 ??) binds: [B:6:0x0008, B:12:0x001f] A[DONT_GENERATE, DONT_INLINE]
          (r302v2 ?? I:X.1y2) from 0x0020: IPUT (r302v2 ?? I:X.1y2), (r301v0 'this' ?? I:com.facebook.msys.mca.SlimMailbox A[IMMUTABLE_TYPE, THIS]) A[Catch: all -> 0x0027] com.facebook.msys.mca.SlimMailbox.mSessionedNotificationCenterCallbackManager X.1y2
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
    public X.C1y2 getSessionedNotificationCenterCallbackManager() {
        /*
            r301 = this;
            r0 = r301
            monitor-enter(r0)
            r0 = r301
            X.1y2 r0 = r0.mSessionedNotificationCenterCallbackManager     // Catch: java.lang.Throwable -> L27
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L23
            r0 = r301
            com.facebook.msys.mci.AccountSession r0 = r0.mAccountSession     // Catch: java.lang.Throwable -> L27
            r303 = r0
            r0 = r303
            com.facebook.msys.mci.SessionedNotificationCenter r0 = r0.getSessionedNotificationCenter()     // Catch: java.lang.Throwable -> L27
            r303 = r0
            X.1y2 r0 = new X.1y2     // Catch: java.lang.Throwable -> L27
            r302 = r0
            r0 = r302
            r1 = r303
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L27
            r0 = r301
            r1 = r302
            r0.mSessionedNotificationCenterCallbackManager = r1     // Catch: java.lang.Throwable -> L27
        L23:
            r0 = r301
            monitor-exit(r0)
            r0 = r302
            return r0
        L27:
            r303 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r303
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mca.SlimMailbox.getSessionedNotificationCenterCallbackManager():X.1y2");
    }

    public native int hashCode();
}
