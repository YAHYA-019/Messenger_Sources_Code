package X;

import android.content.Context;
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
import com.facebook.orca.notify.MessagesNotificationManager;
import com.facebook.push.constants.PushProperty;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* renamed from: X.205, reason: invalid class name */
/* loaded from: 205.class */
public final class AnonymousClass205 implements AnonymousClass208 {
    public 1BY A00;
    public final C0et A01;
    public final C00i A04;
    public final C00i A06;
    public final Context A07;
    public final C00i A08;
    public final C00i A03 = new 1BQ(49168);
    public final C00i A05 = new 1BV((1BY) null, 81966);
    public final C00i A02 = new 1BV((1BY) null, 17008);

    public AnonymousClass205(1BO r302) {
        Context context = (Context) 1Bn.A0E((Context) null, (1BY) null, 83719);
        this.A07 = context;
        this.A06 = new 1HH(context, 100179);
        this.A01 = (C0et) 1Bi.A03(83604);
        this.A08 = new 1BQ(83826);
        this.A04 = new 1BV((1BY) null, 83835);
        this.A00 = new 1BY(r302);
    }

    public static C5aA A00(MessagingNotification messagingNotification, AnonymousClass205 anonymousClass205) {
        return ((C5a9) anonymousClass205.A04.get()).A00(messagingNotification);
    }

    public static MessagesNotificationManager A01(AnonymousClass205 anonymousClass205) {
        return (MessagesNotificationManager) anonymousClass205.A03.get();
    }

    public static ExecutorService A02(AnonymousClass205 anonymousClass205) {
        return (ExecutorService) anonymousClass205.A02.get();
    }

    public static boolean A03(AnonymousClass205 anonymousClass205) {
        return C0et.A0P.equals(anonymousClass205.A01);
    }

    @Override // X.AnonymousClass208
    public void AFI(String str) {
        new 4Zr(this.A06, this, str, (ExecutorService) this.A02.get()).A01();
    }

    @Override // X.AnonymousClass208
    public void AFU() {
        if (A03(this)) {
            final ExecutorService executorService = (ExecutorService) this.A02.get();
            final C00i c00i = this.A06;
            new 4Zs(c00i, executorService) { // from class: X.38f
                public static final String __redex_internal_original_name = "AsyncNotificationClient$54";

                public void A00() {
                    AnonymousClass205.A01(this).A05();
                }
            }.A01();
        }
    }

    @Override // X.AnonymousClass208
    public void AFY(final String str) {
        final ExecutorService executorService = (ExecutorService) this.A02.get();
        final C00i c00i = this.A06;
        new 4Zs(c00i, executorService) { // from class: X.6r1
            public static final String __redex_internal_original_name = "AsyncNotificationClient$50";
        }.A01();
    }

    @Override // X.AnonymousClass208
    public void AFh(ArrayList arrayList) {
        if (C0et.A0P.equals(this.A01)) {
            new 39J(this.A06, this, arrayList, (ExecutorService) this.A02.get()).A01();
        }
    }

    @Override // X.AnonymousClass208
    public void AFj(Message message) {
        new BFL(this.A06, message, this, A02(this)).A01();
    }

    @Override // X.AnonymousClass208
    public void AFn() {
        if (C0et.A0P.equals(this.A01)) {
            new BFI(this.A06, this, (ExecutorService) this.A02.get()).A01();
        }
    }

    @Override // X.AnonymousClass208
    public void AFx(ThreadKey threadKey, String str) {
        if (threadKey != null) {
            new 4Zu(this.A06, threadKey, this, str, (ExecutorService) this.A02.get()).A01();
        }
    }

    @Override // X.AnonymousClass208
    public void Bff(final BICConsentRequestNotification bICConsentRequestNotification) {
        if (A03(this)) {
            final ExecutorService A02 = A02(this);
            final C00i c00i = this.A06;
            new 4Zs(c00i, A02) { // from class: X.397
                public static final String __redex_internal_original_name = "AsyncNotificationClient$37";

                public void A00() {
                    1Fw.A08(bICConsentRequestNotification, AnonymousClass205.A01(this));
                }
            }.A01();
        }
    }

