package com.facebook.payments.p2p.awareness;

import X.0FI;
import X.11T;
import X.1BK;
import X.1BQ;
import X.1BV;
import X.1Bn;
import X.1Br;
import X.1tC;
import X.2tJ;
import X.6Gx;
import X.7zU;
import X.AbF;
import X.AbH;
import X.AbK;
import X.C00i;
import X.C05324dh;
import X.C06c;
import X.C1750Ark;
import X.C2t1;
import X.CP0;
import X.DKC;
import X.DKD;
import X.DKH;
import X.DKI;
import X.DKT;
import X.DYk;
import X.DYy;
import X.EKk;
import X.EMw;
import X.EfA;
import X.FHR;
import X.Fmo;
import X.GKg;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import java.io.Serializable;

/* loaded from: PaymentAwarenessActivity.class */
public class PaymentAwarenessActivity extends FbFragmentActivity {
    public Intent A00;
    public EMw A01;
    public boolean A02;
    public C00i A03;
    public C00i A04;
    public C00i A05;
    public final C00i A09 = AbH.A0D();
    public final C00i A08 = DKD.A0P();
    public final C00i A06 = 1BQ.A02(98773);
    public final C00i A07 = 1BQ.A02(98783);

    private void A12() {
        DKI.A0Y(this, EKk.A01);
        if (this.A00 != null) {
            AbK.A0q(this.A09).A0A(this, this.A00);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        super.A2b(fragment);
        if (fragment instanceof DYy) {
            ((DYy) fragment).A02 = new Fmo(this);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        DYk dYy;
        super.A2y(bundle);
        if (getWindow() != null) {
            ((1tC) this.A04.get()).A03(getWindow(), AbF.A0p(this.A03));
        }
        setContentView(2132542031);
        this.A01 = getIntent().getSerializableExtra("payment_awareness_mode");
        this.A00 = (Intent) getIntent().getParcelableExtra("payment_awareness_post_nux_intent");
        this.A02 = DKH.A0T(this.A05).AZk(36312870452991050L);
        if (DKH.A0T(this.A05).AZk(36312870455940184L)) {
            this.A01 = EMw.A05;
            C00i c00i = this.A07;
            if (!((EfA) c00i.get()).A00) {
                C05324dh c05324dh = (C05324dh) this.A06.get();
                Context baseContext = getBaseContext();
                InterstitialTrigger interstitialTrigger = new InterstitialTrigger(681, (String) null);
                11T.A0F(baseContext, 0);
                2tJ A0P = ((C2t1) 1Br.A0B(c05324dh.A02)).A0P(interstitialTrigger, C1750Ark.class);
                if (A0P != null && C05324dh.A00(baseContext, c05324dh, A0P, interstitialTrigger, null)) {
                    CP0 cp0 = new CP0("com.bloks.www.p2p.payment.nux");
                    Integer num = 8214;
                    cp0.A05("nuxId", num.toString());
                    cp0.A05("nextAction", "p2p_messenger_callback_to_composer");
                    C00i c00i2 = this.A08;
                    if (DKD.A0a(c00i2) != null && DKD.A0a(c00i2).A02 != null) {
                        cp0.A05("entry_point", DKD.A0a(c00i2).A02);
                    }
                    if (DKD.A0a(c00i2) != null && DKD.A0a(c00i2).A04 != null) {
                        cp0.A05("session_id", DKD.A0a(c00i2).A04);
                    }
                    1Bn.A0A(98520);
                    ((EfA) c00i.get()).A00 = true;
                    DKT.A06(this, (GKg) null, cp0.A03());
                    return;
                }
            }
            A12();
            return;
        }
        if (BDe().A0Y(2131364227) == null) {
            if (this.A02) {
                C05324dh c05324dh2 = (C05324dh) this.A06.get();
                Context baseContext2 = getBaseContext();
                InterstitialTrigger interstitialTrigger2 = new InterstitialTrigger(681, (String) null);
                11T.A0F(baseContext2, 0);
                if (C05324dh.A01(baseContext2, c05324dh2, interstitialTrigger2, C1750Ark.class, null, true)) {
                    dYy = new DYk();
                    C06c A0D = 7zU.A0D(this);
                    A0D.A0L(dYy, 2131364227);
                    A0D.A04();
                    6Gx A0a = DKC.A0a(this.A08);
                    FHR fhr = new FHR("init");
                    FHR.A02(this.A01, fhr);
                    A0a.A05(fhr);
                }
            }
            Parcelable parcelableExtra = getIntent().getParcelableExtra("thread_summary");
            Serializable serializable = this.A01;
            Bundle A05 = 1BK.A05();
            A05.putSerializable("payment_awareness_mode", serializable);
            A05.putParcelable("thread_summary", parcelableExtra);
            dYy = new DYy();
            dYy.setArguments(A05);
            C06c A0D2 = 7zU.A0D(this);
            A0D2.A0L(dYy, 2131364227);
            A0D2.A04();
            6Gx A0a2 = DKC.A0a(this.A08);
            FHR fhr2 = new FHR("init");
            FHR.A02(this.A01, fhr2);
            A0a2.A05(fhr2);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2z(Bundle bundle) {
        this.A05 = DKD.A0U();
        this.A03 = DKD.A0W(this);
        this.A04 = 1BV.A00(16838);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (((EfA) this.A07.get()).A00) {
            A12();
        }
        6Gx A0a = DKC.A0a(this.A08);
        FHR fhr = new FHR("back_click");
        FHR.A02(this.A01, fhr);
        A0a.A05(fhr);
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public void onRestart() {
        int A00 = 0FI.A00(462438366);
        super.onRestart();
        if (((EfA) this.A07.get()).A00) {
            A12();
        }
        0FI.A07(1354411564, A00);
    }
}
