package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.business.agent.plugins.biim.hintcard.AiAgentComposerBlockHintCardImplementation;
import com.facebook.messaging.channels.plugins.pause.adminpausedchannelhintcard.AdminPausedChannelHintCardImplementation;
import com.facebook.messaging.channels.plugins.pause.memberpausedchannelhintcard.MemberPausedChannelHintCardImplementation;
import com.facebook.messaging.communitymessaging.plugins.adminonboarding.hintcard.SendWelcomeMessageHintCardImplementation;
import com.facebook.messaging.communitymessaging.plugins.broadcastchats.listenerhintcard.CommunityBroadcastChatListenerHintCardPluginImplementation;
import com.facebook.messaging.communitymessaging.plugins.broadcastchats.speakerhintcard.CommunityBroadcastChatSpeakerHintCardPluginImplementation;
import com.facebook.messaging.communitymessaging.plugins.chatcaptain.chatcaptaincomposernux.ChatCaptainComposerNuxImplementation;
import com.facebook.messaging.communitymessaging.plugins.directinvite.hintcard.CommunityChannelDirectInviteHintCardImplementation;
import com.facebook.messaging.communitymessaging.plugins.notify.communitychannelcreation.hintcard.CommunityChannelCreationNotificationHintCardImplementation;
import com.facebook.messaging.communitymessaging.plugins.pages.hintcard.PagesAPPlusHintCardPluginImplementation;
import com.facebook.messaging.communitymessaging.plugins.participation.participationcomposer.ParticipationComposerImplementation;
import com.facebook.messaging.communitymessaging.plugins.pausechat.pausedgroupthreadhintcard.PausedGroupThreadHintCardImplementation;
import com.facebook.messaging.communitymessaging.plugins.rollcall.hintcard.CommunityMessagingRollCallHintCardPluginImpl;
import com.facebook.messaging.communitymessaging.plugins.takedowns.disabledthreadcomposer.DisabledThreadComposerImplementation;
import com.facebook.messaging.communitymessaging.plugins.threadpreview.hintcard.implementation.CommunityChannelThreadPreviewHintCardImplementation;
import com.facebook.messaging.cutover.plugins.defaulte2eecomposerblock.DefaultE2EEComposerBlockImplementation;
import com.facebook.messaging.cutover.plugins.dualthreadcutovercomposerblock.DualThreadCutoverComposerBlockImplementation;
import com.facebook.messaging.cutover.plugins.readonlycomposerblock.ReadOnlyThreadComposerBlockImplementation;
import com.facebook.messaging.gbgsolutions.plugins.automation.supporthintcard.AutomationSupportHintCardPluginImplementation;
import com.facebook.messaging.groups.plugins.groupchatupgradedtocommunity.groupchatpausedandupgradedtocommunityhintcard.GroupChatPausedAndUpgradedToCommunityHintCardImplementation;
import com.facebook.messaging.groups.plugins.leavegroup.hintcard.LeaveGroupHintCardImplementation;
import com.facebook.messaging.integrity.plugins.featurelimits.hintcard.MessengerOnlyAccountsHintCardImplementation;
import com.facebook.messaging.interop.plugins.hintcard.xacreadonly.XacReadOnlyImplementation;
import com.facebook.messaging.marketplace.plugins.marketplacefolder.hintcard.DisableMPThreadHintCardImplementation;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.nativepagereply.plugins.highmessagespersecond.hintcard.HMPSHintCardImplementation;
import com.facebook.messaging.publicchats.broadcastchats.plugins.threadview.listenerhintcard.PublicBroadcastChatListenerHintCardImplementation;
import com.facebook.messaging.publicchats.plugins.threadview.firstmessageprompthintcard.FirstMessagePromptHintCardImplementation;
import com.facebook.messaging.publicchats.plugins.threadview.messageaspagehintcard.MessageAsPageHintCardImplementation;
import com.facebook.messaging.publicchats.plugins.threadview.threadpreviewhintcard.PublicChannelsThreadPreviewHintCardImplementation;
import com.facebook.messaging.quickpromotion.chatentity.composer.plugins.hintcard.privacy.PrivacyHintCardImplementation;
import com.facebook.messaging.threadview.params.ThreadViewParams;
import com.facebook.messaging.wellbeing.enforcementfairness.plugins.hintcard.featurelimits.ReadOnlyFeatureLimitHintCardImplementation;
import com.facebook.messaging.wellbeing.selfremediation.plugins.cannotreply.hintcard.CannotReplyHintCardImplementation;
import com.facebook.messaging.wellbeing.selfremediation.restrict.plugins.hintcard.RestrictHintCardPluginImplementation;
import com.facebook.messaging.wellbeing.unknowncontact.messagerequests.plugins.invitemodel.abovecomposer.InviteModelAboveComposerBannerImplementation;
import com.facebook.messaging.wellbeing.unknowncontact.messagerequests.plugins.invitemodel.composerblock.InviteModeComposerBlockBannerImplementation;
import com.facebook.messaging.wellbeing.unknowncontact.messagerequests.plugins.mrlimit.composerblock.MrLimitComposerBlockBannerImplementation;
import com.facebook.messaging.wellbeing.unknowncontact.reachabilitycontrols.plugins.composerblock.hintcard.ComposerBlockHintCardImplementation;
import com.facebook.messaging.wellbeing.unknowncontact.scams.marketplace.plugins.hintcard.ScamMarketplaceHintCardImplementation;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* renamed from: X.6lc, reason: invalid class name */
/* loaded from: 6lc.class */
public final class C6lc {
    public AiAgentComposerBlockHintCardImplementation A00;
    public AdminPausedChannelHintCardImplementation A01;
    public MemberPausedChannelHintCardImplementation A02;
    public SendWelcomeMessageHintCardImplementation A03;
    public CommunityBroadcastChatListenerHintCardPluginImplementation A04;
    public CommunityBroadcastChatSpeakerHintCardPluginImplementation A05;
    public ChatCaptainComposerNuxImplementation A06;
    public CommunityChannelDirectInviteHintCardImplementation A07;
    public CommunityChannelCreationNotificationHintCardImplementation A08;
    public PagesAPPlusHintCardPluginImplementation A09;
    public ParticipationComposerImplementation A0A;
    public PausedGroupThreadHintCardImplementation A0B;
    public CommunityMessagingRollCallHintCardPluginImpl A0C;
    public DisabledThreadComposerImplementation A0D;
    public CommunityChannelThreadPreviewHintCardImplementation A0E;
    public DefaultE2EEComposerBlockImplementation A0F;
    public DualThreadCutoverComposerBlockImplementation A0G;
    public ReadOnlyThreadComposerBlockImplementation A0H;
    public AutomationSupportHintCardPluginImplementation A0I;
    public GroupChatPausedAndUpgradedToCommunityHintCardImplementation A0J;
    public LeaveGroupHintCardImplementation A0K;
    public MessengerOnlyAccountsHintCardImplementation A0L;
    public XacReadOnlyImplementation A0M;
    public DisableMPThreadHintCardImplementation A0N;
    public HMPSHintCardImplementation A0O;
    public C1v5 A0P;
    public PublicBroadcastChatListenerHintCardImplementation A0Q;
    public FirstMessagePromptHintCardImplementation A0R;
    public MessageAsPageHintCardImplementation A0S;
    public PublicChannelsThreadPreviewHintCardImplementation A0T;
    public PrivacyHintCardImplementation A0U;
    public ReadOnlyFeatureLimitHintCardImplementation A0V;
    public CannotReplyHintCardImplementation A0W;
    public RestrictHintCardPluginImplementation A0X;
    public InviteModelAboveComposerBannerImplementation A0Y;
    public InviteModeComposerBlockBannerImplementation A0Z;
    public MrLimitComposerBlockBannerImplementation A0a;
    public ComposerBlockHintCardImplementation A0b;
    public ScamMarketplaceHintCardImplementation A0c;
    public C1gs A0d;
    public Object A0e;
    public Object A0f;
    public Object A0g;
    public Object A0h;
    public Object A0i;
    public Object A0j;
    public Object A0k;
    public Object A0l;
    public Object A0m;
    public Object A0n;
    public Object A0o;
    public Object A0p;
    public Object A0q;
    public Object A0r;
    public Object A0s;
    public Object A0t;
    public Object A0u;
    public Object A0v;
    public Object A0w;
    public Object A0x;
    public Object A0y;
    public Object A0z;
    public Object A10;
    public Object A11;
    public Object A12;
    public Object A13;
    public Object A14;
    public Object A15;
    public Object A16;
    public Object A17;
    public Object A18;
    public Object A19;
    public Object A1A;
    public Object A1B;
    public Object A1C;
    public Object A1D;
    public Object A1E;
    public Object A1F;
    public boolean A1G;
    public final Context A1H;
    public final 06Z A1I;
    public final FbUserSession A1J;
    public final ThreadSummary A1K;
    public final 1YC A1L = 1YC.A03;
    public final 5Sl A1M;
    public final 5Sh A1N;
    public final 64W A1O;
    public final 63D A1P;
    public final ThreadViewParams A1Q;
    public final 6IV A1R;
    public final MigColorScheme A1S;
    public final User A1T;
    public final Capabilities A1U;
    public final String A1V;

