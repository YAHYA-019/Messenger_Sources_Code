package X;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.facebook.messaging.business.bizrtc.model.PageIncomingCallNotification;
import com.facebook.messaging.business.bizrtc.model.PageMessageNotification;
import com.facebook.messaging.cowatch.notifications.MessengerLivingRoomCreateNotification;
import com.facebook.messaging.events.notifications.EventReminderNotification;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.BICConsentRequestNotification;
import com.facebook.messaging.notify.DirectMessageStorySeenNotification;
import com.facebook.messaging.notify.FailedToSendMessageNotification;
import com.facebook.messaging.notify.FriendInstallNotification;
import com.facebook.messaging.notify.JoinRequestNotification;
import com.facebook.messaging.notify.LoggedOutMessageNotification;
import com.facebook.messaging.notify.MessengerAFSCancelationIncompleteNotification;
import com.facebook.messaging.notify.MessengerAFSCanceledDSNotification;
import com.facebook.messaging.notify.MessengerAFSLinkingBothSubscribedNotification;
import com.facebook.messaging.notify.MessengerAFSLinkingMultipleSubscriptionsDeferredDowngradeNextBillingCycleNotification;
import com.facebook.messaging.notify.MessengerAFSLinkingMultipleSubscriptionsDeferredDowngradeNotification;
import com.facebook.messaging.notify.MessengerAFSMultipleSubscriptionVariablePricingNotification;
import com.facebook.messaging.notify.MessengerAFSStandardUnlinkingNotification;
import com.facebook.messaging.notify.MessengerAFSUnlinkingDeferredDowngradeNextBillingCycleNotification;
import com.facebook.messaging.notify.MessengerAFSUpgradeDeviceSettingNotification;
import com.facebook.messaging.notify.MessengerAFSYouthShouldCancelSubscriptionNotification;
import com.facebook.messaging.notify.MessengerChatEncouragementNotification;
import com.facebook.messaging.notify.MessengerRoomInviteReminderNotification;
import com.facebook.messaging.notify.MessengerSupportInboxNotification;
import com.facebook.messaging.notify.MontageMessageNotification;
import com.facebook.messaging.notify.MultipleAccountsNewMessagesNotification;
import com.facebook.messaging.notify.NotesNotification;
import com.facebook.messaging.notify.PageAdminIncomingCallNotification;
import com.facebook.messaging.notify.PaymentNotification;
import com.facebook.messaging.notify.RoomsSpeakeasyGenericNotification;
import com.facebook.messaging.notify.SimpleMessageNotification;
import com.facebook.messaging.notify.SparkArTestEffectInCallNotification;
import com.facebook.messaging.notify.StaleNotification;
import com.facebook.messaging.notify.UriNotification;
import com.facebook.messaging.notify.VideoChatLinkJoinAttemptNotification;
import com.facebook.messaging.notify.backgroundaccount.BackgroundAccountNotification;
import com.facebook.messaging.notify.type.MessageReactionNotification;
import com.facebook.messaging.notify.type.MessageRequestNotification;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.messaging.notify.type.NewMessageNotification;
import com.facebook.messaging.rtc.callstatus.notification.MissedCallNotification;
import com.facebook.messaging.rtc.groupcall.notify.GroupCallUpdateNotification;
import com.facebook.push.constants.PushProperty;
import java.util.ArrayList;

/* loaded from: Cna.class */
public final class Cna implements AnonymousClass208 {
    public 1BY A00;
    public final Context A01 = AbF.A04((1BY) null);
    public final C15h A02;
    public final C00i A03;
    public final C00i A04;
    public final 1PB A05;

    public Cna(1BO r302) {
        1BQ A02 = 1BQ.A02(16626);
        this.A04 = A02;
        this.A05 = ((1P8) A02.get()).A00("notification_instance");
        this.A02 = DBe.A00(this, 85);
        this.A03 = 1BV.A01((1BY) null, 83835);
        this.A00 = 7zL.A0Q(r302);
    }

    public static void A00(Intent intent, Cna cna) {
        ((2AG) cna.A02.get()).A00(intent, cna.A01);
    }

    public static void A01(Parcelable parcelable, Cna cna, String str) {
        Intent intent = new Intent(str);
        intent.putExtra("notification", parcelable);
        ((2AG) cna.A02.get()).A00(intent, cna.A01);
    }

