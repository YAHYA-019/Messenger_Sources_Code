package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* loaded from: Bam.class */
public final class Bam {
    public final BxA A00;

    public Bam(Context context, FbUserSession fbUserSession, 1pI r304, ThreadKey threadKey, ParcelableSecondaryData parcelableSecondaryData, String str) {
        if (!AbF.A1Z(str)) {
            throw 1BL.A0l(str);
        }
        this.A00 = new BxA(context, fbUserSession, r304, threadKey, parcelableSecondaryData);
    }
}
