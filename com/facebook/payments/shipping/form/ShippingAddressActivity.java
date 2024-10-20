package com.facebook.payments.shipping.form;

import X.0FI;
import X.1BK;
import X.1Bn;
import X.1iF;
import X.7zL;
import X.7zO;
import X.7zU;
import X.AbH;
import X.C00i;
import X.C06c;
import X.DKC;
import X.DKG;
import X.DKH;
import X.DKI;
import X.DLP;
import X.DZy;
import X.EfZ;
import X.Evd;
import X.F6L;
import X.F6h;
import X.FII;
import X.FXq;
import X.FoY;
import X.FsB;
import X.FsE;
import X.Fsa;
import X.GJe;
import X.R32;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.payments.shipping.model.ShippingCommonParams;
import com.facebook.payments.shipping.model.ShippingParams;
import com.facebook.payments.shipping.model.ShippingStyle;
import com.facebook.payments.ui.PaymentsFragmentHeaderView;
import com.facebook.payments.ui.ctabutton.SingleTextCtaButtonView;
import com.facebook.payments.ui.titlebar.PaymentsTitleBarViewStub;
import com.facebook.ui.legacynavbar.LegacyNavigationBar;

/* loaded from: ShippingAddressActivity.class */
public class ShippingAddressActivity extends FbFragmentActivity {
    public C00i A00;
    public F6L A01;
    public DZy A02;
    public ShippingParams A03;
    public SingleTextCtaButtonView A04;
    public LegacyNavigationBar A05;
    public FII A06;
    public DLP A07;
    public final F6h A08 = F6h.A00();
    public final GJe A09 = new FsB(this, 4);

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        super.A2b(fragment);
        if (fragment instanceof DZy) {
            DZy dZy = (DZy) fragment;
            this.A02 = dZy;
            dZy.A09 = new FoY(this);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKG.A0I();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        this.A01.A03 = null;
        this.A05 = null;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        setContentView(2132543329);
        if (this.A03.shippingStyle == ShippingStyle.TXN_HUB) {
            LegacyNavigationBar legacyNavigationBar = (LegacyNavigationBar) A2e().B0T(2131368089);
            this.A05 = legacyNavigationBar;
            if (legacyNavigationBar != null) {
                legacyNavigationBar.setVisibility(0);
                LegacyNavigationBar legacyNavigationBar2 = this.A05;
                legacyNavigationBar2.A0E();
                legacyNavigationBar2.A0G();
                legacyNavigationBar2.Cm8(FXq.A00(this, 97));
                F6h f6h = this.A08;
                f6h.A08 = getResources().getString(2131965920);
                LegacyNavigationBar legacyNavigationBar3 = this.A05;
                if (legacyNavigationBar3 != null) {
                    DKH.A1O(legacyNavigationBar3, f6h);
                    LegacyNavigationBar legacyNavigationBar4 = this.A05;
                    FsE fsE = new FsE(this);
                    Evd evd = legacyNavigationBar4.A04;
                    if (evd != null) {
                        evd.A03 = fsE;
                    }
                }
            }
        } else {
            ViewGroup viewGroup = (ViewGroup) A2c(2131363324);
            PaymentsTitleBarViewStub A0n = DKG.A0n(this);
            A0n.setVisibility(0);
            F6L f6l = this.A01;
            f6l.A00 = new EfZ(this);
            ShippingCommonParams shippingCommonParams = this.A03;
            f6l.A01 = shippingCommonParams;
            f6l.A02 = A0n;
            Fsa.A00(viewGroup, shippingCommonParams.paymentsDecoratorParams, A0n, f6l, 13);
            f6l.A03 = f6l.A02.A06;
            F6L.A00(f6l);
        }
        ((LegacyNavigationBar) A2c(2131368089)).A07 = true;
        if (bundle == null) {
            C06c A0D = 7zU.A0D(this);
            ShippingParams shippingParams = this.A03;
            Bundle A05 = 1BK.A05();
            A05.putParcelable("extra_shipping_address_params", shippingParams);
            DZy dZy = new DZy();
            dZy.setArguments(A05);
            A0D.A0Q(dZy, "shipping_fragment_tag", 2131364227);
            A0D.A04();
        }
        if (this.A03.shippingStyle == ShippingStyle.SIMPLE_V2) {
            View A2c = A2c(2131364191);
            SingleTextCtaButtonView singleTextCtaButtonView = (SingleTextCtaButtonView) A2c(2131361874);
            this.A04 = singleTextCtaButtonView;
            singleTextCtaButtonView.Cls();
            this.A04.A05(getResources().getString(2131965920));
            FXq.A01(this.A04, this, 96);
            A2c.setVisibility(0);
            A2c.setBackground(R32.A00(DKC.A0V(this.A00).A13(this)));
            PaymentsFragmentHeaderView A2c2 = A2c(2131364443);
            int i = 2131965917;
            if (this.A03.mailingAddress == null) {
                i = 2131965908;
            }
            A2c2.A0F(i);
            A2c2.setVisibility(0);
            this.A07 = new DLP(A2c(2131363324), false);
        }
        FII.A02(this, this.A03.paymentsDecoratorParams.paymentsDecoratorAnimation);
        Window window = getWindow();
        if (window != null) {
            int A0B = DKC.A0V(this.A00).A13(this).A0B();
            window.setBackgroundDrawable(7zL.A0D(A0B));
            AbH.A1K(window.getDecorView(), A0B);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A31(Bundle bundle) {
        super.A31(bundle);
        this.A01 = (F6L) 1Bn.A0A(99330);
        this.A06 = DKG.A0h(this);
        this.A00 = 7zL.A0R(this, 442);
        ShippingCommonParams shippingCommonParams = (ShippingParams) 7zO.A0H(this).getParcelable("extra_shipping_address_params");
        this.A03 = shippingCommonParams;
        FII.A00(this, this.A06, shippingCommonParams.paymentsDecoratorParams);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void finish() {
        super.finish();
        ShippingCommonParams shippingCommonParams = this.A03;
        if (shippingCommonParams != null) {
            FII.A01(this, shippingCommonParams.paymentsDecoratorParams.paymentsDecoratorAnimation);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        DKI.A0T(BDe(), "shipping_fragment_tag");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        int A00 = 0FI.A00(1736617270);
        super.onPause();
        DLP dlp = this.A07;
        if (dlp != null) {
            dlp.A03(this.A09);
        }
        0FI.A07(875398952, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(-226214102);
        super.onResume();
        DLP dlp = this.A07;
        if (dlp != null) {
            dlp.A02(this.A09);
        }
        0FI.A07(1744471741, A00);
    }
}
