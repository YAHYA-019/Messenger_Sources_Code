package X;

import android.os.Bundle;
import com.facebook.messaging.business.share.model.MessengerPlatformExtensibleShareContentFields;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel;
import com.facebook.messaging.sharing.broadcastflow.intent.model.PlatformLinkShareIntentModel;

/* loaded from: Csa.class */
public final class Csa implements DFq {
    public static final NavigationTrigger A00 = NavigationTrigger.A03("platform_link_share_trigger");

    @Override // X.DFq
    public BroadcastFlowIntentModel AHz(Bundle bundle) {
        MessengerPlatformExtensibleShareContentFields messengerPlatformExtensibleShareContentFields = (MessengerPlatformExtensibleShareContentFields) bundle.getParcelable("share_platform_extensible");
        if (messengerPlatformExtensibleShareContentFields == null) {
            return null;
        }
        String str = messengerPlatformExtensibleShareContentFields.A00 == 0S2.A01 ? messengerPlatformExtensibleShareContentFields.A0D : messengerPlatformExtensibleShareContentFields.A09;
        if (1JF.A0B(str)) {
            return null;
        }
        return new PlatformLinkShareIntentModel(messengerPlatformExtensibleShareContentFields, A00, BWC.A00(bundle), str);
    }
}
