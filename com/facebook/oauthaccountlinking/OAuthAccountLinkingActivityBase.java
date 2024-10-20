package com.facebook.oauthaccountlinking;

import X.03Y;
import X.04J;
import X.04R;
import X.0S2;
import X.11T;
import X.1BK;
import X.1UG;
import X.4YU;
import X.EQ4;
import X.EQS;
import X.EQe;
import X.Fyz;
import X.JQw;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.LinkedHashMap;

/* loaded from: OAuthAccountLinkingActivityBase.class */
public abstract class OAuthAccountLinkingActivityBase extends FragmentActivity {
    public 04J A01;
    public Fyz A02;
    public String A03 = "";
    public Bundle A00 = new Bundle(0);

    public static final void A00(OAuthAccountLinkingActivityBase oAuthAccountLinkingActivityBase, Integer num, Long l, String str, String str2) {
        String str3;
        EQe eQe;
        String string = oAuthAccountLinkingActivityBase.A00.getString(Property.SYMBOL_Z_ORDER_SOURCE);
        str3 = "";
        if (string == null) {
            string = str3;
        }
        LinkedHashMap A0A = 04R.A0A(new 03Y[]{1BK.A1G(Property.SYMBOL_Z_ORDER_SOURCE, string)});
        String string2 = oAuthAccountLinkingActivityBase.A00.getString("token_source");
        if (string2 == null) {
            string2 = str3;
        }
        A0A.put("token_source", string2);
        String string3 = oAuthAccountLinkingActivityBase.A00.getString("ad_id");
        A0A.put("ad_id", string3 != null ? string3 : "");
        A0A.put("app_session_id", String.valueOf(oAuthAccountLinkingActivityBase.A00.getString("app_session_id")));
        long longValue = l != null ? l.longValue() : oAuthAccountLinkingActivityBase.A00.getLong(JQw.A00(8), 0L);
        04J r0 = oAuthAccountLinkingActivityBase.A01;
        String str4 = oAuthAccountLinkingActivityBase.A03;
        11T.A0F(str4, 2);
        if (r0 != null) {
            1UG A08 = 1BK.A08(r0, "fx_third_party_account_linking");
            Integer num2 = longValue == 0 ? 0S2.A00 : longValue <= 4YU.A06(System.currentTimeMillis()) ? 0S2.A0C : 0S2.A01;
            if (A08.isSampled()) {
                switch (num.intValue()) {
                    case 3:
                        eQe = EQe.A01;
                        break;
                    case 4:
                        eQe = EQe.A02;
                        break;
                    case 5:
                        eQe = EQe.A03;
                        break;
                    case 6:
                        eQe = EQe.A04;
                        break;
                    case 7:
                        eQe = EQe.A05;
                        break;
                    case 8:
                        eQe = EQe.A06;
                        break;
                    case 9:
                        eQe = EQe.A07;
                        break;
                    default:
                        eQe = EQe.A08;
                        break;
                }
                A08.A5c(eQe, "event");
                A08.A6H("partner_integration_id", 1BK.A0n(str4));
                A08.A5c(EQ4.A01, "auth_mechanism");
                int intValue = num2.intValue();
                A08.A5c(intValue != 0 ? intValue != 1 ? EQS.A02 : EQS.A01 : EQS.A03, "authentication_state");
                A08.A6J("extra_data", A0A);
                A08.A7R("error_message", str);
                A08.A7R("error_stacktrace", str2);
                A08.BZL();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if ((r306 instanceof X.Fyz) != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A2c() {
        /*
            r301 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r302 = r0
            java.lang.String r0 = "oauth_account_linking_provider"
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = 33
            r305 = r0
            r0 = r301
            android.content.Intent r0 = r0.getIntent()
            r306 = r0
            r0 = r302
            r1 = r305
            if (r0 < r1) goto L3b
            r0 = r306
            if (r0 == 0) goto L35
            java.lang.Class<X.Fyz> r0 = X.Fyz.class
            r307 = r0
            r0 = r306
            r1 = r303
            r2 = r307
            java.io.Serializable r0 = r0.getSerializableExtra(r1, r2)
            r306 = r0
        L2c:
            r0 = r306
            r304 = r0
            r0 = r306
            X.Fyz r0 = (X.Fyz) r0
            r304 = r0
        L35:
            r0 = r301
            r1 = r304
            r0.A02 = r1
            return
        L3b:
            r0 = r306
            if (r0 == 0) goto L57
            r0 = r306
            r1 = r303
            java.io.Serializable r0 = r0.getSerializableExtra(r1)
            r306 = r0
        L48:
            r0 = r306
            boolean r0 = r0 instanceof X.Fyz
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L35
            goto L2c
        L57:
            r0 = 0
            r306 = r0
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.oauthaccountlinking.OAuthAccountLinkingActivityBase.A2c():void");
    }
}
