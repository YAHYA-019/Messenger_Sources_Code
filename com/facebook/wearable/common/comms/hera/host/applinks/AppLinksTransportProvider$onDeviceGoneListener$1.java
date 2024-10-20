package com.facebook.wearable.common.comms.hera.host.applinks;

import X.04S;
import X.0Pz;
import X.0fH;
import X.1BK;
import X.7zO;
import X.AnonymousClass001;
import X.C00q;
import kotlin.jvm.functions.Function1;

/* loaded from: AppLinksTransportProvider$onDeviceGoneListener$1.class */
public final class AppLinksTransportProvider$onDeviceGoneListener$1 extends C00q implements Function1 {
    public final /* synthetic */ AppLinksTransportProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLinksTransportProvider$onDeviceGoneListener$1(AppLinksTransportProvider appLinksTransportProvider) {
        super(1);
        this.this$0 = appLinksTransportProvider;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AppLinksDeviceConfig) obj);
        return 04S.A00;
    }

    public final void invoke(AppLinksDeviceConfig appLinksDeviceConfig) {
        0fH.A0l(AppLinksTransportProviderKt.TAG, AnonymousClass001.A0Z(appLinksDeviceConfig, "Got gone device from LDM: ", 7zO.A0x(appLinksDeviceConfig, 0)));
        if (!this.this$0.linkedDevices.containsKey(appLinksDeviceConfig.BtcAddress)) {
            0fH.A0l(AppLinksTransportProviderKt.TAG, 0Pz.A0W("Ignored gone device, device does not exist: ", appLinksDeviceConfig.BtcAddress));
            return;
        }
        1BK.A1Q("Stopping and removing device: ", appLinksDeviceConfig.BtcAddress, AppLinksTransportProviderKt.TAG);
        AppLinksDevice appLinksDevice = (AppLinksDevice) this.this$0.linkedDevices.remove(appLinksDeviceConfig.BtcAddress);
        if (appLinksDevice != null) {
            appLinksDevice.stop();
        }
    }
}