    @Override // X.AnonymousClass208
    public void Bfg(final BackgroundAccountNotification backgroundAccountNotification) {
        if (C0et.A0P.equals(this.A01)) {
            final ExecutorService executorService = (ExecutorService) this.A02.get();
            final C00i c00i = this.A06;
            new 4Zs(c00i, executorService) { // from class: X.392
                public static final String __redex_internal_original_name = "AsyncNotificationClient$31";

                public void A00() {
                    1Fw.A08(backgroundAccountNotification, AnonymousClass205.A01(this));
                }
            }.A01();
        }
    }

    @Override // X.AnonymousClass208
    public void Bfk(DirectMessageStorySeenNotification directMessageStorySeenNotification) {
        if (A03(this)) {
            new 39B(this.A06, directMessageStorySeenNotification, this, A02(this)).A01();
        }
    }

    @Override // X.AnonymousClass208
    public void Bfo(final EventReminderNotification eventReminderNotification) {
        if (A03(this)) {
            final ExecutorService A02 = A02(this);
            final C00i c00i = this.A06;
            new 4Zs(c00i, A02) { // from class: X.393
                public static final String __redex_internal_original_name = "AsyncNotificationClient$32";

                public void A00() {
                    1Fw.A08(eventReminderNotification, AnonymousClass205.A01(this));
                }
            }.A01();
        }
    }

    @Override // X.AnonymousClass208
    public void Bfp(FailedToSendMessageNotification failedToSendMessageNotification) {
        new 39O(this.A06, failedToSendMessageNotification, this, A02(this)).A01();
    }

    @Override // X.AnonymousClass208
    public void Bfq() {
        if (A03(this)) {
            final ExecutorService executorService = (ExecutorService) this.A02.get();
            final C00i c00i = this.A06;
            new 4Zs(c00i, executorService) { // from class: X.38e
                public static final String __redex_internal_original_name = "AsyncNotificationClient$34";

                public void A00() {
                    AnonymousClass205.A01(this).A06();
                }
            }.A01();
        }
    }

    @Override // X.AnonymousClass208
    public void Bfr(MontageMessageNotification montageMessageNotification) {
        if (A03(this)) {
            new 39A(this.A06, montageMessageNotification, this, A02(this)).A01();
        }
    }

    @Override // X.AnonymousClass208
    public void Bfu(final GroupCallUpdateNotification groupCallUpdateNotification) {
        if (C0et.A0P.equals(this.A01)) {
            final ExecutorService executorService = (ExecutorService) this.A02.get();
            final C00i c00i = this.A06;
            new 4Zs(c00i, executorService) { // from class: X.38u
                public static final String __redex_internal_original_name = "AsyncNotificationClient$24";

                public void A00() {
                    1Fw.A08(groupCallUpdateNotification, AnonymousClass205.A01(this));
                }
            }.A01();
        }
    }

    @Override // X.AnonymousClass208
    public void Bfv(PageIncomingCallNotification pageIncomingCallNotification) {
        if (A03(this)) {
            new 39F(this.A06, pageIncomingCallNotification, this, A02(this)).A01();
        }
    }

    @Override // X.AnonymousClass208
    public void Bfw(final SimpleMessageNotification simpleMessageNotification) {
        final ExecutorService A02 = A02(this);
        final C00i c00i = this.A06;
        new 4Zs(c00i, A02) { // from class: X.390
            public static final String __redex_internal_original_name = "AsyncNotificationClient$2";

            public void A00() {
                1Fw.A08(simpleMessageNotification, AnonymousClass205.A01(this));
            }
        }.A01();
    }

    @Override // X.AnonymousClass208
    public void Bg0(final JoinRequestNotification joinRequestNotification) {
        if (A03(this)) {
            final ExecutorService A02 = A02(this);
            final C00i c00i = this.A06;
            new 4Zs(c00i, A02) { // from class: X.391
                public static final String __redex_internal_original_name = "AsyncNotificationClient$30";

                public void A00() {
                    1Fw.A08(joinRequestNotification, AnonymousClass205.A01(this));
                }
            }.A01();
        }
    }

