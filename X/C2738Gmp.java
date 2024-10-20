package X;

import android.view.LayoutInflater;
import android.view.View;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* renamed from: X.Gmp, reason: case insensitive filesystem */
/* loaded from: Gmp.class */
public final class C2738Gmp extends IV9 {
    public final LayoutInflater A00;

    public C2738Gmp(LayoutInflater layoutInflater) {
        this.A00 = layoutInflater;
    }

    public void C3C(ParcelableSecondaryData parcelableSecondaryData) {
        View view = ((IV9) this).A00;
        if (view == null) {
            throw 1BK.A0h();
        }
        view.setClickable(true);
    }
}
