package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.montage.model.MontageBucketPreview;
import com.facebook.presence.api.model.RichStatus;
import com.facebook.user.model.User;

/* loaded from: Bac.class */
public final class Bac {
    public final DGY A00;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public Bac(Context context, 06Z r303, 3Ea r304, FbUserSession fbUserSession, C0f c0f, 2UP r307, MontageBucketPreview montageBucketPreview, C38 c38, BL2 bl2, RichStatus richStatus, User user, String str, String str2, int i) {
        Rmo ccG;
        switch (str.hashCode()) {
            case -1581024098:
                if (str.equals("ContactMenuItemsForUniversalSearchContacts")) {
                    ccG = new CcG(context, r303, r304, fbUserSession, c0f, r307, montageBucketPreview, c38, bl2, richStatus, user, str2, i);
                    break;
                }
                throw 1BL.A0l(str);
            case -1461278583:
                if (str.equals("ContactMenuItemsForActiveNowTrayMemoryPog")) {
                    ccG = new Rmm(context, r303, fbUserSession, c0f, r307, montageBucketPreview, c38, richStatus, user);
                    break;
                }
                throw 1BL.A0l(str);
            case -1001497954:
                if (str.equals("ContactMenuItemsForActiveNowTray")) {
                    ccG = new CcH(context, r303, r304, fbUserSession, c0f, r307, montageBucketPreview, c38, bl2, richStatus, user, str2, i);
                    break;
                }
                throw 1BL.A0l(str);
            case -767411438:
                if (str.equals("ContactMenuItemsForUniversalSearchPYMK")) {
                    ccG = new Rmn(context, r303, fbUserSession, c0f, r307, montageBucketPreview, c38, richStatus, user);
                    break;
                }
                throw 1BL.A0l(str);
            case -47420139:
                if (str.equals("ContactMenuItemsForContactManager")) {
                    ccG = new Rmp(context, r303, fbUserSession, c0f, r307, montageBucketPreview, c38, richStatus, user);
                    break;
                }
                throw 1BL.A0l(str);
            case 322464245:
                if (str.equals("ContactMenuItemsForUniversalSearchNoncontacts")) {
                    ccG = new Rmo(context, r303, r304, fbUserSession, c0f, r307, montageBucketPreview, c38, bl2, richStatus, user, str2, i);
                    break;
                }
                throw 1BL.A0l(str);
            default:
                throw 1BL.A0l(str);
        }
        this.A00 = ccG;
    }
}
