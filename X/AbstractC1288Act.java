package X;

import com.facebook.messaging.communitymessaging.model.CommunityMessagingCommunityType;

/* renamed from: X.Act, reason: case insensitive filesystem */
/* loaded from: Act.class */
public abstract class AbstractC1288Act {
    public static final CommunityMessagingCommunityType A00(Integer num) {
        CommunityMessagingCommunityType[] values = CommunityMessagingCommunityType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return null;
            }
            CommunityMessagingCommunityType communityMessagingCommunityType = values[i2];
            int i3 = communityMessagingCommunityType.value;
            if (num != null && i3 == num.intValue()) {
                return communityMessagingCommunityType;
            }
            i = i2 + 1;
        }
    }
}
