package com.facebook.messaging.settings.mesettings.surface;

import X.0S2;
import X.11T;
import X.1BV;
import X.1BY;
import X.1Br;
import X.1Iw;
import X.1Lo;
import X.1pH;
import X.2M3;
import X.2dQ;
import X.6T0;
import X.7zN;
import X.7zO;
import X.7zP;
import X.7zU;
import X.9zQ;
import X.AbF;
import X.AbH;
import X.AbK;
import X.AbL;
import X.AlW;
import X.AnonymousClass001;
import X.BhV;
import X.C00i;
import X.C06c;
import X.C1373Aff;
import X.C1566All;
import X.C1t1;
import X.C1t3;
import X.C1u2;
import X.C1u3;
import X.C2iw;
import X.C5yu;
import X.C5yw;
import X.C5z1;
import X.CZl;
import X.CfA;
import X.CfB;
import X.Cx9;
import X.CxE;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.widget.CustomLinearLayout;
import com.google.common.collect.ImmutableList;

/* loaded from: MessengerMePreferenceActivity.class */
public class MessengerMePreferenceActivity extends FbFragmentActivity {
    public static final Integer A0B = 0S2.A0Y;
    public ViewGroup A00;
    public 1pH A01;
    public C00i A02;
    public AlW A03;
    public CustomLinearLayout A04;
    public FbUserSession A05;
    public C00i A06;
    public LithoView A07;
    public final C2iw A09 = new Object();
    public final 2M3 A08 = new CfB(this, 4);
    public final C1t1 A0A = new Cx9(this, 4);

    public static void A12(MessengerMePreferenceActivity messengerMePreferenceActivity, MigColorScheme migColorScheme) {
        if (migColorScheme != null) {
            ImmutableList of = ImmutableList.of();
            if (1Br.A07(2dQ.A00).AZk(72339764799473786L)) {
                C1u2 A0R = 7zP.A0R();
                int i = C5yu.A00;
                6T0 r0 = new 6T0();
                r0.A06 = migColorScheme;
                r0.A01 = migColorScheme.B4h();
                r0.A00 = A0R.A03(C1u3.A5c);
                r0.A04 = new 9zQ(messengerMePreferenceActivity, 25);
                r0.A07 = "QR Code";
                of = ImmutableList.of((Object) new C5z1(r0));
            }
            LithoView lithoView = messengerMePreferenceActivity.A07;
            C5yw A0b = 7zN.A0b(lithoView.A09, false);
            A0b.A1w(messengerMePreferenceActivity.A09);
            A0b.A2b(migColorScheme);
            A0b.A2a(2131963717);
            A0b.A2g(of);
            CxE.A01(A0b, messengerMePreferenceActivity, 85);
            AbH.A1R(lithoView, A0b);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        String string;
        super.A2b(fragment);
        if (fragment instanceof AlW) {
            AlW alW = (AlW) fragment;
            this.A03 = alW;
            alW.A07 = new BhV(this);
            LithoView lithoView = this.A07;
            if (lithoView != null) {
                C2iw c2iw = this.A09;
                11T.A0F(c2iw, 2);
                ComponentTree componentTree = lithoView.A00;
                if (componentTree == null) {
                    throw AnonymousClass001.A0L("Must call LithoView.setComponent() ");
                }
                1Iw r0 = componentTree.A0V;
                11T.A0A(r0);
                alW.A00 = new C1373Aff(r0, c2iw);
            }
        }
        Bundle A0H = 7zO.A0H(this);
        if (A0H == null || (string = A0H.getString("deeplink_fragment_tag_extra")) == null || !string.equals(C1566All.__redex_internal_original_name)) {
            return;
        }
        this.A01.Czy(new C1566All(), string);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        ((C1t3) 1Lo.A04(this, this.A05, (1BY) null, 33086)).A01(this.A0A);
        super.A2l();
        this.A01.A06();
        this.A01 = null;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        FbUserSession A08 = AbL.A08(this);
        this.A05 = A08;
        ((C1t3) 1Lo.A04(this, A08, (1BY) null, 33086)).A00(this.A0A);
        if (bundle == null) {
            C00i c00i = this.A06;
            c00i.getClass();
            c00i.get();
        }
        setContentView(2132542935);
        this.A00 = (ViewGroup) A2c(2131365482);
        this.A07 = (LithoView) LayoutInflater.from(this).inflate(2132541718, this.A00, false);
        MigColorScheme A0o = AbF.A0o(this, 16979);
        MigColorScheme.A00(this.A07, AbF.A0o(this, 16979));
        AbK.A1D(this, this.A05);
        A12(this, A0o);
        this.A00.addView(this.A07);
        CustomLinearLayout customLinearLayout = (CustomLinearLayout) A2c(2131365479);
        this.A04 = customLinearLayout;
        MigColorScheme.A00(customLinearLayout, AbF.A0o(this, 16979));
        if (BDe().A0Y(2131365480) == null) {
            Fragment alW = new AlW();
            C06c A0D = 7zU.A0D(this);
            A0D.A0Q(alW, "me_preference_fragment", 2131365480);
            A0D.A0V("me_preference_fragment");
            C06c.A00(A0D, false);
        }
        this.A01 = 1pH.A02((ViewGroup) this.A08.AUH(), BDe(), new CfA(this, 7), false);
        BDe().A1L(new CZl(this, 2));
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A31(Bundle bundle) {
        this.A02 = 1BV.A00(147789);
        this.A06 = 1BV.A00(116335);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public boolean A36() {
        return true;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.A01.A07()) {
            return;
        }
        super.onBackPressed();
    }
}