    @Override // X.AnonymousClass208
    public void Bg1(final LoggedOutMessageNotification loggedOutMessageNotification) {
        final ExecutorService A02 = A02(this);
        final C00i c00i = this.A06;
        new 4Zs(c00i, A02) { // from class: X.38g
            public static final String __redex_internal_original_name = "AsyncNotificationClient$10";

            public void A00() {
                AnonymousClass205.A01(this).A09(loggedOutMessageNotification);
            }
        }.A01();
    }

    @Override // X.AnonymousClass208
    public void Bg2(final MessageReactionNotification messageReactionNotification) {
        if (C0et.A0P.equals(this.A01)) {
            final ExecutorService executorService = (ExecutorService) this.A02.get();
            final C00i c00i = this.A06;
            new 4Zs(c00i, executorService) { // from class: X.395
                public static final String __redex_internal_original_name = "AsyncNotificationClient$35";

                public void A00() {
                    1Fw.A08(messageReactionNotification, AnonymousClass205.A01(this));
                }
            }.A01();
        }
    }

    @Override // X.AnonymousClass208
    public void Bg3(final MessageRequestNotification messageRequestNotification) {
        if (C0et.A0P.equals(this.A01)) {
            final ExecutorService executorService = (ExecutorService) this.A02.get();
            final C00i c00i = this.A06;
            new 4Zs(c00i, executorService) { // from class: X.38y
                public static final String __redex_internal_original_name = "AsyncNotificationClient$28";

                public void A00() {
                    AnonymousClass205.A01(this).A0C(messageRequestNotification);
                }
            }.A01();
        }
    }

    @Override // X.AnonymousClass208
    public void Bg4(MessagingNotification messagingNotification) {
        if (C0et.A0P.equals(this.A01)) {
            new BFJ(this.A06, messagingNotification, this, (ExecutorService) this.A02.get()).A01();
        }
    }

    @Override // X.AnonymousClass208
    public void Bg5(final MessengerAFSCancelationIncompleteNotification messengerAFSCancelationIncompleteNotification) {
        A00(messengerAFSCancelationIncompleteNotification, this).A00("notify_messenger_afs_cancelation_incomplete");
        final ExecutorService A02 = A02(this);
        final C00i c00i = this.A06;
        new 4Zs(c00i, A02) { // from class: X.38r
            public static final String __redex_internal_original_name = "AsyncNotificationClient$21";

            public void A00() {
                1Fw.A08(messengerAFSCancelationIncompleteNotification, AnonymousClass205.A01(this));
            }
        }.A01();
    }

    @Override // X.AnonymousClass208
    public void Bg6(final MessengerAFSLinkingBothSubscribedNotification messengerAFSLinkingBothSubscribedNotification) {
        A00(messengerAFSLinkingBothSubscribedNotification, this).A00("notify_messenger_afs_linking_both_subscribed");
        final ExecutorService A02 = A02(this);
        final C00i c00i = this.A06;
        new 4Zs(c00i, A02) { // from class: X.38l
            public static final String __redex_internal_original_name = "AsyncNotificationClient$15";

            public void A00() {
                1Fw.A08(messengerAFSLinkingBothSubscribedNotification, AnonymousClass205.A01(this));
            }
        }.A01();
    }

    @Override // X.AnonymousClass208
    public void Bg7(final MessengerAFSLinkingMultipleSubscriptionsDeferredDowngradeNotification messengerAFSLinkingMultipleSubscriptionsDeferredDowngradeNotification) {
        A00(messengerAFSLinkingMultipleSubscriptionsDeferredDowngradeNotification, this).A00("notify_messenger_afs_linking_multiple_subscription_deferred_downgrade");
        final ExecutorService A02 = A02(this);
        final C00i c00i = this.A06;
        new 4Zs(c00i, A02) { // from class: X.38p
            public static final String __redex_internal_original_name = "AsyncNotificationClient$19";

            public void A00() {
                1Fw.A08(messengerAFSLinkingMultipleSubscriptionsDeferredDowngradeNotification, AnonymousClass205.A01(this));
            }
        }.A01();
    }

