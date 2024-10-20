package com.facebook.quickpromotion.debug;

import X.0FI;
import X.0Pz;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1Bq;
import X.1Br;
import X.1HN;
import X.4GI;
import X.DNd;
import X.DNe;
import X.FWZ;
import X.Fox;
import android.os.Bundle;
import android.preference.PreferenceCategory;
import android.preference.PreferenceScreen;
import com.facebook.base.activity.FbPreferenceActivity;
import com.google.common.base.Platform;

/* loaded from: SeguePreviewSettingsActivity.class */
public final class SeguePreviewSettingsActivity extends FbPreferenceActivity {
    public PreferenceCategory A00;
    public final 1Br A03 = 1Bq.A00(84955);
    public final 1Br A02 = 1BK.A0E();
    public final 1HN A04 = new Fox(this, 1);
    public String A01 = "";

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
    
        if (X.0CV.A0Z(r310, com.facebook.traffic.knob.InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, false) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A01(com.facebook.quickpromotion.debug.SeguePreviewSettingsActivity r301) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.quickpromotion.debug.SeguePreviewSettingsActivity.A01(com.facebook.quickpromotion.debug.SeguePreviewSettingsActivity):void");
    }

    @Override // com.facebook.base.activity.FbPreferenceActivity
    public void A0A(Bundle bundle) {
        PreferenceScreen createPreferenceScreen = getPreferenceManager().createPreferenceScreen(this);
        11T.A0D(createPreferenceScreen);
        DNe dNe = new DNe(this);
        dNe.setText(this.A01);
        dNe.setTitle("Launch segue");
        dNe.setSummary("Launch a user defined segue");
        dNe.getEditText().setHint("fb://");
        FWZ.A00(dNe, createPreferenceScreen, this, 8);
        DNe dNe2 = new DNe(this);
        dNe2.setText(this.A01);
        dNe2.setTitle("Filter segues");
        String text = dNe2.getText();
        11T.A0A(text);
        dNe2.setSummary(Platform.stringIsNullOrEmpty(text) ? "No filter applied" : 0Pz.A0W("Filtered by: ", text));
        dNe2.getEditText().setSelectAllOnFocus(true);
        FWZ.A00(dNe2, createPreferenceScreen, this, 7);
        DNd dNd = new DNd(this);
        dNd.A04(4GI.A0A);
        dNd.setTitle("Show all segues");
        dNd.setSummary("Show all segues including parameterized segues.");
        dNd.setDefaultValue(1BK.A0d());
        createPreferenceScreen.addPreference(dNd);
        PreferenceCategory preferenceCategory = new PreferenceCategory(this);
        this.A00 = preferenceCategory;
        preferenceCategory.setTitle("Segues");
        PreferenceCategory preferenceCategory2 = this.A00;
        if (preferenceCategory2 == null) {
            11T.A0L("surfaceCategory");
            throw 0Q8.createAndThrow();
        }
        createPreferenceScreen.addPreference(preferenceCategory2);
        A01(this);
        setPreferenceScreen(createPreferenceScreen);
    }

    @Override // com.facebook.base.activity.FbPreferenceActivity, android.app.Activity
    public void onPause() {
        int A00 = 0FI.A00(1879914333);
        super.onPause();
        1Br.A09(this.A02).D63(this.A04, 4GI.A0A);
        0FI.A07(1238933195, A00);
    }

    @Override // com.facebook.base.activity.FbPreferenceActivity, android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(1162392003);
        super.onResume();
        1Br.A09(this.A02).CcV(this.A04, 4GI.A0A);
        0FI.A07(-494046444, A00);
    }
}
