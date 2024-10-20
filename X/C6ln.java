package X;

import com.facebook.messaging.communitymessaging.takedown.threadsummary.model.CommunityTakeDownMetadata;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* renamed from: X.6ln, reason: invalid class name */
/* loaded from: 6ln.class */
public abstract class C6ln {
    public static final boolean A00(HeterogeneousMap heterogeneousMap) {
        CommunityTakeDownMetadata communityTakeDownMetadata;
        if (heterogeneousMap == null || (communityTakeDownMetadata = (CommunityTakeDownMetadata) heterogeneousMap.A00(CommunityTakeDownMetadata.A02)) == null) {
            return false;
        }
        return communityTakeDownMetadata.A00;
    }
}
