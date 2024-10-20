package com.facebook.messaging.internalprefs;

import X.0FI;
import X.11T;
import X.1Br;
import X.1Fv;
import X.1Lm;
import X.1lN;
import X.1tR;
import X.7zR;
import X.7zS;
import X.AbE;
import X.AbstractC00603o4;
import X.AnonymousClass001;
import X.C09s;
import X.CZD;
import X.CZg;
import X.DKC;
import X.DKH;
import X.DKO;
import X.DNd;
import X.DNe;
import X.DNg;
import X.FGQ;
import X.FWZ;
import X.FWa;
import X.FWg;
import X.FXr;
import X.Fe5;
import android.R;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceScreen;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.acra.constants.ActionId;
import com.facebook.base.activity.FbPreferenceActivity;
import com.facebook.messaging.internalprefs.burner.MessengerInternalBurnerActivity;
import java.lang.reflect.Field;
import java.util.List;

/* loaded from: MessengerInternalBasePreferenceActivity.class */
public abstract class MessengerInternalBasePreferenceActivity extends FbPreferenceActivity implements 1lN {
    public final List A00 = AnonymousClass001.A0s();
    public final List A01 = AnonymousClass001.A0s();

    @Override // com.facebook.base.activity.FbPreferenceActivity
    public void A06() {
        DKO.A00(this, false);
    }

    @Override // com.facebook.base.activity.FbPreferenceActivity
    public void A0A(Bundle bundle) {
        setContentView(2132542956);
        View A00 = C09s.A00(this, 2131368112);
        11T.A0I(A00, "null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        Toolbar toolbar = (Toolbar) A00;
        toolbar.A0T(getTitle().toString());
        FXr.A04(toolbar, this, 86);
        if (1tR.A00(this)) {
            FGQ.A01(toolbar, new Fe5(toolbar, 0));
        }
        PreferenceScreen createPreferenceScreen = getPreferenceManager().createPreferenceScreen(this);
        setPreferenceScreen(createPreferenceScreen);
        11T.A0D(createPreferenceScreen);
        A0B(createPreferenceScreen);
        SearchView searchView = (SearchView) DKC.A0F(this, 2131367138);
        Field declaredField = Class.forName(AnonymousClass001.A0Y(searchView)).getDeclaredField("mSearchSrcTextView");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(searchView);
        11T.A0I(obj, AbE.A00(639));
        TextView textView = (TextView) obj;
        textView.setTextColor(-16777216);
        SpannableString spannableString = new SpannableString(AbstractC00603o4.A00(44));
        spannableString.setSpan(new ForegroundColorSpan(-7829368), 0, 6, 18);
        textView.setHint(spannableString);
        searchView.mOnQueryChangeListener = new CZg(createPreferenceScreen, this, 0);
        searchView.setOnClickListener(new CZD(searchView, ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES));
    }

    public void A0B(PreferenceScreen preferenceScreen) {
        MessengerInternalBurnerActivity messengerInternalBurnerActivity = (MessengerInternalBurnerActivity) this;
        11T.A0F(preferenceScreen, 0);
        1Br A00 = 1Lm.A00(messengerInternalBurnerActivity, ((1Fv) 1Br.A0B(messengerInternalBurnerActivity.A07)).A05(messengerInternalBurnerActivity), 16686);
        Preference preference = new Preference(messengerInternalBurnerActivity);
        preference.setSummary(messengerInternalBurnerActivity.A0C());
        preferenceScreen.addPreference(preference);
        if (messengerInternalBurnerActivity.A0J()) {
            DNe dNe = new DNe(messengerInternalBurnerActivity);
            dNe.setTitle("Thread Id");
            dNe.setText(String.valueOf(messengerInternalBurnerActivity.A05));
            DKH.A15(dNe, String.valueOf(messengerInternalBurnerActivity.A05));
            FWa.A00(dNe, preferenceScreen, messengerInternalBurnerActivity, 2);
        }
        DNe dNe2 = new DNe(messengerInternalBurnerActivity);
        dNe2.setTitle("Messages Count");
        dNe2.setText(String.valueOf(messengerInternalBurnerActivity.A01));
        DKH.A15(dNe2, String.valueOf(messengerInternalBurnerActivity.A01));
        FWa.A00(dNe2, preferenceScreen, messengerInternalBurnerActivity, 3);
        if (messengerInternalBurnerActivity.A0I()) {
            DNe dNe3 = new DNe(messengerInternalBurnerActivity);
            dNe3.setTitle("Thread Count");
            dNe3.setText(String.valueOf(messengerInternalBurnerActivity.A02));
            DKH.A15(dNe3, String.valueOf(messengerInternalBurnerActivity.A02));
            FWa.A00(dNe3, preferenceScreen, messengerInternalBurnerActivity, 4);
        }
        if (messengerInternalBurnerActivity.A0F()) {
            DNg dNg = new DNg(messengerInternalBurnerActivity);
            dNg.setTitle("Message type");
            dNg.setDefaultValue("TEXT");
            String[] strArr = messengerInternalBurnerActivity.A08;
            dNg.setEntries(strArr);
            dNg.setEntryValues(strArr);
            FWZ.A00(dNg, preferenceScreen, messengerInternalBurnerActivity, 2);
        }
        if (messengerInternalBurnerActivity.A0E()) {
            DNe dNe4 = new DNe(messengerInternalBurnerActivity);
            dNe4.setTitle("Attachments per message");
            dNe4.setText(String.valueOf(messengerInternalBurnerActivity.A00));
            DKH.A15(dNe4, String.valueOf(messengerInternalBurnerActivity.A00));
            FWa.A00(dNe4, preferenceScreen, messengerInternalBurnerActivity, 5);
        }
        if (messengerInternalBurnerActivity.A0G()) {
            DNd dNd = new DNd(messengerInternalBurnerActivity);
            dNd.setTitle("E2EE");
            dNd.setSummary("End to End Encrypted");
            dNd.setDefaultValue(Boolean.valueOf(messengerInternalBurnerActivity.A06));
            FWZ.A00(dNd, preferenceScreen, messengerInternalBurnerActivity, 3);
        }
        if (messengerInternalBurnerActivity.A0H()) {
            DNe dNe5 = new DNe(messengerInternalBurnerActivity);
            dNe5.setTitle("Media ID");
            dNe5.setText(String.valueOf(messengerInternalBurnerActivity.A04));
            DKH.A15(dNe5, String.valueOf(messengerInternalBurnerActivity.A04));
            FWa.A00(dNe5, preferenceScreen, messengerInternalBurnerActivity, 6);
        }
        Preference preference2 = new Preference(messengerInternalBurnerActivity);
        preference2.setTitle("Run");
        preference2.setSummary("Starts Burner job");
        FWg.A00(preference2, messengerInternalBurnerActivity, A00, 0);
        preferenceScreen.addPreference(preference2);
    }

    @Override // com.facebook.base.activity.FbPreferenceActivity, android.preference.PreferenceActivity, android.app.ListActivity, android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        if (findViewById(R.id.list) != null) {
            super.onContentChanged();
        }
    }

    @Override // com.facebook.base.activity.FbPreferenceActivity, android.app.Activity
    public void onPause() {
        int A00 = 0FI.A00(905451635);
        super.onPause();
        InputMethodManager A0C = 7zS.A0C(this);
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            7zR.A12(currentFocus, A0C);
        }
        0FI.A07(-1761536784, A00);
    }
}
