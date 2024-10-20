package X;

import android.net.Uri;
import com.facebook.messaging.groups.invitelink.join.model.GroupInviteLinkData;
import com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel;
import com.facebook.messaging.sharing.broadcastflow.intent.model.InviteLinkShareIntentModel;

/* loaded from: Ctb.class */
public final class Ctb implements DHZ {
    public Class BDh() {
        return InviteLinkShareIntentModel.class;
    }

    public /* bridge */ /* synthetic */ CDU BYN(BroadcastFlowIntentModel broadcastFlowIntentModel) {
        GroupInviteLinkData groupInviteLinkData = ((InviteLinkShareIntentModel) broadcastFlowIntentModel).A00;
        Uri uri = groupInviteLinkData.A03;
        uri.getClass();
        return new CDU(new Ct1(uri.toString(), groupInviteLinkData.A0F, "", groupInviteLinkData.A0D, null));
    }
}