    @Override // X.AnonymousClass208
    public void AFI(String str) {
        Intent A0A = 4YU.A0A("com.facebook.orca.notify.ACTION_CLEAR_ALL_NOTIFICATIONS");
        A0A.putExtra("clear_reason", str);
        try {
            ((2AF) this.A02.get()).A00(A0A, this.A01);
        } catch (Exception e) {
            0fH.A0x("MessagesNotificationClient", "Failed in sending broadcast to clear all notifications.", e);
        }
    }

    @Override // X.AnonymousClass208
    public void AFU() {
        A00(4YU.A0A("com.facebook.orca.notify.ACTION_CLEAR_FAILED_PROFILE_PICTURE_UPLOAD"), this);
    }

    @Override // X.AnonymousClass208
    public void AFY(String str) {
        Intent A0A = 4YU.A0A("com.facebook.orca.notify.ACTION_CLEAR_FRIEND_INSTALL");
        A0A.putExtra("user_id", str);
        A00(A0A, this);
    }

    @Override // X.AnonymousClass208
    public void AFh(ArrayList arrayList) {
        Intent A0A = 4YU.A0A("com.facebook.orca.notify.ACTION_CLEAR_MESSENGER_MULTIPLE_ACCOUNTS_NEW_MESSAGES");
        A0A.putStringArrayListExtra("multiple_accounts_user_ids", arrayList);
        A00(A0A, this);
    }

    @Override // X.AnonymousClass208
    public void AFj(Message message) {
        0fH.A0j("MessagesNotificationClient", "clearNotification");
    }

    @Override // X.AnonymousClass208
    public void AFn() {
        A00(4YU.A0A("com.facebook.orca.notify.ACTION_CLEAR_PAGE_ADMIN_INCOMING_CALL_NOTIFICATION"), this);
    }

    @Override // X.AnonymousClass208
    public void AFx(ThreadKey threadKey, String str) {
        Intent A0A = 4YU.A0A("com.facebook.orca.notify.ACTION_CLEAR_THREAD");
        A0A.putExtra("thread_key_string", threadKey.toString());
        A0A.putExtra("clear_reason", str);
        A00(A0A, this);
    }

    @Override // X.AnonymousClass208
    public void Bff(BICConsentRequestNotification bICConsentRequestNotification) {
        1PB r0 = this.A05;
        PushProperty pushProperty = bICConsentRequestNotification.A02;
        r0.BZR("notif_processing", 0Pz.A0W("Notify bic consent request notification via broadcast, notifId:", pushProperty == null ? null : pushProperty.A0A));
        A01(bICConsentRequestNotification, this, "com.facebook.orca.notify.ACTION_BIC_CONSENT_REQUEST_NOTIFICATION");
    }

    @Override // X.AnonymousClass208
    public void Bfg(BackgroundAccountNotification backgroundAccountNotification) {
        A01(backgroundAccountNotification, this, "com.facebook.orca.notify.ACTION_BACKGROUND_ACCOUNT");
    }

    @Override // X.AnonymousClass208
    public void Bfk(DirectMessageStorySeenNotification directMessageStorySeenNotification) {
        0fH.A0j("MessagesNotificationClient", "notifyDirectMessageStorySeenNotification");
        A01(directMessageStorySeenNotification, this, "com.facebook.orca.notify.ACTION_DIRECT_MESSAGE_STORY_SEEN_NOTIFICATION");
    }

    @Override // X.AnonymousClass208
    public void Bfo(EventReminderNotification eventReminderNotification) {
        A01(eventReminderNotification, this, "com.facebook.orca.notify.ACTION_EVENT_REMINDER");
    }

    @Override // X.AnonymousClass208
    public void Bfp(FailedToSendMessageNotification failedToSendMessageNotification) {
        A01(failedToSendMessageNotification, this, "com.facebook.orca.notify.ACTION_FAILED_SEND");
    }

    @Override // X.AnonymousClass208
    public void Bfq() {
        A00(4YU.A0A("com.facebook.orca.notify.ACTION_FAILED_SET_PROFILE_PICTURE"), this);
    }

    @Override // X.AnonymousClass208
    public void Bfr(MontageMessageNotification montageMessageNotification) {
        A01(montageMessageNotification, this, "com.facebook.orca.notify.MESSENGER_MONTAGE_FIRST_POST");
    }

    @Override // X.AnonymousClass208
    public void Bfu(GroupCallUpdateNotification groupCallUpdateNotification) {
        A01(groupCallUpdateNotification, this, "com.facebook.orca.notify.ACTION_SHOW_GROUP_CALL_UPDATE_NOTIFICATION");
    }

