package X;

import android.preference.Preference;
import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: Ezk.class */
public final class Ezk {
    public 1HN A00;
    public final Preference A01;
    public final 1Br A02 = 1BK.A0E();
    public final FKM A03 = new FKM(this);

    public Ezk(Preference preference) {
        this.A01 = preference;
    }

    public String A00(String str) {
        FbSharedPreferences A09 = 1Br.A09(this.A02);
        1G3 r0 = new 1G3(this.A01.getKey());
        if (str == null) {
            str = A09.BD0(r0);
        } else {
            String BD0 = A09.BD0(r0);
            if (BD0 != null) {
                return BD0;
            }
        }
        return str;
    }

    public void A01(GG0 gg0) {
        String key = this.A01.getKey();
        if (key != null) {
            Fox fox = new Fox(gg0, 0);
            this.A00 = fox;
            1Br.A09(this.A02).A08.A00.A00(new 1G3(key), fox);
        }
    }

    public boolean A02(String str) {
        Preference preference = this.A01;
        if (!preference.hasKey()) {
            return true;
        }
        C00i c00i = this.A02.A00;
        if (11T.A0O(str, 1BK.A0S(c00i).BD0(new 1G3(preference.getKey())))) {
            return true;
        }
        1Ql A0U = 1BL.A0U(c00i);
        11T.A0A(A0U);
        A0U.CaL(new 1G3(preference.getKey()), str);
        A0U.commit();
        return true;
    }

    public boolean A03(boolean z) {
        return 1Br.A09(this.A02).AZn(new 1G3(this.A01.getKey()), z);
    }
}
