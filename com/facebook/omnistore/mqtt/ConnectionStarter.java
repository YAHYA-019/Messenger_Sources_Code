package com.facebook.omnistore.mqtt;

import X.1BO;
import X.1Bi;
import X.1Hv;
import X.1I7;
import X.1P9;
import X.1Xa;
import X.AnonymousClass000;
import X.C1m1;
import X.C1og;
import X.C4Om;
import X.InterfaceC01363qv;
import android.content.Context;
import android.content.Intent;
import com.facebook.inject.FbInjector;

/* loaded from: ConnectionStarter.class */
public class ConnectionStarter implements 1Xa {
    public Context injectedContext;
    public InterfaceC01363qv mCallback;
    public final C1m1 mChannelConnectivityTracker = (C1m1) 1Bi.A03(16782);
    public boolean mIsAppActive;
    public final 1I7 mLocalBroadcastManager;

    public ConnectionStarter() {
        Context A00 = FbInjector.A00();
        this.injectedContext = A00;
        this.mLocalBroadcastManager = (1I7) 1Hv.A02(A00, 65728);
        this.mIsAppActive = false;
    }

    public static final ConnectionStarter _UL__ULSEP_com_facebook_omnistore_mqtt_ConnectionStarter_ULSEP_FACTORY_METHOD(int i, 1BO r302, Object obj) {
        return new ConnectionStarter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleIntent(Intent intent, InterfaceC01363qv interfaceC01363qv) {
        if (C1og.CHANNEL_CONNECTED.equals(C1og.A00(intent.getIntExtra("event", C1og.UNKNOWN.value)))) {
            interfaceC01363qv.connectionEstablished();
        }
    }

    public void onAppActive() {
    }

    public void onAppPaused() {
    }

    public void onAppStopped() {
    }

    public void onDeviceActive() {
    }

    public void onDeviceStopped() {
    }

    public void startConnection(InterfaceC01363qv interfaceC01363qv) {
        1P9 r0 = new 1P9(this.mLocalBroadcastManager);
        r0.A05(new C4Om(this, interfaceC01363qv, 2), AnonymousClass000.A00(17));
        r0.A02().A00();
        if (this.mChannelConnectivityTracker.A03()) {
            interfaceC01363qv.connectionEstablished();
        }
    }
}