    @Override // X.AnonymousClass208
    public void Bfv(PageIncomingCallNotification pageIncomingCallNotification) {
        0fH.A0j("MessagesNotificationClient", "notifyIncomingPageCallNotification");
        A01(pageIncomingCallNotification, this, "com.facebook.orca.notify.ACTION_INCOMING_PAGE_CALL_NOTIFICATION");
    }

    @Override // X.AnonymousClass208
    public void Bfw(SimpleMessageNotification simpleMessageNotification) {
        A01(simpleMessageNotification, this, "com.facebook.orca.notify.ACTION_INTERNAL_MESSAGE");
    }

    @Override // X.AnonymousClass208
    public void Bg0(JoinRequestNotification joinRequestNotification) {
        A01(joinRequestNotification, this, "com.facebook.orca.notify.ACTION_MESSENGER_NEW_JOIN_REQUEST");
    }

    @Override // X.AnonymousClass208
    public void Bg1(LoggedOutMessageNotification loggedOutMessageNotification) {
        A01(loggedOutMessageNotification, this, "com.facebook.orca.notify.ACTION_LOGGED_OUT_MESSAGE");
    }

    @Override // X.AnonymousClass208
    public void Bg2(MessageReactionNotification messageReactionNotification) {
        this.A05.BZR("notif_processing", 0Pz.A0v("Notify reaction notification via broadcast, msgId:", messageReactionNotification.A02, ", notifId:", messageReactionNotification.A05));
        A01(messageReactionNotification, this, "com.facebook.orca.notify.ACTION_MESSAGE_REACTION");
    }

    @Override // X.AnonymousClass208
    public void Bg3(MessageRequestNotification messageRequestNotification) {
        this.A05.BZR("notif_processing", 0Pz.A0W("Notify message request notification via broadcast, threadKey:", 4YV.A0u(messageRequestNotification.A01)));
        A01(messageRequestNotification, this, "com.facebook.orca.notify.ACTION_MESSAGE_REQUEST");
    }

    @Override // X.AnonymousClass208
    public void Bg4(MessagingNotification messagingNotification) {
        0fH.A0j("MessagesNotificationClient", "notifyMessagingNotification");
        A01(messagingNotification, this, "com.facebook.orca.notify.ACTION_MESSAGING_NOTIFICATION");
    }

    @Override // X.AnonymousClass208
    public void Bg5(MessengerAFSCancelationIncompleteNotification messengerAFSCancelationIncompleteNotification) {
        A01(messengerAFSCancelationIncompleteNotification, this, "com.facebook.orca.notify.MSNGR_AFS_CANCELATION_INCOMPLETE_NOTIFICATION");
    }

    @Override // X.AnonymousClass208
    public void Bg6(MessengerAFSLinkingBothSubscribedNotification messengerAFSLinkingBothSubscribedNotification) {
        A01(messengerAFSLinkingBothSubscribedNotification, this, "com.facebook.orca.notify.MSNGR_AFS_LINKING_BOTH_SUBSCRIBED_NOTIFICATION");
    }

    @Override // X.AnonymousClass208
    public void Bg7(MessengerAFSLinkingMultipleSubscriptionsDeferredDowngradeNotification messengerAFSLinkingMultipleSubscriptionsDeferredDowngradeNotification) {
        A01(messengerAFSLinkingMultipleSubscriptionsDeferredDowngradeNotification, this, "com.facebook.orca.notify.MSNGR_AFS_LINKING_MULTIPLE_SUBSCRIPTION_DEFERRED_DOWNGRADE_NOTIFICATION");
    }

    @Override // X.AnonymousClass208
    public void Bg8(MessengerAFSLinkingMultipleSubscriptionsDeferredDowngradeNextBillingCycleNotification messengerAFSLinkingMultipleSubscriptionsDeferredDowngradeNextBillingCycleNotification) {
        A01(messengerAFSLinkingMultipleSubscriptionsDeferredDowngradeNextBillingCycleNotification, this, "com.facebook.orca.notify.MSNGR_AFS_LINKING_MULTIPLE_SUBSCRIPTION_DEFERRED_DOWNGRADE_NEXT_BILLING_CYCLE_NOTIFICATION");
    }

