package com.facebook.quickpromotion.ui;

import X.11T;
import X.1BY;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Hv;
import X.6JO;
import X.7zU;
import X.AQW;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C06c;
import X.F7H;
import X.F7p;
import X.FHL;
import X.GG8;
import android.R;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.quickpromotion.model.CustomRenderType;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import java.util.Map;

/* loaded from: QuickPromotionInterstitialActivity.class */
public class QuickPromotionInterstitialActivity extends FbFragmentActivity implements GG8 {
    public final 1Br A00 = 1Bq.A00(99615);
    public final C01i A01 = C01g.A00(C03i.A02, new AQW(this, 30));

    private final FHL A12(QuickPromotionDefinition quickPromotionDefinition) {
        6JO r0 = (6JO) 1Bn.A0E(this, (1BY) null, 50062);
        String stringExtra = getIntent().getStringExtra("qp_controller_id");
        return r0.A00((InterstitialTrigger) this.A01.getValue(), quickPromotionDefinition.A02(), quickPromotionDefinition, stringExtra);
    }

    private final void A15() {
        Fragment A01 = ((F7p) 1Br.A0B(this.A00)).A01(getIntent());
        if (A01 == null) {
            finish();
            return;
        }
        A01.setRetainInstance(true);
        C06c A0D = 7zU.A0D(this);
        A0D.A0M(A01, R.id.content);
        A0D.A04();
    }

    private final boolean A16() {
        QuickPromotionDefinition quickPromotionDefinition = (QuickPromotionDefinition) getIntent().getParcelableExtra("qp_definition");
        if (quickPromotionDefinition == null) {
            return false;
        }
        boolean z = true;
        if (!((F7H) 1Hv.A02(this, 98412)).A00(quickPromotionDefinition)) {
            z = false;
        }
        if (z) {
            A12(quickPromotionDefinition).A04((Map) null);
            return true;
        }
        if (quickPromotionDefinition.template != QuickPromotionDefinition.TemplateType.A0L || quickPromotionDefinition.customRenderType != CustomRenderType.A0V) {
            return false;
        }
        FHL A12 = A12(quickPromotionDefinition);
        A12.A05((Map) null);
        A12.A04((Map) null);
        finish();
        return true;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2x(Intent intent) {
        QuickPromotionDefinition quickPromotionDefinition;
        11T.A0F(intent, 0);
        super.A2x(intent);
        QuickPromotionDefinition quickPromotionDefinition2 = (QuickPromotionDefinition) getIntent().getParcelableExtra("qp_definition");
        if (quickPromotionDefinition2 == null || (quickPromotionDefinition = (QuickPromotionDefinition) intent.getParcelableExtra("qp_definition")) == null || !11T.A0O(quickPromotionDefinition2.promotionId, quickPromotionDefinition.promotionId)) {
            setIntent(intent);
            if (A16()) {
                return;
            }
            A15();
        }
    }

    public void A3B(Bundle bundle) {
        if (A16() || bundle != null) {
            return;
        }
        A15();
    }

    @Override // X.GG8
    public void CFB(String str) {
        finish();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        A3B(bundle);
        overridePendingTransition(0, 0);
    }
}
