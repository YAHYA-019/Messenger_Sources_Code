package com.facebook.quickpromotion.login.messenger;

import X.06Z;
import X.0FI;
import X.0Pz;
import X.11T;
import X.1BJ;
import X.1BQ;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Lo;
import X.1MV;
import X.2bQ;
import X.2qR;
import X.6JO;
import X.7zM;
import X.7zS;
import X.83Z;
import X.9HO;
import X.9TI;
import X.9Up;
import X.9Wk;
import X.C00i;
import X.C00m;
import X.C04023zl;
import X.CPE;
import X.E7o;
import X.F9t;
import X.FFG;
import X.FI0;
import X.G9Q;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.messaging.msys.thread.aibot.nux.fragment.AiBotInterstitialNuxFragment;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import com.facebook.quickpromotion.ui.QuickPromotionInterstitialActivity;

/* loaded from: QuickPromotionMessengerInterstitialActivity.class */
public final class QuickPromotionMessengerInterstitialActivity extends QuickPromotionInterstitialActivity {
    public final 1Br A00;
    public final 1Br A01;

    public QuickPromotionMessengerInterstitialActivity() {
        this(0);
    }

    public QuickPromotionMessengerInterstitialActivity(int i) {
        this.A01 = 1Bq.A00(99648);
        this.A00 = 7zM.A0Y();
    }

    @Override // com.facebook.quickpromotion.ui.QuickPromotionInterstitialActivity
    public final void A3B(Bundle bundle) {
        FFG ffg;
        C00i c00i = this.A01.A00;
        FI0 fi0 = (FI0) c00i.get();
        if (!fi0.A00) {
            fi0.A04().markerStart(716773283, false);
            fi0.A00 = true;
        }
        FI0 fi02 = (FI0) c00i.get();
        int A00 = FI0.A00(fi02, fi02.A01, "activity_on_create_lc");
        QuickPromotionDefinition quickPromotionDefinition = (QuickPromotionDefinition) getIntent().getParcelableExtra("qp_definition");
        String stringExtra = getIntent().getStringExtra("qp_controller_id");
        InterstitialTrigger interstitialTrigger = (InterstitialTrigger) getIntent().getParcelableExtra("qp_trigger");
        if (quickPromotionDefinition == null || stringExtra == null || interstitialTrigger == null) {
            FI0 fi03 = (FI0) c00i.get();
            MarkerEditor A01 = FI0.A01(fi03, A00);
            String A002 = C04023zl.A00(fi03.A01, "has_no_root_promotion", false, false);
            A01.annotate("has_no_root_promotion", true);
            A01.point(A002);
            A01.markerEditingCompleted();
            ((FI0) c00i.get()).A06("no_root_promotion");
            return;
        }
        FI0 fi04 = (FI0) c00i.get();
        String str = quickPromotionDefinition.promotionId;
        11T.A0F(str, 0);
        MarkerEditor A012 = FI0.A01(fi04, A00);
        A012.annotate("root_promotion_id", str);
        C04023zl c04023zl = fi04.A01;
        A012.point(C04023zl.A00(c04023zl, 0Pz.A0W("root_promotion_id_", str), false, false));
        String A013 = 2bQ.A01(interstitialTrigger.A00);
        A012.annotate("root_trigger", A013);
        A012.point(C04023zl.A00(c04023zl, 0Pz.A0W("root_trigger_", A013), false, false));
        A012.markerEditingCompleted();
        FbUserSession A0E = 7zS.A0E(this.A00);
        11T.A0F(A0E, 1);
        1MV A003 = 1Lo.A00(this, A0E, 99621);
        F9t f9t = (F9t) A003.get();
        1BQ A02 = 1BQ.A02(99620);
        QuickPromotionDefinition.TemplateType templateType = quickPromotionDefinition.template;
        if (templateType != QuickPromotionDefinition.TemplateType.A0m) {
            if (templateType == QuickPromotionDefinition.TemplateType.A0k) {
                ffg = (FFG) A02.get();
                06Z BDe = BDe();
                11T.A0F(f9t, 5);
                FFG.A00(ffg).A08(quickPromotionDefinition.promotionId, 1BJ.A00(484));
                9Wk r0 = (9Wk) 1Bi.A03(99647);
                if (r0.A00()) {
                    9Up r02 = new 9Up(this, quickPromotionDefinition, ffg, f9t, ((6JO) 1Bn.A0E(this, (1BY) null, 50062)).A00(interstitialTrigger, quickPromotionDefinition.A02(), quickPromotionDefinition, stringExtra), stringExtra);
                    83Z r03 = r0.A00;
                    if (r03 != null && 83Z.A00(r03).A0D()) {
                        9HO r04 = new 9HO(this);
                        2qR r05 = BaseMigBottomSheetDialogFragment.A06;
                        9TI r06 = new 9TI(this, BDe, r04, r03, r02);
                        AiBotInterstitialNuxFragment aiBotInterstitialNuxFragment = new AiBotInterstitialNuxFragment();
                        aiBotInterstitialNuxFragment.A00 = r06;
                        aiBotInterstitialNuxFragment.A0m(BDe, "AiBotInterstitialNuxFragment");
                    }
                }
            } else if (templateType == QuickPromotionDefinition.TemplateType.A0l) {
                FI0 fi05 = (FI0) c00i.get();
                MarkerEditor A014 = FI0.A01(fi05, A00);
                String A004 = C04023zl.A00(fi05.A01, "using_legacy_new_account_bloks_root_action_template", false, false);
                A014.annotate("using_legacy_new_account_bloks_root_action_template", true);
                A014.point(A004);
                A014.markerEditingCompleted();
                ((FI0) c00i.get()).A06("new_account_bloks_root_action");
                super.A3B(bundle);
            } else if (!((FFG) A02.get()).A02(this, interstitialTrigger, quickPromotionDefinition, stringExtra, (C00m) null, true)) {
                synchronized (f9t) {
                    f9t.A00 = null;
                }
                ((FI0) c00i.get()).A06("bloks_rendering_failed_in_activity_base");
                finish();
                FI0.A02(c00i, "activity_on_create_lc", A00);
            }
            ((F9t) A003.get()).A02(this);
            FI0.A02(c00i, "activity_on_create_lc", A00);
        }
        ffg = (FFG) A02.get();
        11T.A0F(f9t, 4);
        FFG.A00(ffg).A08(quickPromotionDefinition.promotionId, "notif_prompt");
        CPE.A00(this, new G9Q(this, interstitialTrigger, quickPromotionDefinition, ffg, f9t, stringExtra));
        FFG.A00(ffg).A07(quickPromotionDefinition.promotionId, "notif_prompt");
        E7o A005 = FFG.A00(ffg);
        A005.A04().markerPoint(A00, C04023zl.A00(((FI0) A005).A01, "activity_on_create_lc", false, true));
        ((F9t) A003.get()).A02(this);
        FI0.A02(c00i, "activity_on_create_lc", A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        FI0 fi0 = (FI0) 1Br.A0B(this.A01);
        MarkerEditor withMarker = fi0.A04().withMarker(716773283);
        11T.A0D(withMarker);
        String A00 = C04023zl.A00(fi0.A01, "activity_on_back_pressed", false, false);
        withMarker.annotate("user_back_pressed", true);
        withMarker.point(A00);
        withMarker.markerEditingCompleted();
        super.onBackPressed();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        int A00 = 0FI.A00(1285138401);
        super.onStop();
        finish();
        0FI.A07(-1760196588, A00);
    }
}
