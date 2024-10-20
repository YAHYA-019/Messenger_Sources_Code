package com.facebook.device_id;

import X.0fH;
import X.1BQ;
import X.1BV;
import X.1CO;
import X.1G2;
import X.1H3;
import X.1I9;
import X.1KV;
import X.1Ql;
import X.C00i;
import X.C0dp;
import X.C1Ur;
import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: UniqueFamilyDeviceIdBroadcastSender.class */
public final class UniqueFamilyDeviceIdBroadcastSender {
    public final C00i A00 = new 1BQ(99390);
    public final C00i A03 = new 1BQ(16385);
    public final C00i A02 = new 1BQ(33013);
    public final C00i A04 = new 1BQ(16563);
    public final C00i A05 = new 1BQ(16558);
    public final C00i A01 = new 1BV(49716);

    public void A00() {
        C00i c00i = this.A05;
        if (((1I9) c00i.get()).A08() || ((1I9) c00i.get()).A09()) {
            int A00 = C1Ur.A00((1CO) this.A03.get(), 604800, 36591819987026040L);
            C00i c00i2 = this.A02;
            FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) c00i2.get();
            1G2 r0 = 1H3.A02;
            long Av1 = fbSharedPreferences.Av1(r0, 0L);
            C00i c00i3 = this.A00;
            if (((C0dp) c00i3.get()).now() - Av1 > A00 * 1000) {
                0fH.A0A(UniqueFamilyDeviceIdBroadcastSender.class, "Start PhoneId synchronization");
                ((1KV) this.A04.get()).A03();
                if (((1I9) c00i.get()).A08()) {
                    1Ql edit = ((FbSharedPreferences) c00i2.get()).edit();
                    edit.CaH(r0, ((C0dp) c00i3.get()).now());
                    edit.commit();
                }
                if (((1I9) c00i.get()).A09()) {
                    1Ql edit2 = ((FbSharedPreferences) c00i2.get()).edit();
                    edit2.CaH(1H3.A07, ((C0dp) c00i3.get()).now());
                    edit2.commit();
                }
            }
        }
    }
}
