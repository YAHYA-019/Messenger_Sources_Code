package X;

import com.facebook.messaging.communitymessaging.model.CommunityMessagingFbGroupType;

/* renamed from: X.Acz, reason: case insensitive filesystem */
/* loaded from: Acz.class */
public abstract class AbstractC1293Acz {
    public static final CommunityMessagingFbGroupType A00(Integer num) {
        CommunityMessagingFbGroupType[] values = CommunityMessagingFbGroupType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return null;
            }
            CommunityMessagingFbGroupType communityMessagingFbGroupType = values[i2];
            int i3 = communityMessagingFbGroupType.value;
            if (num != null && i3 == num.intValue()) {
                return communityMessagingFbGroupType;
            }
            i = i2 + 1;
        }
    }
}
