package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.facebook.inject.FbInjector;

/* loaded from: Eku.class */
public final class Eku {
    public final Resources A00;
    public final LayoutInflater A01;
    public final C1uu A02;

    public Eku() {
        LayoutInflater layoutInflater = (LayoutInflater) 1Hv.A02(7zP.A0J(), 100193);
        Context A00 = FbInjector.A00();
        C1uu c1uu = (C1uu) 1Bi.A03(66388);
        this.A01 = layoutInflater;
        this.A00 = A00.getResources();
        this.A02 = c1uu;
    }
}
