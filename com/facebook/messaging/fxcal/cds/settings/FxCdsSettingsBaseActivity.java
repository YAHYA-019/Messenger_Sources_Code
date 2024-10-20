package com.facebook.messaging.fxcal.cds.settings;

import X.0S2;
import X.11T;
import X.1BK;
import X.1Br;
import X.1iF;
import X.2DM;
import X.4YU;
import X.7zP;
import X.AbF;
import X.AbL;
import X.AfK;
import X.AnonymousClass001;
import X.AnonymousClass244;
import X.C26T;
import X.DKB;
import X.DYw;
import X.F8U;
import X.Fcj;
import X.GLd;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.messaging.fxcal.settings.individual_setting_deeplink.FxSettingsIndividualSettingDeeplinkActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: FxCdsSettingsBaseActivity.class */
public abstract class FxCdsSettingsBaseActivity extends FbFragmentActivity {
    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return AbF.A0C(1076419692814423L);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        setContentView(2132541762);
        if (bundle != null) {
            finish();
            return;
        }
        Bundle A05 = 1BK.A05();
        A05.putString("app_id", this instanceof FxSettingsIndividualSettingDeeplinkActivity ? "com.bloks.www.fx.settings.individual_setting.async" : ((FxCdsSettingsActivity) this).A03);
        A05.putSerializable("params", A3B(getIntent()));
        A05.putBoolean("should_set_window_not_touchable", false);
        DYw dYw = new DYw();
        dYw.setArguments(A05);
        F8U f8u = new F8U(this);
        f8u.A05 = dYw;
        f8u.A02 = 2131363333;
        F8U.A00(f8u, 0S2.A00);
        BDe().A1K(new AfK(this, 4), false);
        overridePendingTransition(0, 0);
    }

    public HashMap A3B(Intent intent) {
        String obj;
        FxCdsSettingsActivity fxCdsSettingsActivity = (FxCdsSettingsActivity) this;
        C26T c26t = C26T.A00;
        2DM A0g = 4YU.A0g(c26t);
        A0g.A0o("entrypoint", intent.getStringExtra("entrypoint"));
        A0g.A0o("deeplink_destination", intent.getStringExtra("deeplink_destination"));
        String stringExtra = intent.getStringExtra("deeplink_params_json");
        A0g.A0e(stringExtra == null ? null : ((AnonymousClass244) 1Br.A0B(fxCdsSettingsActivity.A00)).A0I(stringExtra), "deeplink_params");
        if (1Br.A07(fxCdsSettingsActivity.A02).AZk(18306598019547010L)) {
            Fcj fcj = (Fcj) 1Br.A0B(fxCdsSettingsActivity.A01);
            ArrayList A0s = AnonymousClass001.A0s();
            A0s.addAll(Fcj.A00(fcj));
            A0s.addAll(Fcj.A05(fcj, "", "fx_access__facebook_android_access_library_bloks_native_auth"));
            A0s.addAll(Fcj.A01(fcj));
            JSONArray jSONArray = new JSONArray();
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                11T.A0I(next, DKB.A00(28));
                Map map = (Map) next;
                JSONObject A12 = AnonymousClass001.A12();
                try {
                    Iterator A0y = AnonymousClass001.A0y(map);
                    while (A0y.hasNext()) {
                        AbL.A19(A0y, A12);
                    }
                    jSONArray.put(A12);
                } catch (JSONException unused) {
                    obj = new JSONArray().toString();
                }
            }
            obj = jSONArray.toString();
            A0g.A0o("native_auth_tokens", obj);
        }
        2DM A0g2 = 4YU.A0g(c26t);
        A0g2.A0e(A0g, "server_params");
        return AbL.A0g("params", A0g2.toString());
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        List A0x = 7zP.A0x(BDe());
        if (!(A0x instanceof Collection) || !A0x.isEmpty()) {
            Iterator it = A0x.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof GLd) {
                    return;
                }
            }
        }
        finish();
    }
}
