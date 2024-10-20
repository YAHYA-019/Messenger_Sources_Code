package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.messenger.platform_logger.MPLTracker;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.mapbox.mapboxsdk.style.layers.Property;

/* renamed from: X.4Ln, reason: invalid class name */
/* loaded from: 4Ln.class */
public final class C4Ln {
    public boolean A00;
    public final 1Br A03 = 1Bq.A00(16520);
    public final 1Br A02 = 1Bq.A00(83163);
    public final 1Br A01 = 1Bq.A00(66481);

    public final void A00(2SI r302, String str, String str2) {
        11T.A0F(str, 1);
        this.A00 = false;
        C00i c00i = this.A03.A00;
        ((QuickPerformanceLogger) c00i.get()).markerStart(231283107, "folder_list_types", r302.name());
        ((QuickPerformanceLogger) c00i.get()).markerAnnotate(231283107, "group_id", str);
        ((QuickPerformanceLogger) c00i.get()).markerAnnotate(231283107, Property.SYMBOL_Z_ORDER_SOURCE, str2);
        AeK aeK = (AeK) this.A02.A00.get();
        C00i c00i2 = aeK.A01.A00;
        int hashCode = 1WY.A01((1WY) c00i2.get()).AZk(36315340067447592L) ? str.hashCode() : 0;
        if (1WY.A01((1WY) c00i2.get()).AZk(36315340067513129L)) {
            long currentMonotonicTimestamp = 1SG.A02(aeK).currentMonotonicTimestamp();
            if (aeK.A0h()) {
                0fH.A0j(1BJ.A00(796), "endInteractions");
                Integer num = ((1SG) aeK).A02;
                if (num == null) {
                    throw 1BK.A0h();
                }
                MPLTracker.endInteractions(num.intValue(), (short) 22, currentMonotonicTimestamp);
            }
        }
        aeK.A0E(231281153, hashCode);
        aeK.A0G(1SG.A02(aeK).currentMonotonicTimestamp());
        long now = ((C0dp) aeK.A00.A00.get()).now();
        String A00 = 1BJ.A00(1114);
        aeK.A0T(A00, ActionId.MESSENGER_THREAD_LIST_LOADED, now);
        1SG.A04(aeK, A00, "thread_list", ActionId.MESSENGER_THREAD_LIST_LOADED);
        aeK.A0Z("group_id", str);
        aeK.A0Z(Property.SYMBOL_Z_ORDER_SOURCE, str2);
    }
}