    @Override // X.AnonymousClass208
    public void Bg9(MessengerAFSMultipleSubscriptionVariablePricingNotification messengerAFSMultipleSubscriptionVariablePricingNotification) {
        A01(messengerAFSMultipleSubscriptionVariablePricingNotification, this, "com.facebook.orca.notify.MSNGR_AFS_MULTIPLE_SUBSCRIPTION_VARIABLE_PRICING_NOTIFICATION");
    }

    @Override // X.AnonymousClass208
    public void BgA(MessengerAFSStandardUnlinkingNotification messengerAFSStandardUnlinkingNotification) {
        A01(messengerAFSStandardUnlinkingNotification, this, "com.facebook.orca.notify.MSNGR_AFS_STANDARD_UNLINKING_NOTIFICATION");
    }

    @Override // X.AnonymousClass208
    public void BgB(MessengerAFSCanceledDSNotification messengerAFSCanceledDSNotification) {
        A01(messengerAFSCanceledDSNotification, this, "com.facebook.orca.notify.MSNGR_AFS_SUBSCRIPTION_CANCELED_DEVICE_SETTINGS_NOTIFICATION");
    }

    @Override // X.AnonymousClass208
    public void BgC(MessengerAFSUnlinkingDeferredDowngradeNextBillingCycleNotification messengerAFSUnlinkingDeferredDowngradeNextBillingCycleNotification) {
        A01(messengerAFSUnlinkingDeferredDowngradeNextBillingCycleNotification, this, "com.facebook.orca.notify.MSNGR_AFS_UNLINKING_DEFERRED_DOWNGRADE_NEXT_BILLING_CYCLE_NOTIFICATION");
    }

    @Override // X.AnonymousClass208
    public void BgD(MessengerAFSUpgradeDeviceSettingNotification messengerAFSUpgradeDeviceSettingNotification) {
        A01(messengerAFSUpgradeDeviceSettingNotification, this, "com.facebook.orca.notify.MSNGR_AFS_UPGRADE_DEVICE_SETTING_NOTIFICATION");
    }

    @Override // X.AnonymousClass208
    public void BgE(MessengerAFSYouthShouldCancelSubscriptionNotification messengerAFSYouthShouldCancelSubscriptionNotification) {
        A01(messengerAFSYouthShouldCancelSubscriptionNotification, this, "com.facebook.orca.notify.MSNGR_AFS_YOUTH_SHOULD_CANCEL_SUBSCRIPTION_NOTIFICATION");
    }

    @Override // X.AnonymousClass208
    public void BgF(MessengerChatEncouragementNotification messengerChatEncouragementNotification) {
        A01(messengerChatEncouragementNotification, this, "com.facebook.orca.notify.ACTION_MESSENGER_CHAT_ENCOURAGEMENT_NOTIFICATION");
    }

    @Override // X.AnonymousClass208
    public void BgG(MessengerLivingRoomCreateNotification messengerLivingRoomCreateNotification) {
        A01(messengerLivingRoomCreateNotification, this, "com.facebook.orca.notify.ACTION_LIVING_ROOM_CREATE");
    }

    @Override // X.AnonymousClass208
    public void BgH(MessengerRoomInviteReminderNotification messengerRoomInviteReminderNotification) {
        A01(messengerRoomInviteReminderNotification, this, "com.facebook.orca.notify.ACTION_ROOM_INVITE_REMINDER");
    }

    @Override // X.AnonymousClass208
    public void BgI(StaleNotification staleNotification) {
        A01(staleNotification, this, "com.facebook.orca.notify.ACTION_MESSENGER_STALE");
    }

    @Override // X.AnonymousClass208
    public void BgJ(UriNotification uriNotification) {
        A01(uriNotification, this, "com.facebook.orca.notify.ACTION_MESSENGER_PROMOTION");
    }

    @Override // X.AnonymousClass208
    public void BgK(MissedCallNotification missedCallNotification) {
        A01(missedCallNotification, this, "com.facebook.orca.notify.ACTION_MISSED_CALL");
    }

    @Override // X.AnonymousClass208
    public void BgL(MontageMessageNotification montageMessageNotification) {
        A01(montageMessageNotification, this, "com.facebook.orca.notify.MESSENGER_MONTAGE_DAILY_DIGEST");
    }

    @Override // X.AnonymousClass208
    public void BgM(MontageMessageNotification montageMessageNotification) {
        A01(montageMessageNotification, this, "com.facebook.orca.notify.MESSENGER_MONTAGE_MESSAGE_EXPIRING");
    }