    @Override // X.AnonymousClass208
    public void Bg8(final MessengerAFSLinkingMultipleSubscriptionsDeferredDowngradeNextBillingCycleNotification messengerAFSLinkingMultipleSubscriptionsDeferredDowngradeNextBillingCycleNotification) {
        A00(messengerAFSLinkingMultipleSubscriptionsDeferredDowngradeNextBillingCycleNotification, this).A00("notify_messenger_afs_linking_multiple_subscription_deferred_downgrade_next_billing_cycle");
        final ExecutorService A02 = A02(this);
        final C00i c00i = this.A06;
        new 4Zs(c00i, A02) { // from class: X.38q
            public static final String __redex_internal_original_name = "AsyncNotificationClient$20";

            public void A00() {
                1Fw.A08(messengerAFSLinkingMultipleSubscriptionsDeferredDowngradeNextBillingCycleNotification, AnonymousClass205.A01(this));
            }
        }.A01();
    }

    @Override // X.AnonymousClass208
    public void Bg9(final MessengerAFSMultipleSubscriptionVariablePricingNotification messengerAFSMultipleSubscriptionVariablePricingNotification) {
        A00(messengerAFSMultipleSubscriptionVariablePricingNotification, this).A00("notify_messenger_afs_multiple_subscription_variable_pricing");
        final ExecutorService A02 = A02(this);
        final C00i c00i = this.A06;
        new 4Zs(c00i, A02) { // from class: X.38n
            public static final String __redex_internal_original_name = "AsyncNotificationClient$17";

            public void A00() {
                1Fw.A08(messengerAFSMultipleSubscriptionVariablePricingNotification, AnonymousClass205.A01(this));
            }
        }.A01();
    }

    @Override // X.AnonymousClass208
    public void BgA(final MessengerAFSStandardUnlinkingNotification messengerAFSStandardUnlinkingNotification) {
        A00(messengerAFSStandardUnlinkingNotification, this).A00("notify_messenger_afs_standard_unlinking");
        final ExecutorService A02 = A02(this);
        final C00i c00i = this.A06;
        new 4Zs(c00i, A02) { // from class: X.38m
            public static final String __redex_internal_original_name = "AsyncNotificationClient$16";

            public void A00() {
                1Fw.A08(messengerAFSStandardUnlinkingNotification, AnonymousClass205.A01(this));
            }
        }.A01();
    }

    @Override // X.AnonymousClass208
    public void BgB(final MessengerAFSCanceledDSNotification messengerAFSCanceledDSNotification) {
        A00(messengerAFSCanceledDSNotification, this).A00("notify_messenger_afs_canceled_device_settings");
        final ExecutorService A02 = A02(this);
        final C00i c00i = this.A06;
        new 4Zs(c00i, A02) { // from class: X.38j
            public static final String __redex_internal_original_name = "AsyncNotificationClient$13";

            public void A00() {
                1Fw.A08(messengerAFSCanceledDSNotification, AnonymousClass205.A01(this));
            }
        }.A01();
    }

    @Override // X.AnonymousClass208
    public void BgC(final MessengerAFSUnlinkingDeferredDowngradeNextBillingCycleNotification messengerAFSUnlinkingDeferredDowngradeNextBillingCycleNotification) {
        A00(messengerAFSUnlinkingDeferredDowngradeNextBillingCycleNotification, this).A00("notify_messenger_afs_unlinking_deferred_downgrade_next_billing_cycle");
        final ExecutorService A02 = A02(this);
        final C00i c00i = this.A06;
        new 4Zs(c00i, A02) { // from class: X.38k
            public static final String __redex_internal_original_name = "AsyncNotificationClient$14";

            public void A00() {
                1Fw.A08(messengerAFSUnlinkingDeferredDowngradeNextBillingCycleNotification, AnonymousClass205.A01(this));
            }
        }.A01();
    }

