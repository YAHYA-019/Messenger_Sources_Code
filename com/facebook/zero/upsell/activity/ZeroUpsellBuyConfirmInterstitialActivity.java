package com.facebook.zero.upsell.activity;

import X.06Z;
import X.0Pz;
import X.0S2;
import X.1BK;
import X.1BQ;
import X.1Bn;
import X.1iF;
import X.67I;
import X.AbstractC00603o4;
import X.C00i;
import X.C0A2;
import X.DKE;
import X.Dpo;
import X.EM6;
import X.EMn;
import X.FiO;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.base.activity.FbFragmentActivity;
import com.google.common.base.Charsets;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* loaded from: ZeroUpsellBuyConfirmInterstitialActivity.class */
public class ZeroUpsellBuyConfirmInterstitialActivity extends FbFragmentActivity {
    public 67I A00;
    public final C00i A01 = 1BQ.A01();

    private String A12(Uri uri, String str) {
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter == null) {
            return null;
        }
        try {
            return URLDecoder.decode(queryParameter, Charsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            1BK.A09(this.A01).softReport(ZeroUpsellBuyConfirmInterstitialActivity.class.getSimpleName(), 0Pz.A0W("Error decoding query param ", str), e);
            return queryParameter;
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKE.A0Q();
    }

    /* JADX WARN: Type inference failed for: r306v2, types: [java.lang.Object, com.facebook.iorg.common.upsell.model.PromoDataModel] */
    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A00 = (67I) 1Bn.A0A(98850);
        if (bundle == null) {
            Intent intent = getIntent();
            Parcelable parcelableExtra = intent.getParcelableExtra("promo_data_model");
            Parcelable parcelable = parcelableExtra;
            if (parcelableExtra == null) {
                String stringExtra = intent.getStringExtra(AbstractC00603o4.A00(176));
                if (stringExtra == null) {
                    parcelable = null;
                } else {
                    Uri A03 = C0A2.A03(stringExtra);
                    String A12 = A12(A03, "promo_id");
                    String A122 = A12(A03, "title");
                    String A123 = A12(A03, "top_message");
                    String A124 = A12(A03, "promo_name");
                    String A125 = A12(A03, "promo_price");
                    String A126 = A12(A03, "message");
                    String A127 = A12(A03, "button_text");
                    String A128 = A12(A03, "extra_text");
                    Integer num = 0S2.A00;
                    ?? obj = new Object();
                    obj.A00 = null;
                    obj.A05 = A12;
                    obj.A08 = A122;
                    obj.A09 = A123;
                    obj.A03 = A124;
                    obj.A07 = A125;
                    obj.A06 = A126;
                    obj.A02 = A127;
                    obj.A04 = A128;
                    obj.A01 = num;
                    parcelable = obj;
                }
            }
            this.A00.A04(new FiO(this), "buy_confirm_interstitial", null);
            67I r0 = this.A00;
            06Z BDe = BDe();
            r0.A02();
            if (BDe.A0b("buy_confirm_interstitial") == null) {
                Dpo.A07(EM6.A02, EMn.A03, parcelable, null, "buy_confirm_interstitial").A0m(BDe, "buy_confirm_interstitial");
            }
        }
    }
}
