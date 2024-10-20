package com.facebook.attribution;

import X.0Pz;
import X.1BK;
import X.1BQ;
import X.1G2;
import X.1G3;
import X.1Ql;
import X.C00i;
import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: AttributionStateSerializer.class */
public final class AttributionStateSerializer {
    public final C00i A00 = new 1BQ(33013);

    public static 1G2 A00(String str) {
        return new 1G3("Lat").A0D(str);
    }

    public static void A01(AttributionStateSerializer attributionStateSerializer, int i) {
        C00i c00i = attributionStateSerializer.A00;
        1Ql edit = ((FbSharedPreferences) c00i.get()).edit();
        1G2 A00 = A00(0Pz.A0T("ErrorCode", i));
        if (((FbSharedPreferences) c00i.get()).BNM(A00)) {
            edit.Cdj(A00);
            edit.commit();
        }
    }

    public void A02(AttributionState attributionState) {
        C00i c00i = this.A00;
        1Ql edit = ((FbSharedPreferences) c00i.get()).edit();
        edit.CaL(A00("AttributionId"), attributionState.A03);
        edit.CaH(A00("UserId"), attributionState.A01);
        edit.CaH(A00("Timestamp"), attributionState.A00);
        edit.putBoolean(A00("ExposeAndroidId"), attributionState.A05);
        String str = attributionState.A04;
        if (str != null) {
            edit.CaL(A00("PreviousAdvertisingId"), str);
        }
        1G2 A00 = A00("IsTrackingEnabled");
        Boolean bool = attributionState.A02;
        if (bool != null) {
            edit.putBoolean(A00, bool.booleanValue());
        } else if (1BK.A0R(c00i).BNM(A00)) {
            edit.Cdj(A00);
        }
        edit.commit();
    }
}
