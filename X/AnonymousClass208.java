package X;

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
import java.util.ArrayList;

/* renamed from: X.208, reason: invalid class name */
/* loaded from: 208.class */
public interface AnonymousClass208 {
    void AFI(String str);

    void AFU();

    void AFY(String str);

    void AFh(ArrayList arrayList);

    void AFj(Message message);

    void AFn();

    void AFx(ThreadKey threadKey, String str);

    void Bff(BICConsentRequestNotification bICConsentRequestNotification);

    void Bfg(BackgroundAccountNotification backgroundAccountNotification);

    void Bfk(DirectMessageStorySeenNotification directMessageStorySeenNotification);

    void Bfo(EventReminderNotification eventReminderNotification);

    void Bfp(FailedToSendMessageNotification failedToSendMessageNotification);

    void Bfq();

    void Bfr(MontageMessageNotification montageMessageNotification);

    void Bfu(GroupCallUpdateNotification groupCallUpdateNotification);

    void Bfv(PageIncomingCallNotification pageIncomingCallNotification);

    void Bfw(SimpleMessageNotification simpleMessageNotification);

    void Bg0(JoinRequestNotification joinRequestNotification);

    void Bg1(LoggedOutMessageNotification loggedOutMessageNotification);

    void Bg2(MessageReactionNotification messageReactionNotification);

    void Bg3(MessageRequestNotification messageRequestNotification);

    void Bg4(MessagingNotification messagingNotification);

    void Bg5(MessengerAFSCancelationIncompleteNotification messengerAFSCancelationIncompleteNotification);

    void Bg6(MessengerAFSLinkingBothSubscribedNotification messengerAFSLinkingBothSubscribedNotification);

    void Bg7(MessengerAFSLinkingMultipleSubscriptionsDeferredDowngradeNotification messengerAFSLinkingMultipleSubscriptionsDeferredDowngradeNotification);

    void Bg8(MessengerAFSLinkingMultipleSubscriptionsDeferredDowngradeNextBillingCycleNotification messengerAFSLinkingMultipleSubscriptionsDeferredDowngradeNextBillingCycleNotification);

    void Bg9(MessengerAFSMultipleSubscriptionVariablePricingNotification messengerAFSMultipleSubscriptionVariablePricingNotification);

    void BgA(MessengerAFSStandardUnlinkingNotification messengerAFSStandardUnlinkingNotification);

    void BgB(MessengerAFSCanceledDSNotification messengerAFSCanceledDSNotification);

    void BgC(MessengerAFSUnlinkingDeferredDowngradeNextBillingCycleNotification messengerAFSUnlinkingDeferredDowngradeNextBillingCycleNotification);

    void BgD(MessengerAFSUpgradeDeviceSettingNotification messengerAFSUpgradeDeviceSettingNotification);

    void BgE(MessengerAFSYouthShouldCancelSubscriptionNotification messengerAFSYouthShouldCancelSubscriptionNotification);

    void BgF(MessengerChatEncouragementNotification messengerChatEncouragementNotification);

    void BgG(MessengerLivingRoomCreateNotification messengerLivingRoomCreateNotification);

    void BgH(MessengerRoomInviteReminderNotification messengerRoomInviteReminderNotification);

    void BgI(StaleNotification staleNotification);

    void BgJ(UriNotification uriNotification);

    void BgK(MissedCallNotification missedCallNotification);

    void BgL(MontageMessageNotification montageMessageNotification);

    void BgM(MontageMessageNotification montageMessageNotification);

    void BgN(MontageMessageNotification montageMessageNotification);

    void BgO(MontageMessageNotification montageMessageNotification);

    void BgP(MultipleAccountsNewMessagesNotification multipleAccountsNewMessagesNotification);

    void BgQ(FriendInstallNotification friendInstallNotification);

    void BgR(NewMessageNotification newMessageNotification);

    void BgT(NotesNotification notesNotification);

    void BgV(PageAdminIncomingCallNotification pageAdminIncomingCallNotification);

    void BgW(PageMessageNotification pageMessageNotification);

    void BgX(PaymentNotification paymentNotification);

    void BgY(SimpleMessageNotification simpleMessageNotification);

    void Bgd(RoomsSpeakeasyGenericNotification roomsSpeakeasyGenericNotification);

    void Bgf(SparkArTestEffectInCallNotification sparkArTestEffectInCallNotification);

    void Bgi(MessengerSupportInboxNotification messengerSupportInboxNotification);

    void Bgm(VideoChatLinkJoinAttemptNotification videoChatLinkJoinAttemptNotification);
}
