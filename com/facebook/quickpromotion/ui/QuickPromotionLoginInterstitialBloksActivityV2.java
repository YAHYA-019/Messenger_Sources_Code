package com.facebook.quickpromotion.ui;

import X.11T;
import X.1BK;
import X.1Bq;
import X.1Br;
import X.1Lm;
import X.7zM;
import X.7zS;
import X.C00i;
import X.Eo5;
import X.F5u;
import X.F9t;
import X.FI0;
import X.GG8;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import java.util.Map;

/* loaded from: QuickPromotionLoginInterstitialBloksActivityV2.class */
public final class QuickPromotionLoginInterstitialBloksActivityV2 extends FbFragmentActivity implements GG8 {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04 = 1Bq.A00(99615);
    public final F5u A05 = new F5u(this);

    public QuickPromotionLoginInterstitialBloksActivityV2() {
        1Br A0Y = 7zM.A0Y();
        this.A00 = A0Y;
        this.A02 = 1BK.A0C();
        this.A03 = 1Bq.A00(99648);
        this.A01 = 1Lm.A01(7zS.A0E(A0Y), 99621);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A12(android.content.Intent r302) {
        /*
            r301 = this;
            r0 = r301
            X.F5u r0 = r0.A05
            r303 = r0
            java.lang.String r0 = "qp_definition"
            r304 = r0
            r0 = r302
            r1 = r304
            android.os.Parcelable r0 = r0.getParcelableExtra(r1)
            com.facebook.quickpromotion.model.QuickPromotionDefinition r0 = (com.facebook.quickpromotion.model.QuickPromotionDefinition) r0
            r305 = r0
            r0 = r305
            if (r0 == 0) goto Lb2
            r0 = r303
            java.util.Map r0 = r0.A02
            r306 = r0
            r0 = r305
            java.lang.String r0 = r0.promotionId
            r304 = r0
            r0 = r306
            r1 = r304
            java.lang.Object r0 = r0.get(r1)
            X.Eo5 r0 = (X.Eo5) r0
            r307 = r0
            r0 = 1
            r308 = r0
            r0 = r307
            if (r0 != 0) goto L89
            r0 = r303
            com.facebook.quickpromotion.ui.QuickPromotionLoginInterstitialBloksActivityV2 r0 = r0.A03
            X.1Br r0 = r0.A04
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.F7p r0 = (X.F7p) r0
            r304 = r0
            r0 = r304
            r1 = r302
            X.DZF r0 = r0.A01(r1)
            r309 = r0
            r0 = r309
            if (r0 == 0) goto Lb2
            r0 = r309
            r1 = r308
            r0.setRetainInstance(r1)
            r0 = r303
            java.lang.String r0 = r0.A01
            r304 = r0
            X.Eo5 r0 = new X.Eo5
            r307 = r0
            r0 = r307
            r1 = r305
            r2 = r309
            r3 = r304
            r0.<init>(r1, r2, r3)
            r0 = r305
            java.lang.String r0 = r0.promotionId
            r304 = r0
            r0 = r306
            r1 = r304
            r2 = r307
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r305
            java.lang.String r0 = r0.promotionId
            r304 = r0
            r0 = r303
            r1 = r304
            r0.A01 = r1
        L89:
            r0 = r303
            r1 = r307
            X.F5u.A00(r0, r1)
            X.Efl r0 = new X.Efl
            r304 = r0
            r0 = r304
            r1 = r308
            r0.<init>(r1)
        L99:
            r0 = r304
            boolean r0 = r0.A00
            r310 = r0
            r0 = r310
            if (r0 != 0) goto Lb1
            r0 = r301
            X.1Br r0 = r0.A03
            r304 = r0
            r0 = r304
            X.1Br.A0C(r0)
            r0 = r301
            r0.finish()
        Lb1:
            return
        Lb2:
            X.Efl r0 = new X.Efl
            r304 = r0
            r0 = r304
            r1 = 0
            r0.<init>(r1)
            goto L99
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.quickpromotion.ui.QuickPromotionLoginInterstitialBloksActivityV2.A12(android.content.Intent):void");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2x(Intent intent) {
        11T.A0F(intent, 0);
        super.A2x(intent);
        C00i c00i = this.A03.A00;
        FI0 fi0 = (FI0) c00i.get();
        int A00 = FI0.A00(fi0, fi0.A01, "bloks_activity_v2_new_intent");
        A12(intent);
        FI0.A02(c00i, "bloks_activity_v2_new_intent", A00);
    }

    @Override // X.GG8
    public void CFB(String str) {
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Eo5 eo5;
        C00i c00i = this.A03.A00;
        FI0 fi0 = (FI0) c00i.get();
        int A00 = FI0.A00(fi0, fi0.A01, "bloks_activity_v2_backpress");
        F5u f5u = this.A05;
        String str = f5u.A00;
        QuickPromotionDefinition quickPromotionDefinition = null;
        if (str != null) {
            Map map = f5u.A02;
            Eo5 eo52 = (Eo5) map.get(str);
            if (eo52 != null && (eo5 = (Eo5) map.get(eo52.A02)) != null) {
                F5u.A00(f5u, eo5);
                quickPromotionDefinition = eo5.A00;
            }
        }
        if (1Br.A07(this.A02).AZk(36324110381305301L) && quickPromotionDefinition != null) {
            ((F9t) 1Br.A0B(this.A01)).A03(quickPromotionDefinition);
        }
        FI0.A02(c00i, "bloks_activity_v2_backpress", A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        C00i c00i = this.A03.A00;
        FI0 fi0 = (FI0) c00i.get();
        int A00 = FI0.A00(fi0, fi0.A01, "bloks_activity_v2_post_create");
        ((F9t) 1Br.A0B(this.A01)).A02(this);
        A12(getIntent());
        overridePendingTransition(0, 0);
        FI0.A02(c00i, "bloks_activity_v2_post_create", A00);
    }
}
