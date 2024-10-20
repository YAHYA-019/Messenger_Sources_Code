package X;

import android.os.Bundle;
import com.facebook.messaging.communitymessaging.communitycreation.communitycreationmodel.CommunityTemplate;
import java.util.List;

/* loaded from: BzJ.class */
public final class BzJ {
    public final void A00(1pI r302, CommunityTemplate communityTemplate, 2MX r304, Long l, String str, List list) {
        Bundle A05 = 1BK.A05();
        A05.putString("community_creation_fragment_entry_point", str);
        A05.putParcelable("community_template", 0Gm.A00(communityTemplate));
        A05.putStringArray("community_topics", list != null ? C3o5.A0n(list) : null);
        if (l != null) {
            A05.putLong("community_creation_fragment_upgraded_from_group_thread_id", l.longValue());
        }
        AlT alT = new AlT();
        alT.setArguments(A05);
        r302.Czz(alT, 0S2.A01, "CommunityCreationFragment");
        alT.A02 = r304;
    }
}
