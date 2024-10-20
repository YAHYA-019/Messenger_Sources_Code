package com.facebook.messaging.business.common.activity;

import X.06Z;
import X.0FI;
import X.0fH;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1JF;
import X.1Lo;
import X.1iF;
import X.1lN;
import X.1tC;
import X.2PP;
import X.2PV;
import X.2PW;
import X.2S0;
import X.4YT;
import X.4YU;
import X.7zL;
import X.7zO;
import X.AbF;
import X.AbL;
import X.C00i;
import X.C06c;
import X.C1t1;
import X.C1t3;
import X.C2062Dan;
import X.DYd;
import X.E17;
import X.FXr;
import X.FkF;
import X.GHw;
import X.HQl;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: BusinessActivity.class */
public final class BusinessActivity extends FbFragmentActivity implements 1lN {
    public Toolbar A00;
    public 2PP A01;
    public C2062Dan A02;
    public Set A03;
    public 2PV A04;
    public C00i A05;
    public DYd A06;
    public 2PW A07;
    public final C1t1 A08 = new FkF(this, 0);

    public static void A12(Toolbar toolbar, BusinessActivity businessActivity, MigColorScheme migColorScheme) {
        if (1JF.A0B(businessActivity.A06.A1X(businessActivity))) {
            toolbar.setVisibility(8);
            return;
        }
        toolbar.setVisibility(0);
        toolbar.A0T(businessActivity.A06.A1X(businessActivity));
        toolbar.setBackgroundColor(migColorScheme.BDl());
        toolbar.A0N(migColorScheme.B4i());
        Drawable A0E = toolbar.A0E();
        if (A0E != null) {
            A0E.setColorFilter(migColorScheme.B4h(), PorterDuff.Mode.SRC_ATOP);
            toolbar.A0P(A0E);
        }
        FXr.A04(toolbar, businessActivity, 68);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return AbL.A0A();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        ((C1t3) 4YU.A0p(this.A05)).A01(this.A08);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        Bundle A0H = 7zO.A0H(this);
        String string = A0H.getString(4YT.A00(345));
        Parcelable parcelable = A0H.getParcelable(4YT.A00(65));
        string.getClass();
        06Z BDe = BDe();
        DYd A0b = BDe.A0b(string);
        this.A06 = A0b;
        boolean z = true;
        if (A0b == null) {
            z = false;
            Iterator it = this.A03.iterator();
            while (true) {
                if (!it.hasNext()) {
                    A0b = null;
                    break;
                }
                GHw gHw = (GHw) it.next();
                if (gHw.AnQ().equals(string)) {
                    A0b = gHw.AJm();
                    break;
                }
            }
            this.A06 = A0b;
        }
        A0b.getClass();
        if (this.A06 instanceof E17) {
            setTheme(2132608312);
        }
        setContentView(2132541637);
        if (z) {
            0fH.A0j("BusinessActivity", "onActivityCreate, fragment already exists");
        } else {
            C06c A0G = 7zL.A0G(BDe);
            A0G.A0Q(this.A06, string, 2131362700);
            A0G.A04();
        }
        DYd dYd = this.A06;
        dYd.A1Z(new HQl(this));
        if (parcelable != null) {
            dYd.A1Y(this, parcelable);
        }
        MigColorScheme A0o = AbF.A0o(this, 16979);
        this.A00 = (Toolbar) A2c(2131368112);
        ((1tC) 1Bn.A0A(16838)).A03(getWindow(), A0o);
        A12(this.A00, this, A0o);
        this.A01.A01 = (ViewGroup) A2c(2131363335);
        overridePendingTransition(2130772065, 2130772074);
        ((C1t3) 4YU.A0p(this.A05)).A00(this.A08);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2z(Bundle bundle) {
        this.A01 = (2PP) 1Bn.A0E(this, (1BY) null, 17001);
        this.A07 = (2PW) 1Bn.A0E(this, (1BY) null, 67725);
        this.A02 = (C2062Dan) 1Bn.A0E(this, (1BY) null, 98371);
        this.A04 = (2PV) 1Bi.A03(98358);
        this.A03 = 1Bn.A0I(229);
        this.A05 = 1Lo.A00(this, AbL.A08(this), 33086);
        this.A01.A05(this.A04, ImmutableSet.A02(this.A07, this.A02));
    }

    public String AWg() {
        return "BusinessActivity";
    }

    public Long Am7() {
        return null;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (this.A06 != null) {
            overridePendingTransition(2130771975, 2130772074);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        2S0 r0 = this.A06;
        if (r0 instanceof 2S0) {
            r0.Bkd();
        }
        super.onBackPressed();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        int A00 = 0FI.A00(-2107983825);
        super.onPause();
        this.A01.A02();
        0FI.A07(-1537780177, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(1028597922);
        super.onResume();
        this.A01.A03();
        0FI.A07(-1675721625, A00);
    }
}
