package com.facebook.wearable.common.comms.hera.host.applinks;

import X.04S;
import X.0Q8;
import X.11T;
import X.AnonymousClass001;
import X.C00q;
import X.C0Bd;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* loaded from: AppLinksTransportProvider$onDeviceDiscoveredListener$1$device$2.class */
public final class AppLinksTransportProvider$onDeviceDiscoveredListener$1$device$2 extends C00q implements C0Bd {
    public final /* synthetic */ AppLinksTransportProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLinksTransportProvider$onDeviceDiscoveredListener$1$device$2(AppLinksTransportProvider appLinksTransportProvider) {
        super(3);
        this.this$0 = appLinksTransportProvider;
    }

    @Override // X.C0Bd
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke(AnonymousClass001.A03(obj), AnonymousClass001.A1V(obj2), (AppLinksDevice) obj3);
        return 04S.A00;
    }

    public final void invoke(int i, boolean z, AppLinksDevice appLinksDevice) {
        Integer valueOf;
        11T.A0F(appLinksDevice, 2);
        AppLinksTransportProvider appLinksTransportProvider = this.this$0;
        synchronized (appLinksTransportProvider.remoteNodeIdToLinkedDevices) {
            if (z) {
                valueOf = Integer.valueOf(i);
                appLinksTransportProvider.remoteNodeIdToLinkedDevices.put(valueOf, appLinksDevice);
            } else {
                Map map = appLinksTransportProvider.remoteNodeIdToLinkedDevices;
                valueOf = Integer.valueOf(i);
                map.remove(valueOf);
            }
        }
        Function2 function2 = this.this$0.onRemoteAvailability;
        if (function2 == null) {
            11T.A0L("onRemoteAvailability");
            throw 0Q8.createAndThrow();
        }
        function2.invoke(valueOf, Boolean.valueOf(z));
    }
}
