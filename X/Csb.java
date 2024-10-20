package X;

import android.os.Bundle;
import com.facebook.messaging.rtc.meetups.speakeasy.model.SpeakeasyShareSheetModel;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel;
import com.facebook.messaging.sharing.broadcastflow.model.rooms.SpeakeasyRoomShareIntentModel;

/* loaded from: Csb.class */
public final class Csb implements DFq {
    public static final NavigationTrigger A00 = NavigationTrigger.A03("speakeasy_room_share");

    @Override // X.DFq
    public BroadcastFlowIntentModel AHz(Bundle bundle) {
        SpeakeasyShareSheetModel speakeasyShareSheetModel = (SpeakeasyShareSheetModel) bundle.getParcelable("parcelable_share_extras");
        if (speakeasyShareSheetModel == null) {
            return null;
        }
        return new SpeakeasyRoomShareIntentModel(speakeasyShareSheetModel, CBd.A00(bundle, A00));
    }
}
