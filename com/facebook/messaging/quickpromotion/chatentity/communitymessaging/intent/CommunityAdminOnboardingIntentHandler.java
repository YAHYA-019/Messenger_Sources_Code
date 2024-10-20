package com.facebook.messaging.quickpromotion.chatentity.communitymessaging.intent;

import X.0fH;
import X.C3o5;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.messaging.quickpromotion.chatentity.communitymessaging.CommunityMessagingAdminOnboardingActivity;
import com.mapbox.mapboxsdk.style.layers.Property;

/* loaded from: CommunityAdminOnboardingIntentHandler.class */
public final class CommunityAdminOnboardingIntentHandler {
    public static Intent A00(Context context, Intent intent) {
        Uri data = intent.getData();
        if (data == null) {
            0fH.A0B(CommunityAdminOnboardingIntentHandler.class, "Incoming intent has no data");
            return null;
        }
        String queryParameter = data.getQueryParameter("group_id");
        String queryParameter2 = data.getQueryParameter("community_id");
        String queryParameter3 = data.getQueryParameter(Property.SYMBOL_Z_ORDER_SOURCE);
        String queryParameter4 = data.getQueryParameter("channel_creation_entry_point");
        Intent A0D = C3o5.A0D(context, CommunityMessagingAdminOnboardingActivity.class);
        A0D.putExtra("group_id", queryParameter);
        A0D.putExtra("community_id", queryParameter2);
        A0D.putExtra(Property.SYMBOL_Z_ORDER_SOURCE, queryParameter3);
        A0D.putExtra("channel_creation_entry_point", queryParameter4);
        return A0D;
    }
}
