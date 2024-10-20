package com.facebook.orca.notify;

import X.0fH;
import X.1BK;
import X.1BL;
import X.1BQ;
import X.1Fw;
import X.1G2;
import X.1G3;
import X.1GU;
import X.1NK;
import X.1Od;
import X.1Ql;
import X.4YT;
import X.4YU;
import X.AbG;
import X.AbH;
import X.AbK;
import X.AbstractC02263un;
import X.AbstractC02273uo;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C00i;
import X.InterfaceC04174a7;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.FriendInstallNotification;
import com.facebook.messaging.notify.LoggedOutMessageNotification;
import com.facebook.messaging.notify.PaymentNotification;
import com.facebook.messaging.notify.UriNotification;
import com.facebook.messaging.notify.type.MessageRequestNotification;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.messaging.notify.type.NewMessageNotification;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: MessagesNotificationService.class */
public class MessagesNotificationService extends AbstractC02263un {
    public static final 1G2 A04;
    public static final 1G2 A05;
    public final C00i A00;
    public final C00i A01;
    public final C00i A02;
    public final C00i A03;

    static {
        1G2 r0 = 1NK.A24;
        A04 = 1G3.A01(r0, "debug_messenger_notificaiton_service_last_intent_action");
        A05 = 1G3.A01(r0, "debug_messenger_notificaiton_service_last_intent_timestamp");
    }

    public MessagesNotificationService() {
        super("MessagesNotificationService");
        this.A03 = 1BQ.A02(49168);
        this.A00 = 1BQ.A01();
        this.A01 = AbH.A0S();
        this.A02 = 1BQ.A02(84488);
    }

