package X;

import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel;
import com.facebook.messaging.sharing.broadcastflow.intent.model.MontageShareIntentModel;
import com.google.common.collect.ImmutableList;

/* loaded from: Ctd.class */
public final class Ctd implements DHZ {
    public Class BDh() {
        return MontageShareIntentModel.class;
    }

    public /* bridge */ /* synthetic */ CDU BYN(BroadcastFlowIntentModel broadcastFlowIntentModel) {
        Message message = ((MontageShareIntentModel) broadcastFlowIntentModel).A00;
        ImmutableList immutableList = message.A0z;
        return new CDU(immutableList.size() > 1 ? new Csy(immutableList) : new C9xa(message));
    }
}