    @Override // X.AnonymousClass208
    public void BgD(final MessengerAFSUpgradeDeviceSettingNotification messengerAFSUpgradeDeviceSettingNotification) {
        A00(messengerAFSUpgradeDeviceSettingNotification, this).A00("notify_messenger_afs_upgrade_device_setting");
        final ExecutorService A02 = A02(this);
        final C00i c00i = this.A06;
        new 4Zs(c00i, A02) { // from class: X.38o
            public static final String __redex_internal_original_name = "AsyncNotificationClient$18";

            public void A00() {
                1Fw.A08(messengerAFSUpgradeDeviceSettingNotification, AnonymousClass205.A01(this));
            }
        }.A01();
    }

    @Override // X.AnonymousClass208
    public void BgE(final MessengerAFSYouthShouldCancelSubscriptionNotification messengerAFSYouthShouldCancelSubscriptionNotification) {
        A00(messengerAFSYouthShouldCancelSubscriptionNotification, this).A00("notify_messenger_afs_youth_should_cancel_subscription");
        final ExecutorService A02 = A02(this);
        final C00i c00i = this.A06;
        new 4Zs(c00i, A02) { // from class: X.38s
            public static final String __redex_internal_original_name = "AsyncNotificationClient$22";

            public void A00() {
                1Fw.A08(messengerAFSYouthShouldCancelSubscriptionNotification, AnonymousClass205.A01(this));
            }
        }.A01();
    }

    @Override // X.AnonymousClass208
    public void BgF(final MessengerChatEncouragementNotification messengerChatEncouragementNotification) {
        A00(messengerChatEncouragementNotification, this).A00("notify_messenger_friend_online_reminder");
        final ExecutorService A02 = A02(this);
        final C00i c00i = this.A06;
        new 4Zs(c00i, A02) { // from class: X.38i
            public static final String __redex_internal_original_name = "AsyncNotificationClient$12";

            public void A00() {
                1Fw.A08(messengerChatEncouragementNotification, AnonymousClass205.A01(this));
            }
        }.A01();
    }

    @Override // X.AnonymousClass208
    public void BgG(final MessengerLivingRoomCreateNotification messengerLivingRoomCreateNotification) {
        if (A03(this)) {
            final ExecutorService A02 = A02(this);
            final C00i c00i = this.A06;
            new 4Zs(c00i, A02) { // from class: X.394
                public static final String __redex_internal_original_name = "AsyncNotificationClient$33";

                public void A00() {
                    1Fw.A08(messengerLivingRoomCreateNotification, AnonymousClass205.A01(this));
                }
            }.A01();
        }
    }

    @Override // X.AnonymousClass208
    public void BgH(final MessengerRoomInviteReminderNotification messengerRoomInviteReminderNotification) {
        if (A03(this)) {
            final ExecutorService A02 = A02(this);
            final C00i c00i = this.A06;
            new 4Zs(c00i, A02) { // from class: X.398
                public static final String __redex_internal_original_name = "AsyncNotificationClient$38";

                public void A00() {
                    MessagesNotificationManager.A03(messengerRoomInviteReminderNotification, AnonymousClass205.A01(this));
                }
            }.A01();
        }
    }

    @Override // X.AnonymousClass208
    public void BgI(final StaleNotification staleNotification) {
        C0et c0et = C0et.A0P;
        C0et c0et2 = this.A01;
        if (c0et.equals(c0et2) || C0et.A0g.equals(c0et2)) {
            final ExecutorService A02 = A02(this);
            final C00i c00i = this.A06;
            new 4Zs(c00i, A02) { // from class: X.38x
                public static final String __redex_internal_original_name = "AsyncNotificationClient$27";

                public void A00() {
                    1Fw.A08(staleNotification, AnonymousClass205.A01(this));
                }
            }.A01();
        }
    }

