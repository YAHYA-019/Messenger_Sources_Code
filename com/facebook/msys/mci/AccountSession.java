package com.facebook.msys.mci;

import X.1W5;
import X.1XV;
import X.C1y2;
import X.C1y3;
import com.facebook.simplejni.NativeHolder;

/* loaded from: AccountSession.class */
public class AccountSession implements 1W5 {
    public final NativeHolder mNativeHolder;
    public C1y3 mNotificationCenterCallbackManager;
    public Long mSessionedExecutionKey = null;
    public SessionedNotificationCenter mSessionedNotificationCenter;

    static {
        1XV.A00();
    }

    public AccountSession(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public static native AccountSession createWithAuthData(AuthData authData, int i);

    private native long getSessionedExecutionKeyNative();

    private native SessionedNotificationCenter getSessionedNotificationCenterNative();

    private native boolean nativeEquals(Object obj);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AccountSession)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public native AuthData getAuthData();

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r302v2 ??, still in use, count: 2, list:
          (r302v2 ??) from 0x001e: PHI (r302v1 ??) = (r302v0 ??), (r302v2 ??) binds: [B:6:0x0008, B:11:0x001a] A[DONT_GENERATE, DONT_INLINE]
          (r302v2 ?? I:X.1y3) from 0x001b: IPUT (r302v2 ?? I:X.1y3), (r301v0 'this' ?? I:com.facebook.msys.mci.AccountSession A[IMMUTABLE_TYPE, THIS]) A[Catch: all -> 0x0022] com.facebook.msys.mci.AccountSession.mNotificationCenterCallbackManager X.1y3
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
            com.facebook.msys.mci.SessionedNotificationCenter r0 = r0.getSessionedNotificationCenter()     // Catch: java.lang.Throwable -> L22
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
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.AccountSession.getNotificationCenterCallbackManager():X.1y3");
    }

    public long getSessionedExecutionKey() {
        long longValue;
        synchronized (this) {
            Long l = this.mSessionedExecutionKey;
            if (l == null) {
                l = Long.valueOf(getSessionedExecutionKeyNative());
                this.mSessionedExecutionKey = l;
            }
            longValue = l.longValue();
        }
        return longValue;
    }

    public SessionedNotificationCenter getSessionedNotificationCenter() {
        SessionedNotificationCenter sessionedNotificationCenter;
        synchronized (this) {
            sessionedNotificationCenter = this.mSessionedNotificationCenter;
            if (sessionedNotificationCenter == null) {
                sessionedNotificationCenter = getSessionedNotificationCenterNative();
                this.mSessionedNotificationCenter = sessionedNotificationCenter;
            }
        }
        return sessionedNotificationCenter;
    }

    public C1y2 getSessionedNotificationCenterCallbackManager() {
        return (C1y2) getNotificationCenterCallbackManager();
    }

    public native int getState();

    public native int hashCode();

    public native void injectNetworkSession(NetworkSession networkSession);

    public native void invalidate();

    public native boolean isValid();

    public native void setState(int i);

    public native String toString();
}
