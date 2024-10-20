package com.facebook.quickpromotion.debug;

import X.0Q8;
import X.1Bq;
import X.1Br;
import X.2bQ;
import X.7zL;
import X.7zM;
import X.C2t1;
import X.C2t2;
import X.DKH;
import X.FWg;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceScreen;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbPreferenceActivity;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import java.util.Set;

/* loaded from: QuickPromotionTriggersActivity.class */
public final class QuickPromotionTriggersActivity extends FbPreferenceActivity {
    public FbUserSession A00;
    public final 1Br A01 = 1Bq.A00(98768);
    public final 1Br A02 = 7zM.A0M();

    @Override // com.facebook.base.activity.FbPreferenceActivity
    public void A0A(Bundle bundle) {
        this.A00 = DKH.A0H(this);
        PreferenceScreen createPreferenceScreen = getPreferenceManager().createPreferenceScreen(this);
        PreferenceCategory preferenceCategory = new PreferenceCategory(this);
        preferenceCategory.setTitle("Active Triggers");
        createPreferenceScreen.addPreference(preferenceCategory);
        C2t1 c2t1 = (C2t1) 1Br.A0B(this.A01);
        FbUserSession fbUserSession = this.A00;
        if (fbUserSession == null) {
            7zL.A1C();
            throw 0Q8.createAndThrow();
        }
        C2t2 c2t2 = c2t1.A05;
        c2t2.A00();
        try {
            Set<InterstitialTrigger> keySet = C2t1.A07(fbUserSession).keySet();
            c2t2.A01();
            for (InterstitialTrigger interstitialTrigger : keySet) {
                Preference preference = new Preference(this);
                preference.setTitle(2bQ.A01(interstitialTrigger.A00));
                FWg.A00(preference, this, interstitialTrigger, 7);
                createPreferenceScreen.addPreference(preference);
            }
            PreferenceCategory preferenceCategory2 = new PreferenceCategory(this);
            preferenceCategory2.setTitle("All Triggers");
            createPreferenceScreen.addPreference(preferenceCategory2);
            int i = 0;
            do {
                int i2 = i;
                if (i < 0) {
                    i2 = 10000;
                }
                InterstitialTrigger interstitialTrigger2 = new InterstitialTrigger(i2, (String) null);
                Preference preference2 = new Preference(this);
                preference2.setTitle(2bQ.A01(interstitialTrigger2.A00));
                FWg.A00(preference2, this, interstitialTrigger2, 7);
                createPreferenceScreen.addPreference(preference2);
                i++;
            } while (i < 10000);
            setPreferenceScreen(createPreferenceScreen);
        } catch (Throwable th) {
            c2t2.A01();
            throw th;
        }
    }
}
