package com.facebook.msys.mcd;

import X.0fH;
import X.1Br;
import X.1Vt;
import X.2Ay;
import X.C1oE;
import X.C1xu;
import X.C1yi;
import android.os.RemoteException;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.mqtt.service.ipc.IMqttXplatService;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mci.AuthData;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NotificationCenter;
import com.facebook.simplejni.NativeHolder;

/* loaded from: MqttNetworkSessionPlugin.class */
public class MqttNetworkSessionPlugin {
    public static MqttNetworkSessionPlugin sInstance;
    public volatile C1xu mMqttClientCallbacks;
    public final NativeHolder mNativeHolder = initNativeHolder();

    static {
        1Vt.A00();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r302v3 ??, still in use, count: 2, list:
          (r302v3 ??) from 0x0019: PHI (r302v2 ??) = (r302v1 ??), (r302v3 ??) binds: [B:6:0x000a, B:10:0x0016] A[DONT_GENERATE, DONT_INLINE]
          (r302v3 ?? I:com.facebook.msys.mcd.MqttNetworkSessionPlugin) from 0x0016: SPUT (r302v3 ?? I:com.facebook.msys.mcd.MqttNetworkSessionPlugin) A[Catch: all -> 0x001d] com.facebook.msys.mcd.MqttNetworkSessionPlugin.sInstance com.facebook.msys.mcd.MqttNetworkSessionPlugin
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
    public static com.facebook.msys.mcd.MqttNetworkSessionPlugin get() {
        /*
            java.lang.Class<com.facebook.msys.mcd.MqttNetworkSessionPlugin> r0 = com.facebook.msys.mcd.MqttNetworkSessionPlugin.class
            r301 = r0
            r0 = r301
            monitor-enter(r0)
            com.facebook.msys.mcd.MqttNetworkSessionPlugin r0 = com.facebook.msys.mcd.MqttNetworkSessionPlugin.sInstance     // Catch: java.lang.Throwable -> L1d
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L19
            com.facebook.msys.mcd.MqttNetworkSessionPlugin r0 = new com.facebook.msys.mcd.MqttNetworkSessionPlugin     // Catch: java.lang.Throwable -> L1d
            r302 = r0
            r0 = r302
            r0.<init>()     // Catch: java.lang.Throwable -> L1d
            r0 = r302
            com.facebook.msys.mcd.MqttNetworkSessionPlugin.sInstance = r0     // Catch: java.lang.Throwable -> L1d
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
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mcd.MqttNetworkSessionPlugin.get():com.facebook.msys.mcd.MqttNetworkSessionPlugin");
    }

    private native NativeHolder initNativeHolder();

    public static void onCancelPublish(int i) {
        C1xu c1xu = get().mMqttClientCallbacks;
        c1xu.getClass();
        Integer valueOf = Integer.valueOf(i);
        0fH.A0g(valueOf, "MessengerMsysMqttClientCallbacks", "onCancelPublish, publishToken=%d");
        C1yi.A01((C1yi) c1xu.A03.A00.get(), "[client_callback]", StringFormatUtil.formatStrLocaleSafe("cancel_publish (token: %d)", valueOf));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
    
        if (r304 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int onGetConnectionState() {
        /*
            com.facebook.msys.mcd.MqttNetworkSessionPlugin r0 = get()
            r301 = r0
            r0 = r301
            X.1xu r0 = r0.mMqttClientCallbacks
            r302 = r0
            r0 = r302
            java.lang.Class r0 = r0.getClass()
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = r302
            X.1Br r0 = r0.A02     // Catch: java.lang.RuntimeException -> L4f java.lang.Throwable -> L98
            r301 = r0
            r0 = r301
            X.00i r0 = r0.A00     // Catch: java.lang.RuntimeException -> L4f java.lang.Throwable -> L98
            r301 = r0
            r0 = r301
            java.lang.Object r0 = r0.get()     // Catch: java.lang.RuntimeException -> L4f java.lang.Throwable -> L98
            r301 = r0
            r0 = r301
            X.1oE r0 = (X.C1oE) r0     // Catch: java.lang.RuntimeException -> L4f java.lang.Throwable -> L98
            r301 = r0
            r0 = r301
            X.2Ay r0 = r0.CVT()     // Catch: java.lang.RuntimeException -> L4f java.lang.Throwable -> L98
            r304 = r0
            r0 = r304
            X.08t r0 = r0.A06()     // Catch: java.lang.RuntimeException -> L4f java.lang.Throwable -> L98
            r301 = r0
            r0 = r301
            int r0 = r0.ordinal()     // Catch: java.lang.RuntimeException -> L4f java.lang.Throwable -> L98
            r305 = r0
            r0 = 2
            r306 = r0
            r0 = r305
            r1 = r306
            if (r0 == r1) goto L67
            r0 = r305
            r1 = 0
            if (r0 != r1) goto L69
            r0 = 1
            r303 = r0
            goto L69
        L4f:
            r307 = move-exception
            java.lang.String r0 = "MessengerMsysMqttClientCallbacks"
            r308 = r0
            java.lang.String r0 = "onGetConnectionState failed"
            r301 = r0
            r0 = r308
            r1 = r301
            r2 = r307
            X.0fH.A0r(r0, r1, r2)     // Catch: java.lang.Throwable -> L98
            r0 = r304
            if (r0 == 0) goto L6d
            goto L69
        L67:
            r0 = 2
            r303 = r0
        L69:
            r0 = r304
            r0.A07()
        L6d:
            r0 = r302
            X.1Br r0 = r0.A03
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.1yi r0 = (X.C1yi) r0
            r307 = r0
            r0 = r303
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r308 = r0
            java.lang.String r0 = "get_state: %d"
            r1 = r308
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r1)
            r308 = r0
            r0 = r307
            java.lang.String r1 = "[client_callback]"
            r2 = r308
            X.C1yi.A01(r0, r1, r2)
            r0 = r303
            return r0
        L98:
            r301 = move-exception
            r0 = r304
            if (r0 == 0) goto La1
            r0 = r304
            r0.A07()
        La1:
            r0 = r301
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mcd.MqttNetworkSessionPlugin.onGetConnectionState():int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void onMqttConnected();

    private native void onMqttConnectedAggressive();

    /* JADX INFO: Access modifiers changed from: private */
    public native void onMqttConnecting();

    /* JADX INFO: Access modifiers changed from: private */
    public native void onMqttDisconnected();

    /* JADX INFO: Access modifiers changed from: private */
    public native void onMqttPubAck(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native void onMqttPubAckTimeout(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native void onMqttPubError(int i, String str, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public native void onMqttPublishReceived(String str, byte[] bArr);

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int onPublish(java.lang.String r301, int r302, byte[] r303) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mcd.MqttNetworkSessionPlugin.onPublish(java.lang.String, int, byte[]):int");
    }

    private native void registerNative(NetworkSession networkSession, AuthData authData, NotificationCenter notificationCenter, Mailbox mailbox, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6);

    public static void subscribeToTopic(String str) {
        get().mMqttClientCallbacks.getClass();
    }

    private native void unregisterNative(NetworkSession networkSession, AuthData authData);

    public static void unsubscribeFromTopic(String str) {
        get().mMqttClientCallbacks.getClass();
    }

    public static boolean verifyAuthToken(String str) {
        boolean z;
        if (str == null) {
            return false;
        }
        C1xu c1xu = get().mMqttClientCallbacks;
        c1xu.getClass();
        2Ay r0 = null;
        try {
            try {
                2Ay CVT = ((C1oE) 1Br.A0B(c1xu.A02)).CVT();
                IMqttXplatService iMqttXplatService = CVT.A00;
                if (iMqttXplatService != null) {
                    try {
                        z = iMqttXplatService.verifyAuthToken(str);
                    } catch (RemoteException e) {
                        0fH.A0u("MqttXplatPushServiceClientImpl", "Error verifying auth token", e);
                    } catch (RuntimeException e2) {
                        2Ay.A02(e2);
                    }
                    CVT.A07();
                    return z;
                }
                z = false;
                CVT.A07();
                return z;
            } catch (RuntimeException e3) {
                0fH.A0x("MessengerMsysMqttClientCallbacks", "verifyAuthToken failed.", e3);
                if (0 == 0) {
                    return false;
                }
                r0.A07();
                return false;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                r0.A07();
            }
            throw th;
        }
    }

    public void register(C1xu c1xu, NetworkSession networkSession, AuthData authData, NotificationCenter notificationCenter, Mailbox mailbox, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        authData.getClass();
        if (!z4) {
            mailbox.getClass();
        }
        str.getClass();
        c1xu.getClass();
        this.mMqttClientCallbacks = c1xu;
        registerNative(networkSession, authData, notificationCenter, mailbox, str, z, z2, z3, z4, z5, z6);
    }

    public void unregister(NetworkSession networkSession, AuthData authData) {
        unregisterNative(networkSession, authData);
    }
}
