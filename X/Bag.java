package X;

import android.content.Context;
import com.facebook.messaging.data.communitymessaging.memberlist.model.CommunityMemberListSource;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* loaded from: Bag.class */
public final class Bag {
    public final RP9 A00;

    public Bag(Context context, 06Z r303, CommunityMemberListSource communityMemberListSource, ParcelableSecondaryData parcelableSecondaryData, String str) {
        if (!AbF.A1Z(str)) {
            throw 1BL.A0l(str);
        }
        this.A00 = new RP9(context, r303, communityMemberListSource, parcelableSecondaryData);
    }
}
