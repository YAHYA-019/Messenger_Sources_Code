package com.facebook.msys.mci;

import X.38J;
import java.util.List;
import java.util.Map;

/* loaded from: NoOpAnalytics.class */
public class NoOpAnalytics implements Analytics {
    @Override // com.facebook.msys.mci.Analytics
    public EventLogSubscriber getTalEventSubscriber() {
        return new 38J(this, new String[]{"AdvancedCrypto", "CarrierMessaging", "FBBroker", "TAM", "FBLegacyBroker", "Interop"});
    }

    @Override // com.facebook.msys.mci.Analytics
    public void log(int i, int i2, boolean z, String str, String str2, long j, Map map, Map map2, List list) {
    }
}
