package com.facebook.messaging.communitymessaging.plugins.notify.defaulthandler.handler;

import X.11T;
import X.1BJ;
import X.1BK;
import X.1BL;
import X.1Br;
import X.1Bu;
import X.4YU;
import X.4iH;
import X.AbM;
import X.AbstractC00603o4;
import X.AnonymousClass001;
import X.C00i;
import X.C5ap;
import X.C5e2;
import X.C8f;
import X.CDr;
import X.CQ5;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.communitymessaging.notify.CommunityMessagingDefaultNotification;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: CommunityDefaultHandlerImplementation.class */
public final class CommunityDefaultHandlerImplementation {
    public final 1Br A00;
    public final Context A01;

    public CommunityDefaultHandlerImplementation(Context context) {
        11T.A0F(context, 1);
        this.A01 = context;
        this.A00 = 1Bu.A01(context, 83406);
    }

    public final void A00(Context context, MessagingNotification messagingNotification) {
        Intent A05;
        Uri.Builder A08;
        String str;
        11T.A0F(context, 0);
        CDr cDr = (CDr) 1Br.A0B(this.A00);
        CommunityMessagingDefaultNotification communityMessagingDefaultNotification = (CommunityMessagingDefaultNotification) messagingNotification;
        11T.A0F(communityMessagingDefaultNotification, 1);
        C00i c00i = cDr.A00.A00;
        CQ5 cq5 = (CQ5) c00i.get();
        ThreadKey threadKey = communityMessagingDefaultNotification.A00;
        if (cq5.A09(threadKey)) {
            return;
        }
        String str2 = communityMessagingDefaultNotification.A05;
        int A06 = 1BL.A06(str2);
        String valueOf = String.valueOf(threadKey);
        HashMap A0u = AnonymousClass001.A0u();
        String str3 = communityMessagingDefaultNotification.A07;
        String str4 = str3 != null ? str3 : "community_messaging_open_thread";
        if (!str4.equals("community_messaging_open_thread")) {
            if (str4.equals("community_messaging_thread_list")) {
                A05 = CDr.A00(communityMessagingDefaultNotification, cDr, A0u);
            } else if (str4.equals("community_messaging_member_requests_screen")) {
                1Br.A0C(cDr.A02);
                String str5 = communityMessagingDefaultNotification.A02;
                String str6 = communityMessagingDefaultNotification.A03;
                Uri.Builder A082 = AbM.A08("fb-messenger://community");
                A082.appendQueryParameter("group_id", str6);
                A082.appendQueryParameter("community_id", str5);
                A082.appendQueryParameter(AbstractC00603o4.A00(267), "true");
                if (!"notification".isEmpty()) {
                    A082.appendQueryParameter(Property.SYMBOL_Z_ORDER_SOURCE, "notification");
                }
                A05 = 4YU.A0A("com.facebook.orca.notify.SECURE_VIEW");
                A05.setData(A082.build());
                c00i.get();
                A05.putExtra("logger", CQ5.A03(communityMessagingDefaultNotification, A0u));
                A05.putExtra("notifications_logger_model", C5e2.A01.A03(communityMessagingDefaultNotification, A0u));
                A05.putExtra("jewel_dedup_id", communityMessagingDefaultNotification.A04);
            } else {
                if (str4.equals("community_messaging_member_chat_suggestion")) {
                    1Br.A0C(cDr.A02);
                    String str7 = communityMessagingDefaultNotification.A02;
                    String str8 = communityMessagingDefaultNotification.A03;
                    A08 = AbM.A08("fb-messenger://community");
                    A08.appendQueryParameter("community_id", str7);
                    A08.appendQueryParameter("group_id", str8);
                    A08.appendQueryParameter(AbstractC00603o4.A00(ActionId.VIEW_DID_APPEAR_BEGIN), "true");
                    A08.appendQueryParameter(AbstractC00603o4.A00(5), "messenger_community_messaging:member_chat_suggestion_notification");
                    str = "com.facebook.orca.notify.SECURE_VIEW";
                } else {
                    if (str4.equals("messenger_community_chat_host_invite_screen")) {
                        if (threadKey == null) {
                            throw 1BK.A0h();
                        }
                        1Br.A0C(cDr.A02);
                        String str9 = communityMessagingDefaultNotification.A02;
                        String str10 = communityMessagingDefaultNotification.A03;
                        String str11 = communityMessagingDefaultNotification.A08;
                        if (str11 == null) {
                            str11 = "";
                        }
                        A08 = AbM.A08("fb-messenger://community");
                        A08.appendQueryParameter("community_id", str9);
                        A08.appendQueryParameter("group_id", str10);
                        A08.appendQueryParameter("thread_name", str11);
                        A08.appendQueryParameter("threadkey", threadKey.toString());
                        A08.appendQueryParameter(1BJ.A00(2039), "true");
                        A08.appendQueryParameter("from_notification", String.valueOf(true));
                    } else if (str4.equals("messenger_community_incomplete_admod_suggested_actions_v2")) {
                        if (threadKey == null) {
                            throw 1BK.A0h();
                        }
                        1Br.A0C(cDr.A02);
                        String str12 = communityMessagingDefaultNotification.A02;
                        String str13 = communityMessagingDefaultNotification.A03;
                        A08 = AbM.A08("fb-messenger://community");
                        A08.appendQueryParameter("community_id", str12);
                        A08.appendQueryParameter("group_id", str13);
                        A08.appendQueryParameter("thread_key", threadKey.toString());
                        A08.appendQueryParameter(AbstractC00603o4.A00(265), "true");
                    } else if (str4.equals("community_messaging_pending_member_chat_suggestion")) {
                        1Br.A0C(cDr.A02);
                        String str14 = communityMessagingDefaultNotification.A02;
                        String str15 = communityMessagingDefaultNotification.A03;
                        Uri.Builder A083 = AbM.A08("fb-messenger://community");
                        A083.appendQueryParameter("group_id", str15);
                        A083.appendQueryParameter("community_id", str14);
                        A083.appendQueryParameter(AbstractC00603o4.A00(266), "true");
                        if (!"notification".isEmpty()) {
                            A083.appendQueryParameter(Property.SYMBOL_Z_ORDER_SOURCE, "notification");
                        }
                        Intent A0A = 4YU.A0A("com.facebook.orca.notify.SECURE_VIEW");
                        A0A.setData(A083.build());
                        A05 = A0A.putExtra("jewel_dedup_id", communityMessagingDefaultNotification.A04);
                        11T.A0A(A05);
                    }
                    str = "android.intent.action.VIEW";
                }
                A05 = 4YU.A0A(str);
                A05.setData(A08.build());
            }
            A05.putExtra("from_notification", true);
            A05.putExtra("communityID", communityMessagingDefaultNotification.A02);
            A05.putExtra("groupID", communityMessagingDefaultNotification.A03);
            Bundle A052 = 1BK.A05();
            A052.putCharSequence("msgId", str2);
            A052.putCharSequence("threadKeyString", String.valueOf(threadKey));
            A052.putBoolean("isCommunity", true);
            ((C8f) 1Br.A0B(cDr.A01)).A00(context, A05, A052, communityMessagingDefaultNotification, valueOf, null, A06);
        }
        if (threadKey == null) {
            A05 = CDr.A00(communityMessagingDefaultNotification, cDr, AnonymousClass001.A0u());
            Bundle A0522 = 1BK.A05();
            A0522.putCharSequence("msgId", str2);
            A0522.putCharSequence("threadKeyString", String.valueOf(threadKey));
            A0522.putBoolean("isCommunity", true);
            ((C8f) 1Br.A0B(cDr.A01)).A00(context, A05, A0522, communityMessagingDefaultNotification, valueOf, null, A06);
        }
        String str16 = communityMessagingDefaultNotification.A06;
        Locale locale = Locale.US;
        11T.A0B(locale);
        String A18 = 4YU.A18(locale, str16);
        String str17 = C5ap.A1H.stringValue;
        11T.A09(str17);
        String str18 = A18.equals(4YU.A18(locale, str17)) ? "friend_joined_community_chat_notification" : "notification";
        A05 = ((4iH) 1Br.A0B(cDr.A02)).A05(threadKey, communityMessagingDefaultNotification.A02, communityMessagingDefaultNotification.A03, str18);
        A05.putExtra("prefer_chat_if_possible", false);
        c00i.get();
        A05.putExtra("logger", CQ5.A02(communityMessagingDefaultNotification, str18, A0u));
        A05.putExtra("notifications_logger_model", C5e2.A01.A05(communityMessagingDefaultNotification, A0u));
        A05.putExtra("join_behavior", communityMessagingDefaultNotification.A01);
        A05.putExtra("from_notification", true);
        A05.putExtra("communityID", communityMessagingDefaultNotification.A02);
        A05.putExtra("groupID", communityMessagingDefaultNotification.A03);
        Bundle A05222 = 1BK.A05();
        A05222.putCharSequence("msgId", str2);
        A05222.putCharSequence("threadKeyString", String.valueOf(threadKey));
        A05222.putBoolean("isCommunity", true);
        ((C8f) 1Br.A0B(cDr.A01)).A00(context, A05, A05222, communityMessagingDefaultNotification, valueOf, null, A06);
    }
}
