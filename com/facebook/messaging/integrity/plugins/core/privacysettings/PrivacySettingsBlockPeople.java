package com.facebook.messaging.integrity.plugins.core.privacysettings;

import X.11T;
import X.1BK;
import X.1BV;
import X.1Bn;
import X.AbG;
import X.AbL;
import X.BL3;
import X.C1F6;
import X.C7j;
import X.CG8;
import X.Cvn;
import android.content.Context;
import android.preference.Preference;
import com.facebook.inject.FbInjector;

/* loaded from: PrivacySettingsBlockPeople.class */
public final class PrivacySettingsBlockPeople {
    public final Context A00;

    public PrivacySettingsBlockPeople(Context context) {
        11T.A0F(context, 1);
        this.A00 = context;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [android.preference.Preference, X.DFo, X.Aeq, java.lang.Object] */
    public final C7j A00() {
        1Bn.A0A(83042);
        C1F6 A0F = AbG.A0F(83146);
        Context context = this.A00;
        Context A01 = FbInjector.A01();
        AbL.A0y(A0F);
        1Bn.A0K();
        FbInjector.A04(A01);
        BL3 bl3 = BL3.A01;
        ?? preference = new Preference(context);
        preference.A00 = 1BV.A00(148157);
        preference.A01 = bl3;
        preference.setLayoutResource(2132542934);
        preference.ACE();
        return CG8.A00(Cvn.A00(preference, 46), 1BK.A0u(context, 2131963521), context.getString(2131963819), "blocked_accounts");
    }
}
