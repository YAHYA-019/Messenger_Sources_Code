package com.facebook.graphql.enums;

import X.02H;
import X.1BK;
import com.facebook.acra.constants.ReportField;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import java.util.HashSet;
import java.util.Set;

/* loaded from: GraphQLGroupsSubTabSet.class */
public final class GraphQLGroupsSubTabSet {
    public static final HashSet A00;

    static {
        String[] strArr = new String[29];
        System.arraycopy(new String[]{"YOUR_GROUPS", "YOUR_GROUP_JOINS"}, 1BK.A1W(new String[]{ReportField.ACTIVITY_LOG, "CATEGORIES", "COMPOSER", "CREATE", "CROSS_GROUP_INBOX", "CROSS_GROUP_INBOX_CHATS_ONLY", "CROSS_GROUP_INBOX_JVC_ONLY", "DISCOVER_MAIN", "ENGAGE_MAIN", "EVENTS", "FOR_YOU", "GROUP_DIGEST", "GROUP_SET", "INVITES", "JOINED", "LOCAL", "MANAGE_GROUPS", "ME", "POSTS", "QUESTIONS", "RELATED_CONTENT", "RISING", "SETTINGS", "THANKS", OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, "VIDEOS", "YOUR_CHATS"}, strArr) ? 1 : 0, strArr, 27, 2);
        A00 = 02H.A00(strArr);
    }

    public static final Set getSet() {
        return A00;
    }
}