    @Override // X.AbstractC02263un
    public void A03() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC02263un
    public void A04(Intent intent) {
        MessagingNotification messagingNotification;
        String A0v;
        AbstractC02273uo.A00(this);
        if (intent == null) {
            long A09 = 1BL.A09(this.A02);
            C00i c00i = this.A01;
            1BK.A09(this.A00).D0v("MessagesNotificationServiceError", StringFormatUtil.formatStrLocaleSafe("Service was started with a null intent. Most Recent Intent's Action: %s,Time since last intent %s", 1BK.A0R(c00i).A3a(A04, "<intent not found>"), Long.valueOf(A09 - 1BL.A0A(1BK.A0R(c00i), A05))));
            return;
        }
        String action = intent.getAction();
        1Ql A0V = 1BL.A0V(this.A01);
        A0V.CaL(A04, action);
        A0V.CaH(A05, 1BL.A09(this.A02));
        A0V.commit();
        MessagesNotificationManager messagesNotificationManager = (MessagesNotificationManager) this.A03.get();
        if ("com.facebook.orca.notify.ACTION_NEW_MESSAGE".equals(action)) {
            try {
                NewMessageNotification newMessageNotification = (NewMessageNotification) intent.getParcelableExtra("notification");
                if (newMessageNotification != null) {
                    messagesNotificationManager.A0E(newMessageNotification);
                    return;
                }
                return;
            } catch (Exception e) {
                1BK.A09(this.A00).softReport("invalid_notification_parcelable", e);
                return;
            }
        }
        if (!"com.facebook.orca.notify.ACTION_FAILED_SEND".equals(action)) {
            if ("com.facebook.orca.notify.ACTION_NEW_FRIEND_INSTALL".equals(action)) {
                messagesNotificationManager.A08((FriendInstallNotification) intent.getParcelableExtra("notification"));
                return;
            }
            if ("com.facebook.orca.notify.ACTION_P2P_PAYMENT".equals(action)) {
                messagesNotificationManager.A0A((PaymentNotification) intent.getParcelableExtra("notification"));
                return;
            }
            if (!"com.facebook.orca.notify.ACTION_MISSED_CALL".equals(action)) {
                if ("com.facebook.orca.notify.ACTION_LOGGED_OUT_MESSAGE".equals(action)) {
                    messagesNotificationManager.A09((LoggedOutMessageNotification) intent.getParcelableExtra("notification"));
                    return;
                }
                if (AnonymousClass000.A00(70).equals(action)) {
                    1GU.A00(messagesNotificationManager.A02);
                    C00i c00i2 = messagesNotificationManager.A07;
                    FbSharedPreferences A0R = 1BK.A0R(c00i2);
                    1G2 r0 = MessagesNotificationManager.A0X;
                    if (1BK.A1T(A0R, r0) || ((1Od) messagesNotificationManager.A03.get()).A0F()) {
                        return;
                    }
                    AbK.A1O(1BL.A0V(c00i2), r0);
                    Context context = messagesNotificationManager.A00;
                    String string = context.getString(2131962264);
                    C00i c00i3 = messagesNotificationManager.A0B;
                    c00i3.get();
                    String string2 = context.getString(2131962261);
                    c00i3.get();
                    messagingNotification = new LoggedOutNotification(string, string2, context.getString(2131962262));
                } else {
                    if ("com.facebook.orca.notify.ACTION_CLEAR_THREAD".equals(action)) {
                        ThreadKey A0j = AbG.A0j(intent.getStringExtra("thread_key_string"));
                        String stringExtra = intent.getStringExtra("clear_reason");
                        if (A0j != null) {
                            Preconditions.checkNotNull(stringExtra, "Reason for the thread notification to be cleared must not be null");
                            messagesNotificationManager.A07(A0j, stringExtra);
                            return;
                        }
                        return;
                    }
                    if ("com.facebook.orca.notify.ACTION_CLEAR_THREAD_CLEAR_CONFERENCE_CALL".equals(action)) {
                        ThreadKey A0j2 = AbG.A0j(intent.getStringExtra("thread_key_string"));
                        if (A0j2 != null) {
                            String A00 = 4YT.A00(562);
                            Iterator A1C = AbK.A1C(messagesNotificationManager);
                            while (A1C.hasNext()) {
                                ((InterfaceC04174a7) A1C.next()).AFw(A0j2, A00);
                            }
                            return;
                        }
                        return;
                    }
                    if ("com.facebook.orca.notify.ACTION_CLEAR_FRIEND_INSTALL".equals(action)) {
                        messagesNotificationManager.A0G(intent.getStringExtra("user_id"));
                        return;
                    }
                    if ("com.facebook.orca.notify.ACTION_CLEAR_MESSENGER_MULTIPLE_ACCOUNTS_NEW_MESSAGES".equals(action)) {
                        messagesNotificationManager.A0H(intent.getStringArrayListExtra("multiple_accounts_user_ids"));
                        return;
                    }
                    if ("com.facebook.orca.notify.ACTION_CLEAR_MESSAGE_REQUEST".equals(action)) {
                        Iterator A1C2 = AbK.A1C(messagesNotificationManager);
                        while (A1C2.hasNext()) {
                            ((InterfaceC04174a7) A1C2.next()).AFe();
                        }
                        return;
                    }
                    if ("com.facebook.orca.notify.ACTION_CLEAR_MULTIPLE_MESSAGE_REQUESTS".equals(action)) {
                        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("multiple_threadkeys");
                        ImmutableList.Builder A0h = 4YU.A0h();
                        Iterator<String> it = stringArrayListExtra.iterator();
                        while (it.hasNext()) {
                            A0h.m11011add((Object) AbG.A0j(AnonymousClass001.A0i(it)));
                        }
                        ImmutableList build = A0h.build();
                        Iterator A1C3 = AbK.A1C(messagesNotificationManager);
                        while (A1C3.hasNext()) {
                            ((InterfaceC04174a7) A1C3.next()).AFf(build);
                        }
                        return;
                    }
                    if ("com.facebook.orca.notify.ACTION_CLEAR_ALL_NOTIFICATIONS".equals(action)) {
                        messagesNotificationManager.A0F(intent.getStringExtra("clear_reason"));
                        return;
                    }
                    if ("com.facebook.orca.notify.ACTION_MESSENGER_PROMOTION".equals(action)) {
                        messagesNotificationManager.A0B((UriNotification) intent.getParcelableExtra("notification"));
                        return;
                    }
                    if (!"com.facebook.orca.notify.ACTION_MESSENGER_STALE".equals(action)) {
                        if ("com.facebook.orca.notify.ACTION_MESSAGE_REQUEST".equals(action)) {
                            messagesNotificationManager.A0C((MessageRequestNotification) intent.getParcelableExtra("notification"));
                            return;
                        }
                        if (!"com.facebook.orca.notify.ACTION_INTERNAL_MESSAGE".equals(action) && !"com.facebook.orca.notify.ACTION_PRE_REG_PUSH_MESSAGE".equals(action) && !"com.facebook.orca.notify.ACTION_MESSENGER_MULTIPLE_ACCOUNTS_NEW_MESSAGES".equals(action) && !"com.facebook.orca.notify.ACTION_MESSENGER_NEW_JOIN_REQUEST".equals(action)) {
                            if ("com.facebook.orca.notify.ACTION_FACEBOOK_LOGIN".equals(action)) {
                                String stringExtra2 = intent.getStringExtra("user_id");
                                String stringExtra3 = intent.getStringExtra("user_display_name");
                                Object obj = messagesNotificationManager.A0R.get();
                                if (!1BL.A1a(messagesNotificationManager.A0Q) || Objects.equal(stringExtra2, obj)) {
                                    return;
                                }
                                1GU.A00(messagesNotificationManager.A02);
                                boolean isEmpty = TextUtils.isEmpty(stringExtra3);
                                Context context2 = messagesNotificationManager.A00;
                                if (isEmpty) {
                                    A0v = context2.getString(2131966668);
                                    0fH.A0E(MessagesNotificationManager.class, "handleFacebookLogin: userDisplayName is null");
                                } else {
                                    A0v = 1BK.A0v(context2, stringExtra3, 2131966667);
                                }
                                messagingNotification = new SwitchToFbAccountNotification(context2.getString(2131952789), A0v, context2.getString(2131966666));
                            } else {
                                if ("com.facebook.orca.notify.ACTION_CLEAR_SWITCH_TO_FB_ACCOUNT_NOTIFICATION".equals(action)) {
                                    Iterator A1C4 = AbK.A1C(messagesNotificationManager);
                                    while (A1C4.hasNext()) {
                                        ((InterfaceC04174a7) A1C4.next()).AFu();
                                    }
                                    return;
                                }
                                if (!"com.facebook.orca.notify.ACTION_BACKGROUND_ACCOUNT".equals(action)) {
                                    if (!"com.facebook.orca.notify.ACTION_EVENT_REMINDER".equals(action)) {
                                        if ("com.facebook.orca.notify.ACTION_FAILED_SET_PROFILE_PICTURE".equals(action)) {
                                            messagesNotificationManager.A06();
                                            return;
                                        }
                                        if ("com.facebook.orca.notify.ACTION_CLEAR_FAILED_PROFILE_PICTURE_UPLOAD".equals(action)) {
                                            messagesNotificationManager.A05();
                                            return;
                                        }
                                        if (!"com.facebook.orca.notify.MESSENGER_MONTAGE_FIRST_POST".equals(action) && !"com.facebook.orca.notify.MESSENGER_MONTAGE_MESSAGE_EXPIRING".equals(action) && !"com.facebook.orca.notify.MESSENGER_MONTAGE_MESSAGE_VIEWING_STATUS".equals(action) && !"com.facebook.orca.notify.MESSENGER_MONTAGE_DAILY_DIGEST".equals(action) && !"com.facebook.orca.notify.ACTION_MESSAGE_REACTION".equals(action)) {
                                            if (!"com.facebook.orca.notify.ACTION_NOTES".equals(action) && !"com.facebook.orca.notify.ACTION_BIC_CONSENT_REQUEST_NOTIFICATION".equals(action)) {
                                                if ("com.facebook.talk.notify.ACTION_TALK_NOTIFICATION".equals(action)) {
                                                    messagingNotification = (MessagingNotification) intent.getParcelableExtra("notification");
                                                    if (messagingNotification == null) {
                                                        1BK.A09(messagesNotificationManager.A06).D0v("TalkMessagingNotification - MessagesNotificationManager.notifyTalkMessage:", "null notification");
                                                        return;
                                                    }
                                                    MessagesNotificationManager.A01(1Fw.A00(), messagingNotification, messagesNotificationManager);
                                                    1GU.A00(messagesNotificationManager.A02);
                                                } else if (!"com.facebook.orca.notify.ACTION_LIVING_ROOM_CREATE".equals(action)) {
                                                    if (!"com.facebook.orca.notify.ACTION_VIDEO_CHAT_LINK_JOIN_ATTEMPT_NOTIFICATION".equals(action)) {
                                                        if ("com.facebook.orca.notify.ACTION_MESSAGING_NOTIFICATION".equals(action)) {
                                                            messagesNotificationManager.A0D((MessagingNotification) intent.getParcelableExtra("notification"));
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    messagingNotification = (MessagingNotification) intent.getParcelableExtra("notification");
                                                }
                                            }
                                        }
                                    }
                                }
                                messagingNotification = (MessagingNotification) intent.getParcelableExtra("notification");
                                if (messagingNotification == null) {
                                    return;
                                }
                                MessagesNotificationManager.A01(1Fw.A00(), messagingNotification, messagesNotificationManager);
                                1GU.A00(messagesNotificationManager.A02);
                            }
                        }
                    }
                }
                MessagesNotificationManager.A03(messagingNotification, messagesNotificationManager);
            }
        }
        messagingNotification = (MessagingNotification) intent.getParcelableExtra("notification");
        MessagesNotificationManager.A01(1Fw.A00(), messagingNotification, messagesNotificationManager);
        1GU.A00(messagesNotificationManager.A02);
        MessagesNotificationManager.A03(messagingNotification, messagesNotificationManager);
    }
}
