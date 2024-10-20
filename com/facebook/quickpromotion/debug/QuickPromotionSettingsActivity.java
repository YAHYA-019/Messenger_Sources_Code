package com.facebook.quickpromotion.debug;

import X.11T;
import X.1BK;
import X.1BY;
import X.1Bn;
import X.1Br;
import X.1Bu;
import X.1Fv;
import X.2tJ;
import X.2tY;
import X.2vS;
import X.7zM;
import X.AbJ;
import X.AnonymousClass001;
import X.C3o5;
import X.FWg;
import X.FWh;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceScreen;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbPreferenceActivity;
import com.google.common.collect.ImmutableMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: QuickPromotionSettingsActivity.class */
public final class QuickPromotionSettingsActivity extends FbPreferenceActivity {
    public Map A00;
    public Executor A01;
    public final 1Br A02 = 1BK.A0E();
    public final 1Br A04 = 1Bu.A01(this, 98770);
    public final 1Br A03 = 7zM.A0Y();

    public static final void A01(FbUserSession fbUserSession, QuickPromotionSettingsActivity quickPromotionSettingsActivity) {
        PreferenceScreen createPreferenceScreen = quickPromotionSettingsActivity.getPreferenceManager().createPreferenceScreen(quickPromotionSettingsActivity);
        Preference preference = new Preference(quickPromotionSettingsActivity);
        preference.setTitle("Global Filter Options");
        preference.setIntent(C3o5.A0D(quickPromotionSettingsActivity, QuickPromotionFiltersActivity.class));
        createPreferenceScreen.addPreference(preference);
        Preference preference2 = new Preference(quickPromotionSettingsActivity);
        preference2.setTitle("Triggers Firing Page");
        preference2.setSummary("Tapping a trigger will show the eligible QP Interstitial");
        preference2.setIntent(C3o5.A0D(quickPromotionSettingsActivity, QuickPromotionTriggersActivity.class));
        createPreferenceScreen.addPreference(preference2);
        PreferenceCategory preferenceCategory = new PreferenceCategory(quickPromotionSettingsActivity);
        createPreferenceScreen.addPreference(preferenceCategory);
        preferenceCategory.setTitle("Refresh & Reset");
        Preference preference3 = new Preference(quickPromotionSettingsActivity);
        preference3.setTitle("Reset All NXX Counters");
        FWg.A00(preference3, quickPromotionSettingsActivity, fbUserSession, 5);
        createPreferenceScreen.addPreference(preference3);
        Preference preference4 = new Preference(quickPromotionSettingsActivity);
        FWh.A01(preference4, quickPromotionSettingsActivity, 13);
        preference4.setTitle("Refresh Quick Promotion Data");
        createPreferenceScreen.addPreference(preference4);
        Preference preference5 = new Preference(quickPromotionSettingsActivity);
        preference5.setTitle("Reset Interstitial and Action Delays");
        FWh.A01(preference5, quickPromotionSettingsActivity, 14);
        createPreferenceScreen.addPreference(preference5);
        Preference preference6 = new Preference(quickPromotionSettingsActivity);
        preference6.setTitle("Reset All Force Modes to Default");
        FWg.A00(preference6, quickPromotionSettingsActivity, fbUserSession, 6);
        createPreferenceScreen.addPreference(preference6);
        quickPromotionSettingsActivity.setPreferenceScreen(createPreferenceScreen);
    }

    @Override // com.facebook.base.activity.FbPreferenceActivity
    public void A0A(Bundle bundle) {
        this.A01 = AbJ.A1C();
        2tY r0 = (2tY) 1Bn.A0E(this, (1BY) null, 17108);
        ImmutableMap.Builder A0c = 1BK.A0c();
        FbUserSession A05 = ((1Fv) 1Br.A0B(this.A03)).A05(this);
        Iterator it = r0.A01().iterator();
        while (it.hasNext()) {
            2tJ A00 = r0.A00(A05, AnonymousClass001.A0i(it));
            if (A00 instanceof 2vS) {
                A0c.put(((2vS) A00).A04(), A00.Arn());
            }
        }
        ImmutableMap build = A0c.build();
        11T.A0A(build);
        this.A00 = build;
        A01(A05, this);
    }
}
