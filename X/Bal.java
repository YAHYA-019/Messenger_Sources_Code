package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* loaded from: Bal.class */
public final class Bal {
    public final Bx9 A00;

    public Bal(Context context, 06Z r303, FbUserSession fbUserSession, 3JU r305, ParcelableSecondaryData parcelableSecondaryData, String str) {
        if (!AbF.A1Z(str)) {
            throw 1BL.A0l(str);
        }
        this.A00 = new Bx9(context, r303, fbUserSession, r305, parcelableSecondaryData);
    }
}
