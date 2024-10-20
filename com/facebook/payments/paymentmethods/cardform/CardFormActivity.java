package com.facebook.payments.paymentmethods.cardform;

import X.1BY;
import X.1Bn;
import X.1iF;
import X.7zL;
import X.7zU;
import X.C00i;
import X.C06c;
import X.C3o5;
import X.C5fi;
import X.DKC;
import X.DKG;
import X.DKI;
import X.DZd;
import X.EfP;
import X.Eqi;
import X.ErO;
import X.EsH;
import X.F6h;
import X.FII;
import X.FIR;
import X.FXq;
import X.FnN;
import X.FnP;
import X.Fsa;
import X.GL6;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.facebook.payments.ui.titlebar.PaymentsTitleBarViewStub;
import com.facebook.ui.legacynavbar.LegacyNavigationBar;

/* loaded from: CardFormActivity.class */
public class CardFormActivity extends FbFragmentActivity {
    public EsH A00;
    public CardFormParams A01;
    public Eqi A02;
    public DZd A03;
    public LegacyNavigationBar A04;
    public C00i A05;
    public FII A06;
    public final F6h A07 = F6h.A00();

    public static Intent A12(Context context, CardFormParams cardFormParams) {
        context.getClass();
        Intent A0D = C3o5.A0D(context, CardFormActivity.class);
        A0D.putExtra("card_form_params", cardFormParams);
        return A0D;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        super.A2b(fragment);
        if (fragment instanceof DZd) {
            DZd dZd = (DZd) fragment;
            this.A03 = dZd;
            dZd.A0C = new FnN(this);
            dZd.A0D = new FnP(this);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKG.A0I();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        DZd dZd = this.A03;
        dZd.A0C = null;
        dZd.A0D = null;
        Eqi eqi = this.A02;
        eqi.A02 = null;
        eqi.A05 = null;
        eqi.A00 = null;
        this.A04 = null;
        super.A2l();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        getWindow().addFlags(8192);
        setContentView(2132541665);
        if (this.A01.Abq().cardFormStyleParams.enableHubTitleBar) {
            LegacyNavigationBar legacyNavigationBar = (LegacyNavigationBar) A2e().B0T(2131368089);
            this.A04 = legacyNavigationBar;
            if (legacyNavigationBar != null) {
                legacyNavigationBar.setVisibility(0);
                LegacyNavigationBar legacyNavigationBar2 = this.A04;
                legacyNavigationBar2.A0E();
                legacyNavigationBar2.A0G();
                legacyNavigationBar2.Cm8(FXq.A00(this, 83));
            }
        } else {
            ViewGroup viewGroup = (ViewGroup) A2c(2131363324);
            PaymentsTitleBarViewStub A0n = DKG.A0n(this);
            A0n.setVisibility(0);
            Eqi eqi = this.A02;
            eqi.A02 = new EfP(this);
            CardFormParams cardFormParams = this.A01;
            eqi.A03 = cardFormParams;
            eqi.A04 = A0n;
            PaymentsDecoratorParams paymentsDecoratorParams = cardFormParams.Abq().cardFormStyleParams.paymentsDecoratorParams;
            eqi.A01 = paymentsDecoratorParams;
            Fsa.A00(viewGroup, paymentsDecoratorParams, A0n, eqi, 11);
            PaymentsTitleBarViewStub paymentsTitleBarViewStub = eqi.A04;
            GL6 gl6 = paymentsTitleBarViewStub.A06;
            eqi.A05 = gl6;
            eqi.A00 = paymentsTitleBarViewStub.A01;
            ErO.A00(gl6, eqi, 6);
        }
        if (bundle == null && BDe().A0b("card_form_fragment") == null) {
            C06c A0D = 7zU.A0D(this);
            A0D.A0Q(this.A00.A00(this.A01), "card_form_fragment", 2131364227);
            A0D.A04();
        }
        FII.A02(this, this.A01.Abq().cardFormStyleParams.paymentsDecoratorParams.paymentsDecoratorAnimation);
        Window window = getWindow();
        if (window != null) {
            FIR.A01(this, window.getDecorView(), DKC.A0V(this.A05));
        }
        LegacyNavigationBar legacyNavigationBar3 = (LegacyNavigationBar) A2e().B0T(2131368089);
        if (legacyNavigationBar3 != null) {
            legacyNavigationBar3.A07 = true;
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A31(Bundle bundle) {
        super.A31(bundle);
        this.A02 = (Eqi) 1Bn.A0E(this, (1BY) null, 99331);
        this.A06 = DKG.A0h(this);
        this.A00 = (EsH) 1Bn.A0A(99133);
        this.A05 = 7zL.A0R(this, 442);
        CardFormParams cardFormParams = (CardFormParams) getIntent().getParcelableExtra("card_form_params");
        this.A01 = cardFormParams;
        FII.A00(this, this.A06, cardFormParams.Abq().cardFormStyleParams.paymentsDecoratorParams);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void finish() {
        super.finish();
        CardFormParams cardFormParams = this.A01;
        if (cardFormParams != null) {
            FII.A01(this, cardFormParams.Abq().cardFormStyleParams.paymentsDecoratorParams.paymentsDecoratorAnimation);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        DKI.A0T(BDe(), "card_form_fragment");
        C5fi.A00(this);
        super.onBackPressed();
    }
}
