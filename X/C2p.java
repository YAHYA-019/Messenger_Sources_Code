package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.service.model.AddAdminsToGroupParams;
import com.facebook.messaging.service.model.RemoveAdminsFromGroupParams;
import com.facebook.messaging.service.model.RemoveMemberParams;
import com.facebook.user.model.UserFbidIdentifier;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;

/* loaded from: C2p.class */
public final class C2p {
    public 1BY A00;
    public final C15h A01 = DBe.A00(this, 61);

    public C2p(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public Bundle A00(ThreadKey threadKey, UserKey userKey, String str) {
        Parcelable removeMemberParams;
        int i;
        Bundle A05 = 1BK.A05();
        switch (str.hashCode()) {
            case 1161540277:
                if (str.equals("remove_member")) {
                    removeMemberParams = new RemoveMemberParams(threadKey, ImmutableList.of((Object) new UserFbidIdentifier(userKey.id)), this.A01.get().equals(userKey));
                    i = 220;
                    break;
                }
                throw AnonymousClass001.A0L(0Pz.A0j("Unable to process Operation Type: ", str, " for AdminDialogFragment."));
            case 1358248696:
                if (str.equals("add_admins_to_group")) {
                    removeMemberParams = new AddAdminsToGroupParams(threadKey, ImmutableList.of((Object) userKey));
                    i = 925;
                    break;
                }
                throw AnonymousClass001.A0L(0Pz.A0j("Unable to process Operation Type: ", str, " for AdminDialogFragment."));
            case 1888614090:
                if (str.equals("remove_admins_from_group")) {
                    removeMemberParams = new RemoveAdminsFromGroupParams(threadKey, ImmutableList.of((Object) userKey));
                    i = 1976;
                    break;
                }
                throw AnonymousClass001.A0L(0Pz.A0j("Unable to process Operation Type: ", str, " for AdminDialogFragment."));
            default:
                throw AnonymousClass001.A0L(0Pz.A0j("Unable to process Operation Type: ", str, " for AdminDialogFragment."));
        }
        A05.putParcelable(1BJ.A00(i), removeMemberParams);
        return A05;
    }
}
