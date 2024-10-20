package com.facebook.messaging.fxcal.settings.individual_setting_deeplink;

import X.11T;
import X.AnonymousClass001;
import X.C0A2;
import X.RbJ;
import android.content.Intent;
import android.net.Uri;
import com.facebook.messaging.fxcal.cds.settings.FxCdsSettingsBaseActivity;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: FxSettingsIndividualSettingDeeplinkActivity.class */
public final class FxSettingsIndividualSettingDeeplinkActivity extends FxCdsSettingsBaseActivity {
    @Override // com.facebook.messaging.fxcal.cds.settings.FxCdsSettingsBaseActivity
    public HashMap A3B(Intent intent) {
        String stringExtra = intent.getStringExtra("launch_uri");
        if (stringExtra == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        Uri uri = null;
        try {
            uri = C0A2.A03(stringExtra);
        } catch (SecurityException unused) {
        }
        if (uri == null) {
            return AnonymousClass001.A0u();
        }
        String queryParameter = uri.getQueryParameter("entrypoint");
        if (queryParameter == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        String queryParameter2 = uri.getQueryParameter("node_identifier");
        if (queryParameter2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        HashMap A0u = AnonymousClass001.A0u();
        Iterator<String> it = uri.getQueryParameterNames().iterator();
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            if (!11T.A0O(A0i, "entrypoint") && !11T.A0O(A0i, "node_identifier")) {
                String queryParameter3 = uri.getQueryParameter(A0i);
                if (queryParameter3 == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                A0u.put(A0i, queryParameter3);
            }
        }
        return RbJ.A00(queryParameter, queryParameter2, A0u);
    }
}
