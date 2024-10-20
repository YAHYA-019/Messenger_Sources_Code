package X;

import android.content.res.Resources;
import com.facebook.common.locale.Country;
import com.facebook.inject.FbInjector;

/* loaded from: Fot.class */
public final class Fot implements GOU {
    public final C00i A00 = FbInjector.A00;

    public String AkS(GFy gFy) {
        boolean equals = Country.A01.equals(((RvT) gFy).A00);
        Resources A0B = 1BL.A0B(this.A00);
        int i = 2131968288;
        if (equals) {
            i = 2131968289;
        }
        return A0B.getString(i);
    }

    @Override // X.GOU
    public int Avi(Country country) {
        int i = 12;
        if (Country.A01.equals(country)) {
            i = 5;
        }
        return i;
    }

    public boolean BTX(GFy gFy) {
        RvT rvT = (RvT) gFy;
        return RVW.A01(rvT.A00, rvT.A01);
    }
}
