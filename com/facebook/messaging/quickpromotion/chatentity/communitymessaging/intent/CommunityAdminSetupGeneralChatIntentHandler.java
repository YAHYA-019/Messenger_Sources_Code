package com.facebook.messaging.quickpromotion.chatentity.communitymessaging.intent;

import X.0fH;
import X.1BK;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* loaded from: CommunityAdminSetupGeneralChatIntentHandler.class */
public final class CommunityAdminSetupGeneralChatIntentHandler {
    public static final Bundle A00(Intent intent) {
        Class cls;
        String str;
        Uri data = intent.getData();
        if (data == null) {
            cls = CommunityAdminSetupGeneralChatIntentHandler.class;
            str = "Incoming intent has no uri data";
        } else {
            String queryParameter = data.getQueryParameter("group_id");
            String queryParameter2 = data.getQueryParameter("community_id");
            String queryParameter3 = data.getQueryParameter("channel_creation_entry_point");
            String queryParameter4 = data.getQueryParameter("parent_surface");
            if (queryParameter != null && queryParameter2 != null) {
                Bundle A05 = 1BK.A05();
                A05.putBoolean("community_admin_setup_general_chat", true);
                A05.putString("group_id", queryParameter);
                A05.putString("community_id", queryParameter2);
                A05.putString("channel_creation_entry_point", queryParameter3);
                A05.putString("parent_surface", queryParameter4);
                return A05;
            }
            cls = CommunityAdminSetupGeneralChatIntentHandler.class;
            str = "Invalid url parameter";
        }
        0fH.A0B(cls, str);
        return null;
    }
}
