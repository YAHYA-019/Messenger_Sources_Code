package com.facebook.wearable.common.comms.hera.host.applinks;

import X.0DY;
import X.0Pz;
import X.11T;
import X.1BK;
import X.C00q;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: AppLinksTransportProvider$getDebugStats$1$1.class */
public final class AppLinksTransportProvider$getDebugStats$1$1 extends C00q implements Function1 {
    public static final AppLinksTransportProvider$getDebugStats$1$1 INSTANCE = new AppLinksTransportProvider$getDebugStats$1$1();

    public AppLinksTransportProvider$getDebugStats$1$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(Map.Entry entry) {
        11T.A0F(entry, 0);
        AppLinksDevice appLinksDevice = (AppLinksDevice) entry.getKey();
        String A16 = 1BK.A16(entry);
        String str = appLinksDevice.config.deviceName;
        String str2 = null;
        String A0K = str != null ? 0DY.A0K(str, 4) : null;
        String str3 = appLinksDevice.config.deviceSerial;
        if (str3 != null) {
            str2 = 0DY.A0m(str3, 4);
        }
        return 0Pz.A0z("  ", A0K, str2, ": ", A16);
    }
}
