package com.facebook.wearable.common.comms.hera.host.applinks;

import X.04S;
import X.11T;
import X.C00q;
import kotlin.jvm.functions.Function2;

/* loaded from: AppLinksTransportProvider$onDeviceDiscoveredListener$1$device$1.class */
public final class AppLinksTransportProvider$onDeviceDiscoveredListener$1$device$1 extends C00q implements Function2 {
    public final /* synthetic */ AppLinksTransportProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLinksTransportProvider$onDeviceDiscoveredListener$1$device$1(AppLinksTransportProvider appLinksTransportProvider) {
        super(2);
        this.this$0 = appLinksTransportProvider;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((String) obj, (AppLinksDevice) obj2);
        return 04S.A00;
    }

    public final void invoke(String str, AppLinksDevice appLinksDevice) {
        11T.A0H(str, appLinksDevice);
        AppLinksTransportProvider appLinksTransportProvider = this.this$0;
        synchronized (appLinksTransportProvider.deviceDebugStats) {
            appLinksTransportProvider.deviceDebugStats.put(appLinksDevice, str);
        }
    }
}