    @Override // X.AnonymousClass208
    public void BgJ(final UriNotification uriNotification) {
        if (A03(this)) {
            final ExecutorService A02 = A02(this);
            final C00i c00i = this.A06;
            new 4Zs(c00i, A02) { // from class: X.38w
                public static final String __redex_internal_original_name = "AsyncNotificationClient$26";

                public void A00() {
                    AnonymousClass205.A01(this).A0B(uriNotification);
                }
            }.A01();
        }
    }

    @Override // X.AnonymousClass208
    public void BgK(final MissedCallNotification missedCallNotification) {
        if (C0et.A0P.equals(this.A01)) {
            final ExecutorService executorService = (ExecutorService) this.A02.get();
            final C00i c00i = this.A06;
            new 4Zs(c00i, executorService) { // from class: X.38v
                public static final String __redex_internal_original_name = "AsyncNotificationClient$25";

                public void A00() {
                    1Fw.A08(missedCallNotification, AnonymousClass205.A01(this));
                }
            }.A01();
        }
    }

    @Override // X.AnonymousClass208
    public void BgL(MontageMessageNotification montageMessageNotification) {
        if (A03(this)) {
            new 39L(this.A06, montageMessageNotification, this, A02(this)).A01();
        }
    }

    @Override // X.AnonymousClass208
    public void BgM(MontageMessageNotification montageMessageNotification) {
        if (A03(this)) {
            new 39I(this.A06, montageMessageNotification, this, A02(this)).A01();
        }
    }

    @Override // X.AnonymousClass208
    public void BgN(MontageMessageNotification montageMessageNotification) {
        if (A03(this)) {
            new 39M(this.A06, montageMessageNotification, this, A02(this)).A01();
        }
    }

    @Override // X.AnonymousClass208
    public void BgO(MontageMessageNotification montageMessageNotification) {
        if (A03(this)) {
            new 39K(this.A06, montageMessageNotification, this, A02(this)).A01();
        }
    }

    @Override // X.AnonymousClass208
    public void BgP(final MultipleAccountsNewMessagesNotification multipleAccountsNewMessagesNotification) {
        if (C0et.A0P.equals(this.A01)) {
            final ExecutorService executorService = (ExecutorService) this.A02.get();
            final C00i c00i = this.A06;
            new 4Zs(c00i, executorService) { // from class: X.38z
                public static final String __redex_internal_original_name = "AsyncNotificationClient$29";

                public void A00() {
                    1Fw.A08(multipleAccountsNewMessagesNotification, AnonymousClass205.A01(this));
                }
            }.A01();
        }
    }

    @Override // X.AnonymousClass208
    public void BgQ(final FriendInstallNotification friendInstallNotification) {
        final ExecutorService A02 = A02(this);
        final C00i c00i = this.A06;
        new 4Zs(c00i, A02) { // from class: X.38h
            public static final String __redex_internal_original_name = "AsyncNotificationClient$11";

            public void A00() {
                AnonymousClass205.A01(this).A08(friendInstallNotification);
            }
        }.A01();
    }

    @Override // X.AnonymousClass208
    public void BgR(final NewMessageNotification newMessageNotification) {
        C5aA A00 = ((C5a9) this.A04.get()).A00(newMessageNotification);
        A00.A00("notify_new_message_async");
        if (C0et.A0g.equals(this.A01) && C1q7.A0P(newMessageNotification.A0H)) {
            A00.A02("product_is_talk_and_is_group_call_change_notif", null);
            return;
        }
        ((5Zj) this.A08.get()).A01(((MessagingNotification) newMessageNotification).A02, "ANC-notifyNewMessage", (String) null);
        final ExecutorService executorService = (ExecutorService) this.A02.get();
        final C00i c00i = this.A06;
        new 4Zs(c00i, executorService) { // from class: X.5aq
            public static final String __redex_internal_original_name = "AsyncNotificationClient$1";
        }.A01();
    }

