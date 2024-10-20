package com.facebook.quickpromotion.ui;

import X.0FI;
import X.0Pz;
import X.0Q8;
import X.11T;
import X.1Br;
import X.1MV;
import X.6JO;
import X.7zL;
import X.AQW;
import X.AbF;
import X.AbstractC00603o4;
import X.AnonymousClass046;
import X.C00i;
import X.C00m;
import X.C01g;
import X.C01i;
import X.C04023zl;
import X.DKH;
import X.Epk;
import X.F9t;
import X.FFG;
import X.FHL;
import X.FI0;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import java.util.Map;

/* loaded from: QpInterstitialChainActivity.class */
public final class QpInterstitialChainActivity extends FragmentActivity {
    public FbUserSession A00;
    public final C01i A01 = C01g.A01(new AQW(this, 28));

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        QuickPromotionDefinition quickPromotionDefinition;
        int A00 = 0FI.A00(635142906);
        super.onCreate(bundle);
        this.A00 = DKH.A0H(this);
        Object value = this.A01.getValue();
        11T.A0A(value);
        Epk epk = (Epk) value;
        FbUserSession fbUserSession = this.A00;
        if (fbUserSession == null) {
            7zL.A1C();
            throw 0Q8.createAndThrow();
        }
        C00i c00i = epk.A02.A00;
        FI0 fi0 = (FI0) c00i.get();
        fi0.A04().markerPoint(716773283, C04023zl.A00(fi0.A01, "chain_interstitial_deeplink", false, false));
        1MV A0B = AbF.A0B(fbUserSession, epk.A00.A00, 99621);
        QpInterstitialChainActivity qpInterstitialChainActivity = epk.A05;
        String stringExtra = qpInterstitialChainActivity.getIntent().getStringExtra(AbstractC00603o4.A00(644));
        if (stringExtra == null || stringExtra.length() == 0) {
            ((AnonymousClass046) 1Br.A0B(epk.A03)).ACu("qp_interstitial_deeplink_triggered_empty_nux_id", 533400802);
        } else {
            String stringExtra2 = qpInterstitialChainActivity.getIntent().getStringExtra(AbstractC00603o4.A00(482));
            if (stringExtra2 == null) {
                stringExtra2 = "false";
            }
            if (stringExtra2.equals("true") && (quickPromotionDefinition = ((F9t) A0B.get()).A00) != null) {
                FHL A002 = ((6JO) 1Br.A0B(epk.A04)).A00((InterstitialTrigger) null, quickPromotionDefinition.A02(), quickPromotionDefinition, stringExtra);
                FI0 fi02 = (FI0) c00i.get();
                String str = quickPromotionDefinition.promotionId;
                11T.A0F(str, 0);
                fi02.A04().markerPoint(716773283, C04023zl.A00(fi02.A01, 0Pz.A0W("deeplink_dismiss_", str), false, false));
                A002.A07((Map) null);
            }
            FFG.A01(qpInterstitialChainActivity, (FFG) 1Br.A0B(epk.A01), stringExtra, (C00m) null);
        }
        finish();
        0FI.A07(1107582677, A00);
    }
}
