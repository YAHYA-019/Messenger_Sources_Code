package X;

import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* loaded from: Baj.class */
public final class Baj {
    public final DGZ A00;

    public Baj(Context context, 06Z r303, GF4 gf4, 1F9 r305, ThreadSummary threadSummary, D55 d55, MigColorScheme migColorScheme, ParcelableSecondaryData parcelableSecondaryData, Integer num, String str) {
        Rmq ccI;
        if (str.equals("Top")) {
            ccI = new CcI(context, r303, gf4, r305, threadSummary, d55, migColorScheme, parcelableSecondaryData, num);
        } else {
            if (!str.equals("Bottom")) {
                throw 1BL.A0l(str);
            }
            ccI = new Rmq(context, r303, gf4, threadSummary, d55, migColorScheme, parcelableSecondaryData);
        }
        this.A00 = ccI;
    }
}
