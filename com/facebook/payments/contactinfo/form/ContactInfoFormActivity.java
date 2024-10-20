package com.facebook.payments.contactinfo.form;

import X.1BK;
import X.1Bn;
import X.1iF;
import X.7zU;
import X.C06c;
import X.DKG;
import X.DKI;
import X.EXC;
import X.Ef0;
import X.Eot;
import X.ErO;
import X.F6h;
import X.FII;
import X.FXq;
import X.Fm9;
import X.Fsa;
import X.GL6;
import X.Q4o;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.facebook.payments.ui.titlebar.PaymentsTitleBarViewStub;
import com.facebook.ui.legacynavbar.LegacyNavigationBar;

/* loaded from: ContactInfoFormActivity.class */
public class ContactInfoFormActivity extends FbFragmentActivity {
    public ContactInfoCommonFormParams A00;
    public EXC A01;
    public Eot A02;
    public Q4o A03;
    public LegacyNavigationBar A04;
    public FII A05;
    public final F6h A06 = F6h.A00();

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        super.A2b(fragment);
        Fm9 fm9 = new Fm9(this);
        if (fragment instanceof Q4o) {
            Q4o q4o = (Q4o) fragment;
            this.A03 = q4o;
            q4o.A03 = fm9;
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKG.A0I();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        Eot eot = this.A02;
        eot.getClass();
        eot.A03 = null;
        super.A2l();
        this.A04 = null;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        setContentView(2132541750);
        if (this.A00.A0A) {
            LegacyNavigationBar legacyNavigationBar = (LegacyNavigationBar) A2e().B0T(2131368089);
            this.A04 = legacyNavigationBar;
            if (legacyNavigationBar != null) {
                legacyNavigationBar.setVisibility(0);
                LegacyNavigationBar legacyNavigationBar2 = this.A04;
                legacyNavigationBar2.A0E();
                legacyNavigationBar2.A0G();
                legacyNavigationBar2.Cm8(FXq.A00(this, 51));
            }
        } else {
            ViewGroup viewGroup = (ViewGroup) A2c(2131363324);
            PaymentsTitleBarViewStub A0n = DKG.A0n(this);
            A0n.setVisibility(0);
            Eot eot = this.A02;
            eot.getClass();
            eot.A00 = new Ef0(this);
            Eot eot2 = this.A02;
            eot2.getClass();
            PaymentsDecoratorParams paymentsDecoratorParams = this.A00.A03;
            eot2.A01 = paymentsDecoratorParams;
            eot2.A02 = A0n;
            Fsa.A00(viewGroup, paymentsDecoratorParams, A0n, eot2, 7);
            GL6 gl6 = eot2.A02.A06;
            eot2.A03 = gl6;
            ErO.A00(gl6, eot2, 4);
        }
        if (bundle == null && BDe().A0b("contact_info_form_fragment_tag") == null) {
            C06c A0D = 7zU.A0D(this);
            this.A01.getClass();
            ContactInfoCommonFormParams contactInfoCommonFormParams = this.A00;
            Q4o q4o = new Q4o();
            Bundle A05 = 1BK.A05();
            A05.putParcelable("extra_contact_info_form_params", contactInfoCommonFormParams);
            DKG.A1H(A05, A0D, q4o, "contact_info_form_fragment_tag", 2131364227);
        }
        FII.A02(this, this.A00.A03.paymentsDecoratorAnimation);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A31(Bundle bundle) {
        super.A31(bundle);
        this.A02 = (Eot) 1Bn.A0A(99332);
        this.A05 = DKG.A0h(this);
        this.A01 = (EXC) 1Bn.A0A(99341);
        this.A00 = (ContactInfoCommonFormParams) getIntent().getParcelableExtra("extra_contact_info_form_params");
        FII fii = this.A05;
        fii.getClass();
        FII.A00(this, fii, this.A00.A03);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void finish() {
        super.finish();
        FII.A01(this, this.A00.A03.paymentsDecoratorAnimation);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        DKI.A0T(BDe(), "contact_info_form_fragment_tag");
    }
}
