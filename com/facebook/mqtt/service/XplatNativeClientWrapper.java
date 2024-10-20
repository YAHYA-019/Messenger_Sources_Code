package com.facebook.mqtt.service;

import X.0Pz;
import X.0Q8;
import X.0fH;
import X.11T;
import X.1nK;
import X.1nY;
import X.2BE;
import X.5Cm;
import X.AnonymousClass001;
import X.C00j;
import X.C0il;
import X.C1lj;
import X.C1nL;
import X.C1nX;
import X.C1nm;
import android.content.Context;
import com.facebook.jni.CppException;
import com.facebook.jni.HybridData;
import com.facebook.mqtt.service.ConnectionConfig;
import com.facebook.mqtt.service.MqttPublishExtListener;
import com.facebook.mqtt.service.MqttSubscribeListener;
import com.facebook.mqtt.service.XplatNativeClientWrapper;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: XplatNativeClientWrapper.class */
public final class XplatNativeClientWrapper implements 1nK {
    public static final C1nL Companion = new Object();
    public static final String TAG = "MqttXplatNativeClientWrapper";
    public static final String UPDATE_FOREGROUND_TOPIC = "/t_fs";
    public Executor callbackExecutor;
    public boolean isForeground;
    public HybridData mHybridData;
    public C1nX stateCallback;
    public final AtomicBoolean started = new AtomicBoolean(false);
    public 1nY connectionState = 1nY.A05;
    public final HashSet observers = new HashSet();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1nL, java.lang.Object] */
    static {
        C0il.A0B("xplatmqttclient-jni");
    }

    private final native synchronized void cancelPublishNative(int i);

    public static final native HybridData initHybrid(ConnectionConfig connectionConfig, ConnectionCallback connectionCallback);

    private final native synchronized int publishExtNative(String str, int i, byte[] bArr, MqttPublishExtListener mqttPublishExtListener);

    private final native synchronized int publishNative(String str, int i, byte[] bArr, MqttPublishListener mqttPublishListener);

    private final native synchronized void setForegroundNative(boolean z);

    private final native synchronized void startNative(Set set, int i, MqttSubscribeListener mqttSubscribeListener);

    private final native synchronized void stopNative();

    private final native synchronized void subscribeNative(String str, int i, MqttSubscribeListener mqttSubscribeListener);

    private final native synchronized void unsubscribeNative(String str);

    private final native synchronized void updateNetworkInterfaceNative(int i);

    private final native synchronized void updateNetworkStateNative(int i);

    private final native synchronized void updateRegionPreferenceNative(String str);

    private final native synchronized boolean verifyAuthTokenNative(String str);

    public void addObservers(List list) {
        11T.A0F(list, 0);
        this.observers.addAll(list);
    }

    public boolean cancelPublish(int i) {
        StringBuilder A0n;
        if (!this.started.get()) {
            throw AnonymousClass001.A0N("Cannot cancel publish if not started");
        }
        0fH.A0j(TAG, 0Pz.A0T("Cancel publish with ", i));
        try {
            cancelPublishNative(i);
            return true;
        } catch (CppException e) {
            e = e;
            A0n = AnonymousClass001.A0n("Error cancelling publish with id:");
            A0n.append(i);
            0fH.A0r(TAG, A0n.toString(), e);
            return false;
        } catch (NullPointerException e2) {
            e = e2;
            A0n = AnonymousClass001.A0n("Error cancelling publish with id:");
            A0n.append(i);
            A0n.append(". No native client");
            0fH.A0r(TAG, A0n.toString(), e);
            return false;
        }
    }

    public 1nY getConnectionState() {
        return this.connectionState;
    }

    public String getMqttHealthStats() {
        return null;
    }

    public boolean isConnected() {
        StringBuilder sb = new StringBuilder();
        sb.append("isConnected: ");
        sb.append(this.connectionState);
        0fH.A0j(TAG, sb.toString());
        boolean z = false;
        if (this.connectionState == 1nY.A03) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0047, code lost:
    
        if (r0 == X.1nY.A04) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isConnectedOrConnecting() {
        /*
            r301 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r302 = r0
            r0 = r302
            r0.<init>()
            r0 = r302
            java.lang.String r1 = "isConnectedOrConnecting: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r301
            X.1nY r0 = r0.connectionState
            r303 = r0
            r0 = r302
            r1 = r303
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r302
            java.lang.String r0 = r0.toString()
            r302 = r0
            java.lang.String r0 = "MqttXplatNativeClientWrapper"
            r1 = r302
            X.0fH.A0j(r0, r1)
            r0 = r301
            X.1nY r0 = r0.connectionState
            r304 = r0
            X.1nY r0 = X.1nY.A02
            r303 = r0
            r0 = r304
            r1 = r303
            if (r0 == r1) goto L4a
            X.1nY r0 = X.1nY.A03
            r303 = r0
            r0 = r304
            r1 = r303
            if (r0 == r1) goto L4a
            X.1nY r0 = X.1nY.A04
            r302 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
            r0 = r304
            r1 = r302
            if (r0 != r1) goto L4d
        L4a:
            r0 = 1
            r305 = r0
        L4d:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.XplatNativeClientWrapper.isConnectedOrConnecting():boolean");
    }

    public final boolean isStarted() {
        return this.started.get();
    }

    public void kickOffConnection() {
    }

    public void onNetworkAvailable() {
        String str;
        if (!this.started.get()) {
            throw AnonymousClass001.A0N("Cannot set network available if not started");
        }
        0fH.A0j(TAG, "Network connectivity is now available");
        try {
            updateNetworkStateNative(1);
        } catch (CppException e) {
            e = e;
            str = "Error notifying network available";
            0fH.A0r(TAG, str, e);
        } catch (NullPointerException e2) {
            e = e2;
            str = "Error notifying network available. No native client";
            0fH.A0r(TAG, str, e);
        }
    }

    public void onNetworkInterfaceChanged(int i) {
        StringBuilder A0k;
        if (!this.started.get()) {
            throw AnonymousClass001.A0N("Cannot set network interface if not started");
        }
        0fH.A0j(TAG, 0Pz.A0T("Network interface changed to ", i));
        try {
            updateNetworkInterfaceNative(i);
            Iterator it = this.observers.iterator();
            while (it.hasNext()) {
                it.next();
            }
        } catch (CppException e) {
            e = e;
            A0k = AnonymousClass001.A0k();
            A0k.append("Error notifying network interface changed to ");
            A0k.append(i);
            0fH.A0r(TAG, A0k.toString(), e);
        } catch (NullPointerException e2) {
            e = e2;
            A0k = AnonymousClass001.A0k();
            A0k.append("Error notifying network changed to ");
            A0k.append(i);
            A0k.append(". No native client");
            0fH.A0r(TAG, A0k.toString(), e);
        }
    }

    public void onNetworkUnavailable() {
        String str;
        if (!this.started.get()) {
            throw AnonymousClass001.A0N("Cannot set network unavailable if not started");
        }
        0fH.A0j(TAG, "Network connectivity is now unavailable");
        try {
            updateNetworkStateNative(2);
        } catch (CppException e) {
            e = e;
            str = "Error notifying network unavailable";
            0fH.A0r(TAG, str, e);
        } catch (NullPointerException e2) {
            e = e2;
            str = "Error notifying network unavailable. No native client";
            0fH.A0r(TAG, str, e);
        }
    }

    public int publish(String str, byte[] bArr, C1nm c1nm, MqttPublishListener mqttPublishListener) {
        int i;
        11T.A0F(str, 0);
        11T.A0F(bArr, 1);
        11T.A0F(c1nm, 2);
        if (!this.started.get()) {
            throw AnonymousClass001.A0N("Cannot publish if not started");
        }
        0fH.A0j(TAG, 0Pz.A0W("publish topic: ", str));
        C00j.A05(0Pz.A0W("mqtt:publish:", str), -928583546);
        try {
            try {
                try {
                    int incrementAndGet = C1lj.A06.incrementAndGet();
                    int publishNative = publishNative(str, c1nm.ordinal(), bArr, new 2BE(mqttPublishListener, this, str, bArr, incrementAndGet));
                    StringBuilder sb = new StringBuilder();
                    sb.append("publish to topic: ");
                    sb.append(str);
                    sb.append(" with id:");
                    sb.append(incrementAndGet);
                    sb.append(" and nativeId:");
                    sb.append(publishNative);
                    0fH.A0j(TAG, sb.toString());
                    C00j.A01(605142803);
                    return incrementAndGet;
                } catch (CppException e) {
                    0fH.A0r(TAG, 0Pz.A0W("Error publishing to topic:", str), e);
                    i = -1510967504;
                    C00j.A01(i);
                    return -1;
                }
            } catch (NullPointerException e2) {
                0fH.A0r(TAG, 0Pz.A0j("Error publishing to topic:", str, ". No native client"), e2);
                i = 621019430;
                C00j.A01(i);
                return -1;
            }
        } catch (Throwable th) {
            C00j.A01(-1982300446);
            throw th;
        }
    }

    public int publishExt(final String str, final byte[] bArr, C1nm c1nm, final MqttPublishExtListener mqttPublishExtListener) {
        int i;
        11T.A0F(str, 0);
        11T.A0F(bArr, 1);
        11T.A0F(c1nm, 2);
        11T.A0F(mqttPublishExtListener, 3);
        if (!this.started.get()) {
            throw AnonymousClass001.A0N("Cannot publishExt if not started");
        }
        0fH.A0j(TAG, 0Pz.A0W("publishExt topic: ", str));
        C00j.A05(0Pz.A0W("mqtt:publish:", str), -249237317);
        try {
            try {
                final int incrementAndGet = C1lj.A06.incrementAndGet();
                int publishExtNative = publishExtNative(str, c1nm.ordinal(), bArr, new MqttPublishExtListener() { // from class: X.3aa
                    @Override // com.facebook.mqtt.service.MqttPublishExtListener
                    public void onPublishAttempt(int i2, final int i3, final int i4, final int i5, final int i6) {
                        XplatNativeClientWrapper xplatNativeClientWrapper = this;
                        C1nL c1nL = XplatNativeClientWrapper.Companion;
                        Executor executor = xplatNativeClientWrapper.callbackExecutor;
                        if (executor == null) {
                            11T.A0L("callbackExecutor");
                            throw 0Q8.createAndThrow();
                        }
                        final MqttPublishExtListener mqttPublishExtListener2 = mqttPublishExtListener;
                        final int i7 = incrementAndGet;
                        executor.execute(new Runnable() { // from class: X.3ia
                            public static final String __redex_internal_original_name = "XplatNativeClientWrapper$publishExt$nativeId$1$onPublishAttempt$1";

                            @Override // java.lang.Runnable
                            public final void run() {
                                MqttPublishExtListener.this.onPublishAttempt(i7, i3, i4, i5, i6);
                            }
                        });
                    }

                    @Override // com.facebook.mqtt.service.MqttPublishExtListener
                    public void onPublishCompleted(int i2, final int i3, final int i4, final int i5, final int i6, final boolean z, final int i7) {
                        String A0j;
                        int i8;
                        final String str2 = str;
                        if (z) {
                            A0j = 0Pz.A0j("mqtt:puback:", str2, ":success");
                            i8 = 1339573902;
                        } else {
                            A0j = 0Pz.A0j("mqtt:puback:", str2, ":fail");
                            i8 = -361391219;
                        }
                        C00j.A05(A0j, i8);
                        final XplatNativeClientWrapper xplatNativeClientWrapper = this;
                        C1nL c1nL = XplatNativeClientWrapper.Companion;
                        Executor executor = xplatNativeClientWrapper.callbackExecutor;
                        if (executor == null) {
                            11T.A0L("callbackExecutor");
                            throw 0Q8.createAndThrow();
                        }
                        final MqttPublishExtListener mqttPublishExtListener2 = mqttPublishExtListener;
                        final int i9 = incrementAndGet;
                        final byte[] bArr2 = bArr;
                        executor.execute(new Runnable() { // from class: X.3ie
                            public static final String __redex_internal_original_name = "XplatNativeClientWrapper$publishExt$nativeId$1$onPublishCompleted$1";

                            @Override // java.lang.Runnable
                            public final void run() {
                                XplatNativeClientWrapper xplatNativeClientWrapper2 = xplatNativeClientWrapper;
                                C1nL c1nL2 = XplatNativeClientWrapper.Companion;
                                HashSet hashSet = xplatNativeClientWrapper2.observers;
                                byte[] bArr3 = bArr2;
                                boolean z2 = z;
                                Iterator it = hashSet.iterator();
                                while (it.hasNext()) {
                                    it.next();
                                    0fH.A0j("MqttXplatAnalytics", "Report bytes write");
                                    if (z2) {
                                        C0Ai c0Ai = C0Ai.A03;
                                        c0Ai.A00(false);
                                        c0Ai.A00(true);
                                        0BN.A02.A00(bArr3.length, true);
                                    }
                                }
                                mqttPublishExtListener2.onPublishCompleted(i9, i3, i4, i5, i6, z2, i7);
                            }
                        });
                        C00j.A01(-1629706810);
                    }
                });
                StringBuilder sb = new StringBuilder();
                sb.append("publishExt to topic: ");
                sb.append(str);
                sb.append(" with id:");
                sb.append(incrementAndGet);
                sb.append(" and nativeId:");
                sb.append(publishExtNative);
                0fH.A0j(TAG, sb.toString());
                C00j.A01(-700027572);
                return incrementAndGet;
            } catch (CppException e) {
                0fH.A0r(TAG, 0Pz.A0W("Error publishingExt to topic:", str), e);
                i = -32485555;
                C00j.A01(i);
                return -1;
            } catch (NullPointerException e2) {
                0fH.A0r(TAG, 0Pz.A0j("Error publishingExt to topic:", str, ". No native client"), e2);
                i = 1519869827;
                C00j.A01(i);
                return -1;
            }
        } catch (Throwable th) {
            C00j.A01(-1472002055);
            throw th;
        }
    }

    public void setForeground(boolean z, byte[] bArr, MqttPublishListener mqttPublishListener) {
        StringBuilder A0n;
        if (!this.started.get()) {
            throw AnonymousClass001.A0N("Cannot set foreground if not started");
        }
        0fH.A0j(TAG, 0Pz.A1C("Set foreground: ", z));
        try {
            setForegroundNative(z);
            if (this.isForeground != z) {
                this.isForeground = z;
                if (bArr != null) {
                    publish(UPDATE_FOREGROUND_TOPIC, bArr, C1nm.A02, mqttPublishListener);
                }
            }
        } catch (CppException e) {
            e = e;
            A0n = AnonymousClass001.A0n("Error notifying foreground ");
            A0n.append(z);
            0fH.A0r(TAG, A0n.toString(), e);
        } catch (NullPointerException e2) {
            e = e2;
            A0n = AnonymousClass001.A0n("Error notifying foreground ");
            A0n.append(z);
            A0n.append(". No native client");
            0fH.A0r(TAG, A0n.toString(), e);
        }
    }

    public boolean start(Context context, final ConnectionConfig connectionConfig, final C1nX c1nX, final MqttSubscribeListener mqttSubscribeListener) {
        11T.A0F(connectionConfig, 1);
        11T.A0F(c1nX, 2);
        if (!(!this.started.get())) {
            throw AnonymousClass001.A0N("Client already initialized");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("start with config ");
        sb.append(connectionConfig);
        0fH.A0j(TAG, sb.toString());
        Executor executor = connectionConfig.callbackExecutor;
        this.callbackExecutor = executor;
        this.connectionState = 1nY.A04;
        this.stateCallback = c1nX;
        this.isForeground = !connectionConfig.isAppInBackground;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: X.1nj
                public static final String __redex_internal_original_name = "XplatNativeClientWrapper$start$2";

                @Override // java.lang.Runnable
                public final void run() {
                    XplatNativeClientWrapper xplatNativeClientWrapper = this;
                    C1nL c1nL = XplatNativeClientWrapper.Companion;
                    Iterator it = xplatNativeClientWrapper.observers.iterator();
                    while (it.hasNext()) {
                        ((C1nh) it.next()).C7n(C1lu.A00);
                    }
                    c1nX.Bqu(1nY.A04);
                }
            });
            try {
                this.mHybridData = initHybrid(connectionConfig, new ConnectionCallback() { // from class: X.1nk
                    @Override // com.facebook.mqtt.service.ConnectionCallback
                    public void onConnectionChanged(int i, String str) {
                        1nY r305;
                        11T.A0F(str, 1);
                        if (i == 0) {
                            r305 = 1nY.A05;
                        } else if (i == 1) {
                            r305 = 1nY.A04;
                        } else if (i == 2) {
                            r305 = 1nY.A02;
                        } else {
                            if (i != 3) {
                                throw AnonymousClass001.A0L("Invalid Channel State");
                            }
                            r305 = 1nY.A03;
                        }
                        XplatNativeClientWrapper xplatNativeClientWrapper = this;
                        C1nL c1nL = XplatNativeClientWrapper.Companion;
                        if (r305 != xplatNativeClientWrapper.connectionState) {
                            xplatNativeClientWrapper.connectionState = r305;
                            Executor executor2 = xplatNativeClientWrapper.callbackExecutor;
                            if (executor2 == null) {
                                11T.A0L("callbackExecutor");
                                throw 0Q8.createAndThrow();
                            }
                            executor2.execute(new 1qD(r305, xplatNativeClientWrapper, str));
                        }
                    }

                    @Override // com.facebook.mqtt.service.ConnectionCallback
                    public void onConnectionError(int i) {
                        0fH.A0j(XplatNativeClientWrapper.TAG, 0Pz.A0T("Mqtt connection error ", i));
                        QpF qpF = i != 3005 ? i != 3010 ? i != 3013 ? i != 3014 ? QpF.A05 : QpF.A03 : QpF.A04 : QpF.A06 : QpF.A02;
                        final XplatNativeClientWrapper xplatNativeClientWrapper = this;
                        C1nL c1nL = XplatNativeClientWrapper.Companion;
                        Executor executor2 = xplatNativeClientWrapper.callbackExecutor;
                        if (executor2 == null) {
                            11T.A0L("callbackExecutor");
                            throw 0Q8.createAndThrow();
                        }
                        final ConnectionConfig connectionConfig2 = connectionConfig;
                        final QpF qpF2 = qpF;
                        executor2.execute(new Runnable() { // from class: X.3hu
                            public static final String __redex_internal_original_name = "XplatNativeClientWrapper$start$3$onConnectionError$1";

                            @Override // java.lang.Runnable
                            public final void run() {
                                XplatNativeClientWrapper xplatNativeClientWrapper2 = xplatNativeClientWrapper;
                                C1nL c1nL2 = XplatNativeClientWrapper.Companion;
                                C1nX c1nX2 = xplatNativeClientWrapper2.stateCallback;
                                if (c1nX2 == null) {
                                    11T.A0L("stateCallback");
                                    throw 0Q8.createAndThrow();
                                }
                                c1nX2.Bqo(connectionConfig2, qpF2);
                            }
                        });
                    }

                    @Override // com.facebook.mqtt.service.ConnectionCallback
                    public void onMessageDropped(String str, byte[] bArr, long j) {
                        11T.A0F(str, 0);
                        11T.A0F(bArr, 1);
                        0fH.A0j(XplatNativeClientWrapper.TAG, 0Pz.A0W("Message received on unsubscribed ", str));
                        XplatNativeClientWrapper xplatNativeClientWrapper = this;
                        C1nL c1nL = XplatNativeClientWrapper.Companion;
                        Executor executor2 = xplatNativeClientWrapper.callbackExecutor;
                        if (executor2 == null) {
                            11T.A0L("callbackExecutor");
                            throw 0Q8.createAndThrow();
                        }
                        executor2.execute(new 3iJ(xplatNativeClientWrapper, str, bArr, j));
                    }
                });
                0fH.A0j(TAG, "Hybric object created. Start client");
                startNative(connectionConfig.subscribeTopics, C1nm.A02.value, new MqttSubscribeListener() { // from class: X.1nn
                    @Override // com.facebook.mqtt.service.MqttSubscribeListener
                    public void onData(final String str, final byte[] bArr, final long j) {
                        11T.A0F(str, 0);
                        11T.A0F(bArr, 1);
                        0fH.A0j(XplatNativeClientWrapper.TAG, 0Pz.A0W("Data received on initial topic ", str));
                        final MqttSubscribeListener mqttSubscribeListener2 = MqttSubscribeListener.this;
                        if (mqttSubscribeListener2 != null) {
                            final XplatNativeClientWrapper xplatNativeClientWrapper = this;
                            C1nL c1nL = XplatNativeClientWrapper.Companion;
                            Executor executor2 = xplatNativeClientWrapper.callbackExecutor;
                            if (executor2 == null) {
                                11T.A0L("callbackExecutor");
                                throw 0Q8.createAndThrow();
                            }
                            executor2.execute(new Runnable() { // from class: X.3qp
                                public static final String __redex_internal_original_name = "XplatNativeClientWrapper$start$4$onData$1$1";

                                @Override // java.lang.Runnable
                                public final void run() {
                                    XplatNativeClientWrapper xplatNativeClientWrapper2 = xplatNativeClientWrapper;
                                    C1nL c1nL2 = XplatNativeClientWrapper.Companion;
                                    HashSet hashSet = xplatNativeClientWrapper2.observers;
                                    String str2 = str;
                                    byte[] bArr2 = bArr;
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((C1nh) it.next()).BsN(str2, bArr2);
                                    }
                                    mqttSubscribeListener2.onData(str2, bArr2, j);
                                }
                            });
                        }
                    }

                    @Override // com.facebook.mqtt.service.MqttSubscribeListener
                    public void onSubscriptionResponse(String str, boolean z, int i) {
                        11T.A0F(str, 0);
                        StringBuilder A0k = AnonymousClass001.A0k();
                        A0k.append("Initial subscription ");
                        A0k.append(str);
                        A0k.append(" status ");
                        A0k.append(z);
                        0fH.A0j(XplatNativeClientWrapper.TAG, AnonymousClass001.A0e(" error:", A0k, i));
                        MqttSubscribeListener mqttSubscribeListener2 = MqttSubscribeListener.this;
                        if (mqttSubscribeListener2 != null) {
                            XplatNativeClientWrapper xplatNativeClientWrapper = this;
                            C1nL c1nL = XplatNativeClientWrapper.Companion;
                            Executor executor2 = xplatNativeClientWrapper.callbackExecutor;
                            if (executor2 == null) {
                                11T.A0L("callbackExecutor");
                                throw 0Q8.createAndThrow();
                            }
                            executor2.execute(new 3iV(mqttSubscribeListener2, xplatNativeClientWrapper, str, i, z));
                        }
                    }
                });
                if (!this.started.compareAndSet(false, true)) {
                    throw AnonymousClass001.A0N("Client already initialized");
                }
                0fH.A0j(TAG, "Native client started");
                return true;
            } catch (CppException e) {
                0fH.A0r(TAG, AnonymousClass001.A0Z(connectionConfig, "Error starting client with config:", AnonymousClass001.A0k()), e);
                this.connectionState = 1nY.A05;
                Executor executor2 = this.callbackExecutor;
                if (executor2 != null) {
                    executor2.execute(new Runnable() { // from class: X.3fk
                        public static final String __redex_internal_original_name = "XplatNativeClientWrapper$start$6";

                        @Override // java.lang.Runnable
                        public final void run() {
                            C1nX.this.Bqu(1nY.A05);
                        }
                    });
                    return false;
                }
            }
        }
        11T.A0L("callbackExecutor");
        throw 0Q8.createAndThrow();
    }

    public void stop() {
        String str;
        if (!this.started.compareAndSet(true, false)) {
            throw AnonymousClass001.A0N("Client already stopped");
        }
        0fH.A0j(TAG, "stop");
        try {
            stopNative();
            HybridData hybridData = this.mHybridData;
            if (hybridData == null) {
                11T.A0L("mHybridData");
            } else {
                hybridData.resetNative();
                this.connectionState = 1nY.A05;
                Executor executor = this.callbackExecutor;
                if (executor != null) {
                    executor.execute(new Runnable() { // from class: X.4tx
                        public static final String __redex_internal_original_name = "XplatNativeClientWrapper$stop$2";

                        @Override // java.lang.Runnable
                        public final void run() {
                            XplatNativeClientWrapper xplatNativeClientWrapper = XplatNativeClientWrapper.this;
                            C1nL c1nL = XplatNativeClientWrapper.Companion;
                            Iterator it = xplatNativeClientWrapper.observers.iterator();
                            while (it.hasNext()) {
                                ((C1nh) it.next()).C7o("Stopped");
                            }
                            C1nX c1nX = xplatNativeClientWrapper.stateCallback;
                            if (c1nX == null) {
                                11T.A0L("stateCallback");
                                throw 0Q8.createAndThrow();
                            }
                            c1nX.Bqu(1nY.A05);
                        }
                    });
                    return;
                }
                11T.A0L("callbackExecutor");
            }
            throw 0Q8.createAndThrow();
        } catch (CppException e) {
            e = e;
            str = "Error stopping client";
            0fH.A0r(TAG, str, e);
        } catch (NullPointerException e2) {
            e = e2;
            str = "Error stopping client. No native client";
            0fH.A0r(TAG, str, e);
        }
    }

    public boolean subscribe(String str, C1nm c1nm, MqttSubscribeListener mqttSubscribeListener) {
        StringBuilder A0n;
        11T.A0F(str, 0);
        11T.A0F(c1nm, 1);
        11T.A0F(mqttSubscribeListener, 2);
        if (!this.started.get()) {
            throw AnonymousClass001.A0N("Cannot subscribe if not started");
        }
        0fH.A0j(TAG, 0Pz.A0W("subscribe topic: ", str));
        try {
            subscribeNative(str, c1nm.ordinal(), new 5Cm(mqttSubscribeListener, this));
            return true;
        } catch (CppException e) {
            e = e;
            A0n = AnonymousClass001.A0n("Error subscribing to topic:");
            0fH.A0r(TAG, AnonymousClass001.A0d(str, A0n), e);
            return false;
        } catch (NullPointerException e2) {
            e = e2;
            A0n = AnonymousClass001.A0n("Error subscribing to topic:");
            A0n.append(str);
            str = ". No native client";
            0fH.A0r(TAG, AnonymousClass001.A0d(str, A0n), e);
            return false;
        }
    }

    public boolean unsubscribe(List list) {
        StringBuilder A0n;
        11T.A0F(list, 0);
        if (!this.started.get()) {
            throw AnonymousClass001.A0N("Cannot unsubscribe if not started");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("unsubscribe topics: ");
        sb.append(list);
        0fH.A0j(TAG, sb.toString());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                unsubscribeNative(str);
            } catch (CppException e) {
                e = e;
                A0n = AnonymousClass001.A0n("Error unsubscribing from topic:");
                0fH.A0r(TAG, AnonymousClass001.A0d(str, A0n), e);
                return false;
            } catch (NullPointerException e2) {
                e = e2;
                A0n = AnonymousClass001.A0n("Error unsubscribing from topic:");
                A0n.append(str);
                str = ". No native client";
                0fH.A0r(TAG, AnonymousClass001.A0d(str, A0n), e);
                return false;
            }
        }
        Iterator it2 = this.observers.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
        return true;
    }

    public void updateRegionPreference(String str) {
        StringBuilder A0n;
        11T.A0F(str, 0);
        if (str.length() != 0) {
            if (!this.started.get()) {
                throw AnonymousClass001.A0N("Cannot set region pref if not started");
            }
            0fH.A0j(TAG, 0Pz.A0W("Region pref = ", str));
            try {
                updateRegionPreferenceNative(str);
            } catch (CppException e) {
                e = e;
                A0n = AnonymousClass001.A0n("Error setting Region pref = ");
                0fH.A0r(TAG, AnonymousClass001.A0d(str, A0n), e);
            } catch (NullPointerException e2) {
                e = e2;
                A0n = AnonymousClass001.A0n("Error setting Region pref = ");
                A0n.append(str);
                str = ". No native client";
                0fH.A0r(TAG, AnonymousClass001.A0d(str, A0n), e);
            }
        }
    }

    public boolean verifyAuthToken(String str) {
        11T.A0F(str, 0);
        return verifyAuthTokenNative(str);
    }
}