    public C6lc(Context context, 06Z r303, FbUserSession fbUserSession, ThreadSummary threadSummary, 5Sl r306, 5Sh r307, 64W r308, 63D r309, ThreadViewParams threadViewParams, 6IV r311, MigColorScheme migColorScheme, User user, Capabilities capabilities, String str) {
        this.A1H = context;
        this.A1I = r303;
        this.A1V = str;
        this.A1S = migColorScheme;
        this.A1J = fbUserSession;
        this.A1K = threadSummary;
        this.A1T = user;
        this.A1M = r306;
        this.A1R = r311;
        this.A1O = r308;
        this.A1U = capabilities;
        this.A1P = r309;
        this.A1Q = threadViewParams;
        this.A1N = r307;
    }

    public static void A00(C6lc c6lc) {
        synchronized (c6lc) {
            if (!c6lc.A1G) {
                if (c6lc.A1H == null) {
                    throw AnonymousClass001.A0Q("The context passed in the HintCardInterface.newBuilder() is null.\nIf you have other questions, please post it to group Android Messenger Modularity.");
                }
                c6lc.A0P = C1v5.A01;
                c6lc.A1G = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0096 A[Catch: Exception -> 0x01ae, all -> 0x01c5, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x01ae, blocks: (B:6:0x0047, B:10:0x0051, B:13:0x005b, B:16:0x0096, B:17:0x009c, B:18:0x00a2, B:20:0x00aa, B:22:0x00b3, B:25:0x00c7, B:27:0x00ce, B:29:0x00dc, B:30:0x00e3, B:35:0x00f6, B:36:0x00fd, B:37:0x0101, B:38:0x0108, B:40:0x010d, B:41:0x0113, B:43:0x0118, B:45:0x011f, B:48:0x0131, B:49:0x0138, B:50:0x013f, B:51:0x0144, B:53:0x014b, B:55:0x0158, B:59:0x016a, B:60:0x0171, B:62:0x017a, B:65:0x0186, B:67:0x018b, B:68:0x0191, B:69:0x0195, B:69:0x0195, B:72:0x01a6, B:80:0x019f, B:82:0x01a0, B:82:0x01a0, B:84:0x0064, B:85:0x0069, B:88:0x0075, B:91:0x007d, B:93:0x008a), top: B:5:0x0047, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A01(X.C6lc r301) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6lc.A01(X.6lc):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0099 A[Catch: Exception -> 0x0167, all -> 0x017e, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0167, blocks: (B:6:0x004a, B:10:0x0054, B:13:0x005e, B:16:0x0099, B:17:0x009f, B:18:0x00a5, B:20:0x00ad, B:22:0x00b6, B:24:0x00c3, B:25:0x00c9, B:26:0x00cf, B:28:0x00d4, B:33:0x00e7, B:36:0x00f3, B:39:0x00fd, B:43:0x010b, B:46:0x0117, B:48:0x0125, B:51:0x0133, B:52:0x0139, B:54:0x0144, B:55:0x014a, B:56:0x014e, B:56:0x014e, B:59:0x015f, B:67:0x0158, B:69:0x0159, B:69:0x0159, B:71:0x0067, B:72:0x006c, B:75:0x0078, B:78:0x0080, B:80:0x008d), top: B:5:0x004a, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A02(X.C6lc r301) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6lc.A02(X.6lc):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0099 A[Catch: Exception -> 0x0147, all -> 0x015e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0147, blocks: (B:5:0x004a, B:9:0x0054, B:12:0x005e, B:15:0x0099, B:16:0x009f, B:18:0x00a8, B:19:0x00af, B:20:0x00b6, B:21:0x00bc, B:22:0x00c1, B:23:0x00c9, B:25:0x00d6, B:30:0x00e6, B:32:0x00ee, B:35:0x00f9, B:36:0x00ff, B:39:0x010a, B:40:0x0110, B:41:0x0116, B:42:0x011c, B:44:0x0127, B:45:0x012d, B:46:0x0131, B:46:0x0131, B:49:0x013f, B:55:0x0139, B:56:0x0067, B:57:0x006c, B:60:0x0078, B:63:0x0080, B:65:0x008d), top: B:4:0x004a, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A03(X.C6lc r301) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6lc.A03(X.6lc):boolean");
    }
}
