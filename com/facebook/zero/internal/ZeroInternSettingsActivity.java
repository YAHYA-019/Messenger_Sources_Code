package com.facebook.zero.internal;

import X.1BQ;
import X.1G0;
import X.1G3;
import X.4YU;
import X.7zL;
import X.C00i;
import X.DNf;
import X.DNt;
import X.FWZ;
import X.Q0A;
import X.Q0B;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceGroup;
import android.preference.PreferenceScreen;
import com.facebook.base.activity.FbPreferenceActivity;

/* loaded from: ZeroInternSettingsActivity.class */
public final class ZeroInternSettingsActivity extends FbPreferenceActivity {
    public C00i A00;
    public C00i A01;
    public C00i A02;
    public C00i A03;
    public C00i A04;
    public C00i A05;
    public C00i A06;
    public C00i A07;
    public C00i A08;
    public C00i A09;
    public C00i A0A;
    public C00i A0B;
    public C00i A0C;
    public C00i A0D;
    public C00i A0E;
    public C00i A0F;
    public C00i A0G;
    public C00i A0H;
    public C00i A0I;
    public C00i A0J;
    public C00i A0K;
    public C00i A0L;
    public C00i A0M;
    public final C00i A0N = 1BQ.A02(32832);

    public static void A01(PreferenceGroup preferenceGroup, C00i c00i) {
        c00i.getClass();
        preferenceGroup.addPreference((Preference) c00i.get());
    }

    @Override // com.facebook.base.activity.FbPreferenceActivity
    public void A08(Bundle bundle) {
        this.A01 = 7zL.A0R(this, 98790);
        this.A00 = 7zL.A0R(this, 98789);
        this.A06 = 7zL.A0R(this, 98550);
        this.A07 = 7zL.A0R(this, 131289);
        this.A0A = 7zL.A0R(this, 98552);
        this.A05 = 7zL.A0R(this, 98549);
        this.A0B = 7zL.A0R(this, 98792);
        this.A0C = 7zL.A0R(this, 98795);
        this.A0D = 7zL.A0R(this, 98794);
        this.A02 = 7zL.A0R(this, 98793);
        this.A03 = 7zL.A0R(this, 98791);
        this.A08 = 7zL.A0R(this, 98788);
        this.A0F = 7zL.A0R(this, 98872);
        this.A0E = 7zL.A0R(this, 98871);
        this.A0G = 7zL.A0R(this, 98547);
        this.A0H = 7zL.A0R(this, 98622);
        this.A0I = 7zL.A0R(this, 131299);
        this.A09 = 7zL.A0R(this, 131298);
        this.A0J = 7zL.A0R(this, 116391);
        this.A0K = 7zL.A0R(this, 98548);
        this.A0M = 7zL.A0R(this, 98665);
        this.A0L = 7zL.A0R(this, 98595);
        this.A04 = 7zL.A0R(this, 98563);
        setTitle("Zero Rating Settings");
        PreferenceScreen createPreferenceScreen = getPreferenceManager().createPreferenceScreen(this);
        setPreferenceScreen(createPreferenceScreen);
        PreferenceCategory preferenceCategory = new PreferenceCategory(this);
        preferenceCategory.setTitle(2131958304);
        createPreferenceScreen.addPreference(preferenceCategory);
        A01(preferenceCategory, this.A0M);
        A01(preferenceCategory, this.A0L);
        preferenceCategory.addPreference(new Q0A(this));
        preferenceCategory.addPreference(new Q0B(this));
        A01(preferenceCategory, this.A0K);
        A01(preferenceCategory, this.A0G);
        A01(preferenceCategory, this.A0F);
        A01(preferenceCategory, this.A0E);
        A01(preferenceCategory, this.A06);
        DNf dNf = new DNf(this);
        dNf.A02 = 1G3.A01(1G0.A05, "zero/clear_featurekey_counter_hist");
        dNf.setTitle("Clear Zero Feature Key Counter");
        dNf.getEditText().setSingleLine(true);
        dNf.getEditText().setHint("Enter zero feature key to be reset");
        FWZ.A00(dNf, preferenceCategory, this, 9);
        A01(preferenceCategory, this.A0J);
        A01(preferenceCategory, this.A01);
        A01(preferenceCategory, this.A00);
        A01(preferenceCategory, this.A0A);
        A01(preferenceCategory, this.A05);
        A01(preferenceCategory, this.A0B);
        A01(preferenceCategory, this.A0H);
        A01(preferenceCategory, this.A07);
        A01(preferenceCategory, this.A0I);
        A01(preferenceCategory, this.A09);
        A01(preferenceCategory, this.A0C);
        A01(preferenceCategory, this.A0D);
        A01(preferenceCategory, this.A02);
        A01(preferenceCategory, this.A03);
        A01(preferenceCategory, this.A08);
        A01(preferenceCategory, this.A04);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C00i c00i = this.A0M;
        if (c00i == null || c00i.get() == null) {
            return;
        }
        ((DNt) 4YU.A0p(this.A0M)).A01.A00();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C00i c00i = this.A0M;
        if (c00i == null || c00i.get() == null) {
            return;
        }
        ((DNt) 4YU.A0p(this.A0M)).A01.A01();
    }
}
