package com.facebook.wearable.common.comms.hera.host.applinks;

import X.04S;
import X.0fH;
import X.1BK;
import X.C00m;
import X.C00q;

/* loaded from: AppLinksDevice$startDataXChannel$channel$1$1.class */
public final class AppLinksDevice$startDataXChannel$channel$1$1 extends C00q implements C00m {
    public final /* synthetic */ AppLinksDevice this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLinksDevice$startDataXChannel$channel$1$1(AppLinksDevice appLinksDevice) {
        super(0);
        this.this$0 = appLinksDevice;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        m10244invoke();
        return 04S.A00;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m10244invoke() {
        AppLinksDevice appLinksDevice = this.this$0;
        appLinksDevice.onDebugStats.invoke("DataX channel closed", appLinksDevice);
        0fH.A0l(AppLinksDevice.TAG, "[DataX] onClosed");
        AppLinksDevice appLinksDevice2 = this.this$0;
        Integer num = appLinksDevice2.remoteNodeId;
        if (num != null) {
            int intValue = num.intValue();
            appLinksDevice2.remoteNodeId = null;
            appLinksDevice2.onRemoteAvailability.invoke(Integer.valueOf(intValue), 1BK.A0d(), appLinksDevice2);
        }
    }
}
