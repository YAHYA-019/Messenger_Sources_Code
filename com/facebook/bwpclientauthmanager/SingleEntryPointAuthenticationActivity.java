package com.facebook.bwpclientauthmanager;

import X.1BK;
import X.1Br;
import X.AbstractC00603o4;
import X.AnonymousClass001;
import X.DKC;
import X.E7f;
import X.FHj;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;
import java.net.URLDecoder;
import org.json.JSONObject;

/* loaded from: SingleEntryPointAuthenticationActivity.class */
public final class SingleEntryPointAuthenticationActivity extends FbFragmentActivity {
    public final 1Br A00 = 1BK.A0C();

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        JSONObject A12;
        super.A2y(bundle);
        if (1Br.A07(this.A00).AZk(36325772532667369L)) {
            String stringExtra = getIntent().getStringExtra(AbstractC00603o4.A00(471));
            String stringExtra2 = getIntent().getStringExtra(AbstractC00603o4.A00(586));
            if (stringExtra != null && stringExtra.length() != 0 && stringExtra2 != null && stringExtra2.length() != 0) {
                try {
                    String stringExtra3 = getIntent().getStringExtra(AbstractC00603o4.A00(493));
                    if (stringExtra3 == null) {
                        stringExtra3 = "";
                    }
                    A12 = DKC.A1F(URLDecoder.decode(stringExtra3, "UTF-8"));
                } catch (Exception unused) {
                    A12 = AnonymousClass001.A12();
                }
                A12.put("entry_point", "universal_link");
                FHj.A00(this, new E7f(this, this, 0), stringExtra, stringExtra2, (String) null, (String) null, A12.toString());
            }
        }
        finish();
    }
}
