package com.facebook.tigon.reliablemedia;

import X.1BQ;
import X.1Bi;
import X.1Fv;
import X.1HH;
import X.1PA;
import X.C00i;
import X.C0il;
import X.EnC;
import android.content.Context;
import com.facebook.auth.component.listener.interfaces.AuthenticationResult;
import com.facebook.auth.protocol.AuthenticationResultImpl;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.inject.FbInjector;
import com.facebook.jni.HybridData;
import com.facebook.tigon.iface.TigonServiceHolder;
import com.facebook.tigon.tigonliger.TigonLigerService;

/* loaded from: ReliableMediaMonitor.class */
public class ReliableMediaMonitor {
    public static final ReliableMediaMonitor $redex_init_class = null;
    public Context injectedContext;
    public final C00i mFbBroadcastManager;
    public final C00i mFbNetworkManager;
    public final HybridData mHybridData;
    public boolean mInitialized;
    public boolean mListenersStarted;
    public final C00i mMobileConfig;
    public 1PA mReceiver;
    public final C00i mRmdConfig;
    public final C00i mTigonLigerService = new 1BQ(66070);
    public final C00i mFbAppType = new 1BQ(83603);

    static {
        C0il.A0B("reliablemediamonitor");
    }

    public ReliableMediaMonitor() {
        Context A00 = FbInjector.A00();
        this.injectedContext = A00;
        this.mFbBroadcastManager = new 1HH(A00, 65728);
        this.mFbNetworkManager = new 1BQ(16687);
        this.mMobileConfig = new 1BQ(16385);
        this.mRmdConfig = new 1BQ(147778);
        this.mListenersStarted = false;
        this.mInitialized = false;
        this.mHybridData = initHybrid();
    }

    private native HybridData initHybrid();

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00dc, code lost:
    
        if (r313 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void initializeServiceIfNotAlready(com.facebook.auth.usersession.FbUserSession r302) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.tigon.reliablemedia.ReliableMediaMonitor.initializeServiceIfNotAlready(com.facebook.auth.usersession.FbUserSession):void");
    }

    private native void onBackground();

    private native void onCellConnection();

    private native void onForeground();

    private native void onInit(TigonServiceHolder tigonServiceHolder, TigonLigerService tigonLigerService, int i, String str, AndroidAsyncExecutorFactory androidAsyncExecutorFactory, String str2, String str3, String str4);

    private native void onLogin();

    private native void onLogout();

    private native void onNoConnection();

    private native void onOtherConnection();

    private native void onWifiConnection();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a A[Catch: all -> 0x0081, TRY_ENTER, TryCatch #0 {, blocks: (B:22:0x0006, B:25:0x000f, B:32:0x0042, B:6:0x0047, B:13:0x0065, B:18:0x006c, B:19:0x0073, B:20:0x007a, B:33:0x002a, B:34:0x0032, B:5:0x003a), top: B:21:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void pushDownNetworkStatus(android.net.NetworkInfo r302) {
        /*
            r301 = this;
            r0 = r301
            monitor-enter(r0)
            r0 = r302
            if (r0 == 0) goto L3a
            r0 = r302
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L81
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L3a
            r0 = r302
            int r0 = r0.getType()     // Catch: java.lang.Throwable -> L81
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L32
            r0 = 1
            r303 = r0
            r0 = r304
            r1 = r303
            if (r0 == r1) goto L2a
            r0 = 6
            r303 = r0
            r0 = r304
            r1 = r303
            if (r0 == r1) goto L32
            goto L42
        L2a:
            X.5Fm r0 = X.5Fm.A05     // Catch: java.lang.Throwable -> L81
            r305 = r0
            goto L47
        L32:
            X.5Fm r0 = X.5Fm.A02     // Catch: java.lang.Throwable -> L81
            r305 = r0
            goto L47
        L3a:
            X.5Fm r0 = X.5Fm.A03     // Catch: java.lang.Throwable -> L81
            r305 = r0
            goto L47
        L42:
            X.5Fm r0 = X.5Fm.A04     // Catch: java.lang.Throwable -> L81
            r305 = r0
        L47:
            r0 = r305
            int r0 = r0.ordinal()     // Catch: java.lang.Throwable -> L81
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            r305 = r0
            r0 = r304
            r1 = 0
            if (r0 == r1) goto L7a
            r0 = 1
            r303 = r0
            r0 = r304
            r1 = r303
            if (r0 == r1) goto L73
            r0 = 2
            r303 = r0
            r0 = r304
            r1 = r303
            if (r0 == r1) goto L6c
            r0 = r301
            r0.onOtherConnection()     // Catch: java.lang.Throwable -> L81
            goto L7e
        L6c:
            r0 = r301
            r0.onCellConnection()     // Catch: java.lang.Throwable -> L81
            goto L7e
        L73:
            r0 = r301
            r0.onWifiConnection()     // Catch: java.lang.Throwable -> L81
            goto L7e
        L7a:
            r0 = r301
            r0.onNoConnection()     // Catch: java.lang.Throwable -> L81
        L7e:
            r0 = r301
            monitor-exit(r0)
            return
        L81:
            r305 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r305
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.tigon.reliablemedia.ReliableMediaMonitor.pushDownNetworkStatus(android.net.NetworkInfo):void");
    }

    public void background() {
        synchronized (this) {
            onBackground();
        }
    }

    public void beforeLogout(EnC enC, boolean z) {
        synchronized (this) {
            onLogout();
            this.mInitialized = false;
        }
    }

    public void foreground() {
        synchronized (this) {
            initializeServiceIfNotAlready(((1Fv) 1Bi.A03(66351)).A04());
            onForeground();
        }
    }

    public void initialize() {
        synchronized (this) {
            initializeServiceIfNotAlready(((1Fv) 1Bi.A03(66351)).A04());
        }
    }

    public void onAuthComplete(AuthenticationResult authenticationResult, EnC enC) {
        synchronized (this) {
            if (authenticationResult != null) {
                if (((AuthenticationResultImpl) authenticationResult).A03 != null) {
                    initializeServiceIfNotAlready(((1Fv) 1Bi.A03(66351)).A04());
                    onLogin();
                }
            }
        }
    }
}