    @Override // X.AnonymousClass208
    public void BgT(final NotesNotification notesNotification) {
        if (C0et.A0P.equals(this.A01)) {
            final ExecutorService executorService = (ExecutorService) this.A02.get();
            final C00i c00i = this.A06;
            new 4Zs(c00i, executorService) { // from class: X.396
                public static final String __redex_internal_original_name = "AsyncNotificationClient$36";

                public void A00() {
                    1Fw.A08(notesNotification, AnonymousClass205.A01(this));
                }
            }.A01();
        }
    }

    @Override // X.AnonymousClass208
    public void BgV(PageAdminIncomingCallNotification pageAdminIncomingCallNotification) {
        if (A03(this)) {
            new 39E(this.A06, pageAdminIncomingCallNotification, this, A02(this)).A01();
        }
    }

    @Override // X.AnonymousClass208
    public void BgW(final PageMessageNotification pageMessageNotification) {
        if (C0et.A0P.equals(this.A01)) {
            final ExecutorService executorService = (ExecutorService) this.A02.get();
            final C00i c00i = this.A06;
            new 4Zs(c00i, executorService) { // from class: X.399
                public static final String __redex_internal_original_name = "AsyncNotificationClient$39";

                public void A00() {
                    int i;
                    String A00;
                    MessagesNotificationManager A01 = AnonymousClass205.A01(this);
                    PageMessageNotification pageMessageNotification2 = pageMessageNotification;
                    MessagesNotificationManager.A01(1Fw.A00(), pageMessageNotification2, A01);
                    1GU.A00(A01.A02);
                    PushProperty pushProperty = ((MessagingNotification) pageMessageNotification2).A02;
                    String obj = pushProperty.A04.toString();
                    String str = pushProperty.A0A;
                    String valueOf = String.valueOf(10051);
                    if (((1Ex) A01.A04.get()).BTw()) {
                        if (((C5b6) A01.A0A.get()).A00()) {
                            MessagesNotificationManager.A03(pageMessageNotification2, A01);
                            i = pageMessageNotification2.A00 ? 1562 : 1564;
                        } else {
                            i = 1333;
                        }
                        A00 = 4YT.A00(i);
                    } else {
                        A00 = AbE.A00(71);
                    }
                    MessagesNotificationManager.A04(A01, pushProperty, obj, str, valueOf, A00);
                }
            }.A01();
        }
    }

    @Override // X.AnonymousClass208
    public void BgX(final PaymentNotification paymentNotification) {
        final ExecutorService A02 = A02(this);
        final C00i c00i = this.A06;
        new 4Zs(c00i, A02) { // from class: X.38t
            public static final String __redex_internal_original_name = "AsyncNotificationClient$23";

            public void A00() {
                AnonymousClass205.A01(this).A0A(paymentNotification);
            }
        }.A01();
    }

    @Override // X.AnonymousClass208
    public void BgY(SimpleMessageNotification simpleMessageNotification) {
        new 39N(this.A06, simpleMessageNotification, this, A02(this)).A01();
    }

    @Override // X.AnonymousClass208
    public void Bgd(RoomsSpeakeasyGenericNotification roomsSpeakeasyGenericNotification) {
        if (A03(this)) {
            new 39D(this.A06, roomsSpeakeasyGenericNotification, this, A02(this)).A01();
        }
    }

    @Override // X.AnonymousClass208
    public void Bgf(SparkArTestEffectInCallNotification sparkArTestEffectInCallNotification) {
        if (A03(this)) {
            new 39G(this.A06, sparkArTestEffectInCallNotification, this, A02(this)).A01();
        }
    }

    @Override // X.AnonymousClass208
    public void Bgi(MessengerSupportInboxNotification messengerSupportInboxNotification) {
        if (A03(this)) {
            new 39H(this.A06, messengerSupportInboxNotification, this, A02(this)).A01();
        }
    }

    @Override // X.AnonymousClass208
    public void Bgm(VideoChatLinkJoinAttemptNotification videoChatLinkJoinAttemptNotification) {
        if (A03(this)) {
            new 39C(this.A06, videoChatLinkJoinAttemptNotification, this, A02(this)).A01();
        }
    }
}
