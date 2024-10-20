package X;

import android.content.Context;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* loaded from: Bah.class */
public final class Bah {
    public final ROz A00;

    public Bah(Context context, 1Iw r303, DEE dee, MigColorScheme migColorScheme, ParcelableSecondaryData parcelableSecondaryData, String str) {
        if (!AbF.A1Z(str)) {
            throw 1BL.A0l(str);
        }
        this.A00 = new ROz(context, r303, dee, migColorScheme, parcelableSecondaryData);
    }
}
