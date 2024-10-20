package com.facebook.zero.settings;

import X.0Pz;
import X.1BJ;
import X.1BK;
import X.1BO;
import X.1BQ;
import X.1BY;
import X.1Bi;
import X.4YT;
import X.4YV;
import X.7zL;
import X.7zN;
import X.AbM;
import X.AnonymousClass001;
import X.C00i;
import X.C1ic;
import X.C4S3;
import X.DKD;
import X.DKE;
import X.ETV;
import X.FJ5;
import X.GJL;
import X.K92;
import android.content.Context;
import android.content.Intent;
import com.facebook.inject.FbInjector;
import com.facebook.proxygen.TraceFieldType;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: MobileCenterURLHandler.class */
public final class MobileCenterURLHandler extends C4S3 {
    public 1BY A00;
    public final C00i A01 = FbInjector.A00;
    public final C00i A02 = DKD.A0R();
    public final C00i A03 = 1BQ.A01();
    public final C00i A06 = DKD.A0O();
    public final C00i A05 = 7zN.A0D(32811);
    public final C00i A04 = 1BQ.A00();

    public MobileCenterURLHandler(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    @Override // X.C4S3
    public Intent A00(Context context, Intent intent) {
        Intent Ard = ((GJL) 1Bi.A03(84011)).Ard(1BK.A04(this.A01), 0Pz.A0W(C1ic.A18, 1BJ.A00(205)));
        if (Ard == null) {
            1BK.A09(this.A03).D0v("MobileCenterURLHandler", "Cannot navigate to mobile center, NT screen intent is null");
            return null;
        }
        JSONObject A12 = AnonymousClass001.A12();
        JSONObject A122 = AnonymousClass001.A12();
        try {
            A12.put(4YT.A00(846), "mobile_center");
            A12.put(4YT.A00(1393), true);
            A12.put(4YT.A00(1154), true);
            A12.put("hide-navbar-right", true);
            boolean A1X = DKE.A1X(this.A02);
            ETV A08 = AbM.A0n(this.A06).A08(4YV.A0D(context), "upsell_carrier_page");
            String str = A08 != null ? A08.A02 : "";
            A122.put("is_in_free_mode", A1X);
            A122.put("encrypted_subno", str);
            A122.put(TraceFieldType.NetworkType, DKE.A0s(this.A05));
            A122.put("entry_point", "deeplink");
            Ard.putExtra("a", FJ5.A02(A12.toString())).putExtra(K92.__redex_internal_original_name, FJ5.A02("/zero/fb/carrier_page/home_screen/")).putExtra("q", FJ5.A02(A122.toString()));
            return Ard;
        } catch (JSONException unused) {
            1BK.A09(this.A03).D0v("MobileCenterURLHandler", 4YT.A00(790));
            return null;
        }
    }

    @Override // X.C4S3
    public boolean A01() {
        return 1BK.A0N(this.A04).AZk(36315687949444408L);
    }
}
