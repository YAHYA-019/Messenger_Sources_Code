package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;
import java.util.List;

/* loaded from: Bai.class */
public final class Bai {
    public final Byu A00;

    public Bai(Context context, 06Z r303, FbUserSession fbUserSession, ThreadSummary threadSummary, MigColorScheme migColorScheme, ParcelableSecondaryData parcelableSecondaryData, Integer num, String str, List list) {
        if (!AbF.A1Z(str)) {
            throw 1BL.A0l(str);
        }
        this.A00 = new Byu(context, r303, fbUserSession, threadSummary, migColorScheme, parcelableSecondaryData, num, list);
    }
}
