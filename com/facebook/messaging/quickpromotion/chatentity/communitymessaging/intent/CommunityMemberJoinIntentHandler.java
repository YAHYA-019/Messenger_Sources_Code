package com.facebook.messaging.quickpromotion.chatentity.communitymessaging.intent;

import X.0CW;
import X.0fH;
import X.1BJ;
import X.3GY;
import android.content.Intent;
import android.net.Uri;
import com.facebook.messaging.communitymessaging.model.CommunityMessagingJoinFlowEntrypoint;
import com.mapbox.mapboxsdk.style.layers.Property;

/* loaded from: CommunityMemberJoinIntentHandler.class */
public final class CommunityMemberJoinIntentHandler {
    public static Intent A00(Intent intent) {
        Uri data = intent.getData();
        Integer num = null;
        if (data == null) {
            0fH.A0B(CommunityMemberJoinIntentHandler.class, "Incoming intent has no data");
            return null;
        }
        String queryParameter = data.getQueryParameter("group_id");
        String queryParameter2 = data.getQueryParameter("community_id");
        String A00 = 1BJ.A00(1190);
        String queryParameter3 = data.getQueryParameter(A00);
        String queryParameter4 = data.getQueryParameter(Property.SYMBOL_Z_ORDER_SOURCE);
        String queryParameter5 = data.getQueryParameter("community_channel_invite_entrypoint");
        if (queryParameter5 != null) {
            num = 0CW.A0c(queryParameter5);
        }
        String A002 = 1BJ.A00(386);
        String queryParameter6 = data.getQueryParameter(A002);
        Intent intent2 = new Intent();
        intent2.putExtra("group_id", queryParameter);
        intent2.putExtra("community_id", queryParameter2);
        intent2.putExtra(A00, queryParameter3);
        intent2.putExtra(Property.SYMBOL_Z_ORDER_SOURCE, queryParameter4);
        intent2.putExtra(1BJ.A00(1191), true);
        CommunityMessagingJoinFlowEntrypoint A003 = 3GY.A00(num);
        intent2.putExtra("community_channel_invite_entrypoint", A003 != null ? A003.value : -1);
        intent2.putExtra(A002, queryParameter6);
        intent2.putExtra("intent_handler_delegate_method", "handleCommunityChatMemberJoin");
        return intent2;
    }
}