    @Override // X.AnonymousClass208
    public void BgN(MontageMessageNotification montageMessageNotification) {
        A01(montageMessageNotification, this, "com.facebook.orca.notify.MONTAGE_MESSAGE_REACTION");
    }

    @Override // X.AnonymousClass208
    public void BgO(MontageMessageNotification montageMessageNotification) {
        A01(montageMessageNotification, this, "com.facebook.orca.notify.MESSENGER_MONTAGE_MESSAGE_VIEWING_STATUS");
    }

    @Override // X.AnonymousClass208
    public void BgP(MultipleAccountsNewMessagesNotification multipleAccountsNewMessagesNotification) {
        A01(multipleAccountsNewMessagesNotification, this, "com.facebook.orca.notify.ACTION_MESSENGER_MULTIPLE_ACCOUNTS_NEW_MESSAGES");
    }

    @Override // X.AnonymousClass208
    public void BgQ(FriendInstallNotification friendInstallNotification) {
        A01(friendInstallNotification, this, "com.facebook.orca.notify.ACTION_NEW_FRIEND_INSTALL");
    }

    @Override // X.AnonymousClass208
    public void BgR(NewMessageNotification newMessageNotification) {
        AbK.A0a(this.A03, newMessageNotification).A00("notify_new_message_via_broadcast");
        Message message = newMessageNotification.A0H;
        this.A05.BZR("notif_processing", 0Pz.A0F(newMessageNotification.A0G, "Notify new message notification via broadcast, msgId:", message != null ? message.A1V : null, ", notifId:"));
        A01(newMessageNotification, this, "com.facebook.orca.notify.ACTION_NEW_MESSAGE");
    }

    @Override // X.AnonymousClass208
    public void BgT(NotesNotification notesNotification) {
        1PB r0 = this.A05;
        PushProperty pushProperty = ((MessagingNotification) notesNotification).A02;
        r0.BZR("notif_processing", 0Pz.A0W("Notify notes notification via broadcast, notifId:", pushProperty == null ? null : pushProperty.A0A));
        A01(notesNotification, this, "com.facebook.orca.notify.ACTION_NOTES");
    }

    @Override // X.AnonymousClass208
    public void BgV(PageAdminIncomingCallNotification pageAdminIncomingCallNotification) {
        0fH.A0j("MessagesNotificationClient", "notifyPageAdminIncomingCallNotification");
        A01(pageAdminIncomingCallNotification, this, "com.facebook.orca.notify.ACTION_PAGE_ADMIN_INCOMING_CALL_NOTIFICATION");
    }

    @Override // X.AnonymousClass208
    public void BgW(PageMessageNotification pageMessageNotification) {
    }

    @Override // X.AnonymousClass208
    public void BgX(PaymentNotification paymentNotification) {
        A01(paymentNotification, this, "com.facebook.orca.notify.ACTION_P2P_PAYMENT");
    }

    @Override // X.AnonymousClass208
    public void BgY(SimpleMessageNotification simpleMessageNotification) {
        A01(simpleMessageNotification, this, "com.facebook.orca.notify.ACTION_PRE_REG_PUSH_MESSAGE");
    }

    @Override // X.AnonymousClass208
    public void Bgd(RoomsSpeakeasyGenericNotification roomsSpeakeasyGenericNotification) {
        0fH.A0j("MessagesNotificationClient", "notifyRoomsSpeakeasyGenericNotification");
        A01(roomsSpeakeasyGenericNotification, this, "com.facebook.orca.notify.ACTION_VIDEO_CHAT_LINK_JOIN_ATTEMPT_NOTIFICATION");
    }

    @Override // X.AnonymousClass208
    public void Bgf(SparkArTestEffectInCallNotification sparkArTestEffectInCallNotification) {
        0fH.A0j("MessagesNotificationClient", "notifySparkArTestEffectInCallNotification");
    }

    @Override // X.AnonymousClass208
    public void Bgi(MessengerSupportInboxNotification messengerSupportInboxNotification) {
        0fH.A0j("MessagesNotificationClient", "notifySupportInbox");
    }

    @Override // X.AnonymousClass208
    public void Bgm(VideoChatLinkJoinAttemptNotification videoChatLinkJoinAttemptNotification) {
        0fH.A0j("MessagesNotificationClient", "notifyVideoChatLinkJoinAttemptNotification");
        A01(videoChatLinkJoinAttemptNotification, this, "com.facebook.orca.notify.ACTION_VIDEO_CHAT_LINK_JOIN_ATTEMPT_NOTIFICATION");
    }
}
