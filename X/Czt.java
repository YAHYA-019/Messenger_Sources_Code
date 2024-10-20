package X;

import android.preference.Preference;
import android.preference.TwoStatePreference;
import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: Czt.class */
public final class Czt implements 1HN, 1HO {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Czt(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public void onSharedPreferenceChanged(FbSharedPreferences fbSharedPreferences, 1G2 r303) {
        switch (this.A00) {
            case 0:
                AbG.A0B(((CPl) this.A01).A0E).Ciz(new D5J(this));
                return;
            case 1:
                ((DFp) this.A02).D7z();
                return;
            case 2:
                11T.A0F(r303, 1);
                3PX.A00(new AFm((C2lh) this.A02, r303, (C9h5) this.A01));
                return;
            case 3:
                1BK.A1M(fbSharedPreferences, r303);
                C2lh c2lh = (C2lh) this.A01;
                boolean AZn = fbSharedPreferences.AZn(r303, false);
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("OnSharedPreferenceChangeListener ");
                A0k.append(r303);
                A0k.append(" = ");
                A0k.append(AZn);
                0fH.A0j(7zK.A00(182), A0k.toString());
                c2lh.A02(Boolean.valueOf(AZn));
                return;
            default:
                Preference preference = (Preference) this.A02;
                if (preference instanceof ECW) {
                    TwoStatePreference twoStatePreference = (TwoStatePreference) preference;
                    2Pg r0 = (2Pg) this.A01;
                    twoStatePreference.setChecked(1BK.A1T(1BK.A0R(r0.A0H), r303));
                    2Pg.A08(r0);
                    return;
                }
                return;
        }
    }
}
