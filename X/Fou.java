package X;

import android.content.res.Resources;
import com.facebook.common.locale.Country;
import com.facebook.inject.FbInjector;
import com.google.common.collect.ImmutableList;

/* loaded from: Fou.class */
public final class Fou implements GOU {
    public static final ImmutableList A02 = ImmutableList.of((Object) Country.A00(null, "GB"), (Object) Country.A00(null, "FR"));
    public final Fot A00 = (Fot) 1Bn.A0A(99243);
    public final Resources A01 = FbInjector.A00().getResources();

    public String AkS(GFy gFy) {
        Resources resources;
        int i;
        Country country = Country.A01;
        Country country2 = ((RvT) gFy).A00;
        if (country.equals(country2)) {
            resources = this.A01;
            i = 2131952355;
        } else {
            boolean contains = A02.contains(country2);
            resources = this.A01;
            i = 2131952354;
            if (contains) {
                i = 2131952360;
            }
        }
        return resources.getString(i);
    }

    @Override // X.GOU
    public int Avi(Country country) {
        return this.A00.Avi(country);
    }

    public boolean BTX(GFy gFy) {
        return this.A00.BTX(gFy);
    }
}
