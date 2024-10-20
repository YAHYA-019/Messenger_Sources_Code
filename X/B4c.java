package X;

import com.facebook.messaging.contacts.ranking.logging.RankingLoggingItem;
import com.facebook.messaging.inbox2.activenow.model.GroupPresenceInfo;
import com.facebook.messaging.montage.model.MontageBucketPreview;
import com.facebook.messaging.montage.model.MontageUser;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;

/* loaded from: B4c.class */
public final class B4c extends 2T9 {
    public final int A00;

    public B4c(int i) {
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ Object A00(RankingLoggingItem rankingLoggingItem, Object obj) {
        if (this.A00 != 0) {
            return super.A00(rankingLoggingItem, obj);
        }
        DJm dJm = (DJm) obj;
        if (!(dJm instanceof Cf5)) {
            return null;
        }
        ((Cf5) dJm).A01 = rankingLoggingItem;
        return null;
    }

    public /* bridge */ /* synthetic */ String A01(Object obj) {
        UserKey userKey;
        switch (this.A00) {
            case 0:
                AoS aoS = (DJm) obj;
                if (aoS instanceof AoS) {
                    return aoS.A07.A13;
                }
                throw AnonymousClass002.A0C(aoS, "Row is not of type ContactPickerUserRow: ", AnonymousClass001.A0k());
            case 1:
                return AbI.A16(((GroupPresenceInfo) obj).A00.A0n);
            case 2:
                userKey = ((MontageBucketPreview) obj).A06;
                break;
            case 3:
                userKey = ((MontageUser) obj).A01;
                break;
            case 4:
                return ((User) obj).A13;
            default:
                return null;
        }
        return userKey.id;
    }
}
