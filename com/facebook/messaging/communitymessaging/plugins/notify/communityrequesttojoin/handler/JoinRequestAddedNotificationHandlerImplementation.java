package com.facebook.messaging.communitymessaging.plugins.notify.communityrequesttojoin.handler;

import X.0Q8;
import X.0S2;
import X.11T;
import X.1Bq;
import X.1Br;
import X.4YU;
import X.5qG;
import X.AbstractC00603o4;
import X.C6jR;
import X.C8f;
import android.app.PendingIntent;
import android.content.Intent;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.communitymessaging.notify.MessengerCommunityChatJoinRequestAddedNotification;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.HashMap;

/* loaded from: JoinRequestAddedNotificationHandlerImplementation.class */
public final class JoinRequestAddedNotificationHandlerImplementation {
    public C8f A00;
    public 5qG A01;
    public final 1Br A03 = 1Bq.A00(82449);
    public final 1Br A02 = 1Bq.A00(99952);

    public static final PendingIntent A00(MessengerCommunityChatJoinRequestAddedNotification messengerCommunityChatJoinRequestAddedNotification, JoinRequestAddedNotificationHandlerImplementation joinRequestAddedNotificationHandlerImplementation, ThreadKey threadKey, String str, String str2, String str3, HashMap hashMap, boolean z) {
        5qG r0 = joinRequestAddedNotificationHandlerImplementation.A01;
        if (r0 == null) {
            11T.A0L("messagingNotificationLogIntentCreator");
            throw 0Q8.createAndThrow();
        }
        Intent putExtra = new Intent().setAction("android.intent.action.VIEW").setFlags(67108864).setData(4YU.A0F(AbstractC00603o4.A00(180))).putExtra("from_notification", true).putExtra("thread_key", threadKey).putExtra("user_id", str).putExtra(AbstractC00603o4.A00(ActionId.HEADER_DATA_LOADED), z).putExtra(AbstractC00603o4.A00(188), C6jR.A03).putExtra("event_params", hashMap).putExtra("community_id", str2).putExtra("group_id", str3);
        11T.A0A(putExtra);
        return r0.A06(putExtra, messengerCommunityChatJoinRequestAddedNotification, 0S2.A01, String.valueOf(messengerCommunityChatJoinRequestAddedNotification.A00), AbstractC00603o4.A00(43), 10134);
    }
}
