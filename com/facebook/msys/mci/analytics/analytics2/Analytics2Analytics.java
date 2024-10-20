package com.facebook.msys.mci.analytics.analytics2;

import X.07S;
import X.0CP;
import X.0S2;
import X.1RX;
import X.1Rf;
import X.AnonymousClass001;
import X.C15h;
import com.facebook.msys.mci.Analytics;
import com.facebook.msys.mci.EventLogSubscriber;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: Analytics2Analytics.class */
public class Analytics2Analytics implements Analytics {
    public final C15h A00;
    public final EventLogSubscriber A01;

    public Analytics2Analytics(C15h c15h) {
        final String[] strArr = {"AdvancedCrypto", "CarrierMessaging", "FBBroker", "TAM", "FBLegacyBroker", "Interop"};
        this.A01 = new EventLogSubscriber(strArr) { // from class: X.1Zd
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0159, code lost:
            
                if (r0.A03 != null) goto L38;
             */
            /* JADX WARN: Failed to find 'out' block for switch in B:13:0x00d5. Please report as an issue. */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v168, types: [java.lang.Double] */
            /* JADX WARN: Type inference failed for: r0v20, types: [X.1UG, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r322v0 */
            /* JADX WARN: Type inference failed for: r322v1, types: [java.util.AbstractMap] */
            /* JADX WARN: Type inference failed for: r322v2 */
            /* JADX WARN: Type inference failed for: r322v3 */
            /* JADX WARN: Type inference failed for: r322v4 */
            @Override // com.facebook.msys.mci.EventLogSubscriber
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onLogTalEvent(com.facebook.msys.mci.EventLoggingData r302) {
                /*
                    Method dump skipped, instructions count: 1052
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1Zd.onLogTalEvent(com.facebook.msys.mci.EventLoggingData):void");
            }
        };
        this.A00 = c15h;
    }

    public static void A00(0CP r301, List list) {
        for (Object obj : list) {
            if (obj == null) {
                0CP.A00(r301, (Object) null);
            } else if ((obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof String)) {
                0CP.A00(r301, obj);
            } else if (obj instanceof List) {
                A00(r301.A0C(), (List) obj);
            } else {
                if (!(obj instanceof Map)) {
                    throw AnonymousClass001.A0L("Unexpected value type.");
                }
                A01(r301.A0D(), (Map) obj);
            }
        }
    }

    public static void A01(07S r301, Map map) {
        String A0j;
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value == null) {
                A0j = AnonymousClass001.A0j(entry);
                value = null;
            } else if (value instanceof Map) {
                A01(r301.A0D(AnonymousClass001.A0j(entry)), (Map) value);
            } else if (value instanceof List) {
                A00(r301.A0C(AnonymousClass001.A0j(entry)), (List) value);
            } else {
                if (!(value instanceof Boolean) && !(value instanceof Number) && !(value instanceof String)) {
                    throw AnonymousClass001.A0L("Unexpected value type.");
                }
                A0j = (String) entry.getKey();
            }
            07S.A00(r301, value, A0j);
        }
    }

    @Override // com.facebook.msys.mci.Analytics
    public EventLogSubscriber getTalEventSubscriber() {
        return this.A01;
    }

    @Override // com.facebook.msys.mci.Analytics
    public void log(int i, int i2, boolean z, String str, String str2, long j, Map map, Map map2, List list) {
        1Rf A06 = ((1RX) this.A00.get()).A06(0S2.A00, String.valueOf(i), z);
        A06.A07(Integer.valueOf(i2), "event_type");
        A06.A08("category", str);
        A06.A08("feature", str2);
        A06.A06(Boolean.valueOf(z), "realtime");
        A06.A07(Long.valueOf(j), "event_instance_id");
        if (map != null) {
            Iterator A0y = AnonymousClass001.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                String A0j = AnonymousClass001.A0j(A0z);
                Object value = A0z.getValue();
                A06.A08(A0j, value != null ? value.toString() : null);
            }
        }
        if (map2 != null) {
            A01(A06.A09().A0D("event_annotations"), map2);
        }
        if (list != null) {
            A00(A06.A09().A0C("eav"), list);
        }
        A06.A0B();
    }
}
