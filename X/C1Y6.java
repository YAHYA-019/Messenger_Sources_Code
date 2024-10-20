package X;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.Spannable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.litho.LithoView;
import com.facebook.messaging.appointments.plugins.consumerbooking.titlebarbutton.ThreadTitleBarPageAppointmentButton;
import com.facebook.messaging.attachments.ImageAttachmentData;
import com.facebook.messaging.bump.plugins.bump.bumpmessagerowsupplier.BumpMessageRowSupplierImplementation;
import com.facebook.messaging.business.bmcconversionfoundations.buyerviewcatalog.plugins.entrypoint.threadviewbutton.BuyerViewCatalogButton;
import com.facebook.messaging.business.inboxads.plugins.inboxads.itemlistprocessor.InboxAdsItemListProcessorImplementation;
import com.facebook.messaging.business.plugins.p2bdifferentiation.titlebarsubtitlecomponent.BusinessChatTitleBarSubtitleComponentImpl;
import com.facebook.messaging.communitymessaging.plugins.analytics.impressiontracker.CommunityMessagingImpressionTracker;
import com.facebook.messaging.communitymessaging.plugins.broadcastchats.threadview.subtitle.CommunityBroadcastChatSpeakerThreadViewSubtitle;
import com.facebook.messaging.communitymessaging.plugins.channelinvite.threadviewtitlebarchannelinvitebutton.ThreadViewTitleBarChannelInviteButtonImplementation;
import com.facebook.messaging.communitymessaging.plugins.channellist.threaditemcta.CommunityChannelThreadItemCTA;
import com.facebook.messaging.communitymessaging.plugins.events.threadview.EventsThreadViewSubtitle;
import com.facebook.messaging.communitymessaging.plugins.folder.switchfoldersandactivenowininbox.SwitchFoldersAndActiveNowInInboxImplementation;
import com.facebook.messaging.communitymessaging.plugins.inboxupsells.itemlistprocessor.CcInboxUpsellsItemListProcessor;
import com.facebook.messaging.communitymessaging.plugins.inboxupsells.threaditemcta.CcInboxUpsellsThreadItemCTA;
import com.facebook.messaging.communitymessaging.plugins.privatechats.threadview.subtitle.PrivateChatThreadViewSubtitle;
import com.facebook.messaging.communitymessaging.plugins.threadview.communitychatthreadviewscrolllistener.CommunityChatThreadViewScrollListenerImplementation;
import com.facebook.messaging.communitymessaging.plugins.threadview.communitychattitlebarsubtitle.CommunityChatTitleBarSubtitleImplementation;
import com.facebook.messaging.communitymessaging.plugins.threadview.communityname.CommunityNameThreadViewSubtitle;
import com.facebook.messaging.communitymessaging.plugins.threadviewbutton.plugins.notificationcontrol.implementation.NotificationControlButton;
import com.facebook.messaging.communitymessaging.threadedreplies.plugins.threadviewsubtitle.sidechatthreadviewsubtitle.SidechatThreadviewSubtitleImplementation;
import com.facebook.messaging.communitymessaging.threadedreplies.plugins.titlebarbutton.options.ThreadedRepliesTitleBarOptionsButtonImpl;
import com.facebook.messaging.communitymessaging.threadedreplies.plugins.titlebarbutton.subthreadlistbutton.SubThreadListButton;
import com.facebook.messaging.data.communitymessaging.memberlist.model.CommunityMemberListSource;
import com.facebook.messaging.dialog.MenuDialogParams;
import com.facebook.messaging.events.plugins.threadview.eventssubtitle.EventsSubtitleImplementation;
import com.facebook.messaging.followup.plugins.impressiontracker.followup.InboxFollowupImpressionTracker;
import com.facebook.messaging.forward.plugins.forward.highlyforwardedmessageindicator.MessageHighlyForwardIndicatorDecoration;
import com.facebook.messaging.friending.plugins.inboxunit.itemsprocessor.PeopleYouMayKnowItemProcessor;
import com.facebook.messaging.highlightstab.immersivecolorschemes.HTImmersiveFixedColorScheme;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.messaging.inbox.units.InboxTrackableItem;
import com.facebook.messaging.inbox.units.StaticUnitConfig;
import com.facebook.messaging.inboxsubtabs.plugins.subtabs.itemlistprocessor.InboxSubtabsItemlistprocessorImplementation;
import com.facebook.messaging.magicwords.plugins.consumption.spannable.MagicWordMessageSpannable;
import com.facebook.messaging.model.messages.AdminMessageCta;
import com.facebook.messaging.model.messages.GenericAdminMessageInfo;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadCustomization;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.montage.model.MontageBucketPreview;
import com.facebook.messaging.msys.thread.admin.plugins.actiongetter.sharedalbums.SharedAlbumAdditionAction;
import com.facebook.messaging.nativepagereply.plugins.biimthreadactionsystem.entrypoint.TASEntrypointButton;
import com.facebook.messaging.nativepagereply.plugins.biimthreadactionsystem.threadsubtitle.TasLabelSubtitleComponent;
import com.facebook.messaging.nativepagereply.plugins.filters.filtersegmentedcontrolitemprocessor.FilterSegmentedControlItemProcessor;
import com.facebook.messaging.navigation.home.drawer.model.DrawerFolderKey;
import com.facebook.messaging.navigation.plugins.communities.communitiesdrawerfragmentcreator.CommunitiesDrawerFragmentCreatorImplementation;
import com.facebook.messaging.navigation.plugins.travel.traveldrawerfragmentcreator.TravelDrawerFragmentCreatorImplementation;
import com.facebook.messaging.newfriendbump.plugins.positionedthreads.inboxitemsprocessor.NewFriendBumpInboxItemsProcessor;
import com.facebook.messaging.polling.datamodels.PollingPublishedOption;
import com.facebook.messaging.polling.plugins.interfaces.polldetailsdata.PollDetailsDataInterfaceSpec$DataSourceOverride;
import com.facebook.messaging.polling.plugins.interfaces.pollmutation.PollMutationHandlerInterfaceSpec$MutationHandlerOverride;
import com.facebook.messaging.polling.plugins.interfaces.pollvoterslistdata.PollVotersListDataProviderInterfaceSpec$DataSourceOverride;
import com.facebook.messaging.polling.plugins.upsell.spannable.PollUpsellSpannable;
import com.facebook.messaging.presence.plugins.core.communitythreadsubtitle.CommunityPresenceThreadSubtitle;
import com.facebook.messaging.presence.plugins.core.threadsubtitle.PresenceSubtitleTextKotlin;
import com.facebook.messaging.profile.plugins.contactmenu.viewprofileimplementation.ViewProfileImplementation;
import com.facebook.messaging.publicchats.broadcastchats.plugins.threadview.threadsubtitle.DiscoverablePublicBroadcastChatSubtitle;
import com.facebook.messaging.publicchats.plugins.threadview.threadtitle.ThreadSubtitleImplementation;
import com.facebook.messaging.publicchats.plugins.threadview.threadviewbutton.NotificationButtonImplementation;
import com.facebook.messaging.publicchats.plugins.threadview.threadviewbutton.reportbeforejoiningbutton.ReportBeforeJoiningButtonImplementation;
import com.facebook.messaging.publicchats.plugins.threadview.threadviewbutton.sharebutton.BroadcastChannelShareButtonImplementation;
import com.facebook.messaging.rtc.plugins.threadviewbutton.calloptions.implementation.CallOptionsButtonImplementation;
import com.facebook.messaging.rtc.plugins.threadviewbutton.callrequest.implementation.BICCallRequestButton;
import com.facebook.messaging.rtc.plugins.threadviewbutton.joincall.implementation.JoinCallButtonImplementation;
import com.facebook.messaging.rtc.plugins.threadviewbutton.videocalling.implementation.VideoCallingButtonImplementation;
import com.facebook.messaging.rtc.plugins.threadviewbutton.voip.implementation.VoipButtonImplementation;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.messaging.threadsettings.plugins.threadviewentrypoint.implementation.ThreadSettingsButtonImplementation;
import com.facebook.messaging.threadview.params.ThreadViewParams;
import com.facebook.messaging.threadview.plugins.defaults.usertileview.UserTileViewImplementation;
import com.facebook.messaging.threadview.plugins.interfaceextensions.loadmorerows.MsysLoadMoreRowsImplementation;
import com.facebook.messaging.threadview.plugins.interfaceextensions.sendercontext.transition.SenderContextTransition;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;
import com.facebook.messaging.threadview.surfaceoptions.model.ThreadViewSurfaceOptions;
import com.facebook.messaging.tincan.tincanoverwamsys.plugins.dozemode.dozemode.AdvancedCryptoTransportDozeModeHandlerImplementation;
import com.facebook.messaging.wellbeing.selfremediation.block.plugins.interfaces.blockmemberlistdata.BlockGroupMembersDataProviderInterfaceSpec$BlockMembersDataOverride;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.presence.api.model.RichStatus;
import com.facebook.presence.note.plugins.mention.spannable.NoteMentionSpannable;
import com.facebook.presence.plugins.status.threadsubtitle.StatusThreadSubtitle;
import com.facebook.stickers.model.Sticker;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;
import com.facebook.xapp.messaging.threadview.theme.custom.model.CompositeThreadThemeInfo;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemePayloadMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1Y6, reason: invalid class name */
/* loaded from: 1Y6.class */
public abstract class C1Y6 {
    public static int A00 = 1;
    public static String[] A01;
    public static final Object A02 = new Object();
    public static final Object A03 = new Object();
    public static final AtomicInteger A04 = new AtomicInteger();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Object A00(final Context context, String str, final String str2, Object[] objArr) {
        Object bar;
        switch (str.hashCode()) {
            case -2122262179:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_message_decorations_MessageDecorationInterfaceSpec")) {
                    AnonymousClass622 anonymousClass622 = (AnonymousClass622) objArr[0];
                    5zD r0 = (5zD) objArr[2];
                    06Z r02 = (06Z) objArr[3];
                    2S4 r03 = (2S4) objArr[4];
                    64I r04 = (64I) objArr[5];
                    bar = new 6nM(context, r02, (FbUserSession) objArr[7], r03, r0, (C62u) objArr[6], r04, anonymousClass622, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -2110946608:
                if (str.equals("com_facebook_messaging_threadlist_plugins_interfaces_listobserver_ThreadListObserverInterfaceSpec")) {
                    bar = new 2Vm(context, (FbUserSession) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -2096469517:
                if (str.equals("com_facebook_messaging_navigation_plugins_interfaces_armadillothreadviewlauncher_ArmadilloThreadViewLauncherSpec")) {
                    bar = new 2Mx(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -2050926854:
                if (str.equals("com_facebook_messaging_msys_thread_plugins_interfaces_composer_button_ComposerButtonInterfaceSpec")) {
                    bar = new 7DP(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -2047044413:
                if (str.equals("com_facebook_messaging_communitymessaging_plugins_interfaces_channeleditingcontent_ChannelEditingContentInterfaceSpec")) {
                    bar = new BaR(context, (Context) objArr[0], str2, ((Boolean) objArr[1]).booleanValue());
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -2037920036:
                if (str.equals("com_facebook_messaging_composer_plugins_interfaces_lifecycle_ComposerLifecycleInterfaceSpec")) {
                    2S4 r05 = (2S4) objArr[0];
                    6Qf r06 = (6Qf) objArr[1];
                    6QZ r07 = (6QZ) objArr[2];
                    6Qb r08 = (6Qb) objArr[3];
                    6Qc r09 = (6Qc) objArr[4];
                    bar = new 6RG(context, (06Z) objArr[5], (LifecycleOwner) objArr[7], (FbUserSession) objArr[8], r05, r09, r07, r08, r06, (53U) objArr[6], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -2003540065:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_rowitemgrouping_RowItemGroupingInterfaceSpec")) {
                    bar = new C60n(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1990505911:
                if (str.equals("com_facebook_messaging_search_messages_plugins_interfaces_threadviewopener_ThreadViewOpenerInterfaceSpec")) {
                    ImmutableList immutableList = (ImmutableList) objArr[1];
                    ThreadKey threadKey = (ThreadKey) objArr[2];
                    String str3 = (String) objArr[3];
                    String str4 = (String) objArr[4];
                    bar = new KeY(context, (1pK) objArr[6], threadKey, immutableList, (Long) objArr[5], str2, str3, str4);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1990498851:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_titlebar_subtitle_TitleBarSubtitleSpec")) {
                    final UserKey userKey = (UserKey) objArr[0];
                    final User user = (User) objArr[1];
                    final Capabilities capabilities = (Capabilities) objArr[2];
                    final ThreadSummary threadSummary = (ThreadSummary) objArr[3];
                    final 2Sh r010 = (2Sh) objArr[4];
                    final 2S4 r011 = (2S4) objArr[5];
                    final FbUserSession fbUserSession = (FbUserSession) objArr[6];
                    bar = new Object(context, fbUserSession, r011, threadSummary, user, userKey, capabilities, r010, str2) { // from class: X.6kh
                        public final C6ki A00;

                        /* JADX WARN: Type inference failed for: r0v7, types: [X.6ki] */
                        {
                            if (!str2.equals("All")) {
                                throw 1BL.A0l(str2);
                            }
                            this.A00 = new Object(context, fbUserSession, r011, threadSummary, user, userKey, capabilities, r010) { // from class: X.6ki
                                public CommunityBroadcastChatSpeakerThreadViewSubtitle A01;
                                public EventsThreadViewSubtitle A02;
                                public PrivateChatThreadViewSubtitle A03;
                                public CommunityNameThreadViewSubtitle A04;
                                public SidechatThreadviewSubtitleImplementation A05;
                                public EventsSubtitleImplementation A06;
                                public CommunityPresenceThreadSubtitle A07;
                                public PresenceSubtitleTextKotlin A08;
                                public DiscoverablePublicBroadcastChatSubtitle A09;
                                public ThreadSubtitleImplementation A0A;
                                public StatusThreadSubtitle A0B;
                                public int[] A0C;
                                public Object A0D;
                                public Object A0E;
                                public Object A0F;
                                public Object A0G;
                                public Object A0H;
                                public Object A0I;
                                public Object A0J;
                                public Object A0K;
                                public Object A0L;
                                public Object A0M;
                                public Object A0N;
                                public Object A0O;
                                public Object A0P;
                                public Object A0Q;
                                public final Context A0R;
                                public final 2S4 A0S;
                                public final ThreadSummary A0T;
                                public final User A0V;
                                public final UserKey A0W;
                                public final 2Sh A0X;
                                public final FbUserSession A0Y;
                                public final Capabilities A0Z;
                                public int A00 = -1;
                                public final 1YC A0U = 1YC.A03;

                                {
                                    this.A0R = context;
                                    this.A0W = userKey;
                                    this.A0V = user;
                                    this.A0Z = capabilities;
                                    this.A0T = threadSummary;
                                    this.A0X = r010;
                                    this.A0S = r011;
                                    this.A0Y = fbUserSession;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:20:0x0113  */
                                /* JADX WARN: Removed duplicated region for block: B:23:0x0080 A[Catch: Exception -> 0x00cb, all -> 0x00e2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00cb, blocks: (B:5:0x0043, B:6:0x0048, B:9:0x0054, B:12:0x005c, B:15:0x0078, B:17:0x00c3, B:23:0x0080, B:26:0x0089, B:30:0x009a, B:31:0x00a1, B:33:0x00af, B:36:0x00bd, B:38:0x0069), top: B:4:0x0043, outer: #0 }] */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A00(X.C6ki r301) {
                                    /*
                                        Method dump skipped, instructions count: 319
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C6ki.A00(X.6ki):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:15:0x0075 A[Catch: Exception -> 0x00b9, all -> 0x00d0, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00b9, blocks: (B:5:0x0043, B:6:0x0048, B:9:0x0054, B:12:0x005c, B:15:0x0075, B:18:0x0080, B:21:0x008c, B:22:0x0092, B:24:0x0099, B:25:0x009f, B:26:0x00a3, B:26:0x00a3, B:29:0x00b1, B:35:0x00ab, B:37:0x0069), top: B:4:0x0043, outer: #0 }] */
                                /* JADX WARN: Removed duplicated region for block: B:32:0x0101  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A01(X.C6ki r301) {
                                    /*
                                        Method dump skipped, instructions count: 298
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C6ki.A01(X.6ki):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:16:0x0075 A[Catch: Exception -> 0x0105, all -> 0x011c, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0105, blocks: (B:6:0x0043, B:7:0x0048, B:10:0x0054, B:13:0x005c, B:16:0x0075, B:17:0x007b, B:20:0x008a, B:21:0x0090, B:26:0x00ac, B:27:0x00b1, B:32:0x00c1, B:35:0x00cb, B:36:0x00d1, B:39:0x00db, B:41:0x00e2, B:42:0x00e8, B:43:0x00ec, B:43:0x00ec, B:46:0x00fd, B:54:0x00f6, B:57:0x00f7, B:57:0x00f7, B:60:0x0069), top: B:5:0x0043, outer: #3 }] */
                                /* JADX WARN: Removed duplicated region for block: B:49:0x014d  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A02(X.C6ki r301) {
                                    /*
                                        Method dump skipped, instructions count: 374
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C6ki.A02(X.6ki):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:15:0x0075 A[Catch: Exception -> 0x00b9, all -> 0x00d0, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00b9, blocks: (B:5:0x0043, B:6:0x0048, B:9:0x0054, B:12:0x005c, B:15:0x0075, B:18:0x0080, B:21:0x008c, B:22:0x0092, B:24:0x0099, B:25:0x009f, B:26:0x00a3, B:26:0x00a3, B:29:0x00b1, B:35:0x00ab, B:37:0x0069), top: B:4:0x0043, outer: #0 }] */
                                /* JADX WARN: Removed duplicated region for block: B:32:0x0101  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A03(X.C6ki r301) {
                                    /*
                                        Method dump skipped, instructions count: 298
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C6ki.A03(X.6ki):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:15:0x0078 A[Catch: Exception -> 0x00dc, all -> 0x00f3, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00dc, blocks: (B:5:0x0046, B:6:0x004b, B:9:0x0057, B:12:0x005f, B:15:0x0078, B:18:0x0083, B:19:0x0089, B:23:0x0099, B:24:0x009f, B:25:0x00a4, B:28:0x00af, B:30:0x00b4, B:31:0x00ba, B:32:0x00be, B:32:0x00be, B:35:0x00d4, B:42:0x00ce, B:44:0x006c), top: B:4:0x0046, outer: #0 }] */
                                /* JADX WARN: Removed duplicated region for block: B:38:0x0124  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A04(X.C6ki r301) {
                                    /*
                                        Method dump skipped, instructions count: 333
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C6ki.A04(X.6ki):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:15:0x00b9 A[Catch: Exception -> 0x0114, all -> 0x012b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0114, blocks: (B:5:0x0046, B:6:0x004b, B:9:0x0057, B:12:0x005f, B:15:0x00b9, B:18:0x00c4, B:19:0x00ca, B:22:0x00d5, B:24:0x00da, B:25:0x00e0, B:26:0x00e4, B:26:0x00e4, B:29:0x00f2, B:34:0x00ec, B:35:0x0068, B:40:0x00aa, B:40:0x00aa, B:42:0x00ae, B:43:0x0077, B:45:0x0089, B:53:0x00a5, B:61:0x0101, B:63:0x010c, B:65:0x0113), top: B:4:0x0046, outer: #2 }] */
                                /* JADX WARN: Removed duplicated region for block: B:32:0x015c  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A05(X.C6ki r301) {
                                    /*
                                        Method dump skipped, instructions count: 389
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C6ki.A05(X.6ki):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:15:0x0078 A[Catch: Exception -> 0x00c9, all -> 0x00e0, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00c9, blocks: (B:5:0x0046, B:6:0x004b, B:9:0x0057, B:12:0x005f, B:15:0x0078, B:18:0x0081, B:21:0x008c, B:24:0x0099, B:27:0x00a6, B:30:0x00b3, B:32:0x00c1, B:38:0x00bb, B:40:0x006c), top: B:4:0x0046, outer: #0 }] */
                                /* JADX WARN: Removed duplicated region for block: B:35:0x0111  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A06(X.C6ki r301) {
                                    /*
                                        Method dump skipped, instructions count: 317
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C6ki.A06(X.6ki):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:15:0x0078 A[Catch: Exception -> 0x00ee, all -> 0x0105, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ee, blocks: (B:5:0x0046, B:6:0x004b, B:9:0x0057, B:12:0x005f, B:15:0x0078, B:16:0x007e, B:18:0x0086, B:20:0x0091, B:21:0x0097, B:22:0x009e, B:27:0x00ba, B:30:0x00c7, B:31:0x00cd, B:33:0x00d6, B:34:0x00dc, B:35:0x00e0, B:35:0x00e0, B:38:0x00e6, B:44:0x00b2, B:46:0x006c), top: B:4:0x0046, outer: #1 }] */
                                /* JADX WARN: Removed duplicated region for block: B:41:0x0136  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A07(X.C6ki r301) {
                                    /*
                                        Method dump skipped, instructions count: 354
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C6ki.A07(X.6ki):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:15:0x0078 A[Catch: Exception -> 0x00b8, all -> 0x00cf, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00b8, blocks: (B:5:0x0046, B:6:0x004b, B:9:0x0057, B:12:0x005f, B:15:0x0078, B:16:0x007d, B:18:0x0085, B:21:0x009e, B:24:0x00aa, B:26:0x00b0, B:32:0x0090, B:34:0x006c), top: B:4:0x0046, outer: #2 }] */
                                /* JADX WARN: Removed duplicated region for block: B:29:0x0100  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A08(X.C6ki r301) {
                                    /*
                                        Method dump skipped, instructions count: 300
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C6ki.A08(X.6ki):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:15:0x0078 A[Catch: Exception -> 0x0150, all -> 0x0167, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0150, blocks: (B:5:0x0046, B:6:0x004b, B:9:0x0057, B:12:0x005f, B:15:0x0078, B:16:0x007e, B:18:0x008b, B:20:0x0094, B:23:0x009e, B:27:0x00af, B:28:0x00b5, B:29:0x00ba, B:33:0x00cd, B:34:0x00d3, B:35:0x00d8, B:39:0x00e8, B:40:0x00ee, B:41:0x00f3, B:42:0x00f8, B:43:0x00fd, B:44:0x0105, B:46:0x0113, B:49:0x0121, B:50:0x0127, B:52:0x0130, B:53:0x0136, B:54:0x013a, B:54:0x013a, B:57:0x0148, B:63:0x0142, B:65:0x006c), top: B:4:0x0046, outer: #1 }] */
                                /* JADX WARN: Removed duplicated region for block: B:60:0x0198  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A09(X.C6ki r301) {
                                    /*
                                        Method dump skipped, instructions count: 452
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C6ki.A09(X.6ki):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:33:0x0110  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A0A(X.C6ki r301) {
                                    /*
                                        Method dump skipped, instructions count: 313
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C6ki.A0A(X.6ki):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:20:0x0102  */
                                /* JADX WARN: Removed duplicated region for block: B:23:0x0083 A[Catch: Exception -> 0x00ba, all -> 0x00d1, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ba, blocks: (B:5:0x0046, B:6:0x004b, B:9:0x0057, B:12:0x005f, B:15:0x007b, B:17:0x00b2, B:23:0x0083, B:24:0x0089, B:27:0x0095, B:28:0x009b, B:30:0x00a2, B:31:0x00a8, B:32:0x00ac, B:32:0x00ac, B:35:0x006c), top: B:4:0x0046, outer: #0 }] */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A0B(X.C6ki r301) {
                                    /*
                                        Method dump skipped, instructions count: 299
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C6ki.A0B(X.6ki):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:20:0x0102  */
                                /* JADX WARN: Removed duplicated region for block: B:23:0x0083 A[Catch: Exception -> 0x00ba, all -> 0x00d1, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ba, blocks: (B:5:0x0046, B:6:0x004b, B:9:0x0057, B:12:0x005f, B:15:0x007b, B:17:0x00b2, B:23:0x0083, B:24:0x0089, B:27:0x0095, B:28:0x009b, B:30:0x00a2, B:31:0x00a8, B:32:0x00ac, B:32:0x00ac, B:35:0x006c), top: B:4:0x0046, outer: #0 }] */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A0C(X.C6ki r301) {
                                    /*
                                        Method dump skipped, instructions count: 299
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C6ki.A0C(X.6ki):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:15:0x0078 A[Catch: Exception -> 0x00c6, all -> 0x00dd, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00c6, blocks: (B:5:0x0046, B:6:0x004b, B:9:0x0057, B:12:0x005f, B:15:0x0078, B:17:0x0083, B:18:0x0089, B:19:0x008e, B:22:0x0099, B:23:0x009f, B:25:0x00a6, B:26:0x00ac, B:27:0x00b0, B:27:0x00b0, B:30:0x00be, B:36:0x00b8, B:38:0x006c), top: B:4:0x0046, outer: #2 }] */
                                /* JADX WARN: Removed duplicated region for block: B:33:0x010e  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A0D(X.C6ki r301) {
                                    /*
                                        Method dump skipped, instructions count: 311
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C6ki.A0D(X.6ki):boolean");
                                }
                            };
                        }
                    };
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1963313122:
                if (str.equals("com_facebook_messaging_msys_thread_plugins_interfaces_actionhandler_CallToActionHandlerInterfaceSpec")) {
                    6tF r012 = (6tF) objArr[0];
                    ThreadKey threadKey2 = (ThreadKey) objArr[1];
                    bar = new Bao(context, (FbUserSession) objArr[3], (1pK) objArr[2], threadKey2, r012, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1959059565:
                if (str.equals("com_facebook_messaging_notify_plugins_interfaces_notificationeventlistener_NotificationEventListenerInterfaceSpec")) {
                    bar = new C4Dn(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1930892135:
                if (str.equals("com_facebook_messaging_inboxfolders_plugins_interfaces_profilepicture_FoldersFragmentProfileImageClickHandlerInterfaceSpec")) {
                    ParcelableSecondaryData parcelableSecondaryData = (ParcelableSecondaryData) objArr[0];
                    bar = new Bam(context, (FbUserSession) objArr[3], (1pI) objArr[1], (ThreadKey) objArr[2], parcelableSecondaryData, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1907571464:
                if (str.equals("com_facebook_messaging_montage_composer_plugins_interfaces_fbpendingstory_MontageFbPendingStoriesHelperSpec")) {
                    bar = new Object(context, str2) { // from class: X.7nO
                        public final 7rM A00;

                        {
                            if (!str2.equals("All")) {
                                throw 1BL.A0l(str2);
                            }
                            this.A00 = new 7rM(context);
                        }
                    };
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1890413186:
                if (str.equals("com_facebook_messaging_inboxfolders_plugins_interfaces_bottomsheet_FoldersBottomSheetInterfaceSpec")) {
                    2SI r013 = (2SI) objArr[0];
                    bar = new 3Ii(context, (06Z) objArr[1], (ThreadKey) objArr[2], (2MX) objArr[4], r013, (ParcelableSecondaryData) objArr[3], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1878750547:
                if (str.equals("com_facebook_messaging_communitymessaging_plugins_interfaces_manageinboxitemactions_ManageInboxItemActionsInterfaceSpec")) {
                    1pI r014 = (1pI) objArr[0];
                    06Z r015 = (06Z) objArr[1];
                    ThreadSummary threadSummary2 = (ThreadSummary) objArr[2];
                    bar = new BaX(context, r015, (FbUserSession) objArr[4], (CallerContext) objArr[3], r014, threadSummary2, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1869424179:
                if (str.equals("com_facebook_messaging_communitymessaging_plugins_interfaces_threadviewscrolllistener_ThreadViewScrollListenerInterfaceSpec")) {
                    final ThreadKey threadKey3 = (ThreadKey) objArr[0];
                    final 2S4 r016 = (2S4) objArr[1];
                    bar = new Object(context, r016, threadKey3, str2) { // from class: X.6ky
                        public final C6kz A00;

                        /* JADX WARN: Type inference failed for: r0v7, types: [X.6kz] */
                        {
                            if (!str2.equals("All")) {
                                throw 1BL.A0l(str2);
                            }
                            this.A00 = new Object(context, r016, threadKey3) { // from class: X.6kz
                                public CommunityChatThreadViewScrollListenerImplementation A00;
                                public Object A01;
                                public final Context A02;
                                public final 2S4 A03;
                                public final ThreadKey A04;
                                public final 1YC A05 = 1YC.A03;

                                {
                                    this.A02 = context;
                                    this.A04 = threadKey3;
                                    this.A03 = r016;
                                }
                            };
                        }
                    };
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1867979298:
                if (str.equals("com_facebook_messaging_highlightstab_classicuicomponents_plugins_interfaces_feeditems_HTClassicFeedItemInterfaceSpec")) {
                    HighlightsFeedContent highlightsFeedContent = (HighlightsFeedContent) objArr[0];
                    8Kh r017 = (8Kh) objArr[1];
                    MigColorScheme migColorScheme = (MigColorScheme) objArr[2];
                    Aaj aaj = (Aaj) objArr[3];
                    AZg aZg = (AZg) objArr[4];
                    9cG r018 = (9cG) objArr[5];
                    2Qz r019 = (2Qz) objArr[6];
                    bar = new RDx(context, (06Z) objArr[9], (LiveData) objArr[10], (FbUserSession) objArr[7], r018, aaj, r019, highlightsFeedContent, (C9yk) objArr[8], r017, migColorScheme, aZg, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1860986320:
                if (str.equals("com_facebook_messaging_sms_plugins_interfaces_takeoverstate_SmsTakeOverStateListenerInterfaceSpec")) {
                    bar = new Object(context, str2) { // from class: X.2dc
                        public final C2dd A00;

                        /* JADX WARN: Type inference failed for: r0v7, types: [X.2dd] */
                        {
                            if (!str2.equals("CarrierMessaging")) {
                                throw 1BL.A0l(str2);
                            }
                            this.A00 = new Object(context) { // from class: X.2dd
                                public final Context A00;
                                public final 1YC A01 = 1YC.A03;

                                {
                                    this.A00 = context;
                                }
                            };
                        }
                    };
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1833853502:
                if (str.equals("com_facebook_messaging_composer_quickreply_plugins_interfaces_quickreplydataloader_QuickReplyDataLoaderInterfaceSpec")) {
                    bar = new 6S1(context, (FbUserSession) objArr[0], (6S0) objArr[1], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1822475928:
                if (str.equals("com_facebook_messaging_rtc_incall_plugins_interfaces_notification_feature_NotificationFeatureInterfaceSpec")) {
                    bar = new HPY(context, (FbUserSession) objArr[1], (I8a) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1813958432:
                if (str.equals("com_facebook_messaging_media_editing_plugins_interfaces_defaultlayers_MediaEditingDefaultLayersPreprocessorInterfaceSpec")) {
                    bar = new HPP(context, (FbUserSession) objArr[0], (C5wh) objArr[2], str2, (List) objArr[1]);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1806971503:
                if (str.equals("com_facebook_messaging_threadsettings_plugins_interfaces_threadviewentrypoint_longpresshandler_ThreadSettingsButtonLongPressHandlerSpec")) {
                    bar = new 6lN(context, (ThreadKey) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1792144078:
                if (str.equals("com_facebook_messaging_composer_plugins_interfaces_entrypoint_ComposerEntryPointInterfaceSpec")) {
                    FbUserSession fbUserSession2 = (FbUserSession) objArr[0];
                    2S4 r020 = (2S4) objArr[1];
                    6Qf r021 = (6Qf) objArr[2];
                    C6fo c6fo = (C6fo) objArr[3];
                    ThreadKey threadKey4 = (ThreadKey) objArr[4];
                    ThreadSummary threadSummary3 = (ThreadSummary) objArr[5];
                    Capabilities capabilities2 = (Capabilities) objArr[6];
                    6Qh r022 = (6Qh) objArr[7];
                    bar = new C6fp(context, (06Z) objArr[8], fbUserSession2, r020, r022, (6Qi) objArr[9], r021, c6fo, threadKey4, threadSummary3, (MigColorScheme) objArr[12], (53U) objArr[11], capabilities2, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1754721254:
                if (str.equals("com_facebook_messaging_communitymessaging_plugins_interfaces_memberactions_CommunityActionsMenuItemInterfaceSpec")) {
                    Bs5 bs5 = (Bs5) objArr[0];
                    MigColorScheme migColorScheme2 = (MigColorScheme) objArr[1];
                    1Iw r023 = (1Iw) objArr[2];
                    DJY djy = (DJY) objArr[3];
                    User user2 = (User) objArr[4];
                    bar = new BaY(context, (06Z) objArr[5], (LifecycleOwner) objArr[6], (FbUserSession) objArr[8], (1pI) objArr[7], r023, bs5, djy, migColorScheme2, user2, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1714471680:
                if (str.equals("com_facebook_messaging_business_bmcconsiderationgrowth_buyerpersistentnavigation_plugins_interfaces_buyerpersistentnavigationinterface_BuyerPersistentNavigationInterfaceSpec")) {
                    bar = new 6Sc(context, (FbUserSession) objArr[1], (6Qb) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1710566593:
                if (str.equals("com_facebook_messaging_threadsettings_plugins_interfaces_actionbuttonheader_ActionButtonHeaderInterfaceSpec")) {
                    ThreadKey threadKey5 = (ThreadKey) objArr[0];
                    ThreadSummary threadSummary4 = (ThreadSummary) objArr[1];
                    User user3 = (User) objArr[2];
                    bar = new Bb7(context, (06Z) objArr[3], (FbUserSession) objArr[6], threadKey5, threadSummary4, user3, (Capabilities) objArr[4], (2Sh) objArr[5], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1695811777:
                if (str.equals("com_facebook_messaging_highlightstab_loader_plugins_interfaces_prefetch_HTFeedContentPrefetcherSpec")) {
                    bar = new 5cX(context, (FbUserSession) objArr[1], str2, (List) objArr[0]);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1692837665:
                if (str.equals("com_facebook_rtc_plugins_interfaces_msys_MailboxPluginInterfaceSpec")) {
                    bar = new BbP(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1671218263:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_banner_cta_ThreadViewBannerCtaHandlerInterfaceSpec")) {
                    bar = new 7Op(context, (FbUserSession) objArr[1], (63D) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1641162486:
                if (str.equals("com_facebook_messaging_graph_plugins_interfaces_indexrail_IndexRailInterfaceSpec")) {
                    bar = new Bae(context, (1Iw) objArr[0], (C0e) objArr[5], (MigColorScheme) objArr[1], (ImmutableList) objArr[2], str2, ((Number) objArr[3]).intValue(), ((Boolean) objArr[4]).booleanValue());
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1639545186:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_message_sendertile_click_SenderTileClickInterfaceSpec")) {
                    User user4 = (User) objArr[0];
                    1F9 r024 = (1F9) objArr[1];
                    bar = new 7nW(context, (06Z) objArr[2], r024, (Message) objArr[4], (61C) objArr[5], (ThreadSummary) objArr[3], user4, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1595133718:
                if (str.equals("com_facebook_messaging_inboxfolders_plugins_interfaces_stickyfooter_FoldersStickyFooterInterfaceSpec")) {
                    2SI r025 = (2SI) objArr[0];
                    06Z r026 = (06Z) objArr[1];
                    C3Nf c3Nf = (C3Nf) objArr[2];
                    bar = new 3Im(context, r026, (FbUserSession) objArr[3], (LithoView) objArr[4], c3Nf, (ThreadKey) objArr[5], (2MX) objArr[7], r025, (ParcelableSecondaryData) objArr[6], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1588504750:
                if (str.equals("com_facebook_messaging_composer_plugins_interfaces_expression_ComposerExpressionInterfaceSpec")) {
                    final Capabilities capabilities3 = (Capabilities) objArr[0];
                    final 6Qf r027 = (6Qf) objArr[1];
                    final 6QZ r028 = (6QZ) objArr[2];
                    final 6Qb r029 = (6Qb) objArr[3];
                    final 2S4 r030 = (2S4) objArr[4];
                    bar = new Object(context, r030, r028, r029, r027, capabilities3, str2) { // from class: X.7nN
                        public final C7yk A00;

                        {
                            Rmi iqy;
                            if (str2.equals("EXPRESSION")) {
                                iqy = new IQY(context, r030, r028, r029, r027, capabilities3);
                            } else {
                                if (!str2.equals("BUSINESS_TOOLS")) {
                                    throw 1BL.A0l(str2);
                                }
                                iqy = new Rmi(context, r030, r028, r029, r027, capabilities3);
                            }
                            this.A00 = iqy;
                        }
                    };
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1581665227:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_titlebar_tooltip_TitleTooltipInterfaceSpec")) {
                    bar = new 6lT(context, (5Sh) objArr[1], str2, ((Boolean) objArr[0]).booleanValue());
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1573476538:
                if (str.equals("com_facebook_messaging_inboxfolders_plugins_interfaces_interstitials_FolderInterstitialInterfaceSpec")) {
                    bar = new Bal(context, (06Z) objArr[0], (FbUserSession) objArr[1], (3JU) objArr[2], (ParcelableSecondaryData) objArr[3], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1543663458:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_message_decorations_topbottom_TopBottomMessageDecorationInterfaceSpec")) {
                    AnonymousClass622 anonymousClass6222 = (AnonymousClass622) objArr[0];
                    63V r031 = (63V) objArr[1];
                    5zD r032 = (5zD) objArr[2];
                    06Z r033 = (06Z) objArr[3];
                    2S4 r034 = (2S4) objArr[4];
                    64I r035 = (64I) objArr[5];
                    Capabilities capabilities4 = (Capabilities) objArr[6];
                    64W r036 = (64W) objArr[7];
                    boolean booleanValue = ((Boolean) objArr[9]).booleanValue();
                    bar = new 65P(context, r033, (FbUserSession) objArr[11], r034, r032, r036, (C62u) objArr[10], r035, anonymousClass6222, r031, capabilities4, str2, booleanValue);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1526561688:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_data_secondarytransform_SecondaryDataTransformInterfaceSpec")) {
                    bar = new 6iJ(context, (ThreadKey) objArr[0], (ThreadViewSurfaceOptions) objArr[1], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1511956730:
                if (str.equals("com_facebook_messaging_msys_thread_reactions_reactors_plugins_interfaces_senderfactory_ReactionsSenderFactoryInterfaceSpec")) {
                    bar = new 9Gn(context, (FbUserSession) objArr[1], (ThreadKey) objArr[0], (HeterogeneousMap) objArr[2], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1489303739:
                if (str.equals("com_facebook_messaging_capability_plugins_interfaces_accountcapabilitycomputation_AccountCapabilityComputationSpec")) {
                    bar = new 1vA(context, (C1v9) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1486887484:
                if (str.equals("com_facebook_messaging_capability_thread_plugins_interfaces_threadcapabilitycomputation_ThreadCapabilityComputationSpec")) {
                    final ThreadSummary threadSummary5 = (ThreadSummary) objArr[0];
                    final C1v9 c1v9 = (C1v9) objArr[1];
                    final User user5 = (User) objArr[2];
                    final 2Sh r037 = (2Sh) objArr[3];
                    bar = new Object(context, threadSummary5, user5, c1v9, r037, str2) { // from class: X.7nM
                        public final C7y1 A00;

                        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                        {
                            Rmb rma;
                            switch (str2.hashCode()) {
                                case -552510078:
                                    if (str2.equals("OPTIMISTIC_CANONICAL")) {
                                        rma = new Rmb(context, threadSummary5, user5, c1v9, r037);
                                        break;
                                    }
                                    throw 1BL.A0l(str2);
                                case 64897:
                                    if (str2.equals("ALL")) {
                                        rma = new CcB(context, threadSummary5, user5, c1v9, r037);
                                        break;
                                    }
                                    throw 1BL.A0l(str2);
                                case 1249280224:
                                    if (str2.equals("OPTIMISTIC_CANONICAL_HIDE_CALL_BUTTONS")) {
                                        rma = new Rma(context, threadSummary5, user5, c1v9, r037);
                                        break;
                                    }
                                    throw 1BL.A0l(str2);
                                default:
                                    throw 1BL.A0l(str2);
                            }
                            this.A00 = rma;
                        }
                    };
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1469393592:
                if (str.equals("com_facebook_auth_login_plugins_interfaces_accountmanager_AccountManagerUtilSpec")) {
                    bar = new EcR(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1452807894:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_message_decorations_pill_MessagePillDecorationInterfaceSpec")) {
                    FbUserSession fbUserSession3 = (FbUserSession) objArr[0];
                    AnonymousClass622 anonymousClass6223 = (AnonymousClass622) objArr[1];
                    5zD r038 = (5zD) objArr[2];
                    bar = new 6nA(context, (06Z) objArr[3], fbUserSession3, (2S4) objArr[6], r038, (63D) objArr[4], (AnonymousClass635) objArr[5], anonymousClass6223, (Capabilities) objArr[7], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1446094024:
                if (str.equals("com_facebook_bloks_messenger_implementations_plugins_interfaces_extensions_MSGBloksExtensionsInterfaceSpec")) {
                    bar = new EcS(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1428887831:
                if (str.equals("com_facebook_messaging_navigation_plugins_interfaces_threadviewlauncher_ThreadViewLauncherSpec")) {
                    bar = new 2Mu(context, (1pI) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1424107456:
                if (str.equals("com_facebook_messaging_threadlist_plugins_interfaces_threadtimestamp_ThreadTimestampInterfaceSpec")) {
                    bar = new 2oB(context, (FbUserSession) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1411323231:
                if (str.equals("com_facebook_messaging_notify_replyreminder_plugins_interfaces_replyreminderprocessor_MessengerE2EEMessageReminderProcessorInterfaceSpec")) {
                    bar = new Object(context, str2) { // from class: X.7nR
                        public final BrL A00;

                        {
                            if (!str2.equals("All")) {
                                throw 1BL.A0l(str2);
                            }
                            this.A00 = new BrL(context);
                        }
                    };
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1401834497:
                if (str.equals("com_facebook_presence_plugins_interfaces_perflogging_PresencePerfLoggingInterfaceSpec")) {
                    bar = new 1YL(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1382361207:
                if (str.equals("com_facebook_messaging_navigation_plugins_interfaces_drawer_folder_foldersection_HomeDrawerFolderSectionInterfaceSpec")) {
                    bar = new C4Mp(context, (FbUserSession) objArr[1], (C4Xo) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1370745663:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_messagerowsupplier_MessageRowSupplierInterfaceSpec")) {
                    final Message message = (Message) objArr[0];
                    final 60I r039 = (60I) objArr[1];
                    final FbUserSession fbUserSession4 = (FbUserSession) objArr[2];
                    bar = new Object(context, fbUserSession4, message, r039, str2) { // from class: X.615
                        public final AnonymousClass616 A00;

                        /* JADX WARN: Type inference failed for: r0v7, types: [X.616] */
                        {
                            if (!str2.equals("MessageRowSuppliers")) {
                                throw 1BL.A0l(str2);
                            }
                            this.A00 = new Object(context, fbUserSession4, message, r039) { // from class: X.616
                                public 61B A00;
                                public BumpMessageRowSupplierImplementation A01;
                                public C1v5 A02;
                                public MsysLoadMoreRowsImplementation A03;
                                public Object A04;
                                public Object A05;
                                public Object A06;
                                public Object A07;
                                public Object A08;
                                public Object A09;
                                public boolean A0A;
                                public final Context A0B;
                                public final FbUserSession A0C;
                                public final Message A0D;
                                public final 1YC A0E = 1YC.A03;
                                public final 60I A0F;

                                {
                                    this.A0B = context;
                                    this.A0D = message;
                                    this.A0F = r039;
                                    this.A0C = fbUserSession4;
                                }

                                public static void A00(AnonymousClass616 anonymousClass616) {
                                    synchronized (anonymousClass616) {
                                        if (!anonymousClass616.A0A) {
                                            if (anonymousClass616.A0B == null) {
                                                throw AnonymousClass001.A0Q("The context passed in the MessageRowSupplierInterface.newBuilder() is null.\nIf you have other questions, please post it to group Android Messenger Modularity.");
                                            }
                                            anonymousClass616.A02 = C1v5.A01;
                                            anonymousClass616.A0A = true;
                                        }
                                    }
                                }
                            };
                        }
                    };
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1362026575:
                if (str.equals("com_facebook_messaging_neue_plugins_interfaces_inboxtabemptyview_InboxTabEmptyViewInterfaceSpec")) {
                    bar = new 4EN(context, (2S7) objArr[1], (MigColorScheme) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1358098343:
                if (str.equals("com_facebook_messaging_omnipicker_plugins_interfaces_secondaryomnipickercomponent_SecondaryOmnipickerComponentInterfaceSpec")) {
                    Bcn bcn = (Bcn) objArr[0];
                    String str5 = (String) objArr[1];
                    String str6 = (String) objArr[2];
                    String str7 = (String) objArr[3];
                    String str8 = (String) objArr[4];
                    MigColorScheme migColorScheme3 = (MigColorScheme) objArr[5];
                    1Iw r040 = (1Iw) objArr[6];
                    BME bme = (BME) objArr[7];
                    ThreadSummary threadSummary6 = (ThreadSummary) objArr[8];
                    ThreadKey threadKey6 = (ThreadKey) objArr[9];
                    bar = new Bas(context, (FbUserSession) objArr[10], r040, bme, bcn, threadKey6, threadSummary6, migColorScheme3, (ParcelableSecondaryData) objArr[12], (ImmutableList) objArr[11], str2, str5, str6, str7, str8, (String) objArr[13], ((Number) objArr[14]).intValue());
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1347983590:
                if (str.equals("com_facebook_messaging_threadlist_plugins_interfaces_threadmetadataprovider_ThreadMetadataProviderInterfaceSpec")) {
                    bar = new 2nL(context, (FbUserSession) objArr[0], (2SI) objArr[1], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1327684998:
                if (str.equals("com_facebook_messaging_accountlogin_plugins_interfaces_interactions_AccountLoginExitSpec")) {
                    bar = new BaN(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1302989331:
                if (str.equals("com_facebook_msys_config_plugins_interfaces_mpl_TTRCPluginInterfaceSpec")) {
                    bar = new 3Iw(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1297235560:
                if (str.equals("com_facebook_messaging_threadsettings_threadactionhelpers_plugins_interfaces_contactrowmenuitem_MessengerContactRowMenuItemInterfaceSpec")) {
                    bar = new 7nT(context, (ThreadSummary) objArr[0], (User) objArr[1], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1295159214:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_surfaceoptions_ThreadViewSurfaceOptionsInterfaceSpec")) {
                    bar = new BbK(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1294995339:
                if (str.equals("com_facebook_messaging_aibot_plugins_interfaces_intf_AiBotPluginSpec")) {
                    bar = new C1247Abp(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1281622135:
                if (str.equals("com_facebook_messaging_threadsettings_plugins_interfaces_row_RowInterfaceSpec")) {
                    FbUserSession fbUserSession5 = (FbUserSession) objArr[0];
                    ThreadKey threadKey7 = (ThreadKey) objArr[1];
                    Capabilities capabilities5 = (Capabilities) objArr[2];
                    ThreadSummary threadSummary7 = (ThreadSummary) objArr[3];
                    2Sh r041 = (2Sh) objArr[4];
                    C1783AsH c1783AsH = (C1783AsH) objArr[5];
                    06Z r042 = (06Z) objArr[6];
                    User user6 = (User) objArr[7];
                    ImmutableList immutableList2 = (ImmutableList) objArr[8];
                    DHc dHc = (DHc) objArr[9];
                    bar = new BbC(context, r042, fbUserSession5, threadKey7, threadSummary7, (DJX) objArr[12], (DHb) objArr[10], dHc, (DHd) objArr[11], (MigColorScheme) objArr[13], user6, capabilities5, r041, c1783AsH, immutableList2, str2, (String) objArr[14]);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1258715768:
                if (str.equals("com_facebook_messaging_capability_plugins_interfaces_accountcapabilities_AccountCapabilityStoreSpec")) {
                    bar = new C1v2(context, ((Number) objArr[0]).longValue(), str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1254602222:
                if (str.equals("com_facebook_messaging_threadlist_plugins_interfaces_calltoaction_ThreadListCallToActionInterfaceSpec")) {
                    final C2gi c2gi = (C2gi) objArr[0];
                    final 06Z r043 = (06Z) objArr[1];
                    final 2YQ r044 = (2YQ) objArr[2];
                    bar = new Object(context, r043, r044, c2gi, str2) { // from class: X.2ph
                        public final C2pi A00;

                        /* JADX WARN: Type inference failed for: r0v7, types: [X.2pi] */
                        {
                            if (!str2.equals("All")) {
                                throw 1BL.A0l(str2);
                            }
                            this.A00 = new Object(context, r043, r044, c2gi) { // from class: X.2pi
                                public CommunityChannelThreadItemCTA A00;
                                public CcInboxUpsellsThreadItemCTA A01;
                                public Object A02;
                                public Object A03;
                                public final Context A04;
                                public final 06Z A05;
                                public final 2YQ A06;
                                public final 1YC A07 = 1YC.A03;
                                public final C2gi A08;

                                {
                                    this.A04 = context;
                                    this.A08 = c2gi;
                                    this.A05 = r043;
                                    this.A06 = r044;
                                }
                            };
                        }
                    };
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1242897594:
                if (str.equals("com_facebook_messaging_groups_plugins_interfaces_memberlistemptystateconfig_MemberListEmptyStateConfigInterfaceSpec")) {
                    bar = new Bah(context, (1Iw) objArr[0], (DEE) objArr[2], (MigColorScheme) objArr[1], (ParcelableSecondaryData) objArr[3], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1201603118:
                if (str.equals("com_facebook_messaging_graph_plugins_interfaces_contactinfomenuitem_ContactInfoMenuItemInterfaceSpec")) {
                    User user7 = (User) objArr[0];
                    06Z r045 = (06Z) objArr[1];
                    int intValue = ((Number) objArr[2]).intValue();
                    String str9 = (String) objArr[3];
                    FbUserSession fbUserSession6 = (FbUserSession) objArr[4];
                    C0f c0f = (C0f) objArr[5];
                    3Ea r046 = (3Ea) objArr[6];
                    BL2 bl2 = (BL2) objArr[7];
                    C38 c38 = (C38) objArr[8];
                    RichStatus richStatus = (RichStatus) objArr[9];
                    bar = new Bac(context, r045, r046, fbUserSession6, c0f, (2UP) objArr[11], (MontageBucketPreview) objArr[10], c38, bl2, richStatus, user7, str2, str9, intValue);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1189398699:
                if (str.equals("com_facebook_messaging_threadview_messagelist_binders_plugins_interfaces_messagecomponentbinder_MessageBinderProviderInterfaceSpec")) {
                    bar = new 63F(context, (2S4) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1169645868:
                if (str.equals("com_facebook_messaging_communitymessaging_plugins_interfaces_channelimageediting_ChannelImageProviderInterfaceSpec")) {
                    Context context2 = (Context) objArr[0];
                    boolean booleanValue2 = ((Boolean) objArr[1]).booleanValue();
                    bar = new 3Id(context, context2, (BLC) objArr[3], (ThreadSummary) objArr[2], str2, booleanValue2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1169221572:
                if (str.equals("com_facebook_messaging_settings_plugins_interfaces_mesettings_profilesubheading_MeSettingsProfileSubheadingInterfaceSpec")) {
                    bar = new Bb1(context, (FbUserSession) objArr[0], (1pI) objArr[2], (DFp) objArr[1], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1141845144:
                if (str.equals("com_facebook_messaging_threadsettings_plugins_interfaces_rowclick_XappRowClickHandlerInterfaceSpec")) {
                    ThreadKey threadKey8 = (ThreadKey) objArr[0];
                    bar = new BbD(context, (06Z) objArr[1], threadKey8, (DHb) objArr[3], (DHc) objArr[2], (DHd) objArr[4], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1137473100:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_messagelist_secondarydata_MessageListSecondaryDataInterfaceSpec")) {
                    Message message2 = (Message) objArr[0];
                    boolean booleanValue3 = ((Boolean) objArr[1]).booleanValue();
                    boolean booleanValue4 = ((Boolean) objArr[3]).booleanValue();
                    bar = new C61H(context, (FbUserSession) objArr[6], message2, (60I) objArr[4], (60W) objArr[5], str2, booleanValue3, booleanValue4);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1130432393:
                if (str.equals("com_facebook_messaging_wearable_plugins_interfaces_hera_HeraMessengerPluginInterfaceSpec")) {
                    bar = new HPc(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1104002982:
                if (str.equals("com_facebook_messaging_quickpromotion_plugins_interfaces_threadviewattributes_ThreadViewQpTriggerContextAttributesAmenderInterfaceSpec")) {
                    bar = new 7KQ(context, (ThreadSummary) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1101965886:
                if (str.equals("com_facebook_messaging_sync_plugins_interfaces_deltamarkreadinterface_DeltaMarkReadInterfaceSpec")) {
                    bar = new Bb4(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1052881914:
                if (str.equals("com_facebook_messaging_groups_plugins_interfaces_memberlistactionitem_MemberListActionItemInterfaceSpec")) {
                    Capabilities capabilities6 = (Capabilities) objArr[0];
                    bar = new Baf(context, (06Z) objArr[2], (ThreadKey) objArr[1], (ThreadSummary) objArr[3], capabilities6, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1042885722:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_logging_ThreadViewConversionLoggingInterfaceSpec")) {
                    bar = new HPb(context, (ThreadSummary) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1019303630:
                if (str.equals("com_facebook_presence_plugins_interfaces_presenceupdate_PresenceUpdateInterfaceSpec")) {
                    bar = new C1Y9(context, (FbUserSession) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1013410639:
                if (str.equals("com_facebook_messaging_composer_plugins_interfaces_actionbar_ComposerActionBarMaxButtonCountOverrideInterfaceSpec")) {
                    final ThreadSummary threadSummary8 = (ThreadSummary) objArr[0];
                    bar = new Object(context, threadSummary8, str2) { // from class: X.6fv
                        public final C6fw A00;

                        /* JADX WARN: Type inference failed for: r0v7, types: [X.6fw] */
                        {
                            if (!str2.equals("All")) {
                                throw 1BL.A0l(str2);
                            }
                            this.A00 = new Object(context, threadSummary8) { // from class: X.6fw
                                public Object A00;
                                public Object A01;
                                public final ThreadSummary A02;
                                public final 1YC A03 = 1YC.A03;
                                public final Context A04;

                                {
                                    this.A04 = context;
                                    this.A02 = threadSummary8;
                                }
                            };
                        }
                    };
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -1011074909:
                if (str.equals("com_facebook_messaging_neue_nux_plugins_interfaces_interactions_NeueNuxOnBackSpec")) {
                    bar = new EcU(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -991127765:
                if (str.equals("com_facebook_messaging_virtualfolders_plugins_interfaces_dbthreadsiterator_VirtualFolderDbThreadSummaryIteratorSpec")) {
                    bar = new BbM(context, (C10704ud) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -990111060:
                if (str.equals("com_facebook_messaging_inboxfolders_plugins_interfaces_logging_FoldersItemsLoggingInterfaceSpec")) {
                    bar = new 3Ik(context, (ParcelableSecondaryData) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -981327272:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_messagelist_headerfooter_MessageListHeaderFooterInterfaceSpec")) {
                    bar = new 6jS(context, (FbUserSession) objArr[2], (60I) objArr[0], (60W) objArr[1], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -956934062:
                if (str.equals("com_facebook_messaging_tray_plugins_interfaces_itemsupplierstrategy_TrayItemSupplierStrategyInterfaceSpec")) {
                    bar = new 2St(context, (FbUserSession) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -938279147:
                if (str.equals("com_facebook_rtc_plugins_interfaces_calllifecycle_CallLifecyclePluginInterfaceSpec")) {
                    bar = new HPg(context, (FbUserSession) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -926020020:
                if (str.equals("com_facebook_messaging_composer_plugins_interfaces_keyboard_ComposerKeyboardFactoryInterfaceSpec")) {
                    2S4 r047 = (2S4) objArr[0];
                    53U r048 = (53U) objArr[1];
                    6Qf r049 = (6Qf) objArr[2];
                    6QZ r050 = (6QZ) objArr[3];
                    6Qb r051 = (6Qb) objArr[4];
                    bar = new 6R9(context, (06Z) objArr[7], (LifecycleOwner) objArr[8], (FbUserSession) objArr[9], r047, (6Qc) objArr[5], (6R7) objArr[6], r050, r051, r049, r048, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -909305531:
                if (str.equals("com_facebook_messaging_communitymessaging_plugins_interfaces_suggestedcommunitychatslist_SuggestedCommunityChatsListInterfaceSpec")) {
                    bar = new 9Gf(context, (Context) objArr[3], (06Z) objArr[4], (FbUserSession) objArr[5], (1Iw) objArr[0], (2YQ) objArr[6], (2SI) objArr[7], (MigColorScheme) objArr[1], str2, (List) objArr[2], (C00m) objArr[8]);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -908262894:
                if (str.equals("com_facebook_messaging_sharedcontent_plugins_interfaces_tabcontent_SharedContentTabContentInterfaceSpec")) {
                    1Iw r052 = (1Iw) objArr[0];
                    List list = (List) objArr[1];
                    9XU r053 = (9XU) objArr[2];
                    ThreadKey threadKey9 = (ThreadKey) objArr[3];
                    User user8 = (User) objArr[4];
                    2O4 r054 = (2O4) objArr[5];
                    06Z r055 = (06Z) objArr[6];
                    9Ah r056 = (9Ah) objArr[7];
                    C95o c95o = (C95o) objArr[8];
                    bar = new 9Gp(context, (View) objArr[10], r055, r054, (FbUserSession) objArr[9], r052, threadKey9, r053, c95o, r056, user8, str2, list);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -875911014:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_lifecycle_ThreadViewLifecycleInterfaceSpec")) {
                    6G0 r057 = (6G0) objArr[0];
                    6Fz r058 = (6Fz) objArr[1];
                    6Fy r059 = (6Fy) objArr[2];
                    6GK r060 = (6GK) objArr[3];
                    C6G7 c6g7 = (C6G7) objArr[4];
                    6G3 r061 = (6G3) objArr[5];
                    C6G1 c6g1 = (C6G1) objArr[6];
                    6G5 r062 = (6G5) objArr[7];
                    6G9 r063 = (6G9) objArr[8];
                    63D r064 = (63D) objArr[9];
                    64W r065 = (64W) objArr[10];
                    bar = new 6I7(context, (LifecycleOwner) objArr[12], (FbUserSession) objArr[13], (2S4) objArr[11], r063, r062, r065, r057, r064, r061, r058, c6g1, r059, r060, c6g7, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -866843825:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_adminmessagecta_AdminMessageCtaInterfaceSpec")) {
                    final FbUserSession fbUserSession7 = (FbUserSession) objArr[0];
                    final AdminMessageCta adminMessageCta = (AdminMessageCta) objArr[1];
                    final String str10 = (String) objArr[2];
                    final ThreadKey threadKey10 = (ThreadKey) objArr[3];
                    final ThreadSummary threadSummary9 = (ThreadSummary) objArr[4];
                    final 5zD r066 = (5zD) objArr[5];
                    final 06Z r067 = (06Z) objArr[6];
                    final 63D r068 = (63D) objArr[7];
                    bar = new Object(context, r067, fbUserSession7, r066, adminMessageCta, threadKey10, threadSummary9, r068, str2, str10) { // from class: X.7aF
                        public final 7aE A00;

                        {
                            if (!str2.equals("AdminMessages")) {
                                throw 1BL.A0l(str2);
                            }
                            this.A00 = new 7aE(context, r067, fbUserSession7, r066, adminMessageCta, threadKey10, threadSummary9, r068, str10);
                        }
                    };
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -851098888:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_message_transitions_MessageTransitionsInterfaceSpec")) {
                    final C2i4 c2i4 = (C2i4) objArr[0];
                    final boolean booleanValue5 = ((Boolean) objArr[1]).booleanValue();
                    bar = new Object(context, c2i4, str2, booleanValue5) { // from class: X.66w
                        public final C66x A00;

                        /* JADX WARN: Type inference failed for: r0v7, types: [X.66x] */
                        {
                            if (!str2.equals("All")) {
                                throw 1BL.A0l(str2);
                            }
                            this.A00 = new Object(context, c2i4, booleanValue5) { // from class: X.66x
                                public C60r A00;
                                public SenderContextTransition A01;
                                public C1v5 A03;
                                public Object A04;
                                public Object A05;
                                public Object A06;
                                public Object A07;
                                public Object A08;
                                public Object A09;
                                public boolean A0A;
                                public final Context A0B;
                                public final C2i4 A0C;
                                public final boolean A0E;
                                public int A02 = -1;
                                public final 1YC A0D = 1YC.A03;

                                {
                                    this.A0B = context;
                                    this.A0C = c2i4;
                                    this.A0E = booleanValue5;
                                }

                                public static int A00(C66x c66x) {
                                    int i = c66x.A02;
                                    if (i == -1) {
                                        i = A03(c66x) ? 1 : 0;
                                        if (A05(c66x)) {
                                            i++;
                                        }
                                        if (A04(c66x)) {
                                            i++;
                                        }
                                        if (A07(c66x)) {
                                            i++;
                                        }
                                        if (A06(c66x)) {
                                            i++;
                                        }
                                        if (A02(c66x)) {
                                            i++;
                                        }
                                        c66x.A02 = i;
                                    }
                                    return i;
                                }

                                public static void A01(C66x c66x) {
                                    synchronized (c66x) {
                                        if (!c66x.A0A) {
                                            if (c66x.A0B == null) {
                                                throw AnonymousClass001.A0Q("The context passed in the MessageTransitionsInterface.newBuilder() is null.\nIf you have other questions, please post it to group Android Messenger Modularity.");
                                            }
                                            c66x.A03 = C1v5.A01;
                                            c66x.A0A = true;
                                        }
                                    }
                                }

                                /* JADX WARN: Removed duplicated region for block: B:15:0x00b6 A[Catch: Exception -> 0x00cc, all -> 0x00e3, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00cc, blocks: (B:5:0x0047, B:9:0x0051, B:12:0x005b, B:15:0x00b6, B:17:0x00c4, B:23:0x00be, B:24:0x0064, B:25:0x0069, B:28:0x0073, B:29:0x007c, B:32:0x0085, B:34:0x0092, B:35:0x0098, B:37:0x009e, B:40:0x00a7), top: B:4:0x0047, outer: #0 }] */
                                /* JADX WARN: Removed duplicated region for block: B:20:0x0114  */
                                /* JADX WARN: Removed duplicated region for block: B:23:0x00be A[Catch: Exception -> 0x00cc, all -> 0x00e3, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00cc, blocks: (B:5:0x0047, B:9:0x0051, B:12:0x005b, B:15:0x00b6, B:17:0x00c4, B:23:0x00be, B:24:0x0064, B:25:0x0069, B:28:0x0073, B:29:0x007c, B:32:0x0085, B:34:0x0092, B:35:0x0098, B:37:0x009e, B:40:0x00a7), top: B:4:0x0047, outer: #0 }] */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A02(X.C66x r301) {
                                    /*
                                        Method dump skipped, instructions count: 317
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C66x.A02(X.66x):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
                                /* JADX WARN: Removed duplicated region for block: B:26:0x0110  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A03(X.C66x r301) {
                                    /*
                                        Method dump skipped, instructions count: 313
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C66x.A03(X.66x):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:15:0x0099 A[Catch: Exception -> 0x00bc, all -> 0x00d3, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00bc, blocks: (B:5:0x0047, B:9:0x0051, B:12:0x005b, B:15:0x0099, B:17:0x00b4, B:23:0x00a1, B:24:0x00a5, B:25:0x00aa, B:26:0x00ae, B:26:0x00ae, B:28:0x0064, B:29:0x0069, B:32:0x0075, B:35:0x007d, B:37:0x008a), top: B:4:0x0047, outer: #0 }] */
                                /* JADX WARN: Removed duplicated region for block: B:20:0x0104  */
                                /* JADX WARN: Removed duplicated region for block: B:23:0x00a1 A[Catch: Exception -> 0x00bc, all -> 0x00d3, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00bc, blocks: (B:5:0x0047, B:9:0x0051, B:12:0x005b, B:15:0x0099, B:17:0x00b4, B:23:0x00a1, B:24:0x00a5, B:25:0x00aa, B:26:0x00ae, B:26:0x00ae, B:28:0x0064, B:29:0x0069, B:32:0x0075, B:35:0x007d, B:37:0x008a), top: B:4:0x0047, outer: #0 }] */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A04(X.C66x r301) {
                                    /*
                                        Method dump skipped, instructions count: 301
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C66x.A04(X.66x):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:15:0x0099 A[Catch: Exception -> 0x00af, all -> 0x00c6, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00af, blocks: (B:5:0x0047, B:9:0x0051, B:12:0x005b, B:15:0x0099, B:17:0x00a7, B:23:0x00a1, B:24:0x0064, B:25:0x0069, B:28:0x0075, B:31:0x007d, B:33:0x008a), top: B:4:0x0047, outer: #1 }] */
                                /* JADX WARN: Removed duplicated region for block: B:20:0x00f7  */
                                /* JADX WARN: Removed duplicated region for block: B:23:0x00a1 A[Catch: Exception -> 0x00af, all -> 0x00c6, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00af, blocks: (B:5:0x0047, B:9:0x0051, B:12:0x005b, B:15:0x0099, B:17:0x00a7, B:23:0x00a1, B:24:0x0064, B:25:0x0069, B:28:0x0075, B:31:0x007d, B:33:0x008a), top: B:4:0x0047, outer: #1 }] */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A05(X.C66x r301) {
                                    /*
                                        Method dump skipped, instructions count: 288
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C66x.A05(X.66x):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:15:0x0096 A[Catch: Exception -> 0x00bb, all -> 0x00d2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00bb, blocks: (B:5:0x0047, B:9:0x0051, B:12:0x005b, B:15:0x0096, B:16:0x009a, B:19:0x00a5, B:21:0x00b3, B:27:0x00ad, B:28:0x0064, B:29:0x0069, B:32:0x0075, B:35:0x007d, B:37:0x008a), top: B:4:0x0047, outer: #0 }] */
                                /* JADX WARN: Removed duplicated region for block: B:24:0x0103  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A06(X.C66x r301) {
                                    /*
                                        Method dump skipped, instructions count: 300
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C66x.A06(X.66x):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
                                /* JADX WARN: Removed duplicated region for block: B:26:0x010e  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A07(X.C66x r301) {
                                    /*
                                        Method dump skipped, instructions count: 311
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C66x.A07(X.66x):boolean");
                                }
                            };
                        }
                    };
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -833993927:
                if (str.equals("com_facebook_messaging_app_plugins_interfaces_lowmemory_OnTrimMemorySpec")) {
                    bar = new C03833z7(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -827741063:
                if (str.equals("com_facebook_messaging_threadsettings_plugins_interfaces_sectionheader_SectionHeaderInterfaceSpec")) {
                    DHd dHd = (DHd) objArr[0];
                    DJX djx = (DJX) objArr[1];
                    bar = new BbH(context, (ThreadKey) objArr[2], (ThreadSummary) objArr[4], djx, dHd, (2Sh) objArr[3], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -823753324:
                if (str.equals("com_facebook_messaging_highlightstab_immersiveuicomponents_featurecontentview_plugins_interfaces_cards_HTImmersiveCardViewInterfaceSpec")) {
                    Context context3 = (Context) objArr[0];
                    HighlightsFeedContent highlightsFeedContent2 = (HighlightsFeedContent) objArr[1];
                    C9yk c9yk = (C9yk) objArr[2];
                    06Z r069 = (06Z) objArr[3];
                    95J r070 = (95J) objArr[4];
                    HTImmersiveFixedColorScheme hTImmersiveFixedColorScheme = (HTImmersiveFixedColorScheme) objArr[5];
                    bar = new 9Wd(context, context3, (View) objArr[6], r069, hTImmersiveFixedColorScheme, r070, (9Tf) objArr[8], highlightsFeedContent2, c9yk, (AZg) objArr[7], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -817233973:
                if (str.equals("com_facebook_messaging_highlightstab_xsharelibraries_composer_sender_plugins_interfaces_preprocessor_HTMessagePreprocessorInterfaceSpec")) {
                    bar = new 9Gk(context, (HighlightsFeedContent) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -815213449:
                if (str.equals("com_facebook_stickers_keyboardls_plugins_interfaces_tabs_StickerTabsInterfaceSpec")) {
                    bar = new HPh(context, (JMq) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -791398948:
                if (str.equals("com_facebook_messaging_communitymessaging_threadedreplies_plugins_interfaces_titlebaroptionsmenuitem_ThreadedRepliesTitleBarOptionsMenuItemInterfaceSpec")) {
                    ThreadSummary threadSummary10 = (ThreadSummary) objArr[0];
                    06Z r071 = (06Z) objArr[1];
                    Capabilities capabilities7 = (Capabilities) objArr[2];
                    bar = new Baa(context, r071, (FbUserSession) objArr[5], threadSummary10, (64W) objArr[3], (C5xv) objArr[4], capabilities7, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -788253469:
                if (str.equals("com_facebook_messaging_xma_template_plugins_interfaces_cta_GenericXmaCtaHandlerSpec")) {
                    bar = new 7Wx(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -772628639:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_titlebar_TitleBarInterfaceSpec")) {
                    bar = new 6OE(context, (Context) objArr[1], (ViewGroup) objArr[2], (2S4) objArr[0], (6OD) objArr[3], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -771792168:
                if (str.equals("com_facebook_messaging_capability_thread_plugins_interfaces_threadtypecapability_ThreadTypeCapabilitySpec")) {
                    bar = new 5yF(context, (ThreadSummary) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -767252653:
                if (str.equals("com_facebook_messaging_quickpromotion_plugins_interfaces_threadviewtrigger_ThreadViewQpTriggerInterfaceSpec")) {
                    ThreadKey threadKey11 = (ThreadKey) objArr[0];
                    bar = new 7Nw(context, (FbUserSession) objArr[2], (2S4) objArr[1], threadKey11, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -767194897:
                if (str.equals("com_facebook_messaging_linkhandling_plugins_interfaces_linkhandler_LinkHandlerInterfaceSpec")) {
                    bar = new C68u(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -703075800:
                if (str.equals("com_facebook_messaging_threadsettings_plugins_interfaces_contextsubheading_ThreadSettingsContextSubheadingInterfaceSpec")) {
                    bar = new Bb9(context, (FbUserSession) objArr[5], (ThreadKey) objArr[0], (ThreadSummary) objArr[1], (User) objArr[2], (Capabilities) objArr[3], (2Sh) objArr[4], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -690692379:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_message_decorations_customxmalayoutwrapper_CustomXMALayoutWrapperDecorationInterfaceSpec")) {
                    AnonymousClass622 anonymousClass6224 = (AnonymousClass622) objArr[0];
                    Capabilities capabilities8 = (Capabilities) objArr[1];
                    bar = new 9Gq(context, (06Z) objArr[3], (FbUserSession) objArr[4], (5zD) objArr[2], anonymousClass6224, capabilities8, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -683890754:
                if (str.equals("com_facebook_messaging_reactions_plugins_interfaces_datahandlers_ReactionsReactorsDataHandlerInterfaceSpec")) {
                    ThreadKey threadKey12 = (ThreadKey) objArr[0];
                    ThreadSummary threadSummary11 = (ThreadSummary) objArr[1];
                    Capabilities capabilities9 = (Capabilities) objArr[2];
                    HgE hgE = (HgE) objArr[3];
                    bar = new HPU(context, threadKey12, (ThreadCustomization) objArr[4], threadSummary11, hgE, (JD4) objArr[8], capabilities9, (1Mv) objArr[5], str2, (String) objArr[6], ((Boolean) objArr[7]).booleanValue());
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -647648605:
                if (str.equals("com_facebook_messaging_omnipicker_plugins_interfaces_threadhostprovider_forthreadkey_OmnipickerThreadHostForThreadKeyProviderInterfaceSpec")) {
                    bar = new Bav(context, (Context) objArr[0], (FbUserSession) objArr[4], (ThreadKey) objArr[1], (DIz) objArr[2], (NavigationTrigger) objArr[3], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -644491361:
                if (str.equals("com_facebook_messaging_reactions_plugins_interfaces_reactionsactionsdrawer_ReactionsActionsDrawerPresenterSpec")) {
                    MenuDialogParams menuDialogParams = (MenuDialogParams) objArr[0];
                    ThreadSummary threadSummary12 = (ThreadSummary) objArr[1];
                    boolean booleanValue6 = ((Boolean) objArr[2]).booleanValue();
                    bar = new KeX(context, menuDialogParams, threadSummary12, (9KE) objArr[4], str2, ((Number) objArr[3]).intValue(), booleanValue6);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -641754843:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_messagelist_decorationrow_DecorationRowInterfaceSpec")) {
                    bar = new 62H(context, (FbUserSession) objArr[0], (Message) objArr[1], (Message) objArr[2], (Message) objArr[3], (60I) objArr[5], (60W) objArr[6], (AnonymousClass624) objArr[4], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -634709976:
                if (str.equals("com_facebook_messaging_sms_plugins_interfaces_statechecker_SmsStateCheckerInterfaceSpec")) {
                    bar = new Object(context, str2) { // from class: X.2dg
                        public final C2dh A00;

                        /* JADX WARN: Type inference failed for: r0v7, types: [X.2dh] */
                        {
                            if (!str2.equals("All")) {
                                throw 1BL.A0l(str2);
                            }
                            this.A00 = new Object(context) { // from class: X.2dh
                                public final 1YC A00 = 1YC.A03;
                                public final Context A01;

                                {
                                    this.A01 = context;
                                }
                            };
                        }
                    };
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -616062855:
                if (str.equals("com_facebook_messaging_nativepagereply_plugins_interfaces_pageaccounteventlistenerinterface_PageAccountEventListenerInterfaceSpec")) {
                    bar = new Object(context, str2) { // from class: X.5ch
                        public final C5ci A00;

                        /* JADX WARN: Type inference failed for: r0v7, types: [X.5ci] */
                        {
                            if (!str2.equals("All")) {
                                throw 1BL.A0l(str2);
                            }
                            this.A00 = new Object(context) { // from class: X.5ci
                                public Object A00;
                                public Object A01;
                                public final Context A02;
                                public final 1YC A03 = 1YC.A03;

                                {
                                    this.A02 = context;
                                }
                            };
                        }
                    };
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -606984595:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_titlebar_titleclick_TitleClickInterfaceSpec")) {
                    ThreadKey threadKey13 = (ThreadKey) objArr[0];
                    5Sh r072 = (5Sh) objArr[1];
                    Capabilities capabilities10 = (Capabilities) objArr[2];
                    6FI r073 = (6FI) objArr[3];
                    bar = new C6kv(context, (2S4) objArr[5], threadKey13, r072, (64W) objArr[4], r073, capabilities10, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -603125941:
                if (str.equals("com_facebook_messaging_navigation_plugins_interfaces_drawer_folder_navigation_HomeDrawerFolderNavigationInterfaceSpec")) {
                    bar = new 3Iq(context, (3Jh) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -600613316:
                if (str.equals("com_facebook_messaging_mqtt_plugins_interfaces_lifecycle_MessagingMqttLifeCycleInterfaceSpec")) {
                    bar = new KeV(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -595926641:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_message_decorations_sendercontext_SenderContextDecorationInterfaceSpec")) {
                    final AnonymousClass622 anonymousClass6225 = (AnonymousClass622) objArr[0];
                    final 5zD r074 = (5zD) objArr[1];
                    final 06Z r075 = (06Z) objArr[2];
                    final FbUserSession fbUserSession8 = (FbUserSession) objArr[3];
                    final 63D r076 = (63D) objArr[4];
                    bar = new Object(context, r075, fbUserSession8, r074, r076, anonymousClass6225, str2) { // from class: X.655
                        public final AnonymousClass656 A00;

                        {
                            if (!str2.equals("All")) {
                                throw 1BL.A0l(str2);
                            }
                            this.A00 = new AnonymousClass656(context, r075, fbUserSession8, r074, r076, anonymousClass6225);
                        }

                        public C1u3 A00() {
                            int andIncrement;
                            String str11;
                            AnonymousClass656 anonymousClass656 = this.A00;
                            AtomicInteger atomicInteger = C1Y6.A04;
                            int andIncrement2 = atomicInteger.getAndIncrement();
                            1YC r077 = anonymousClass656.A0e;
                            r077.A08("com.facebook.messaging.threadview.plugins.interfaces.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "getIcon", andIncrement2);
                            Exception e = null;
                            try {
                                AnonymousClass656.A00(anonymousClass656);
                                C1u3 c1u3 = null;
                                if (AnonymousClass656.A0E(anonymousClass656)) {
                                    andIncrement = atomicInteger.getAndIncrement();
                                    str11 = "messaging.wellbeing.selfremediation.groupprotections.sendercontextdecoration.BlockedUserSenderContextDecorationImplementation";
                                    r077.A0A("com.facebook.messaging.wellbeing.selfremediation.plugins.groupprotections.sendercontextdecoration.BlockedUserSenderContextDecorationImplementation", str11, "com.facebook.messaging.threadview.plugins.interfaces.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", andIncrement, "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "com.facebook.messaging.wellbeing.selfremediation.plugins.groupprotections.WellbeingSelfremediationGroupprotectionsKillSwitch", "getIcon");
                                } else {
                                    try {
                                        try {
                                            if (AnonymousClass656.A0A(anonymousClass656)) {
                                                andIncrement = atomicInteger.getAndIncrement();
                                                str11 = "messaging.pinnedmessages.production.sendercontextdecoration.PinnedMessageSenderContext";
                                                r077.A0A("com.facebook.messaging.pinnedmessages.plugins.production.sendercontextdecoration.PinnedMessageSenderContext", str11, "com.facebook.messaging.threadview.plugins.interfaces.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", andIncrement, "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "com.facebook.messaging.pinnedmessages.plugins.production.PinnedmessagesProductionKillSwitch", "getIcon");
                                                if (anonymousClass656.A09.A00.A0k) {
                                                    c1u3 = C1u3.A5S;
                                                }
                                            } else if (AnonymousClass656.A0C(anonymousClass656)) {
                                                andIncrement = atomicInteger.getAndIncrement();
                                                str11 = "messaging.replies.replies.sendercontextv2.ReplySenderContextV2";
                                                r077.A0A("com.facebook.messaging.replies.plugins.replies.sendercontextv2.ReplySenderContextV2", str11, "com.facebook.messaging.threadview.plugins.interfaces.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", andIncrement, "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "com.facebook.messaging.replies.plugins.replies.RepliesRepliesKillSwitch", "getIcon");
                                                Integer num = anonymousClass656.A0C.A00.A0G;
                                                if (num != null) {
                                                    int intValue2 = num.intValue();
                                                    if (intValue2 == 4 || intValue2 == 5) {
                                                        c1u3 = C1u3.A35;
                                                    }
                                                }
                                                c1u3 = C1u3.A5S;
                                            } else if (AnonymousClass656.A0B(anonymousClass656)) {
                                                andIncrement = atomicInteger.getAndIncrement();
                                                str11 = "messaging.replies.replies.sendercontext.ReplySenderContext";
                                                r077.A0A("com.facebook.messaging.replies.plugins.replies.sendercontext.ReplySenderContext", str11, "com.facebook.messaging.threadview.plugins.interfaces.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", andIncrement, "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "com.facebook.messaging.replies.plugins.replies.RepliesRepliesKillSwitch", "getIcon");
                                                c1u3 = C1u3.A5S;
                                            } else if (AnonymousClass656.A01(anonymousClass656)) {
                                                andIncrement = atomicInteger.getAndIncrement();
                                                str11 = "messaging.bump.bump.sendercontext.BumpSenderContext";
                                                r077.A0A("com.facebook.messaging.bump.plugins.bump.sendercontext.BumpSenderContext", str11, "com.facebook.messaging.threadview.plugins.interfaces.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", andIncrement, "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "com.facebook.messaging.bump.plugins.bump.BumpKillSwitch", "getIcon");
                                            } else if (AnonymousClass656.A0D(anonymousClass656)) {
                                                andIncrement = atomicInteger.getAndIncrement();
                                                str11 = "messaging.userstatus.userstatus.replysendercontext.StatusReplySenderContext";
                                                r077.A0A("com.facebook.messaging.userstatus.plugins.userstatus.replysendercontext.StatusReplySenderContext", str11, "com.facebook.messaging.threadview.plugins.interfaces.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", andIncrement, "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "com.facebook.messaging.userstatus.plugins.userstatus.UserStatusReplyKillSwitch", "getIcon");
                                                c1u3 = C1u3.A5S;
                                            } else if (AnonymousClass656.A06(anonymousClass656)) {
                                                andIncrement = atomicInteger.getAndIncrement();
                                                str11 = "messaging.forward.forward.highlyforwardedmessageindicator.MessageHighlyForwardIndicatorDecoration";
                                                r077.A0A("com.facebook.messaging.forward.plugins.forward.highlyforwardedmessageindicator.MessageHighlyForwardIndicatorDecoration", str11, "com.facebook.messaging.threadview.plugins.interfaces.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", andIncrement, "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "com.facebook.messaging.forward.plugins.forward.MessageForwardKillSwitch", "getIcon");
                                                c1u3 = C1u3.A37;
                                            } else if (AnonymousClass656.A07(anonymousClass656)) {
                                                andIncrement = atomicInteger.getAndIncrement();
                                                str11 = "messaging.forward.forward.messageindicator.MessageForwardIndicatorDecoration";
                                                r077.A0A("com.facebook.messaging.forward.plugins.forward.messageindicator.MessageForwardIndicatorDecoration", str11, "com.facebook.messaging.threadview.plugins.interfaces.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", andIncrement, "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "com.facebook.messaging.forward.plugins.forward.MessageForwardKillSwitch", "getIcon");
                                                c1u3 = C1u3.A35;
                                            } else {
                                                if (!AnonymousClass656.A09(anonymousClass656)) {
                                                    if (AnonymousClass656.A0F(anonymousClass656)) {
                                                        andIncrement = atomicInteger.getAndIncrement();
                                                        str11 = "presence.note.mention.mention.NoteMentionImplementation";
                                                        r077.A0A("com.facebook.presence.note.plugins.mention.mention.NoteMentionImplementation", str11, "com.facebook.messaging.threadview.plugins.interfaces.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", andIncrement, "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "com.facebook.presence.note.plugins.mention.NoteMentionKillSwitch", "getIcon");
                                                        c1u3 = C1u3.A35;
                                                    }
                                                    r077.A02((Exception) null, "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "getIcon", andIncrement2);
                                                    return c1u3;
                                                }
                                                andIncrement = atomicInteger.getAndIncrement();
                                                str11 = "messaging.highlightstab.message.contextsnippet.orca.sendercontext.birthday.HighlightsTabBirthdaySenderContextImplementation";
                                                r077.A0A("com.facebook.messaging.highlightstab.message.contextsnippet.orca.plugins.sendercontext.birthday.HighlightsTabBirthdaySenderContextImplementation", str11, "com.facebook.messaging.threadview.plugins.interfaces.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", andIncrement, "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "com.facebook.messaging.highlightstab.message.contextsnippet.orca.plugins.sendercontext.HighlightstabMessageContextsnippetOrcaSendercontextKillSwitch", "getIcon");
                                                c1u3 = C1u3.A1A;
                                            }
                                        } catch (Exception e2) {
                                            e = e2;
                                            throw e;
                                        }
                                    } catch (Throwable th) {
                                        r077.A04(e, str11, "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "getIcon", andIncrement);
                                        throw th;
                                    }
                                }
                                r077.A04((Exception) null, str11, "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "getIcon", andIncrement);
                                r077.A02((Exception) null, "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "getIcon", andIncrement2);
                                return c1u3;
                            } catch (Throwable th2) {
                                r077.A02(e, "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "getIcon", andIncrement2);
                                throw th2;
                            }
                        }

                        public 3vS A01() {
                            int andIncrement;
                            String str11;
                            AnonymousClass656 anonymousClass656 = this.A00;
                            AtomicInteger atomicInteger = C1Y6.A04;
                            int andIncrement2 = atomicInteger.getAndIncrement();
                            1YC r077 = anonymousClass656.A0e;
                            r077.A08("com.facebook.messaging.threadview.plugins.interfaces.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "getNameClickHandler", andIncrement2);
                            try {
                                AnonymousClass656.A00(anonymousClass656);
                                3vS r311 = null;
                                try {
                                    try {
                                        if (!AnonymousClass656.A04(anonymousClass656)) {
                                            if (AnonymousClass656.A05(anonymousClass656)) {
                                                andIncrement = atomicInteger.getAndIncrement();
                                                str11 = "messaging.editmessage.editmessage.sendercontext.EditMessageDecorationImplementation";
                                                r077.A0A("com.facebook.messaging.editmessage.plugins.editmessage.sendercontext.EditMessageDecorationImplementation", str11, "com.facebook.messaging.threadview.plugins.interfaces.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", andIncrement, "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "com.facebook.messaging.editmessage.plugins.editmessage.EditmessageEditmessageKillSwitch", "getNameClickHandler");
                                                new 3vS(new AV4(anonymousClass656.A06, 37), (Object[]) null, -1);
                                            }
                                            r077.A02((Exception) null, "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "getNameClickHandler", andIncrement2);
                                            return r311;
                                        }
                                        andIncrement = atomicInteger.getAndIncrement();
                                        str11 = "messaging.communitymessaging.chatcaptain.chatcaptainroleclick.ChatCaptainRoleClickImplementation";
                                        r077.A0A("com.facebook.messaging.communitymessaging.plugins.chatcaptain.chatcaptainroleclick.ChatCaptainRoleClickImplementation", str11, "com.facebook.messaging.threadview.plugins.interfaces.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", andIncrement, "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.chatcaptain.CommunitymessagingChatcaptainKillSwitch", "getNameClickHandler");
                                        new 3vS(new DD4(anonymousClass656.A04, 16), (Object[]) null, -1);
                                        r077.A04((Exception) null, str11, "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "getNameClickHandler", andIncrement);
                                        r077.A02((Exception) null, "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "getNameClickHandler", andIncrement2);
                                        return r311;
                                    } catch (Exception e) {
                                        throw e;
                                    }
                                } catch (Throwable th) {
                                    r077.A04((Exception) null, str11, "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "getNameClickHandler", andIncrement);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                r077.A02((Exception) null, "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "getNameClickHandler", andIncrement2);
                                throw th2;
                            }
                        }

                        /*  JADX ERROR: Types fix failed
                            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
                            */
                        /* JADX WARN: Failed to calculate best type for var: r313v0 ??
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
                         */
                        /* JADX WARN: Failed to calculate best type for var: r313v0 ??
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                         */
                        /* JADX WARN: Failed to calculate best type for var: r315v0 ??
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
                         */
                        /* JADX WARN: Failed to calculate best type for var: r315v0 ??
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                         */
                        /* JADX WARN: Not initialized variable reg: 313, insn: 0x0181: MOVE (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r313 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) A[TRY_ENTER], block:B:69:0x0181 */
                        /* JADX WARN: Not initialized variable reg: 315, insn: 0x017b: MOVE (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r315 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:68:0x0173 */
                        public X.C7sl A02() {
                            /*
                                Method dump skipped, instructions count: 422
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass655.A02():X.7sl");
                        }

                        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
                            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r320v24 ??, still in use, count: 2, list:
                              (r320v24 ??) from 0x0457: PHI (r320v23 ??) = (r320v21 ??), (r320v22 ??), (r320v24 ??) binds: [B:259:0x04f8, B:246:0x04be, B:224:0x0451] A[DONT_GENERATE, DONT_INLINE]
                              (r320v24 ?? I:java.lang.StringBuilder) from 0x0453: INVOKE (r320v24 ?? I:java.lang.StringBuilder), (r0v836 ?? I:java.lang.String) VIRTUAL call: java.lang.StringBuilder.append(java.lang.String):java.lang.StringBuilder A[Catch: Exception -> 0x11ab, all -> 0x11b0, MD:(java.lang.String):java.lang.StringBuilder (c)]
                            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
                            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
                            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
                            	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
                            	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
                            	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
                            	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
                            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
                            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
                            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
                            */
                        public java.lang.CharSequence A03() {
                            /*
                                Method dump skipped, instructions count: 4604
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass655.A03():java.lang.CharSequence");
                        }

                        public void A04() {
                            AnonymousClass656 anonymousClass656 = this.A00;
                            int andIncrement = C1Y6.A04.getAndIncrement();
                            1YC r077 = anonymousClass656.A0e;
                            r077.A08("com.facebook.messaging.threadview.plugins.interfaces.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "getImageClickHandler", andIncrement);
                            try {
                                AnonymousClass656.A00(anonymousClass656);
                                r077.A02((Exception) null, "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "getImageClickHandler", andIncrement);
                            } catch (Throwable th) {
                                r077.A06("messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "getImageClickHandler", andIncrement);
                                throw th;
                            }
                        }

                        public void A05() {
                            AnonymousClass656 anonymousClass656 = this.A00;
                            AtomicInteger atomicInteger = C1Y6.A04;
                            int andIncrement = atomicInteger.getAndIncrement();
                            1YC r077 = anonymousClass656.A0e;
                            r077.A08("com.facebook.messaging.threadview.plugins.interfaces.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "onDecorationCreated", andIncrement);
                            try {
                                AnonymousClass656.A00(anonymousClass656);
                                if (!AnonymousClass656.A06(anonymousClass656)) {
                                    r077.A02((Exception) null, "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "onDecorationCreated", andIncrement);
                                    return;
                                }
                                int andIncrement2 = atomicInteger.getAndIncrement();
                                try {
                                    r077.A0A("com.facebook.messaging.forward.plugins.forward.highlyforwardedmessageindicator.MessageHighlyForwardIndicatorDecoration", "messaging.forward.forward.highlyforwardedmessageindicator.MessageHighlyForwardIndicatorDecoration", "com.facebook.messaging.threadview.plugins.interfaces.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", andIncrement2, "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "com.facebook.messaging.forward.plugins.forward.MessageForwardKillSwitch", "onDecorationCreated");
                                    try {
                                        MessageHighlyForwardIndicatorDecoration messageHighlyForwardIndicatorDecoration = anonymousClass656.A07;
                                        AcN acN = (AcN) 1Bn.A0A(82524);
                                        9XX r078 = (9XX) 1Bn.A0A(68168);
                                        Long valueOf = Long.valueOf(C1Ur.A00((1CO) acN.A00.A00.get(), 5, 36594684730411195L));
                                        AnonymousClass622 anonymousClass6226 = messageHighlyForwardIndicatorDecoration.A00;
                                        String str11 = anonymousClass6226.A03.A1V;
                                        ThreadSummary threadSummary13 = anonymousClass6226.A05;
                                        r078.A00(threadSummary13 != null ? threadSummary13.A0n : null, valueOf, str11);
                                        r077.A04((Exception) null, "messaging.forward.forward.highlyforwardedmessageindicator.MessageHighlyForwardIndicatorDecoration", "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "onDecorationCreated", andIncrement2);
                                        r077.A02((Exception) null, "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "onDecorationCreated", andIncrement);
                                    } catch (Exception e) {
                                        throw e;
                                    }
                                } catch (Throwable th) {
                                    r077.A04((Exception) null, "messaging.forward.forward.highlyforwardedmessageindicator.MessageHighlyForwardIndicatorDecoration", "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "onDecorationCreated", andIncrement2);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                r077.A02((Exception) null, "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "onDecorationCreated", andIncrement);
                                throw th2;
                            }
                        }

                        public boolean A06() {
                            int andIncrement;
                            String str11;
                            AnonymousClass656 anonymousClass656 = this.A00;
                            AtomicInteger atomicInteger = C1Y6.A04;
                            int andIncrement2 = atomicInteger.getAndIncrement();
                            1YC r077 = anonymousClass656.A0e;
                            r077.A08("com.facebook.messaging.threadview.plugins.interfaces.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "isSingleLine", andIncrement2);
                            try {
                                AnonymousClass656.A00(anonymousClass656);
                                boolean z = false;
                                if (AnonymousClass656.A0C(anonymousClass656)) {
                                    andIncrement = atomicInteger.getAndIncrement();
                                    str11 = "messaging.replies.replies.sendercontextv2.ReplySenderContextV2";
                                    r077.A0A("com.facebook.messaging.replies.plugins.replies.sendercontextv2.ReplySenderContextV2", str11, "com.facebook.messaging.threadview.plugins.interfaces.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", andIncrement, "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "com.facebook.messaging.replies.plugins.replies.RepliesRepliesKillSwitch", "isSingleLine");
                                } else if (AnonymousClass656.A0B(anonymousClass656)) {
                                    andIncrement = atomicInteger.getAndIncrement();
                                    str11 = "messaging.replies.replies.sendercontext.ReplySenderContext";
                                    r077.A0A("com.facebook.messaging.replies.plugins.replies.sendercontext.ReplySenderContext", str11, "com.facebook.messaging.threadview.plugins.interfaces.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", andIncrement, "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "com.facebook.messaging.replies.plugins.replies.RepliesRepliesKillSwitch", "isSingleLine");
                                } else {
                                    if (!AnonymousClass656.A07(anonymousClass656)) {
                                        if (AnonymousClass656.A08(anonymousClass656)) {
                                            andIncrement = atomicInteger.getAndIncrement();
                                            str11 = "messaging.groups.core.sendername.SenderNameDecoration";
                                            r077.A0A("com.facebook.messaging.groups.plugins.core.sendername.SenderNameDecoration", str11, "com.facebook.messaging.threadview.plugins.interfaces.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", andIncrement, "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "com.facebook.messaging.groups.plugins.core.GroupsCoreKillSwitch", "isSingleLine");
                                            z = true;
                                        }
                                        r077.A02((Exception) null, "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "isSingleLine", andIncrement2);
                                        return z;
                                    }
                                    andIncrement = atomicInteger.getAndIncrement();
                                    str11 = "messaging.forward.forward.messageindicator.MessageForwardIndicatorDecoration";
                                    r077.A0A("com.facebook.messaging.forward.plugins.forward.messageindicator.MessageForwardIndicatorDecoration", str11, "com.facebook.messaging.threadview.plugins.interfaces.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", andIncrement, "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "com.facebook.messaging.forward.plugins.forward.MessageForwardKillSwitch", "isSingleLine");
                                }
                                r077.A04((Exception) null, str11, "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "isSingleLine", andIncrement);
                                r077.A02((Exception) null, "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "isSingleLine", andIncrement2);
                                return z;
                            } catch (Throwable th) {
                                r077.A02((Exception) null, "messaging.threadview.message.decorations.sendercontext.SenderContextDecorationInterfaceSpec", "isSingleLine", andIncrement2);
                                throw th;
                            }
                        }
                    };
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -577314835:
                if (str.equals("com_facebook_msys_config_plugins_interfaces_flipper_FlipperPluginInterfaceSpec")) {
                    bar = new 1yP(context, (Context) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -558848724:
                if (str.equals("com_facebook_messaging_msys_thread_plugins_interfaces_composer_configuration_ComposerConfigurationInterfaceSpec")) {
                    bar = new 6zF(context, (Fragment) objArr[0], (ThreadKey) objArr[1], (5oY) objArr[3], (5oZ) objArr[4], (ImmutableSet) objArr[2], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -540373820:
                if (str.equals("com_facebook_messaging_bubbles_plugins_interfaces_threadviewintentcreator_BubblesThreadViewIntentCreatorInterfaceSpec")) {
                    bar = new BaQ(context, (ThreadKey) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -536323939:
                if (str.equals("com_facebook_messaging_inbox_plugins_interfaces_fragment_scrolllistener_FragmentScrollListenerInterfaceSpec")) {
                    bar = new 2Y8(context, (FbUserSession) objArr[1], (2S4) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -531487070:
                if (str.equals("com_facebook_messaging_navigation_plugins_interfaces_drawer_header_HomeDrawerHeaderInterfaceSpec")) {
                    bar = new C4N4(context, (FbUserSession) objArr[1], (C4Xo) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -526695554:
                if (str.equals("com_facebook_messaging_contextbanner_plugins_interfaces_grouppromptaccessory_GroupPromptContextBannerAccessoryInterfaceSpec")) {
                    Capabilities capabilities11 = (Capabilities) objArr[0];
                    bar = new Bab(context, (06Z) objArr[2], (ThreadKey) objArr[1], (ThreadSummary) objArr[3], capabilities11, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -519822504:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_message_content_MessageContentInterfaceSpec")) {
                    FbUserSession fbUserSession9 = (FbUserSession) objArr[0];
                    2S4 r077 = (2S4) objArr[1];
                    AnonymousClass622 anonymousClass6226 = (AnonymousClass622) objArr[2];
                    63V r078 = (63V) objArr[3];
                    Capabilities capabilities12 = (Capabilities) objArr[4];
                    C62q c62q = (C62q) objArr[5];
                    63W r079 = (63W) objArr[6];
                    63X r080 = (63X) objArr[7];
                    bar = new 63Y(context, (06Z) objArr[9], fbUserSession9, r077, (63D) objArr[8], c62q, r080, anonymousClass6226, r078, r079, capabilities12, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -513354211:
                if (str.equals("com_facebook_messaging_inbox_plugins_interfaces_fragment_pulltorefreshlistener_FragmentPullToRefreshListenerInterfaceSpec")) {
                    bar = new 6Dt(context, (2S4) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -499487285:
                if (str.equals("com_facebook_messaging_userstatus_plugins_interfaces_changelistener_ChangeViewerStatusListenerInterfaceSpec")) {
                    bar = new BbL(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -494655098:
                if (str.equals("com_facebook_messaging_groups_plugins_interfaces_memberlistsubtitle_MemberListSubtitleInterfaceSpec")) {
                    bar = new Bak(context, (ThreadSummary) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -478304578:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_colorscheme_ThreadViewColorSchemeInterfaceSpec")) {
                    bar = new 6jI(context, (ThreadKey) objArr[0], (ThreadViewSurfaceOptions) objArr[3], (CompositeThreadThemeInfo) objArr[1], (ThreadThemePayloadMap) objArr[2], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -434919598:
                if (str.equals("com_facebook_messaging_badges_plugins_interfaces_orbitbadgeoverlay_OrbitBadgeOverlayInterfaceSpec")) {
                    final MigColorScheme migColorScheme4 = (MigColorScheme) objArr[0];
                    final C1p8 c1p8 = (C1p8) objArr[1];
                    final int intValue2 = ((Number) objArr[2]).intValue();
                    final int intValue3 = ((Number) objArr[3]).intValue();
                    final int intValue4 = ((Number) objArr[4]).intValue();
                    bar = new Object(context, c1p8, migColorScheme4, str2, intValue2, intValue3, intValue4) { // from class: X.2ci
                        public final C2cj A00;

                        /* JADX WARN: Type inference failed for: r0v7, types: [X.2cj] */
                        {
                            if (!str2.equals("OrbitBadgeOverlay")) {
                                throw 1BL.A0l(str2);
                            }
                            this.A00 = new Object(context, c1p8, migColorScheme4, intValue2, intValue3, intValue4) { // from class: X.2cj
                                public Object A00;
                                public final int A01;
                                public final int A02;
                                public final int A03;
                                public final 1YC A04 = 1YC.A03;
                                public final C1p8 A05;
                                public final MigColorScheme A06;
                                public final Context A07;

                                {
                                    this.A07 = context;
                                    this.A06 = migColorScheme4;
                                    this.A05 = c1p8;
                                    this.A03 = intValue2;
                                    this.A02 = intValue3;
                                    this.A01 = intValue4;
                                }
                            };
                        }
                    };
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -405563885:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_titlebar_subtitlecomponent_TitleBarSubtitleComponentSpec")) {
                    final UserKey userKey2 = (UserKey) objArr[0];
                    final User user9 = (User) objArr[1];
                    final Capabilities capabilities13 = (Capabilities) objArr[2];
                    final ThreadSummary threadSummary13 = (ThreadSummary) objArr[3];
                    final 2Sh r081 = (2Sh) objArr[4];
                    final 2S4 r082 = (2S4) objArr[5];
                    bar = new Object(context, r082, threadSummary13, user9, userKey2, capabilities13, r081, str2) { // from class: X.6kk
                        public final C6kl A00;

                        /* JADX WARN: Type inference failed for: r0v7, types: [X.6kl] */
                        {
                            if (!str2.equals("All")) {
                                throw 1BL.A0l(str2);
                            }
                            this.A00 = new Object(context, r082, threadSummary13, user9, userKey2, capabilities13, r081) { // from class: X.6kl
                                public BusinessChatTitleBarSubtitleComponentImpl A01;
                                public CommunityChatTitleBarSubtitleImplementation A02;
                                public TasLabelSubtitleComponent A03;
                                public int[] A04;
                                public Object A05;
                                public Object A06;
                                public Object A07;
                                public final Context A09;
                                public final 2S4 A0A;
                                public final ThreadSummary A0B;
                                public final User A0C;
                                public final UserKey A0D;
                                public final Capabilities A0E;
                                public final 2Sh A0F;
                                public int A00 = -1;
                                public final 1YC A08 = 1YC.A03;

                                {
                                    this.A09 = context;
                                    this.A0D = userKey2;
                                    this.A0C = user9;
                                    this.A0E = capabilities13;
                                    this.A0B = threadSummary13;
                                    this.A0F = r081;
                                    this.A0A = r082;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:15:0x0075 A[Catch: Exception -> 0x00e1, all -> 0x00f8, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00e1, blocks: (B:5:0x0043, B:6:0x0048, B:9:0x0054, B:12:0x005c, B:15:0x0075, B:18:0x0080, B:22:0x0091, B:23:0x0098, B:25:0x00a6, B:28:0x00b4, B:29:0x00ba, B:31:0x00c1, B:32:0x00c7, B:33:0x00cb, B:33:0x00cb, B:36:0x00d9, B:42:0x00d3, B:44:0x0069), top: B:4:0x0043, outer: #0 }] */
                                /* JADX WARN: Removed duplicated region for block: B:39:0x0129  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A00(X.C6kl r301) {
                                    /*
                                        Method dump skipped, instructions count: 338
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C6kl.A00(X.6kl):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:15:0x0075 A[Catch: Exception -> 0x00f0, all -> 0x0107, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00f0, blocks: (B:5:0x0043, B:6:0x0048, B:9:0x0054, B:12:0x005c, B:15:0x0075, B:18:0x0080, B:19:0x0086, B:23:0x0095, B:24:0x009b, B:25:0x00a0, B:28:0x00ab, B:29:0x00b1, B:30:0x00b7, B:31:0x00bd, B:33:0x00c8, B:34:0x00ce, B:35:0x00d2, B:35:0x00d2, B:38:0x00e8, B:45:0x00e2, B:47:0x0069), top: B:4:0x0043, outer: #1 }] */
                                /* JADX WARN: Removed duplicated region for block: B:41:0x0138  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A01(X.C6kl r301) {
                                    /*
                                        Method dump skipped, instructions count: 353
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C6kl.A01(X.6kl):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:15:0x0075 A[Catch: Exception -> 0x0103, all -> 0x011a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0103, blocks: (B:5:0x0043, B:6:0x0048, B:9:0x0054, B:12:0x005c, B:15:0x0075, B:16:0x007b, B:18:0x0083, B:21:0x009e, B:22:0x00a5, B:24:0x00b4, B:25:0x00ba, B:26:0x00bf, B:27:0x00c5, B:28:0x00cb, B:30:0x00d3, B:33:0x00de, B:34:0x00e4, B:36:0x00eb, B:37:0x00f1, B:38:0x00f5, B:38:0x00f5, B:41:0x00fb, B:47:0x008f, B:49:0x0069), top: B:4:0x0043, outer: #1 }] */
                                /* JADX WARN: Removed duplicated region for block: B:44:0x014b  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A02(X.C6kl r301) {
                                    /*
                                        Method dump skipped, instructions count: 375
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C6kl.A02(X.6kl):boolean");
                                }
                            };
                        }
                    };
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -403918923:
                if (str.equals("com_facebook_mig_profileimage_plugins_interfaces_badge_BadgeInterfaceSpec")) {
                    bar = new C2qd(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -383224739:
                if (str.equals("com_facebook_messaging_threadsettings_plugins_interfaces_sectionfooter_SectionFooterInterfaceSpec")) {
                    bar = new BbG(context, (ThreadKey) objArr[0], (ThreadSummary) objArr[1], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -375570017:
                if (str.equals("com_facebook_messaging_threadsettings_plugins_interfaces_secondarysurface_SecondarySurfaceInterfaceSpec")) {
                    bar = new BbF(context, (ThreadKey) objArr[0], (DIi) objArr[2], (DHb) objArr[3], (DHc) objArr[4], (DHd) objArr[5], (UserKey) objArr[1], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -353479311:
                if (str.equals("com_facebook_orca_notify_plugins_interfaces_handler_MessagingNotificationHandlerInterfaceSpec")) {
                    bar = new 4aC(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -353153624:
                if (str.equals("com_facebook_messaging_aibot_plugins_interfaces_common_intf_AiBotResourceProviderPluginSpec")) {
                    bar = new 6qN(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -325777136:
                if (str.equals("com_facebook_messaging_communitymessaging_plugins_interfaces_joiningbottomsheetsubtitle_ChannelJoiningBottomSheetSubtitleInterfaceSpec")) {
                    bar = new BaW(context, (Context) objArr[0], (ThreadSummary) objArr[1], str2, (List) objArr[2]);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -302718742:
                if (str.equals("com_facebook_messaging_msys_thread_admin_plugins_interfaces_openactiongetter_OpenActionInterfaceSpec")) {
                    bar = new 7nP(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -298852291:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_message_attachments_MessageAttachmentInterfaceSpec")) {
                    final 63V r083 = (63V) objArr[0];
                    final AnonymousClass622 anonymousClass6227 = (AnonymousClass622) objArr[1];
                    final Capabilities capabilities14 = (Capabilities) objArr[2];
                    final 06Z r084 = (06Z) objArr[3];
                    final 1LI r085 = (1LI) objArr[4];
                    final C62h c62h = (C62h) objArr[5];
                    final 2Of r086 = (2Of) objArr[6];
                    final C62r c62r = (C62r) objArr[7];
                    final C62q c62q2 = (C62q) objArr[8];
                    final C63s c63s = (C63s) objArr[9];
                    final AnonymousClass632 anonymousClass632 = (AnonymousClass632) objArr[10];
                    final C62u c62u = (C62u) objArr[11];
                    final AnonymousClass633 anonymousClass633 = (AnonymousClass633) objArr[12];
                    final 63B r087 = (63B) objArr[13];
                    final C62w c62w = (C62w) objArr[14];
                    final FbUserSession fbUserSession10 = (FbUserSession) objArr[15];
                    bar = new Object(context, r084, fbUserSession10, r085, anonymousClass632, c63s, c62h, anonymousClass633, r087, c62w, c62r, c62q2, c62u, anonymousClass6227, r083, capabilities14, r086, str2) { // from class: X.63t
                        public final C63u A00;

                        /* JADX WARN: Type inference failed for: r0v7, types: [X.63u] */
                        {
                            if (!str2.equals("All")) {
                                throw 1BL.A0l(str2);
                            }
                            this.A00 = new Object(context, r084, fbUserSession10, r085, anonymousClass632, c63s, c62h, anonymousClass633, r087, c62w, c62r, c62q2, c62u, anonymousClass6227, r083, capabilities14, r086) { // from class: X.63u
                                public Object A00;
                                public Object A01;
                                public Object A02;
                                public Object A03;
                                public Object A04;
                                public Object A05;
                                public Object A06;
                                public Object A07;
                                public Object A08;
                                public final Context A09;
                                public final 06Z A0A;
                                public final FbUserSession A0B;
                                public final 1LI A0C;
                                public final 1YC A0D = 1YC.A03;
                                public final AnonymousClass632 A0E;
                                public final C63s A0F;
                                public final C62h A0G;
                                public final AnonymousClass633 A0H;
                                public final 63B A0I;
                                public final C62w A0J;
                                public final C62r A0K;
                                public final C62q A0L;
                                public final C62u A0M;
                                public final AnonymousClass622 A0N;
                                public final 63V A0O;
                                public final Capabilities A0P;
                                public final 2Of A0Q;

                                {
                                    this.A09 = context;
                                    this.A0O = r083;
                                    this.A0N = anonymousClass6227;
                                    this.A0P = capabilities14;
                                    this.A0A = r084;
                                    this.A0C = r085;
                                    this.A0G = c62h;
                                    this.A0Q = r086;
                                    this.A0K = c62r;
                                    this.A0L = c62q2;
                                    this.A0F = c63s;
                                    this.A0E = anonymousClass632;
                                    this.A0M = c62u;
                                    this.A0H = anonymousClass633;
                                    this.A0I = r087;
                                    this.A0J = c62w;
                                    this.A0B = fbUserSession10;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:16:0x00b5 A[Catch: Exception -> 0x0100, all -> 0x0117, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0100, blocks: (B:6:0x0043, B:7:0x0048, B:10:0x0054, B:13:0x005c, B:16:0x00b5, B:18:0x00c2, B:19:0x00c6, B:19:0x00c6, B:23:0x00d0, B:25:0x00de, B:30:0x00d8, B:31:0x0065, B:36:0x00a6, B:36:0x00a6, B:38:0x00aa, B:39:0x0074, B:41:0x0085, B:49:0x00a1, B:57:0x00ed, B:59:0x00f8, B:61:0x00ff), top: B:5:0x0043, outer: #1 }] */
                                /* JADX WARN: Removed duplicated region for block: B:28:0x0148  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A00(X.C63u r301) {
                                    /*
                                        Method dump skipped, instructions count: 369
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C63u.A00(X.63u):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:15:0x0075 A[Catch: Exception -> 0x00a6, all -> 0x00bd, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00a6, blocks: (B:5:0x0043, B:6:0x0048, B:9:0x0054, B:12:0x005c, B:15:0x0075, B:17:0x0082, B:18:0x0086, B:18:0x0086, B:22:0x0090, B:24:0x009e, B:30:0x0098, B:32:0x0069), top: B:4:0x0043, outer: #2 }] */
                                /* JADX WARN: Removed duplicated region for block: B:27:0x00ee  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A01(X.C63u r301) {
                                    /*
                                        Method dump skipped, instructions count: 279
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C63u.A01(X.63u):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:15:0x0075 A[Catch: Exception -> 0x00cd, all -> 0x00e4, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00cd, blocks: (B:5:0x0043, B:6:0x0048, B:9:0x0054, B:12:0x005c, B:15:0x0075, B:16:0x007b, B:18:0x0083, B:20:0x008c, B:21:0x0091, B:21:0x0091, B:25:0x009e, B:28:0x00aa, B:32:0x00ba, B:33:0x00c1, B:33:0x00c1, B:36:0x00c6, B:40:0x0069), top: B:4:0x0043, outer: #1 }] */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A02(X.C63u r301) {
                                    /*
                                        Method dump skipped, instructions count: 307
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C63u.A02(X.63u):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:20:0x0154  */
                                /* JADX WARN: Removed duplicated region for block: B:23:0x0080 A[Catch: Exception -> 0x010c, all -> 0x0123, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x010c, blocks: (B:5:0x0043, B:6:0x0048, B:9:0x0054, B:12:0x005c, B:15:0x0078, B:17:0x0104, B:23:0x0080, B:24:0x0086, B:25:0x008c, B:27:0x0099, B:28:0x009f, B:30:0x00a8, B:32:0x00b5, B:33:0x00bb, B:34:0x00c0, B:36:0x00ce, B:37:0x00d5, B:40:0x00df, B:41:0x00e5, B:42:0x00ec, B:44:0x00f2, B:47:0x00fe, B:49:0x0069), top: B:4:0x0043, outer: #0 }] */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A03(X.C63u r301) {
                                    /*
                                        Method dump skipped, instructions count: 384
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C63u.A03(X.63u):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:15:0x0077 A[Catch: Exception -> 0x00a8, all -> 0x00bf, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00a8, blocks: (B:5:0x0045, B:6:0x004a, B:9:0x0056, B:12:0x005e, B:15:0x0077, B:17:0x0084, B:18:0x0088, B:18:0x0088, B:22:0x0092, B:24:0x00a0, B:30:0x009a, B:32:0x006b), top: B:4:0x0045, outer: #2 }] */
                                /* JADX WARN: Removed duplicated region for block: B:27:0x00f0  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A04(X.C63u r301) {
                                    /*
                                        Method dump skipped, instructions count: 281
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C63u.A04(X.63u):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:15:0x0078 A[Catch: Exception -> 0x00a9, all -> 0x00c0, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00a9, blocks: (B:5:0x0046, B:6:0x004b, B:9:0x0057, B:12:0x005f, B:15:0x0078, B:17:0x0085, B:18:0x0089, B:18:0x0089, B:22:0x0093, B:24:0x00a1, B:30:0x009b, B:32:0x006c), top: B:4:0x0046, outer: #0 }] */
                                /* JADX WARN: Removed duplicated region for block: B:27:0x00f1  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A05(X.C63u r301) {
                                    /*
                                        Method dump skipped, instructions count: 282
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C63u.A05(X.63u):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:20:0x0157  */
                                /* JADX WARN: Removed duplicated region for block: B:23:0x0083 A[Catch: Exception -> 0x010f, all -> 0x0126, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x010f, blocks: (B:5:0x0046, B:6:0x004b, B:9:0x0057, B:12:0x005f, B:15:0x007b, B:17:0x0107, B:23:0x0083, B:24:0x0089, B:25:0x008f, B:27:0x009c, B:28:0x00a2, B:30:0x00ab, B:32:0x00b8, B:33:0x00be, B:34:0x00c3, B:36:0x00d1, B:37:0x00d8, B:40:0x00e2, B:41:0x00e8, B:42:0x00ef, B:44:0x00f5, B:47:0x0101, B:49:0x006c), top: B:4:0x0046, outer: #1 }] */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A06(X.C63u r301) {
                                    /*
                                        Method dump skipped, instructions count: 387
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C63u.A06(X.63u):boolean");
                                }
                            };
                        }
                    };
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -287891605:
                if (str.equals("com_facebook_messaging_navigation_home_tabs_plugins_interfaces_tabtoolbartitleshortcut_TabToolbarTitleShortcutHandlerInterfaceSpec")) {
                    bar = new KeW(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -245853044:
                if (str.equals("com_facebook_messaging_inbox_plugins_interfaces_itemsupplier_ItemSupplierInterfaceSpec")) {
                    bar = new 2Sm(context, (FbUserSession) objArr[0], (2S4) objArr[1], (2Si) objArr[2], (2Sk) objArr[3], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -221550900:
                if (str.equals("com_facebook_messaging_wellbeing_selfremediation_block_plugins_interfaces_blockmemberlistdata_BlockGroupMembersDataProviderInterfaceSpec")) {
                    Context context4 = (Context) objArr[0];
                    ThreadKey threadKey14 = (ThreadKey) objArr[1];
                    C25 c25 = (C25) objArr[2];
                    C3M c3m = (C3M) objArr[3];
                    bar = new BbN(context, context4, (FbUserSession) objArr[6], threadKey14, (BNT) objArr[4], c25, c3m, (BlockGroupMembersDataProviderInterfaceSpec$BlockMembersDataOverride) objArr[5], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -216590549:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_titlebar_buttons_TitleBarButtonsSpec")) {
                    final FbUserSession fbUserSession11 = (FbUserSession) objArr[0];
                    final ThreadKey threadKey15 = (ThreadKey) objArr[1];
                    final 5Sh r088 = (5Sh) objArr[2];
                    final 06Z r089 = (06Z) objArr[3];
                    final Capabilities capabilities15 = (Capabilities) objArr[4];
                    final NavigationTrigger navigationTrigger = (NavigationTrigger) objArr[5];
                    final ThreadViewColorScheme threadViewColorScheme = (ThreadViewColorScheme) objArr[6];
                    final 6FI r090 = (6FI) objArr[7];
                    final 64W r091 = (64W) objArr[8];
                    final String str11 = (String) objArr[9];
                    final C5xv c5xv = (C5xv) objArr[10];
                    bar = new Object(context, r089, fbUserSession11, threadKey15, navigationTrigger, r088, r091, threadViewColorScheme, c5xv, r090, capabilities15, str2, str11) { // from class: X.6l2
                        public final C6l3 A00;

                        /* JADX WARN: Type inference failed for: r0v7, types: [X.6l3] */
                        {
                            if (!str2.equals("All")) {
                                throw 1BL.A0l(str2);
                            }
                            this.A00 = new Object(context, r089, fbUserSession11, threadKey15, navigationTrigger, r088, r091, threadViewColorScheme, c5xv, r090, capabilities15, str11) { // from class: X.6l3
                                public ThreadTitleBarPageAppointmentButton A00;
                                public BuyerViewCatalogButton A01;
                                public ThreadViewTitleBarChannelInviteButtonImplementation A02;
                                public NotificationControlButton A03;
                                public ThreadedRepliesTitleBarOptionsButtonImpl A04;
                                public SubThreadListButton A05;
                                public TASEntrypointButton A06;
                                public NotificationButtonImplementation A07;
                                public ReportBeforeJoiningButtonImplementation A08;
                                public BroadcastChannelShareButtonImplementation A09;
                                public CallOptionsButtonImplementation A0A;
                                public BICCallRequestButton A0B;
                                public JoinCallButtonImplementation A0C;
                                public VideoCallingButtonImplementation A0D;
                                public VoipButtonImplementation A0E;
                                public C6l5 A0F;
                                public C6l5 A0G;
                                public C6l5 A0H;
                                public C6l5 A0I;
                                public 6lL A0J;
                                public 6lM A0K;
                                public ThreadSettingsButtonImplementation A0L;
                                public C15h A0M;
                                public C15h A0N;
                                public C15h A0O;
                                public C1v5 A0Q;
                                public Object A0R;
                                public Object A0S;
                                public Object A0T;
                                public Object A0U;
                                public Object A0V;
                                public Object A0W;
                                public Object A0X;
                                public Object A0Y;
                                public Object A0Z;
                                public Object A0a;
                                public Object A0b;
                                public Object A0c;
                                public Object A0d;
                                public Object A0e;
                                public Object A0f;
                                public Object A0g;
                                public boolean A0h;
                                public final Context A0i;
                                public final ThreadKey A0j;
                                public final 5Sh A0l;
                                public final ThreadViewColorScheme A0m;
                                public final 06Z A0n;
                                public final FbUserSession A0o;
                                public final NavigationTrigger A0p;
                                public final 64W A0q;
                                public final C5xv A0r;
                                public final 6FI A0s;
                                public final Capabilities A0t;
                                public final String A0u;
                                public int A0P = -1;
                                public final 1YC A0k = 1YC.A03;

                                {
                                    this.A0i = context;
                                    this.A0o = fbUserSession11;
                                    this.A0j = threadKey15;
                                    this.A0l = r088;
                                    this.A0n = r089;
                                    this.A0t = capabilities15;
                                    this.A0p = navigationTrigger;
                                    this.A0m = threadViewColorScheme;
                                    this.A0s = r090;
                                    this.A0q = r091;
                                    this.A0u = str11;
                                    this.A0r = c5xv;
                                }

                                public static int A00(C6l3 c6l3) {
                                    int i = c6l3.A0P;
                                    if (i == -1) {
                                        i = A0B(c6l3) ? 1 : 0;
                                        if (A0A(c6l3)) {
                                            i++;
                                        }
                                        if (A0C(c6l3)) {
                                            i++;
                                        }
                                        if (A09(c6l3)) {
                                            i++;
                                        }
                                        if (A0H(c6l3)) {
                                            i++;
                                        }
                                        if (A0E(c6l3)) {
                                            i++;
                                        }
                                        if (A0G(c6l3)) {
                                            i++;
                                        }
                                        if (A0F(c6l3)) {
                                            i++;
                                        }
                                        if (A0D(c6l3)) {
                                            i++;
                                        }
                                        if (A04(c6l3)) {
                                            i++;
                                        }
                                        if (A03(c6l3)) {
                                            i++;
                                        }
                                        if (A05(c6l3)) {
                                            i++;
                                        }
                                        if (A06(c6l3)) {
                                            i++;
                                        }
                                        if (A07(c6l3)) {
                                            i++;
                                        }
                                        if (A08(c6l3)) {
                                            i++;
                                        }
                                        if (A0I(c6l3)) {
                                            i++;
                                        }
                                        c6l3.A0P = i;
                                    }
                                    return i;
                                }

                                public static void A01(C6l3 c6l3) {
                                    synchronized (c6l3) {
                                        if (!c6l3.A0h) {
                                            if (c6l3.A0i == null) {
                                                throw AnonymousClass001.A0Q("The context passed in the TitleBarButtons.newBuilder() is null.\nIf you have other questions, please post it to group Android Messenger Modularity.");
                                            }
                                            c6l3.A0Q = C1v5.A01;
                                            c6l3.A0h = true;
                                        }
                                    }
                                }

                                public static final boolean A02(FbUserSession fbUserSession12, ThreadKey threadKey16, ThreadSummary threadSummary14, C6l5 c6l5, 5Sh r305, Capabilities capabilities16) {
                                    11T.A0F(fbUserSession12, 0);
                                    11T.A0F(threadSummary14, 2);
                                    11T.A0F(c6l5, 6);
                                    boolean A022 = c6l5.A02(fbUserSession12, threadKey16);
                                    boolean z = capabilities16.A00.get(25);
                                    boolean z2 = false;
                                    boolean z3 = !c6l5.A03(fbUserSession12, threadSummary14, r305.A05, false);
                                    if (A022 || (z && z3)) {
                                        z2 = true;
                                    }
                                    return z2;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:15:0x00ff A[Catch: Exception -> 0x01fa, all -> 0x0211, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x01fa, blocks: (B:5:0x004b, B:9:0x0055, B:12:0x005f, B:15:0x00ff, B:16:0x0105, B:18:0x0112, B:19:0x0118, B:21:0x011e, B:25:0x012d, B:26:0x0134, B:28:0x0142, B:31:0x0150, B:33:0x015e, B:34:0x0164, B:37:0x0170, B:38:0x0177, B:40:0x017d, B:43:0x0188, B:47:0x019b, B:50:0x01a9, B:51:0x01af, B:52:0x01b5, B:54:0x01c0, B:55:0x01c6, B:56:0x01ca, B:56:0x01ca, B:59:0x01d8, B:64:0x01d2, B:65:0x0068, B:66:0x006d, B:69:0x0079, B:72:0x0081, B:73:0x008a, B:78:0x00f0, B:78:0x00f0, B:80:0x00f4, B:81:0x0099, B:83:0x00ab, B:95:0x00eb, B:103:0x01e7, B:105:0x01f2, B:107:0x01f9), top: B:4:0x004b, outer: #1 }] */
                                /* JADX WARN: Removed duplicated region for block: B:62:0x024c  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A03(X.C6l3 r301) {
                                    /*
                                        Method dump skipped, instructions count: 646
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C6l3.A03(X.6l3):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:15:0x0099 A[Catch: Exception -> 0x0160, all -> 0x0177, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0160, blocks: (B:5:0x004a, B:9:0x0054, B:12:0x005e, B:15:0x0099, B:16:0x009f, B:18:0x00ac, B:19:0x00b2, B:21:0x00bb, B:22:0x00c2, B:24:0x00d0, B:28:0x00e5, B:31:0x012b, B:32:0x0131, B:33:0x0137, B:34:0x013d, B:36:0x0148, B:37:0x014e, B:38:0x0152, B:38:0x0152, B:41:0x0158, B:47:0x00ef, B:50:0x00f9, B:52:0x0107, B:53:0x010c, B:56:0x0115, B:57:0x0123, B:58:0x0067, B:59:0x006c, B:62:0x0078, B:65:0x0080, B:67:0x008d), top: B:4:0x004a, outer: #1 }] */
                                /* JADX WARN: Removed duplicated region for block: B:44:0x01a8  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A04(X.C6l3 r301) {
                                    /*
                                        Method dump skipped, instructions count: 468
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C6l3.A04(X.6l3):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:15:0x0099 A[Catch: Exception -> 0x013c, all -> 0x0153, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x013c, blocks: (B:5:0x004a, B:9:0x0054, B:12:0x005e, B:15:0x0099, B:17:0x00a6, B:19:0x00ac, B:22:0x00b6, B:25:0x00c2, B:26:0x00c8, B:29:0x00d3, B:30:0x00da, B:31:0x00e1, B:33:0x00ea, B:36:0x00f6, B:37:0x00fc, B:40:0x0107, B:41:0x010d, B:42:0x0113, B:44:0x011c, B:45:0x0122, B:46:0x0126, B:46:0x0126, B:49:0x0134, B:55:0x012e, B:56:0x0067, B:57:0x006c, B:60:0x0078, B:63:0x0080, B:65:0x008d), top: B:4:0x004a, outer: #0 }] */
                                /* JADX WARN: Removed duplicated region for block: B:52:0x0184  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A05(X.C6l3 r301) {
                                    /*
                                        Method dump skipped, instructions count: 429
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C6l3.A05(X.6l3):boolean");
                                }

                                /* JADX WARN: Code restructure failed: missing block: B:44:0x0195, code lost:
                                
                                    if (X.C5xr.A00(r0).AZk(36322499768829533L) != false) goto L81;
                                 */
                                /* JADX WARN: Removed duplicated region for block: B:15:0x0108 A[Catch: Exception -> 0x0204, all -> 0x021a, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0204, blocks: (B:5:0x004e, B:9:0x0058, B:12:0x0062, B:15:0x0108, B:16:0x010e, B:18:0x011b, B:20:0x0121, B:23:0x0130, B:26:0x013d, B:27:0x0144, B:30:0x0150, B:36:0x016b, B:37:0x0170, B:40:0x017c, B:42:0x018a, B:48:0x0168, B:50:0x0198, B:51:0x019e, B:52:0x01a4, B:53:0x01aa, B:54:0x01b0, B:55:0x01b6, B:57:0x01c9, B:58:0x01cf, B:59:0x01d4, B:59:0x01d4, B:62:0x01e2, B:67:0x01dc, B:68:0x006b, B:69:0x0070, B:72:0x007c, B:75:0x0084, B:76:0x008d, B:81:0x00f9, B:81:0x00f9, B:83:0x00fd, B:84:0x009c, B:86:0x00ae, B:99:0x00f4, B:106:0x01f1, B:108:0x01fc, B:110:0x0203), top: B:4:0x004e, outer: #3 }] */
                                /* JADX WARN: Removed duplicated region for block: B:65:0x0255  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A06(X.C6l3 r301) {
                                    /*
                                        Method dump skipped, instructions count: 654
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C6l3.A06(X.6l3):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:15:0x0099 A[Catch: Exception -> 0x01c2, all -> 0x01d8, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x01c2, blocks: (B:5:0x004a, B:9:0x0054, B:12:0x005e, B:15:0x0099, B:16:0x009f, B:17:0x00a5, B:18:0x00ab, B:19:0x00b1, B:20:0x00b7, B:21:0x00bd, B:23:0x00ca, B:24:0x00d0, B:26:0x00d9, B:28:0x00e3, B:30:0x00ed, B:32:0x00f7, B:34:0x0102, B:36:0x0109, B:39:0x0111, B:40:0x0117, B:42:0x011e, B:46:0x012e, B:47:0x0135, B:48:0x013c, B:51:0x0148, B:53:0x0156, B:57:0x0172, B:58:0x0178, B:59:0x017d, B:62:0x0186, B:63:0x018c, B:65:0x01a1, B:66:0x01a7, B:67:0x01ac, B:67:0x01ac, B:70:0x01ba, B:76:0x01b4, B:77:0x0067, B:78:0x006c, B:81:0x0078, B:84:0x0080, B:86:0x008d), top: B:4:0x004a, outer: #1 }] */
                                /* JADX WARN: Removed duplicated region for block: B:73:0x0206  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A07(X.C6l3 r301) {
                                    /*
                                        Method dump skipped, instructions count: 560
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C6l3.A07(X.6l3):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:15:0x0099 A[Catch: Exception -> 0x014c, all -> 0x0163, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x014c, blocks: (B:5:0x004a, B:9:0x0054, B:12:0x005e, B:15:0x0099, B:16:0x009f, B:17:0x00a5, B:19:0x00b2, B:20:0x00b8, B:22:0x00c1, B:23:0x00c7, B:24:0x00cc, B:28:0x00dc, B:30:0x00e3, B:33:0x00ef, B:36:0x00fb, B:37:0x0101, B:38:0x0107, B:39:0x010d, B:40:0x0113, B:41:0x0118, B:43:0x012b, B:44:0x0131, B:45:0x0136, B:45:0x0136, B:48:0x0144, B:54:0x013e, B:55:0x0067, B:56:0x006c, B:59:0x0078, B:62:0x0080, B:64:0x008d), top: B:4:0x004a, outer: #0 }] */
                                /* JADX WARN: Removed duplicated region for block: B:51:0x0194  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A08(X.C6l3 r301) {
                                    /*
                                        Method dump skipped, instructions count: 448
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C6l3.A08(X.6l3):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:15:0x009d A[Catch: Exception -> 0x014d, all -> 0x0164, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x014d, blocks: (B:5:0x004e, B:9:0x0058, B:12:0x0062, B:15:0x009d, B:16:0x00a3, B:17:0x00a9, B:19:0x00b6, B:20:0x00bc, B:22:0x00c5, B:23:0x00ca, B:23:0x00ca, B:28:0x00dc, B:29:0x00e3, B:31:0x00f2, B:32:0x00f8, B:33:0x00fd, B:35:0x0105, B:38:0x0111, B:39:0x0117, B:40:0x011c, B:42:0x012d, B:43:0x0132, B:44:0x0137, B:44:0x0137, B:47:0x0145, B:53:0x013f, B:54:0x006b, B:55:0x0070, B:58:0x007c, B:61:0x0084, B:63:0x0091), top: B:4:0x004e, outer: #1 }] */
                                /* JADX WARN: Removed duplicated region for block: B:50:0x01a1  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A09(X.C6l3 r301) {
                                    /*
                                        Method dump skipped, instructions count: 472
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C6l3.A09(X.6l3):boolean");
                                }

                                /* JADX WARN: Code restructure failed: missing block: B:56:0x015b, code lost:
                                
                                    if (X.1Wi.A00(r0).AZk(36320279274536185L) == false) goto L69;
                                 */
                                /* JADX WARN: Removed duplicated region for block: B:15:0x009d A[Catch: Exception -> 0x019b, all -> 0x01b2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x019b, blocks: (B:5:0x004e, B:9:0x0058, B:12:0x0062, B:15:0x009d, B:16:0x00a3, B:18:0x00b0, B:19:0x00b6, B:21:0x00bc, B:22:0x00c1, B:27:0x00d2, B:30:0x00de, B:34:0x00f2, B:35:0x00f9, B:37:0x0105, B:38:0x010c, B:39:0x0113, B:43:0x0121, B:45:0x0127, B:49:0x0136, B:52:0x0142, B:54:0x0150, B:57:0x015e, B:58:0x0164, B:59:0x016a, B:61:0x0175, B:62:0x017b, B:63:0x017f, B:63:0x017f, B:66:0x0193, B:71:0x0187, B:73:0x018c, B:75:0x018d, B:75:0x018d, B:77:0x006b, B:78:0x0070, B:81:0x007c, B:84:0x0084, B:86:0x0091), top: B:4:0x004e, outer: #0 }] */
                                /* JADX WARN: Removed duplicated region for block: B:69:0x01ea  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A0A(X.C6l3 r301) {
                                    /*
                                        Method dump skipped, instructions count: 548
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C6l3.A0A(X.6l3):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:15:0x0099 A[Catch: Exception -> 0x0116, all -> 0x012d, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0116, blocks: (B:5:0x004a, B:9:0x0054, B:12:0x005e, B:15:0x0099, B:17:0x00a6, B:19:0x00ac, B:20:0x00b1, B:25:0x00c2, B:28:0x00ce, B:29:0x00d3, B:30:0x00d9, B:31:0x00df, B:32:0x00e5, B:34:0x00f6, B:35:0x00fb, B:36:0x0100, B:36:0x0100, B:39:0x010e, B:45:0x0108, B:46:0x0067, B:47:0x006c, B:50:0x0078, B:53:0x0080, B:55:0x008d), top: B:4:0x004a, outer: #2 }] */
                                /* JADX WARN: Removed duplicated region for block: B:42:0x015e  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A0B(X.C6l3 r301) {
                                    /*
                                        Method dump skipped, instructions count: 391
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C6l3.A0B(X.6l3):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:16:0x0099 A[Catch: Exception -> 0x0186, all -> 0x019d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0186, blocks: (B:6:0x004a, B:10:0x0054, B:13:0x005e, B:16:0x0099, B:17:0x009f, B:19:0x00a7, B:21:0x00b5, B:23:0x00bc, B:25:0x00c3, B:26:0x00c8, B:31:0x00da, B:32:0x00df, B:34:0x00ec, B:37:0x0154, B:38:0x015a, B:40:0x0163, B:41:0x0169, B:42:0x016d, B:42:0x016d, B:45:0x017e, B:51:0x00f8, B:56:0x0109, B:59:0x0116, B:60:0x011c, B:62:0x0122, B:66:0x0134, B:67:0x0139, B:69:0x0146, B:72:0x0177, B:74:0x0178, B:74:0x0178, B:76:0x0067, B:77:0x006c, B:80:0x0078, B:83:0x0080, B:85:0x008d), top: B:5:0x004a, outer: #3 }] */
                                /* JADX WARN: Removed duplicated region for block: B:48:0x01ce  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A0C(X.C6l3 r301) {
                                    /*
                                        Method dump skipped, instructions count: 506
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C6l3.A0C(X.6l3):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:16:0x00f0 A[Catch: Exception -> 0x025d, all -> 0x0275, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x025d, blocks: (B:6:0x004d, B:10:0x005a, B:13:0x0066, B:16:0x00f0, B:17:0x00f6, B:18:0x00fc, B:19:0x0102, B:20:0x0108, B:22:0x0116, B:23:0x011c, B:25:0x0125, B:27:0x012f, B:29:0x0139, B:30:0x013e, B:30:0x013e, B:34:0x014a, B:37:0x0156, B:39:0x0162, B:40:0x0169, B:42:0x0172, B:46:0x0186, B:47:0x018d, B:49:0x0199, B:50:0x019e, B:52:0x01a7, B:54:0x01b9, B:57:0x01c5, B:58:0x01cc, B:59:0x01d3, B:62:0x01df, B:63:0x01e6, B:64:0x01ed, B:67:0x01f9, B:68:0x01ff, B:69:0x0205, B:70:0x020b, B:72:0x0220, B:73:0x0226, B:74:0x022b, B:74:0x022b, B:77:0x0239, B:82:0x0233, B:83:0x0070, B:84:0x0075, B:87:0x0081, B:90:0x008b, B:91:0x0095, B:96:0x00df, B:96:0x00df, B:98:0x00e4, B:99:0x00a6, B:101:0x00b8, B:109:0x00da, B:112:0x0248, B:114:0x0255, B:116:0x025c), top: B:5:0x004d, outer: #1 }] */
                                /* JADX WARN: Removed duplicated region for block: B:80:0x02b2  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A0D(X.C6l3 r301) {
                                    /*
                                        Method dump skipped, instructions count: 746
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C6l3.A0D(X.6l3):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:137:0x03aa  */
                                /* JADX WARN: Removed duplicated region for block: B:16:0x0105 A[Catch: Exception -> 0x0356, all -> 0x036d, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x0356, blocks: (B:6:0x004e, B:10:0x0058, B:13:0x0062, B:16:0x0105, B:17:0x010b, B:18:0x0111, B:19:0x0116, B:21:0x0121, B:22:0x0127, B:24:0x012f, B:26:0x0139, B:27:0x013e, B:27:0x013e, B:31:0x014a, B:34:0x0156, B:36:0x0165, B:37:0x016c, B:39:0x017b, B:40:0x0182, B:41:0x0189, B:43:0x0194, B:47:0x01a5, B:48:0x01ac, B:50:0x01b5, B:54:0x01c6, B:56:0x01cc, B:57:0x01d3, B:59:0x01e0, B:66:0x01fe, B:68:0x020c, B:71:0x021a, B:72:0x0221, B:73:0x0227, B:76:0x0232, B:77:0x0239, B:78:0x023f, B:82:0x024f, B:83:0x0256, B:85:0x0262, B:86:0x0269, B:88:0x0270, B:89:0x0277, B:93:0x0283, B:94:0x028a, B:96:0x0298, B:98:0x029f, B:99:0x02a4, B:101:0x02b2, B:103:0x02b9, B:106:0x02e4, B:107:0x02e9, B:109:0x0308, B:111:0x02c7, B:113:0x02cd, B:117:0x02d2, B:119:0x02d8, B:123:0x02db, B:125:0x030e, B:126:0x0313, B:127:0x0319, B:129:0x0324, B:130:0x032a, B:131:0x032e, B:131:0x032e, B:134:0x0334, B:139:0x02dc, B:139:0x02dc, B:141:0x006b, B:142:0x0070, B:145:0x007c, B:148:0x0084, B:149:0x008d, B:154:0x00f6, B:154:0x00f6, B:156:0x00fa, B:157:0x009c, B:159:0x00ae, B:171:0x00f1, B:174:0x0343, B:176:0x034e, B:178:0x0355), top: B:5:0x004e, outer: #6 }] */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A0E(X.C6l3 r301) {
                                    /*
                                        Method dump skipped, instructions count: 997
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C6l3.A0E(X.6l3):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:16:0x00de A[Catch: Exception -> 0x0230, all -> 0x0247, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0230, blocks: (B:6:0x004e, B:10:0x0058, B:13:0x0062, B:16:0x00de, B:17:0x00e4, B:18:0x00ea, B:19:0x00f0, B:21:0x00fd, B:22:0x0103, B:24:0x010c, B:26:0x0116, B:27:0x011b, B:27:0x011b, B:31:0x0125, B:34:0x0131, B:36:0x013d, B:37:0x0143, B:39:0x0149, B:43:0x015d, B:44:0x0164, B:46:0x0173, B:47:0x0179, B:48:0x017e, B:49:0x0184, B:50:0x018a, B:54:0x01a8, B:57:0x01d7, B:58:0x01dd, B:59:0x01e3, B:60:0x01e9, B:62:0x01fe, B:63:0x0204, B:64:0x0208, B:64:0x0208, B:67:0x020e, B:73:0x01c0, B:74:0x01cf, B:75:0x006b, B:76:0x0070, B:79:0x007c, B:82:0x0084, B:83:0x008d, B:88:0x00cf, B:88:0x00cf, B:90:0x00d3, B:91:0x009c, B:93:0x00ae, B:101:0x00ca, B:109:0x021d, B:111:0x0228, B:113:0x022f), top: B:5:0x004e, outer: #1 }] */
                                /* JADX WARN: Removed duplicated region for block: B:70:0x027f  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A0F(X.C6l3 r301) {
                                    /*
                                        Method dump skipped, instructions count: 694
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C6l3.A0F(X.6l3):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:16:0x00de A[Catch: Exception -> 0x0247, all -> 0x025e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0247, blocks: (B:6:0x004e, B:10:0x0058, B:13:0x0062, B:16:0x00de, B:17:0x00e4, B:18:0x00ea, B:19:0x00f0, B:20:0x00f6, B:21:0x00fc, B:25:0x010f, B:26:0x0116, B:28:0x011e, B:31:0x012a, B:32:0x0130, B:34:0x0139, B:36:0x0143, B:38:0x014d, B:40:0x0157, B:41:0x015c, B:41:0x015c, B:45:0x0166, B:48:0x0172, B:50:0x017e, B:51:0x0184, B:53:0x018a, B:57:0x019b, B:58:0x019f, B:60:0x01a6, B:62:0x01b5, B:65:0x01c1, B:66:0x01c7, B:67:0x01ce, B:70:0x01da, B:71:0x01df, B:72:0x01e4, B:75:0x01ef, B:76:0x01f5, B:77:0x01fb, B:79:0x020d, B:80:0x0213, B:81:0x0217, B:81:0x0217, B:84:0x0225, B:89:0x021f, B:90:0x006b, B:91:0x0070, B:94:0x007c, B:97:0x0084, B:98:0x008d, B:103:0x00cf, B:103:0x00cf, B:105:0x00d3, B:106:0x009c, B:108:0x00ae, B:116:0x00ca, B:119:0x0234, B:121:0x023f, B:123:0x0246), top: B:5:0x004e, outer: #4 }] */
                                /* JADX WARN: Removed duplicated region for block: B:87:0x0296  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A0G(X.C6l3 r301) {
                                    /*
                                        Method dump skipped, instructions count: 717
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C6l3.A0G(X.6l3):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:16:0x00f0 A[Catch: Exception -> 0x0276, all -> 0x028e, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0276, blocks: (B:6:0x004d, B:10:0x005a, B:13:0x0066, B:16:0x00f0, B:17:0x00f6, B:18:0x00fc, B:19:0x0102, B:20:0x0108, B:21:0x010e, B:25:0x0121, B:26:0x0128, B:28:0x0130, B:31:0x013d, B:32:0x0143, B:34:0x014c, B:36:0x0156, B:38:0x0160, B:40:0x016a, B:41:0x016f, B:41:0x016f, B:45:0x017b, B:48:0x0187, B:50:0x0193, B:51:0x019a, B:53:0x01a3, B:57:0x01b4, B:58:0x01b9, B:60:0x01c2, B:62:0x01d4, B:65:0x01e0, B:66:0x01e7, B:67:0x01ee, B:70:0x01fa, B:71:0x0201, B:72:0x0208, B:75:0x0214, B:76:0x021a, B:77:0x0220, B:78:0x0226, B:80:0x0239, B:81:0x023f, B:82:0x0244, B:82:0x0244, B:85:0x0252, B:90:0x024c, B:91:0x0070, B:92:0x0075, B:95:0x0081, B:98:0x008b, B:99:0x0095, B:104:0x00df, B:104:0x00df, B:106:0x00e4, B:107:0x00a6, B:109:0x00b8, B:117:0x00da, B:125:0x0261, B:127:0x026e, B:129:0x0275), top: B:5:0x004d, outer: #3 }] */
                                /* JADX WARN: Removed duplicated region for block: B:88:0x02cb  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A0H(X.C6l3 r301) {
                                    /*
                                        Method dump skipped, instructions count: 771
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C6l3.A0H(X.6l3):boolean");
                                }

                                /* JADX WARN: Code restructure failed: missing block: B:84:0x0208, code lost:
                                
                                    if (r0.A01(r0, r0.A0n) != false) goto L82;
                                 */
                                /* JADX WARN: Removed duplicated region for block: B:113:0x02dd  */
                                /* JADX WARN: Removed duplicated region for block: B:16:0x009d A[Catch: Exception -> 0x028e, all -> 0x02a5, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x028e, blocks: (B:6:0x004e, B:10:0x0058, B:13:0x0062, B:16:0x009d, B:17:0x00a3, B:18:0x00a9, B:20:0x00b4, B:21:0x00bb, B:23:0x00c9, B:24:0x00d2, B:26:0x00e1, B:27:0x00e7, B:28:0x00ec, B:30:0x00f6, B:32:0x00ff, B:37:0x0110, B:38:0x0117, B:41:0x0123, B:42:0x0129, B:46:0x013b, B:50:0x0150, B:54:0x0163, B:55:0x0169, B:56:0x016e, B:60:0x0180, B:65:0x019c, B:66:0x01a2, B:69:0x01bb, B:70:0x01c2, B:74:0x01d3, B:75:0x01da, B:77:0x01e8, B:80:0x01f6, B:82:0x0200, B:86:0x0216, B:87:0x021d, B:88:0x0224, B:89:0x022a, B:90:0x0230, B:91:0x0236, B:92:0x023c, B:93:0x0241, B:94:0x0247, B:95:0x024e, B:97:0x0254, B:99:0x0257, B:103:0x026e, B:105:0x0273, B:106:0x0277, B:107:0x027b, B:107:0x027b, B:110:0x01b3, B:117:0x0284, B:119:0x0289, B:121:0x028d, B:124:0x01ad, B:125:0x006b, B:126:0x0070, B:129:0x007c, B:132:0x0084, B:134:0x0091), top: B:5:0x004e, outer: #2 }] */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A0I(X.C6l3 r301) {
                                    /*
                                        Method dump skipped, instructions count: 785
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C6l3.A0I(X.6l3):boolean");
                                }
                            };
                        }
                    };
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -209233745:
                if (str.equals("com_facebook_messaging_rtc_incall_plugins_interfaces_notification_content_NotificationContentPluginInterfaceSpec")) {
                    bar = new HPX(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -207429224:
                if (str.equals("com_facebook_messaging_navigation_home_drawer_plugins_interfaces_drawerfoldermetadataprovider_DrawerFolderMetadataProviderInterfaceSpec")) {
                    bar = new C4MK(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -175344165:
                if (str.equals("com_facebook_messaging_tincan_tincanoverwamsys_plugins_interfaces_networkblocked_NetworkBlockedHandlerInterfaceSpec")) {
                    bar = new 3It(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -170281663:
                if (str.equals("com_facebook_messaging_settings_plugins_interfaces_mesettings_settingsitem_MeSettingsItemInterfaceSpec")) {
                    DFp dFp = (DFp) objArr[0];
                    bar = new Bb2(context, (06Z) objArr[1], (FbUserSession) objArr[3], (1pI) objArr[2], dFp, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -162001853:
                if (str.equals("com_facebook_presence_plugins_interfaces_msysportal_UnifiedPresenceMsysPortalMailboxInterfaceSpec")) {
                    bar = new HPf(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -141908774:
                if (str.equals("com_facebook_presence_plugins_interfaces_colorfilter_ColorFilterInterfaceSpec")) {
                    bar = new 1YP(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -115920294:
                if (str.equals("com_facebook_messaging_threadlist_plugins_interfaces_threadmenuitem_ThreadMenuItemInterfaceSpec")) {
                    ThreadSummary threadSummary14 = (ThreadSummary) objArr[0];
                    06Z r092 = (06Z) objArr[1];
                    2SI r093 = (2SI) objArr[2];
                    Capabilities capabilities16 = (Capabilities) objArr[3];
                    bar = new Bb5(context, r092, (FbUserSession) objArr[4], (CallerContext) objArr[5], (InboxTrackableItem) objArr[7], threadSummary14, r093, (User) objArr[6], capabilities16, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -69938222:
                if (str.equals("com_facebook_presence_plugins_interfaces_presenceread_PresenceReadInterfaceSpec")) {
                    bar = new C2fj(context, (FbUserSession) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -51619775:
                if (str.equals("com_facebook_messaging_omnipicker_plugins_interfaces_threadhostprovider_forfragment_OmnipickerThreadHostForFragmentProviderInterfaceSpec")) {
                    bar = new Bau(context, (Fragment) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -50687598:
                if (str.equals("com_facebook_messaging_rtc_plugins_interfaces_raisehands_entrypoint_RaiseHandsEntryPointInterfaceSpec")) {
                    bar = new 3Ir(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -33844292:
                if (str.equals("com_facebook_messaging_montage_viewer_plugins_interfaces_launcher_MontageViewerLauncherSpec")) {
                    bar = new 9Gl(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case -18516965:
                if (str.equals("com_facebook_messaging_business_bmcconsiderationgrowth_persistentnavigation_plugins_interfaces_persistentnavigationinterface_PersistentNavigationInterfaceSpec")) {
                    ThreadSummary threadSummary15 = (ThreadSummary) objArr[0];
                    9QS r094 = (9QS) objArr[1];
                    63D r095 = (63D) objArr[2];
                    bar = new 3Ic(context, (FbUserSession) objArr[3], r094, threadSummary15, r095, (6Fy) objArr[5], (Capabilities) objArr[4], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 6853530:
                if (str.equals("com_facebook_messaging_threadlist_plugins_interfaces_threadname_ThreadNameInterfaceSpec")) {
                    bar = new 2mD(context, (FbUserSession) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 12291866:
                if (str.equals("com_facebook_messaging_threadlist_plugins_interfaces_threadmetadataloader_ThreadMetadataLoaderInterfaceSpec")) {
                    bar = new 2VA(context, (Context) objArr[0], (FbUserSession) objArr[1], (2V3) objArr[2], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 22876219:
                if (str.equals("com_facebook_messaging_tincan_tincanoverwamsys_plugins_interfaces_dozemode_DozeModeHandlerInterfaceSpec")) {
                    bar = new Object(context, str2) { // from class: X.1yo
                        public final C1yp A00;

                        /* JADX WARN: Type inference failed for: r0v7, types: [X.1yp] */
                        {
                            if (!str2.equals("All")) {
                                throw 1BL.A0l(str2);
                            }
                            this.A00 = new Object(context) { // from class: X.1yp
                                public C1v5 A00;
                                public 1SI A01;
                                public AdvancedCryptoTransportDozeModeHandlerImplementation A02;
                                public Object A03;
                                public boolean A04;
                                public final Context A05;
                                public final 1YC A06 = 1YC.A03;

                                {
                                    this.A05 = context;
                                }

                                public static void A00(C1yp c1yp) {
                                    synchronized (c1yp) {
                                        if (!c1yp.A04) {
                                            if (c1yp.A05 == null) {
                                                throw AnonymousClass001.A0Q("The context passed in the DozeModeHandlerInterface.newBuilder() is null.\nIf you have other questions, please post it to group Android Messenger Modularity.");
                                            }
                                            c1yp.A00 = C1v5.A01;
                                            c1yp.A04 = true;
                                        }
                                    }
                                }
                            };
                        }
                    };
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 28958740:
                if (str.equals("com_facebook_messaging_contacts_picker_plugins_interfaces_viewindexablelist_ViewIndexableListInterfaceSpec")) {
                    bar = new 3Ig(context, (DJm) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 40540420:
                if (str.equals("com_facebook_messaging_bubbles_plugins_interfaces_statelistener_BubblesStateListenerInterfaceSpec")) {
                    bar = new BaP(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 42655932:
                if (str.equals("com_facebook_messaging_audio_plugins_interfaces_recording_VoiceClipRecordingListenerInterfaceSpec")) {
                    6Qf r096 = (6Qf) objArr[0];
                    bar = new HPO(context, (2S4) objArr[2], (HQx) objArr[1], (6Qb) objArr[3], r096, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 59328750:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_hintcardvisibility_HintCardVisibilitySpec")) {
                    bar = new 6Hn(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 70802262:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_message_decorations_photo_PhotoWrapperDecorationInterfaceSpec")) {
                    AnonymousClass622 anonymousClass6228 = (AnonymousClass622) objArr[0];
                    7Y8 r097 = (7Y8) objArr[2];
                    bar = new 7Yg(context, (5SA) objArr[5], (ImageAttachmentData) objArr[3], r097, anonymousClass6228, str2, ((Number) objArr[4]).intValue());
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 72996854:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_oldmessageslogger_OldMessagesLoggerSpec")) {
                    bar = new 6FT(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 83838206:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_data_secondaryload_SecondaryDataLoadInterfaceSpec")) {
                    FbUserSession fbUserSession12 = (FbUserSession) objArr[0];
                    ThreadKey threadKey16 = (ThreadKey) objArr[1];
                    6iB r098 = (6iB) objArr[2];
                    63D r099 = (63D) objArr[3];
                    bar = new 6iE(context, fbUserSession12, (2S4) objArr[4], threadKey16, r098, r099, (ThreadViewSurfaceOptions) objArr[6], str2, (String) objArr[5]);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 85878427:
                if (str.equals("com_facebook_ui_media_contentsearch_gif_plugins_interfaces_tincangif_TincanGifInterfaceSpec")) {
                    bar = new HPi(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 87487678:
                if (str.equals("com_facebook_messaging_inboxfolders_plugins_interfaces_subheader_FoldersSubheaderInterfaceSpec")) {
                    2SI r0100 = (2SI) objArr[0];
                    C3Ne c3Ne = (C3Ne) objArr[1];
                    bar = new 3In(context, (FbUserSession) objArr[2], (LithoView) objArr[3], c3Ne, (ThreadKey) objArr[5], r0100, (Long) objArr[4], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 122500328:
                if (str.equals("com_facebook_messaging_inbox_plugins_interfaces_itemlistprocessor_ItemListProcessorInterfaceSpec")) {
                    bar = new Object(context, str2) { // from class: X.2gz
                        public final C2h1 A00;

                        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                        {
                            C2h1 c2h1;
                            switch (str2.hashCode()) {
                                case -1079793746:
                                    if (str2.equals("PublicChannelInvitesList")) {
                                        c2h1 = new C2h1(context) { // from class: X.3W6
                                            public Object A01;
                                            public String[] A02;
                                            public final Context A03;
                                            public int A00 = -1;
                                            public final 1YC A04 = 1YC.A03;

                                            {
                                                this.A03 = context;
                                            }

                                            /* JADX WARN: Removed duplicated region for block: B:15:0x006f A[Catch: Exception -> 0x0082, all -> 0x0096, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0082, blocks: (B:5:0x003b, B:6:0x0040, B:9:0x004c, B:12:0x0054, B:15:0x006f, B:17:0x007b, B:20:0x0076, B:22:0x0060), top: B:4:0x003b, outer: #0 }] */
                                            /* JADX WARN: Removed duplicated region for block: B:20:0x0076 A[Catch: Exception -> 0x0082, all -> 0x0096, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0082, blocks: (B:5:0x003b, B:6:0x0040, B:9:0x004c, B:12:0x0054, B:15:0x006f, B:17:0x007b, B:20:0x0076, B:22:0x0060), top: B:4:0x003b, outer: #0 }] */
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                                            */
                                            private boolean A00() {
                                                /*
                                                    Method dump skipped, instructions count: 208
                                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: X.C3W6.A00():boolean");
                                            }

                                            /* JADX WARN: Multi-variable type inference failed */
                                            /* JADX WARN: Type inference failed for: r303v1 */
                                            /* JADX WARN: Type inference failed for: r303v4 */
                                            /* JADX WARN: Type inference failed for: r303v5 */
                                            @Override // X.C2h1
                                            public String[] Ayr() {
                                                String[] strArr = this.A02;
                                                if (strArr == null) {
                                                    int i = this.A00;
                                                    int i2 = i;
                                                    if (i == -1) {
                                                        boolean A002 = A00();
                                                        this.A00 = A002 ? 1 : 0;
                                                        i2 = A002;
                                                    }
                                                    strArr = new String[i2];
                                                    if (A00()) {
                                                        strArr[0] = "public_channel_invites_null_state";
                                                    }
                                                    this.A02 = strArr;
                                                }
                                                return strArr;
                                            }

                                            @Override // X.C2h1
                                            public ImmutableList CZJ(HeterogeneousMap heterogeneousMap, 2Sh r303, ImmutableList immutableList3, String str12) {
                                                ImmutableList immutableList4 = immutableList3;
                                                AtomicInteger atomicInteger = C1Y6.A04;
                                                int andIncrement = atomicInteger.getAndIncrement();
                                                1YC r0101 = this.A04;
                                                r0101.A08("com.facebook.messaging.inbox.plugins.interfaces.itemlistprocessor.ItemListProcessorInterfaceSpec", "messaging.inbox.itemlistprocessor.ItemListProcessorInterfaceSpec", "processItems", andIncrement);
                                                ImmutableList immutableList5 = null;
                                                Exception e = null;
                                                try {
                                                    if (str12.equals("public_channel_invites_null_state") && A00()) {
                                                        int andIncrement2 = atomicInteger.getAndIncrement();
                                                        r0101.A0A("com.facebook.messaging.publicchats.plugins.threadlist.leftnav.nullstateitemlistprocessor.PublicChannelInvitesNullStateItemListProcessorImplementation", "messaging.publicchats.threadlist.leftnav.nullstateitemlistprocessor.PublicChannelInvitesNullStateItemListProcessorImplementation", "com.facebook.messaging.inbox.plugins.interfaces.itemlistprocessor.ItemListProcessorInterfaceSpec", andIncrement2, "messaging.inbox.itemlistprocessor.ItemListProcessorInterfaceSpec", "com.facebook.messaging.publicchats.plugins.threadlist.PublicchatsThreadlistKillSwitch", "processItems");
                                                        try {
                                                            try {
                                                                11T.A0F(immutableList3, 0);
                                                                if (immutableList3.isEmpty()) {
                                                                    immutableList4 = ImmutableList.of((Object) new 2UP() { // from class: X.37V
                                                                        public static final StaticUnitConfig A00 = new StaticUnitConfig(0S2.A0G, "826634672929275", null, true);

                                                                        {
                                                                            StaticUnitConfig staticUnitConfig = A00;
                                                                        }

                                                                        public 2hJ AsW() {
                                                                            return 2hJ.A0t;
                                                                        }

                                                                        public String BKC() {
                                                                            return "PUBLIC_CHANNEL_INVITES_NULL_STATE";
                                                                        }

                                                                        public boolean BVb(2UR r302) {
                                                                            11T.A0F(r302, 0);
                                                                            return r302 instanceof C37V;
                                                                        }
                                                                    });
                                                                    11T.A0A(immutableList4);
                                                                }
                                                                immutableList5 = immutableList4;
                                                                r0101.A09("messaging.publicchats.threadlist.leftnav.nullstateitemlistprocessor.PublicChannelInvitesNullStateItemListProcessorImplementation", "messaging.inbox.itemlistprocessor.ItemListProcessorInterfaceSpec", "processItems", andIncrement2);
                                                            } catch (Exception e2) {
                                                                e = e2;
                                                                throw e;
                                                            }
                                                        } catch (Throwable th) {
                                                            r0101.A04(e, "messaging.publicchats.threadlist.leftnav.nullstateitemlistprocessor.PublicChannelInvitesNullStateItemListProcessorImplementation", "messaging.inbox.itemlistprocessor.ItemListProcessorInterfaceSpec", "processItems", andIncrement2);
                                                            throw th;
                                                        }
                                                    }
                                                    r0101.A02((Exception) null, "messaging.inbox.itemlistprocessor.ItemListProcessorInterfaceSpec", "processItems", andIncrement);
                                                    return immutableList5;
                                                } catch (Throwable th2) {
                                                    r0101.A02(e, "messaging.inbox.itemlistprocessor.ItemListProcessorInterfaceSpec", "processItems", andIncrement);
                                                    throw th2;
                                                }
                                            }
                                        };
                                        break;
                                    }
                                    throw 1BL.A0l(str2);
                                case 70791782:
                                    if (str2.equals("Inbox")) {
                                        c2h1 = new C2h1(context) { // from class: X.2h0
                                            public 2fV A01;
                                            public 2fV A02;
                                            public 2Ra A03;
                                            public C2h8 A04;
                                            public InboxAdsItemListProcessorImplementation A05;
                                            public SwitchFoldersAndActiveNowInInboxImplementation A06;
                                            public CcInboxUpsellsItemListProcessor A07;
                                            public PeopleYouMayKnowItemProcessor A08;
                                            public InboxSubtabsItemlistprocessorImplementation A09;
                                            public FilterSegmentedControlItemProcessor A0A;
                                            public NewFriendBumpInboxItemsProcessor A0B;
                                            public C1v5 A0C;
                                            public Object A0D;
                                            public Object A0E;
                                            public Object A0F;
                                            public Object A0G;
                                            public Object A0H;
                                            public Object A0I;
                                            public Object A0J;
                                            public Object A0K;
                                            public Object A0L;
                                            public boolean A0M;
                                            public String[] A0N;
                                            public final Context A0O;
                                            public int A00 = -1;
                                            public final 1YC A0P = 1YC.A03;

                                            {
                                                this.A0O = context;
                                            }

                                            private void A00() {
                                                synchronized (this) {
                                                    if (!this.A0M) {
                                                        if (this.A0O == null) {
                                                            throw AnonymousClass001.A0Q("The context passed in the ItemListProcessorInterface.newBuilder() is null.\nIf you have other questions, please post it to group Android Messenger Modularity.");
                                                        }
                                                        this.A0C = C1v5.A01;
                                                        this.A0M = true;
                                                    }
                                                }
                                            }

                                            /* JADX WARN: Removed duplicated region for block: B:15:0x0091 A[Catch: Exception -> 0x00e1, all -> 0x00f5, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00e1, blocks: (B:5:0x0043, B:9:0x004d, B:12:0x0057, B:15:0x0091, B:16:0x0096, B:20:0x00a7, B:21:0x00ae, B:23:0x00b6, B:24:0x00bb, B:24:0x00bb, B:27:0x00c1, B:28:0x00c7, B:29:0x00cb, B:29:0x00cb, B:32:0x00d9, B:38:0x00d3, B:39:0x0060, B:40:0x0065, B:43:0x0071, B:46:0x0079, B:48:0x0085), top: B:4:0x0043, outer: #0 }] */
                                            /* JADX WARN: Removed duplicated region for block: B:35:0x0126  */
                                            /* JADX WARN: Removed duplicated region for block: B:38:0x00d3 A[Catch: Exception -> 0x00e1, all -> 0x00f5, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00e1, blocks: (B:5:0x0043, B:9:0x004d, B:12:0x0057, B:15:0x0091, B:16:0x0096, B:20:0x00a7, B:21:0x00ae, B:23:0x00b6, B:24:0x00bb, B:24:0x00bb, B:27:0x00c1, B:28:0x00c7, B:29:0x00cb, B:29:0x00cb, B:32:0x00d9, B:38:0x00d3, B:39:0x0060, B:40:0x0065, B:43:0x0071, B:46:0x0079, B:48:0x0085), top: B:4:0x0043, outer: #0 }] */
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                                            */
                                            private boolean A01() {
                                                /*
                                                    Method dump skipped, instructions count: 335
                                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: X.C2h0.A01():boolean");
                                            }

                                            /* JADX WARN: Removed duplicated region for block: B:15:0x00d0  */
                                            /* JADX WARN: Removed duplicated region for block: B:33:0x0179  */
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                                            */
                                            private boolean A02() {
                                                /*
                                                    Method dump skipped, instructions count: 418
                                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: X.C2h0.A02():boolean");
                                            }

                                            /* JADX WARN: Removed duplicated region for block: B:15:0x0091  */
                                            /* JADX WARN: Removed duplicated region for block: B:37:0x013b  */
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                                            */
                                            private boolean A03() {
                                                /*
                                                    Method dump skipped, instructions count: 356
                                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: X.C2h0.A03():boolean");
                                            }

                                            /* JADX WARN: Removed duplicated region for block: B:15:0x0097 A[Catch: Exception -> 0x00ba, all -> 0x00ce, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ba, blocks: (B:5:0x0046, B:9:0x0050, B:12:0x005a, B:15:0x0097, B:17:0x00b2, B:23:0x009f, B:24:0x00a3, B:25:0x00a8, B:26:0x00ac, B:26:0x00ac, B:28:0x0063, B:29:0x0068, B:32:0x0074, B:35:0x007c, B:37:0x0088), top: B:4:0x0046, outer: #2 }] */
                                            /* JADX WARN: Removed duplicated region for block: B:20:0x00ff  */
                                            /* JADX WARN: Removed duplicated region for block: B:23:0x009f A[Catch: Exception -> 0x00ba, all -> 0x00ce, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ba, blocks: (B:5:0x0046, B:9:0x0050, B:12:0x005a, B:15:0x0097, B:17:0x00b2, B:23:0x009f, B:24:0x00a3, B:25:0x00a8, B:26:0x00ac, B:26:0x00ac, B:28:0x0063, B:29:0x0068, B:32:0x0074, B:35:0x007c, B:37:0x0088), top: B:4:0x0046, outer: #2 }] */
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                                            */
                                            private boolean A04() {
                                                /*
                                                    Method dump skipped, instructions count: 296
                                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: X.C2h0.A04():boolean");
                                            }

                                            /* JADX WARN: Removed duplicated region for block: B:15:0x0094  */
                                            /* JADX WARN: Removed duplicated region for block: B:33:0x0126  */
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                                            */
                                            private boolean A05() {
                                                /*
                                                    Method dump skipped, instructions count: 335
                                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: X.C2h0.A05():boolean");
                                            }

                                            /* JADX WARN: Removed duplicated region for block: B:20:0x012a  */
                                            /* JADX WARN: Removed duplicated region for block: B:23:0x009f  */
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                                            */
                                            private boolean A06() {
                                                /*
                                                    Method dump skipped, instructions count: 339
                                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: X.C2h0.A06():boolean");
                                            }

                                            /* JADX WARN: Removed duplicated region for block: B:20:0x0158  */
                                            /* JADX WARN: Removed duplicated region for block: B:23:0x00c7 A[Catch: Exception -> 0x0113, all -> 0x0127, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0113, blocks: (B:5:0x0046, B:9:0x0050, B:12:0x005a, B:15:0x00bf, B:17:0x010b, B:23:0x00c7, B:25:0x00d1, B:26:0x00d8, B:27:0x00df, B:30:0x00eb, B:33:0x00f7, B:35:0x00fc, B:36:0x0101, B:37:0x0105, B:37:0x0105, B:39:0x0063, B:40:0x0068, B:43:0x0074, B:46:0x007c, B:47:0x0085, B:50:0x008e, B:52:0x009c, B:53:0x00a2, B:55:0x00a8, B:58:0x00b0), top: B:4:0x0046, outer: #0 }] */
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                                            */
                                            private boolean A07() {
                                                /*
                                                    Method dump skipped, instructions count: 385
                                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: X.C2h0.A07():boolean");
                                            }

                                            /* JADX WARN: Removed duplicated region for block: B:15:0x00d4 A[Catch: Exception -> 0x013d, all -> 0x0151, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x013d, blocks: (B:5:0x0046, B:9:0x0050, B:12:0x005a, B:15:0x00d4, B:18:0x00df, B:20:0x00ed, B:21:0x00f4, B:23:0x00fc, B:24:0x0101, B:24:0x0101, B:27:0x0106, B:28:0x010c, B:29:0x0110, B:29:0x0110, B:32:0x011e, B:37:0x0118, B:38:0x0063, B:39:0x0068, B:42:0x0074, B:45:0x007c, B:46:0x0085, B:51:0x00c5, B:51:0x00c5, B:53:0x00c9, B:54:0x0094, B:56:0x00a5, B:64:0x00c0, B:67:0x012b, B:69:0x0135, B:71:0x013c), top: B:4:0x0046, outer: #0 }] */
                                            /* JADX WARN: Removed duplicated region for block: B:35:0x0182  */
                                            /* JADX WARN: Removed duplicated region for block: B:37:0x0118 A[Catch: Exception -> 0x013d, all -> 0x0151, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x013d, blocks: (B:5:0x0046, B:9:0x0050, B:12:0x005a, B:15:0x00d4, B:18:0x00df, B:20:0x00ed, B:21:0x00f4, B:23:0x00fc, B:24:0x0101, B:24:0x0101, B:27:0x0106, B:28:0x010c, B:29:0x0110, B:29:0x0110, B:32:0x011e, B:37:0x0118, B:38:0x0063, B:39:0x0068, B:42:0x0074, B:45:0x007c, B:46:0x0085, B:51:0x00c5, B:51:0x00c5, B:53:0x00c9, B:54:0x0094, B:56:0x00a5, B:64:0x00c0, B:67:0x012b, B:69:0x0135, B:71:0x013c), top: B:4:0x0046, outer: #0 }] */
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                                            */
                                            private boolean A08() {
                                                /*
                                                    Method dump skipped, instructions count: 427
                                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: X.C2h0.A08():boolean");
                                            }

                                            /* JADX WARN: Removed duplicated region for block: B:16:0x00d4  */
                                            /* JADX WARN: Removed duplicated region for block: B:32:0x0180  */
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                                            */
                                            private boolean A09() {
                                                /*
                                                    Method dump skipped, instructions count: 425
                                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: X.C2h0.A09():boolean");
                                            }

                                            /* JADX WARN: Multi-variable type inference failed */
                                            /* JADX WARN: Type inference failed for: r0v107, types: [int] */
                                            /* JADX WARN: Type inference failed for: r0v109, types: [int] */
                                            /* JADX WARN: Type inference failed for: r0v111, types: [int] */
                                            /* JADX WARN: Type inference failed for: r0v113, types: [int] */
                                            /* JADX WARN: Type inference failed for: r0v115, types: [int] */
                                            /* JADX WARN: Type inference failed for: r0v117, types: [int] */
                                            /* JADX WARN: Type inference failed for: r0v119, types: [int] */
                                            /* JADX WARN: Type inference failed for: r0v121, types: [int] */
                                            /* JADX WARN: Type inference failed for: r303v1 */
                                            /* JADX WARN: Type inference failed for: r303v43 */
                                            /* JADX WARN: Type inference failed for: r303v44 */
                                            @Override // X.C2h1
                                            public String[] Ayr() {
                                                String[] strArr = this.A0N;
                                                if (strArr == null) {
                                                    int i = this.A00;
                                                    int i2 = i;
                                                    if (i == -1) {
                                                        boolean A012 = A01();
                                                        boolean z = A012;
                                                        if (A08()) {
                                                            z = (A012 ? 1 : 0) + 1;
                                                        }
                                                        boolean z2 = z;
                                                        if (A07()) {
                                                            z2 = (z ? 1 : 0) + 1;
                                                        }
                                                        boolean z3 = z2;
                                                        if (A05()) {
                                                            z3 = (z2 ? 1 : 0) + 1;
                                                        }
                                                        boolean z4 = z3;
                                                        if (A04()) {
                                                            z4 = (z3 ? 1 : 0) + 1;
                                                        }
                                                        boolean z5 = z4;
                                                        if (A02()) {
                                                            z5 = (z4 ? 1 : 0) + 1;
                                                        }
                                                        boolean z6 = z5;
                                                        if (A03()) {
                                                            z6 = (z5 ? 1 : 0) + 1;
                                                        }
                                                        boolean z7 = z6;
                                                        if (A09()) {
                                                            z7 = (z6 ? 1 : 0) + 1;
                                                        }
                                                        boolean z8 = z7;
                                                        if (A06()) {
                                                            z8 = (z7 ? 1 : 0) + 1;
                                                        }
                                                        this.A00 = z8 ? 1 : 0;
                                                        i2 = z8;
                                                    }
                                                    int i3 = 0;
                                                    strArr = new String[i2];
                                                    if (A01()) {
                                                        strArr[0] = "inbox_ads";
                                                        i3 = 1;
                                                    }
                                                    if (A08()) {
                                                        strArr[i3] = "new_friend_bump_threads";
                                                        i3++;
                                                    }
                                                    if (A07()) {
                                                        strArr[i3] = "filter_segmented_control";
                                                        i3++;
                                                    }
                                                    if (A05()) {
                                                        strArr[i3] = "inbox_subtabs";
                                                        i3++;
                                                    }
                                                    if (A04()) {
                                                        strArr[i3] = "people_you_may_know";
                                                        i3++;
                                                    }
                                                    if (A02()) {
                                                        strArr[i3] = "switch_active_now_and_folders";
                                                        i3++;
                                                    }
                                                    if (A03()) {
                                                        strArr[i3] = "cc_inbox_upsells";
                                                        i3++;
                                                    }
                                                    if (A09()) {
                                                        strArr[i3] = "inbox_multi_select_mode_enabled";
                                                        i3++;
                                                    }
                                                    if (A06()) {
                                                        strArr[i3] = "inbox_subtabs_null_state";
                                                    }
                                                    this.A0N = strArr;
                                                }
                                                return strArr;
                                            }

                                            /*  JADX ERROR: Types fix failed
                                                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                                                	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                                                	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                                                	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                                                	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                                                	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                                                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                                                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
                                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
                                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
                                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
                                                */
                                            /* JADX WARN: Failed to calculate best type for var: r319v0 ??
                                            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
                                             */
                                            /* JADX WARN: Failed to calculate best type for var: r319v0 ??
                                            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
                                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
                                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
                                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                                             */
                                            /* JADX WARN: Failed to calculate best type for var: r321v0 ??
                                            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
                                             */
                                            /* JADX WARN: Failed to calculate best type for var: r321v0 ??
                                            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
                                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
                                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
                                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                                             */
                                            /* JADX WARN: Not initialized variable reg: 319, insn: 0x1b49: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r319 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:1356:0x1b35 */
                                            /* JADX WARN: Not initialized variable reg: 321, insn: 0x1b3d: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r321 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:1356:0x1b35 */
                                            @Override // X.C2h1
                                            public com.google.common.collect.ImmutableList CZJ(com.facebook.xapp.messaging.map.HeterogeneousMap r302, X.2Sh r303, com.google.common.collect.ImmutableList r304, java.lang.String r305) {
                                                /*
                                                    Method dump skipped, instructions count: 7063
                                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: X.C2h0.CZJ(com.facebook.xapp.messaging.map.HeterogeneousMap, X.2Sh, com.google.common.collect.ImmutableList, java.lang.String):com.google.common.collect.ImmutableList");
                                            }
                                        };
                                        break;
                                    }
                                    throw 1BL.A0l(str2);
                                case 1487485112:
                                    if (str2.equals("CommunityChannelList")) {
                                        c2h1 = new C2h1(context) { // from class: X.3W5
                                            public Object A01;
                                            public String[] A02;
                                            public final Context A03;
                                            public int A00 = -1;
                                            public final 1YC A04 = 1YC.A03;

                                            {
                                                this.A03 = context;
                                            }

                                            /* JADX WARN: Removed duplicated region for block: B:15:0x006f A[Catch: Exception -> 0x0082, all -> 0x0096, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0082, blocks: (B:5:0x003b, B:6:0x0040, B:9:0x004c, B:12:0x0054, B:15:0x006f, B:17:0x007b, B:20:0x0076, B:22:0x0060), top: B:4:0x003b, outer: #0 }] */
                                            /* JADX WARN: Removed duplicated region for block: B:20:0x0076 A[Catch: Exception -> 0x0082, all -> 0x0096, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0082, blocks: (B:5:0x003b, B:6:0x0040, B:9:0x004c, B:12:0x0054, B:15:0x006f, B:17:0x007b, B:20:0x0076, B:22:0x0060), top: B:4:0x003b, outer: #0 }] */
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                                            */
                                            private boolean A00() {
                                                /*
                                                    Method dump skipped, instructions count: 208
                                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: X.C3W5.A00():boolean");
                                            }

                                            /* JADX WARN: Multi-variable type inference failed */
                                            /* JADX WARN: Type inference failed for: r303v1 */
                                            /* JADX WARN: Type inference failed for: r303v4 */
                                            /* JADX WARN: Type inference failed for: r303v5 */
                                            @Override // X.C2h1
                                            public String[] Ayr() {
                                                String[] strArr = this.A02;
                                                if (strArr == null) {
                                                    int i = this.A00;
                                                    int i2 = i;
                                                    if (i == -1) {
                                                        boolean A002 = A00();
                                                        this.A00 = A002 ? 1 : 0;
                                                        i2 = A002;
                                                    }
                                                    strArr = new String[i2];
                                                    if (A00()) {
                                                        strArr[0] = "community_insights_dashboard_entrypoint";
                                                    }
                                                    this.A02 = strArr;
                                                }
                                                return strArr;
                                            }

                                            @Override // X.C2h1
                                            public ImmutableList CZJ(HeterogeneousMap heterogeneousMap, 2Sh r303, ImmutableList immutableList3, String str12) {
                                                ImmutableList immutableList4 = immutableList3;
                                                AtomicInteger atomicInteger = C1Y6.A04;
                                                int andIncrement = atomicInteger.getAndIncrement();
                                                1YC r0101 = this.A04;
                                                r0101.A08("com.facebook.messaging.inbox.plugins.interfaces.itemlistprocessor.ItemListProcessorInterfaceSpec", "messaging.inbox.itemlistprocessor.ItemListProcessorInterfaceSpec", "processItems", andIncrement);
                                                ImmutableList immutableList5 = null;
                                                try {
                                                    if (str12.equals("community_insights_dashboard_entrypoint") && A00()) {
                                                        int andIncrement2 = atomicInteger.getAndIncrement();
                                                        r0101.A0A("com.facebook.messaging.communitymessaging.plugins.insights.insightsdashboardentrypointitemlistprocessor.InsightsDashboardEntryPointItemListProcessorImplementation", "messaging.communitymessaging.insights.insightsdashboardentrypointitemlistprocessor.InsightsDashboardEntryPointItemListProcessorImplementation", "com.facebook.messaging.inbox.plugins.interfaces.itemlistprocessor.ItemListProcessorInterfaceSpec", andIncrement2, "messaging.inbox.itemlistprocessor.ItemListProcessorInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.insights.CommunitymessagingInsightsKillSwitch", "processItems");
                                                        try {
                                                            try {
                                                                11T.A0F(immutableList3, 0);
                                                                BLL bll = (BLL) r303.A01((String) null, BLL.class);
                                                                if (bll != null) {
                                                                    int ordinal = bll.ordinal();
                                                                    if (ordinal != -1 && ordinal != 0 && ordinal != 2) {
                                                                        if (ordinal != 3 && ordinal != 1) {
                                                                            throw 1BK.A1F();
                                                                        }
                                                                        immutableList5 = immutableList4;
                                                                        r0101.A09("messaging.communitymessaging.insights.insightsdashboardentrypointitemlistprocessor.InsightsDashboardEntryPointItemListProcessorImplementation", "messaging.inbox.itemlistprocessor.ItemListProcessorInterfaceSpec", "processItems", andIncrement2);
                                                                    }
                                                                }
                                                                ImmutableList.Builder builder = ImmutableList.builder();
                                                                Iterator it = immutableList4.iterator();
                                                                while (it.hasNext()) {
                                                                    Object next = it.next();
                                                                    if (!(next instanceof B5G)) {
                                                                        builder.m11011add(next);
                                                                    }
                                                                }
                                                                immutableList4 = 1Fj.A01(builder);
                                                                immutableList5 = immutableList4;
                                                                r0101.A09("messaging.communitymessaging.insights.insightsdashboardentrypointitemlistprocessor.InsightsDashboardEntryPointItemListProcessorImplementation", "messaging.inbox.itemlistprocessor.ItemListProcessorInterfaceSpec", "processItems", andIncrement2);
                                                            } catch (Exception e) {
                                                                throw e;
                                                            }
                                                        } catch (Throwable th) {
                                                            r0101.A04((Exception) null, "messaging.communitymessaging.insights.insightsdashboardentrypointitemlistprocessor.InsightsDashboardEntryPointItemListProcessorImplementation", "messaging.inbox.itemlistprocessor.ItemListProcessorInterfaceSpec", "processItems", andIncrement2);
                                                            throw th;
                                                        }
                                                    }
                                                    r0101.A02((Exception) null, "messaging.inbox.itemlistprocessor.ItemListProcessorInterfaceSpec", "processItems", andIncrement);
                                                    return immutableList5;
                                                } catch (Throwable th2) {
                                                    r0101.A02((Exception) null, "messaging.inbox.itemlistprocessor.ItemListProcessorInterfaceSpec", "processItems", andIncrement);
                                                    throw th2;
                                                }
                                            }
                                        };
                                        break;
                                    }
                                    throw 1BL.A0l(str2);
                                case 2001077986:
                                    if (str2.equals("NoProcessors")) {
                                        c2h1 = new C2h1(context) { // from class: X.3W4
                                            public String[] A01;
                                            public final Context A02;
                                            public int A00 = -1;
                                            public final 1YC A03 = 1YC.A03;

                                            {
                                                this.A02 = context;
                                            }

                                            @Override // X.C2h1
                                            public String[] Ayr() {
                                                String[] strArr = this.A01;
                                                if (strArr == null) {
                                                    int i = this.A00;
                                                    if (i == -1) {
                                                        i = 0;
                                                        this.A00 = 0;
                                                    }
                                                    strArr = new String[i];
                                                    this.A01 = strArr;
                                                }
                                                return strArr;
                                            }

                                            @Override // X.C2h1
                                            public ImmutableList CZJ(HeterogeneousMap heterogeneousMap, 2Sh r303, ImmutableList immutableList3, String str12) {
                                                int A002 = 1BK.A00();
                                                1YC r0101 = this.A03;
                                                r0101.A08("com.facebook.messaging.inbox.plugins.interfaces.itemlistprocessor.ItemListProcessorInterfaceSpec", "messaging.inbox.itemlistprocessor.ItemListProcessorInterfaceSpec", "processItems", A002);
                                                r0101.A02((Exception) null, "messaging.inbox.itemlistprocessor.ItemListProcessorInterfaceSpec", "processItems", A002);
                                                return null;
                                            }
                                        };
                                        break;
                                    }
                                    throw 1BL.A0l(str2);
                                default:
                                    throw 1BL.A0l(str2);
                            }
                            this.A00 = c2h1;
                        }
                    };
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 133088161:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_hintcard_HintCardInterfaceSpec")) {
                    06Z r0101 = (06Z) objArr[0];
                    String str12 = (String) objArr[1];
                    MigColorScheme migColorScheme5 = (MigColorScheme) objArr[2];
                    FbUserSession fbUserSession13 = (FbUserSession) objArr[3];
                    ThreadSummary threadSummary16 = (ThreadSummary) objArr[4];
                    User user10 = (User) objArr[5];
                    5Sl r0102 = (5Sl) objArr[6];
                    6IV r0103 = (6IV) objArr[7];
                    64W r0104 = (64W) objArr[8];
                    Capabilities capabilities17 = (Capabilities) objArr[9];
                    bar = new C6lb(context, r0101, fbUserSession13, threadSummary16, r0102, (5Sh) objArr[12], r0104, (63D) objArr[10], (ThreadViewParams) objArr[11], r0103, migColorScheme5, user10, capabilities17, str2, str12);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 189195791:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_messagelistitem_MessageListItemInterfaceSpec")) {
                    ThreadKey threadKey17 = (ThreadKey) objArr[0];
                    FbUserSession fbUserSession14 = (FbUserSession) objArr[1];
                    ThreadSummary threadSummary17 = (ThreadSummary) objArr[2];
                    User user11 = (User) objArr[3];
                    06Z r0105 = (06Z) objArr[4];
                    06Z r0106 = (06Z) objArr[5];
                    6Fa r0107 = (6Fa) objArr[6];
                    C62h c62h2 = (C62h) objArr[7];
                    6Fc r0108 = (6Fc) objArr[8];
                    bar = new 6kJ(context, r0105, r0106, fbUserSession14, threadKey17, threadSummary17, (6Fe) objArr[12], (63D) objArr[9], c62h2, (C62r) objArr[10], r0107, r0108, (63W) objArr[11], user11, (Capabilities) objArr[13], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 207100839:
                if (str.equals("com_facebook_messaging_sms_plugins_interfaces_mmsdownload_MmsDownloadInterfaceSpec")) {
                    bar = new EcV(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 234355279:
                if (str.equals("com_facebook_messaging_notify_plugins_interfaces_notificationbuilder_NewMessageNotificationBuilderSpec")) {
                    bar = new 5QH(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 238529389:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_messageclickhandler_MessageClickHandlerInterfaceSpec")) {
                    bar = new 6H0(context, (06Z) objArr[3], (2S4) objArr[0], (1pI) objArr[4], (64W) objArr[1], (63D) objArr[2], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 243249103:
                if (str.equals("com_facebook_messaging_publicchats_plugins_interfaces_creation_navigation_DiscoverablePublicChatCreationNavigationInterfaceSpec")) {
                    bar = new Baz(context, (1pI) objArr[0], (BLF) objArr[2], str2, ((Boolean) objArr[1]).booleanValue());
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 257546991:
                if (str.equals("com_facebook_messaging_highlightstab_components_plugins_interfaces_feedsection_HighlightsTabFeedSectionInterfaceSpec")) {
                    1Iw r0109 = (1Iw) objArr[0];
                    MigColorScheme migColorScheme6 = (MigColorScheme) objArr[1];
                    C9yk c9yk2 = (C9yk) objArr[2];
                    ImmutableList immutableList3 = (ImmutableList) objArr[3];
                    Aa5 aa5 = (Aa5) objArr[4];
                    AZg aZg2 = (AZg) objArr[5];
                    2Qz r0110 = (2Qz) objArr[6];
                    8LH r0111 = (8LH) objArr[7];
                    Aaj aaj2 = (Aaj) objArr[8];
                    9cG r0112 = (9cG) objArr[9];
                    FbUserSession fbUserSession15 = (FbUserSession) objArr[10];
                    bar = new 9Gh(context, (06Z) objArr[15], (MutableLiveData) objArr[11], (MutableLiveData) objArr[12], fbUserSession15, r0109, r0112, aaj2, r0111, r0110, c9yk2, aa5, (8Kh) objArr[14], migColorScheme6, aZg2, immutableList3, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 277722008:
                if (str.equals("com_facebook_messaging_virtualfolders_plugins_interfaces_webservicehandler_VirtualFolderWebServiceHandlerSpec")) {
                    bar = new 3Iv(context, (CQW) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 292043207:
                if (str.equals("com_facebook_messaging_inbox_plugins_interfaces_fragment_lifecycle_FragmentLifecycleInterfaceSpec")) {
                    2S4 r0113 = (2S4) objArr[0];
                    06Z r0114 = (06Z) objArr[1];
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) objArr[2];
                    2Vr r0115 = (2Vr) objArr[3];
                    bar = new 2Vs(context, (Fragment) objArr[5], r0114, lifecycleOwner, (FbUserSession) objArr[4], r0113, r0115, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 326224705:
                if (str.equals("com_facebook_messaging_threadlist_plugins_interfaces_eventsconfig_ThreadListEventsConfigProviderInterfaceSpec")) {
                    Context context5 = (Context) objArr[0];
                    1Va r0116 = (1Va) objArr[1];
                    bar = new 2W6(context, context5, (FbUserSession) objArr[3], (2S4) objArr[2], (ThreadKey) objArr[4], r0116, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 356174049:
                if (str.equals("com_facebook_messaging_composer_plugins_interfaces_tabbedextensions_ComposerTabbedExtensionSetConfigInterfaceSpec")) {
                    bar = new 6PI(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 361010252:
                if (str.equals("com_facebook_messaging_communitymessaging_plugins_interfaces_suggestchatrequestlist_SuggestedChatRequestListInterfaceSpec")) {
                    bar = new BaZ(context, (1Iw) objArr[0], (C0P) objArr[3], (MigColorScheme) objArr[1], str2, (List) objArr[2], ((Number) objArr[4]).longValue());
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 369870029:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_message_sendertile_tileviewparams_TileViewParamsInterfaceSpec")) {
                    final Message message3 = (Message) objArr[0];
                    final UserKey userKey3 = (UserKey) objArr[1];
                    final String str13 = (String) objArr[2];
                    final ThreadKey threadKey18 = (ThreadKey) objArr[3];
                    final String str14 = (String) objArr[4];
                    final String str15 = (String) objArr[5];
                    final ThreadSummary threadSummary18 = (ThreadSummary) objArr[6];
                    final FbUserSession fbUserSession16 = (FbUserSession) objArr[7];
                    bar = new Object(context, fbUserSession16, message3, threadKey18, threadSummary18, userKey3, str2, str13, str14, str15) { // from class: X.666
                        public final AnonymousClass667 A00;

                        /* JADX WARN: Type inference failed for: r0v7, types: [X.667] */
                        {
                            if (!str2.equals("All")) {
                                throw 1BL.A0l(str2);
                            }
                            this.A00 = new Object(context, fbUserSession16, message3, threadKey18, threadSummary18, userKey3, str13, str14, str15) { // from class: X.667
                                public UserTileViewImplementation A00;
                                public Object A01;
                                public Object A02;
                                public final Context A03;
                                public final FbUserSession A04;
                                public final Message A05;
                                public final ThreadKey A06;
                                public final ThreadSummary A07;
                                public final 1YC A08 = 1YC.A03;
                                public final UserKey A09;
                                public final String A0A;
                                public final String A0B;
                                public final String A0C;

                                {
                                    this.A03 = context;
                                    this.A05 = message3;
                                    this.A09 = userKey3;
                                    this.A0C = str13;
                                    this.A06 = threadKey18;
                                    this.A0A = str14;
                                    this.A0B = str15;
                                    this.A07 = threadSummary18;
                                    this.A04 = fbUserSession16;
                                }
                            };
                        }
                    };
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 379479903:
                if (str.equals("com_facebook_messaging_wellbeing_selfremediation_block_plugins_interfaces_blockrow_BlockRowInterfaceSpec")) {
                    bar = new BbO(context, (Resources) objArr[0], (ThreadSummary) objArr[2], (BNT) objArr[3], (User) objArr[1], (ImmutableMap) objArr[4], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 397719346:
                if (str.equals("com_facebook_messaging_reactions_plugins_interfaces_trayactionbutton_ReactionsTrayActionButtonInterfaceSpec")) {
                    bar = new HPV(context, (Integer) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 408026669:
                if (str.equals("com_facebook_messaging_communitymessaging_plugins_interfaces_recommendedcommunitieslist_RecommendedCommunitiesListInterfaceSpec")) {
                    1Iw r0117 = (1Iw) objArr[0];
                    MigColorScheme migColorScheme7 = (MigColorScheme) objArr[1];
                    List list2 = (List) objArr[2];
                    bar = new 3If(context, (Context) objArr[6], (06Z) objArr[3], r0117, (3GX) objArr[4], (2YQ) objArr[5], migColorScheme7, str2, list2, (C00m) objArr[7]);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 416137810:
                if (str.equals("com_facebook_messaging_friendsinboxunit_plugins_interfaces_loader_FriendsInboxUnitLoaderInterfaceSpec")) {
                    bar = new 2TD(context, (FbUserSession) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 422251194:
                if (str.equals("com_facebook_messaging_threadlist_plugins_interfaces_clickhandler_ClickHandlerInterfaceSpec")) {
                    C2gi c2gi2 = (C2gi) objArr[0];
                    06Z r0118 = (06Z) objArr[1];
                    LifecycleOwner lifecycleOwner2 = (LifecycleOwner) objArr[2];
                    1pI r0119 = (1pI) objArr[3];
                    FbUserSession fbUserSession17 = (FbUserSession) objArr[4];
                    49D r0120 = (49D) objArr[5];
                    bar = new 7U3(context, r0118, lifecycleOwner2, fbUserSession17, (CallerContext) objArr[6], r0119, (2YQ) objArr[8], c2gi2, r0120, str2, (String) objArr[7]);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 445380621:
                if (str.equals("com_facebook_messaging_powerups_plugins_interfaces_previewwrapper_PowerupPreviewWrapperInterfaceSpec")) {
                    final 9Xd r0121 = (9Xd) objArr[0];
                    bar = new Object(context, r0121, str2) { // from class: X.9Go
                        public final C9mS A00;

                        /* JADX WARN: Type inference failed for: r0v7, types: [X.9mS] */
                        {
                            if (!str2.equals("All")) {
                                throw 1BL.A0l(str2);
                            }
                            this.A00 = new Object(context, r0121) { // from class: X.9mS
                                public C1v5 A00;
                                public C60t A01;
                                public C60t A02;
                                public C60t A03;
                                public C60t A04;
                                public A8m A05;
                                public Object A06;
                                public Object A07;
                                public Object A08;
                                public Object A09;
                                public Object A0A;
                                public boolean A0B;
                                public final Context A0C;
                                public final 1YC A0D = 1YC.A03;
                                public final 9Xd A0E;

                                {
                                    this.A0C = context;
                                    this.A0E = r0121;
                                }

                                public static void A00(C9mS c9mS) {
                                    synchronized (c9mS) {
                                        if (!c9mS.A0B) {
                                            if (c9mS.A0C == null) {
                                                throw AnonymousClass001.A0Q("The context passed in the PowerupPreviewWrapperInterface.newBuilder() is null.\nIf you have other questions, please post it to group Android Messenger Modularity.");
                                            }
                                            c9mS.A00 = C1v5.A01;
                                            c9mS.A0B = true;
                                        }
                                    }
                                }

                                /* JADX WARN: Removed duplicated region for block: B:20:0x00b7 A[Catch: Exception -> 0x00e5, all -> 0x00f1, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00e5, blocks: (B:5:0x0046, B:9:0x0050, B:12:0x005a, B:15:0x00b0, B:17:0x00de, B:20:0x00b7, B:22:0x00c4, B:24:0x00ca, B:25:0x00cf, B:28:0x00d9, B:29:0x0063, B:30:0x0068, B:33:0x0074, B:36:0x007c, B:37:0x0085, B:40:0x008e, B:41:0x0093, B:43:0x0099, B:46:0x00a1), top: B:4:0x0046, outer: #0 }] */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A01(X.C9mS r301) {
                                    /*
                                        Method dump skipped, instructions count: 307
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C9mS.A01(X.9mS):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:20:0x00b7 A[Catch: Exception -> 0x00e5, all -> 0x00f1, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00e5, blocks: (B:5:0x0046, B:9:0x0050, B:12:0x005a, B:15:0x00b0, B:17:0x00de, B:20:0x00b7, B:22:0x00c4, B:24:0x00ca, B:25:0x00cf, B:28:0x00d9, B:29:0x0063, B:30:0x0068, B:33:0x0074, B:36:0x007c, B:37:0x0085, B:40:0x008e, B:41:0x0093, B:43:0x0099, B:46:0x00a1), top: B:4:0x0046, outer: #0 }] */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A02(X.C9mS r301) {
                                    /*
                                        Method dump skipped, instructions count: 307
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C9mS.A02(X.9mS):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:15:0x0094 A[Catch: Exception -> 0x00a7, all -> 0x00b3, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00a7, blocks: (B:5:0x0046, B:9:0x0050, B:12:0x005a, B:15:0x0094, B:17:0x00a0, B:20:0x009b, B:21:0x0063, B:22:0x0068, B:25:0x0074, B:28:0x007c, B:30:0x0088), top: B:4:0x0046, outer: #0 }] */
                                /* JADX WARN: Removed duplicated region for block: B:20:0x009b A[Catch: Exception -> 0x00a7, all -> 0x00b3, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00a7, blocks: (B:5:0x0046, B:9:0x0050, B:12:0x005a, B:15:0x0094, B:17:0x00a0, B:20:0x009b, B:21:0x0063, B:22:0x0068, B:25:0x0074, B:28:0x007c, B:30:0x0088), top: B:4:0x0046, outer: #0 }] */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A03(X.C9mS r301) {
                                    /*
                                        Method dump skipped, instructions count: 245
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C9mS.A03(X.9mS):boolean");
                                }
                            };
                        }
                    };
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 480329458:
                if (str.equals("com_facebook_messaging_composer_plugins_interfaces_textwatcher_ComposerTextWatcherInterfaceSpec")) {
                    2S4 r0122 = (2S4) objArr[0];
                    6Qf r0123 = (6Qf) objArr[1];
                    bar = new 6RD(context, (LifecycleOwner) objArr[4], (FbUserSession) objArr[5], r0122, (6QZ) objArr[2], (6Qb) objArr[3], r0123, (ThreadViewParams) objArr[6], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 499165551:
                if (str.equals("com_facebook_messaging_highlightstab_plugins_interfaces_bottomsheet_HighlightsFeedBottomSheetInterfaceSpec")) {
                    HighlightsFeedContent highlightsFeedContent3 = (HighlightsFeedContent) objArr[0];
                    AaL aaL = (AaL) objArr[1];
                    bar = new 9Gj(context, (1pI) objArr[2], (2ZG) objArr[4], highlightsFeedContent3, aaL, (8Kh) objArr[3], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 520339157:
                if (str.equals("com_facebook_messaging_tincan_tincanoverwamsys_plugins_interfaces_pushnotificationhandler_SecureMessageOverWAPushNotificationHandlerInterfaceSpec")) {
                    bar = new C3ra(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 538607967:
                if (str.equals("com_facebook_messaging_nativepagereply_plugins_interfaces_toolstabiteminterface_ToolsTabItemInterfaceSpec")) {
                    bar = new Bap(context, (FbUserSession) objArr[0], (C8m) objArr[3], (DFS) objArr[1], (MigColorScheme) objArr[2], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 544969186:
                if (str.equals("com_facebook_messaging_msys_thread_xma_plugins_interfaces_metadata_XmaMetadataInterfaceSpec")) {
                    bar = new 6AT(context, (C5pu) objArr[0], str2, ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 549424550:
                if (str.equals("com_facebook_messaging_groups_plugins_interfaces_memberlistheader_MemberListHeaderInterfaceSpec")) {
                    FbUserSession fbUserSession18 = (FbUserSession) objArr[0];
                    MigColorScheme migColorScheme8 = (MigColorScheme) objArr[1];
                    List list3 = (List) objArr[2];
                    ThreadSummary threadSummary19 = (ThreadSummary) objArr[3];
                    Integer num = (Integer) objArr[4];
                    bar = new Bai(context, (06Z) objArr[6], fbUserSession18, threadSummary19, migColorScheme8, (ParcelableSecondaryData) objArr[5], num, str2, list3);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 556148351:
                if (str.equals("com_facebook_messaging_sms_plugins_interfaces_smsgroupthreadsearch_SmsGroupThreadSearchInterfaceSpec")) {
                    bar = new 3Is(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 599214623:
                if (str.equals("com_facebook_messaging_accountlogin_plugins_interfaces_accesstoken_AccessTokenRetrieverSpec")) {
                    bar = new BaM(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 659334169:
                if (str.equals("com_facebook_messaging_navigation_plugins_interfaces_drawer_folder_folderitem_HomeDrawerFolderItemInterfaceSpec")) {
                    bar = new C4Lz(context, (FbUserSession) objArr[1], (C4Xo) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 693215039:
                if (str.equals("com_facebook_messaging_threadsettings_plugins_interfaces_menuitem_MenuItemInterfaceSpec")) {
                    ThreadKey threadKey19 = (ThreadKey) objArr[0];
                    User user12 = (User) objArr[1];
                    ThreadSummary threadSummary20 = (ThreadSummary) objArr[2];
                    2Sh r0124 = (2Sh) objArr[3];
                    Capabilities capabilities18 = (Capabilities) objArr[4];
                    1pI r0125 = (1pI) objArr[5];
                    06Z r0126 = (06Z) objArr[6];
                    DHb dHb = (DHb) objArr[7];
                    DHd dHd2 = (DHd) objArr[8];
                    bar = new BbB(context, r0126, (FbUserSession) objArr[10], r0125, threadKey19, threadSummary20, dHb, (DHc) objArr[9], dHd2, user12, capabilities18, r0124, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 696883327:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_message_bubble_TextBubbleComponentInterfaceSpec")) {
                    bar = new 64O(context, (Context) objArr[0], (FbUserSession) objArr[4], (2S4) objArr[1], (5zD) objArr[2], (AnonymousClass622) objArr[3], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 723514856:
                if (str.equals("com_facebook_messaging_inboxfolders_plugins_interfaces_upclickhandler_FoldersFragmentUpClickHandlerInterfaceSpec")) {
                    ParcelableSecondaryData parcelableSecondaryData2 = (ParcelableSecondaryData) objArr[0];
                    bar = new 3Ip(context, (FbUserSession) objArr[2], (2MX) objArr[1], parcelableSecondaryData2, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 729960153:
                if (str.equals("com_facebook_messaging_xma_template_plugins_interfaces_bodyextra_GenericXmaBodyExtraSpec")) {
                    AnonymousClass622 anonymousClass6229 = (AnonymousClass622) objArr[0];
                    bar = new 7Wp(context, (06Z) objArr[2], (6Az) objArr[1], anonymousClass6229, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 733589421:
                if (str.equals("com_facebook_messaging_communitymessaging_plugins_interfaces_externalsharehscrollbutton_ExternalShareHscrollButtonInterfaceSpec")) {
                    MigColorScheme migColorScheme9 = (MigColorScheme) objArr[0];
                    06Z r0127 = (06Z) objArr[1];
                    ThreadSummary threadSummary21 = (ThreadSummary) objArr[2];
                    String str16 = (String) objArr[3];
                    String str17 = (String) objArr[4];
                    String str18 = (String) objArr[5];
                    bar = new BaV(context, r0127, (EnumC3499Mfu) objArr[7], (FbUserSession) objArr[6], threadSummary21, migColorScheme9, str2, str16, str17, str18);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 770140741:
                if (str.equals("com_facebook_messaging_navigation_home_tabs_plugins_interfaces_tabcontent_TabContentInterfaceSpec")) {
                    06Z r0128 = (06Z) objArr[0];
                    2OW r0129 = (2OW) objArr[1];
                    2OO r0130 = (2OO) objArr[2];
                    MigColorScheme migColorScheme10 = (MigColorScheme) objArr[3];
                    2OX r0131 = (2OX) objArr[4];
                    User user13 = (User) objArr[5];
                    bar = new 2Ox(context, r0128, (FbUserSession) objArr[6], r0129, r0131, r0130, migColorScheme10, user13, str2, ((Number) objArr[8]).intValue(), ((Boolean) objArr[7]).booleanValue());
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 772007066:
                if (str.equals("com_facebook_messaging_composer_plugins_interfaces_popovertray_PopoverTrayInterfaceSpec")) {
                    bar = new 6Sr(context, (FbUserSession) objArr[2], (2S4) objArr[0], (2Wo) objArr[1], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 786443707:
                if (str.equals("com_facebook_messaging_sharing_broadcastflow_mutation_loader_plugins_interfaces_sectionsloader_BroadcastFlowSectionsLoaderInterfaceSpec")) {
                    DHX dhx = (DHX) objArr[0];
                    DJZ djz = (DJZ) objArr[1];
                    FbUserSession fbUserSession19 = (FbUserSession) objArr[2];
                    Set set = (Set) objArr[3];
                    BMK bmk = (BMK) objArr[4];
                    ListenableFuture listenableFuture = (ListenableFuture) objArr[5];
                    ListenableFuture listenableFuture2 = (ListenableFuture) objArr[6];
                    ListenableFuture listenableFuture3 = (ListenableFuture) objArr[7];
                    boolean booleanValue7 = ((Boolean) objArr[8]).booleanValue();
                    boolean booleanValue8 = ((Boolean) objArr[9]).booleanValue();
                    boolean booleanValue9 = ((Boolean) objArr[10]).booleanValue();
                    bar = new Bb3(context, fbUserSession19, bmk, dhx, djz, (C6r) objArr[13], (ImmutableList.Builder) objArr[11], (ImmutableList.Builder) objArr[12], listenableFuture, listenableFuture2, listenableFuture3, str2, set, booleanValue7, booleanValue8, booleanValue9);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 812001795:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_messagelistlongclickoutside_MessageListLongClickOutsideInterfaceSpec")) {
                    bar = new 6Me(context, (06Z) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 822776552:
                if (str.equals("com_facebook_messaging_montage_composer_plugins_interfaces_fbstorieseditor_MontageFbStoriesEditorLauncherSpec")) {
                    bar = new HPR(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 853955314:
                if (str.equals("com_facebook_messaging_omnipicker_plugins_interfaces_subtitle_OmnipickerSubtitleInterfaceSpec")) {
                    bar = new Bat(context, (Context) objArr[0], (ThreadSummary) objArr[1], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 867884065:
                if (str.equals("com_facebook_messaging_tincan_tincanoverwamsys_plugins_interfaces_skew_TincanOverWAServerAdjustedTimeManagerInterfaceSpec")) {
                    bar = new 3Iu(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 877380052:
                if (str.equals("com_facebook_messaging_msys_lifecycle_plugins_interfaces_lifecycle_MsysLifecyclePluginInterfaceSpec")) {
                    bar = new C1z3(context, (FbUserSession) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 887456790:
                if (str.equals("com_facebook_messaging_threadsettings_plugins_interfaces_lifecycle_ThreadSettingsLifecycleInterfaceSpec")) {
                    Context context6 = (Context) objArr[0];
                    LifecycleOwner lifecycleOwner3 = (LifecycleOwner) objArr[1];
                    DHc dHc2 = (DHc) objArr[2];
                    bar = new BbA(context, context6, lifecycleOwner3, (FbUserSession) objArr[4], (ThreadKey) objArr[3], dHc2, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 915215874:
                if (str.equals("com_facebook_messaging_composer_plugins_interfaces_topsheetcontainer_ComposerTopSheetContainerInterfaceSpec")) {
                    6Qf r0132 = (6Qf) objArr[0];
                    6QZ r0133 = (6QZ) objArr[1];
                    6Qb r0134 = (6Qb) objArr[2];
                    6Qc r0135 = (6Qc) objArr[3];
                    bar = new 6S8(context, (06Z) objArr[4], (FbUserSession) objArr[6], (2S4) objArr[5], r0135, r0133, r0134, r0132, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 961296833:
                if (str.equals("com_facebook_messaging_inboxfolders_plugins_interfaces_menu_FoldersMenuItemInterfaceSpec")) {
                    ParcelableSecondaryData parcelableSecondaryData3 = (ParcelableSecondaryData) objArr[0];
                    2Sh r0136 = (2Sh) objArr[1];
                    1F9 r0137 = (1F9) objArr[2];
                    1pI r0138 = (1pI) objArr[3];
                    bar = new 3Il(context, (AnonymousClass088) objArr[7], (06Z) objArr[4], r0138, (3Kf) objArr[8], r0137, (ThreadKey) objArr[5], parcelableSecondaryData3, r0136, (Long) objArr[6], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 970438352:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_contextmenu_ContextMenuPluginInterfaceSpec")) {
                    Message message4 = (Message) objArr[0];
                    Capabilities capabilities19 = (Capabilities) objArr[1];
                    ThreadSummary threadSummary22 = (ThreadSummary) objArr[2];
                    6Gc r0139 = (6Gc) objArr[3];
                    5zD r0140 = (5zD) objArr[4];
                    2Sh r0141 = (2Sh) objArr[5];
                    bar = new BbJ(context, (LifecycleOwner) objArr[7], (FbUserSession) objArr[6], r0140, message4, threadSummary22, r0139, capabilities19, r0141, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 994305024:
                if (str.equals("com_facebook_messaging_rtc_plugins_interfaces_activity_RtcInCallActivityClassProviderInterfaceSpec")) {
                    bar = new HPZ(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1004793673:
                if (str.equals("com_facebook_messaging_tincan_tincanoverwamsys_plugins_interfaces_appplatform_AppPlatformOverriderInterfaceSpec")) {
                    bar = new C25u(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1009127470:
                if (str.equals("com_facebook_messaging_threadwarning_plugins_interfaces_dialog_ThreadWarningDialogInterfaceSpec")) {
                    bar = new C5no(context, (FbUserSession) objArr[2], (ThreadSummary) objArr[0], str2, ((Number) objArr[1]).intValue());
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1030017490:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_banner_ThreadViewBannerInterfaceSpec")) {
                    bar = new 7No(context, (FbUserSession) objArr[0], (2S4) objArr[3], (ThreadKey) objArr[1], (63D) objArr[2], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1035170789:
                if (str.equals("com_facebook_messaging_navigation_home_tabs_plugins_interfaces_tabtoolbarbutton_TabToolbarButtonInterfaceSpec")) {
                    FbUserSession fbUserSession20 = (FbUserSession) objArr[0];
                    bar = new 2RN(context, (06Z) objArr[1], fbUserSession20, (1pI) objArr[3], (2OO) objArr[2], str2, ((Boolean) objArr[4]).booleanValue(), ((Boolean) objArr[5]).booleanValue(), ((Boolean) objArr[6]).booleanValue());
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1054012016:
                if (str.equals("com_facebook_messaging_threadsettings_plugins_interfaces_threadviewentrypoint_resulthandler_ThreadSettingsResultInterfaceSpec")) {
                    63D r0142 = (63D) objArr[0];
                    bar = new 7nS(context, (06Z) objArr[4], (ThreadKey) objArr[1], (5Sh) objArr[2], r0142, (MigColorScheme) objArr[3], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1060406143:
                if (str.equals("com_facebook_messaging_navigation_home_drawer_components_plugins_interfaces_folderaccessorycomponents_FolderAccessoryComponentsInterfaceSpec")) {
                    MigColorScheme migColorScheme11 = (MigColorScheme) objArr[0];
                    DrawerFolderKey drawerFolderKey = (DrawerFolderKey) objArr[1];
                    bar = new Baq(context, (FbUserSession) objArr[3], (C4NG) objArr[2], drawerFolderKey, migColorScheme11, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1061412659:
                if (str.equals("com_facebook_messaging_profile_plugins_interfaces_lifecycle_ContextualProfileLifecycleInterfaceSpec")) {
                    bar = new Bay(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1072408888:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_titlebar_customtitle_TitleBarCustomTitleInterfaceSpec")) {
                    bar = new C6bp(context, (Context) objArr[1], (2S4) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1077765964:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_message_decorations_wrapper_MessageWrapperDecorationInterfaceSpec")) {
                    AnonymousClass622 anonymousClass62210 = (AnonymousClass622) objArr[0];
                    63V r0143 = (63V) objArr[1];
                    Capabilities capabilities20 = (Capabilities) objArr[2];
                    5zD r0144 = (5zD) objArr[3];
                    C1ro c1ro = (C1ro) objArr[4];
                    C1rp c1rp = (C1rp) objArr[5];
                    64I r0145 = (64I) objArr[6];
                    Sticker sticker = (Sticker) objArr[7];
                    06Z r0146 = (06Z) objArr[8];
                    2S4 r0147 = (2S4) objArr[9];
                    63D r0148 = (63D) objArr[10];
                    AnonymousClass632 anonymousClass6322 = (AnonymousClass632) objArr[11];
                    C62v c62v = (C62v) objArr[12];
                    C62u c62u2 = (C62u) objArr[13];
                    AnonymousClass635 anonymousClass635 = (AnonymousClass635) objArr[14];
                    AnonymousClass636 anonymousClass636 = (AnonymousClass636) objArr[15];
                    AnonymousClass638 anonymousClass638 = (AnonymousClass638) objArr[16];
                    C62r c62r2 = (C62r) objArr[17];
                    bar = new 64X(context, r0146, (FbUserSession) objArr[21], r0147, r0144, c62v, anonymousClass6322, (64W) objArr[18], r0148, c62r2, c62u2, anonymousClass635, anonymousClass636, anonymousClass638, r0145, anonymousClass62210, r0143, sticker, capabilities20, c1ro, c1rp, str2, ((Boolean) objArr[19]).booleanValue(), ((Boolean) objArr[20]).booleanValue());
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1095705086:
                if (str.equals("com_facebook_messaging_rtc_plugins_interfaces_launcher_RtcLauncherFactoryInterfaceSpec")) {
                    bar = new 5Uw(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1122087314:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_titlebar_profileimage_TitleBarProfileImageInterfaceSpec")) {
                    final 2S4 r0149 = (2S4) objArr[0];
                    final Context context7 = (Context) objArr[1];
                    bar = new Object(context, context7, r0149, str2) { // from class: X.6bt
                        public final C6bu A00;

                        /* JADX WARN: Type inference failed for: r0v7, types: [X.6bu] */
                        {
                            if (!str2.equals("All")) {
                                throw 1BL.A0l(str2);
                            }
                            this.A00 = new Object(context, context7, r0149) { // from class: X.6bu
                                public Object A00;
                                public final 1YC A01 = 1YC.A03;
                                public final Context A02;
                                public final Context A03;
                                public final 2S4 A04;

                                {
                                    this.A03 = context;
                                    this.A04 = r0149;
                                    this.A02 = context7;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A00(X.C6bu r301) {
                                    /*
                                        Method dump skipped, instructions count: 238
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C6bu.A00(X.6bu):boolean");
                                }
                            };
                        }
                    };
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1136341286:
                if (str.equals("com_facebook_messaging_inboxfolders_plugins_interfaces_touchinterceptor_FoldersTouchInterceptorInterfaceSpec")) {
                    bar = new 3Io(context, (06Z) objArr[1], (ThreadKey) objArr[2], (2SI) objArr[0], (ParcelableSecondaryData) objArr[3], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1138088272:
                if (str.equals("com_facebook_messaging_montage_composer_plugins_interfaces_fbhomebase_MontageFbHomebaseLauncherSpec")) {
                    bar = new HPQ(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1144676048:
                if (str.equals("com_facebook_messaging_mentions_plugins_interfaces_composer_MentionRowSupplierSpec")) {
                    bar = new 6SM(context, (06Z) objArr[3], (6Qf) objArr[0], (5zD) objArr[4], (ThreadKey) objArr[1], (ThreadSummary) objArr[5], (Capabilities) objArr[2], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1154075892:
                if (str.equals("com_facebook_messaging_communitymessaging_plugins_interfaces_communitycreation_navigation_CommunityCreationNavigationInterfaceSpec")) {
                    bar = new BaT(context, (1pI) objArr[0], (2MX) objArr[1], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1164747863:
                if (str.equals("com_facebook_messaging_messengerprefs_plugins_interfaces_privacysettings_settingitems_PrivacySettingsItemInterfaceSpec")) {
                    bar = new Ban(context, (LifecycleOwner) objArr[0], (DFp) objArr[1], str2, (String) objArr[2]);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1188519908:
                if (str.equals("com_facebook_messaging_inbox_plugins_interfaces_searchbarfilter_SearchBarFilterInterfaceSpec")) {
                    bar = new 2hX(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1195487245:
                if (str.equals("com_facebook_messaging_navigation_plugins_interfaces_drawer_folder_fragmentcreator_HomeDrawerFolderFragmentCreatorInterfaceSpec")) {
                    final DrawerFolderKey drawerFolderKey2 = (DrawerFolderKey) objArr[0];
                    bar = new Object(context, drawerFolderKey2, str2) { // from class: X.7nQ
                        public final C4Uz A00;

                        /* JADX WARN: Type inference failed for: r0v7, types: [X.4Uz] */
                        {
                            if (!str2.equals("All")) {
                                throw 1BL.A0l(str2);
                            }
                            this.A00 = new Object(context, drawerFolderKey2) { // from class: X.4Uz
                                public 4ME A00;
                                public CommunitiesDrawerFragmentCreatorImplementation A01;
                                public TravelDrawerFragmentCreatorImplementation A02;
                                public C1v5 A03;
                                public C4M7 A04;
                                public Object A05;
                                public Object A06;
                                public Object A07;
                                public Object A08;
                                public Object A09;
                                public Object A0A;
                                public Object A0B;
                                public Object A0C;
                                public Object A0D;
                                public Object A0E;
                                public Object A0F;
                                public boolean A0G;
                                public final Context A0H;
                                public final DrawerFolderKey A0I;
                                public final 1YC A0J = 1YC.A03;

                                {
                                    this.A0H = context;
                                    this.A0I = drawerFolderKey2;
                                }

                                public static void A00(C4Uz c4Uz) {
                                    synchronized (c4Uz) {
                                        if (!c4Uz.A0G) {
                                            if (c4Uz.A0H == null) {
                                                throw AnonymousClass001.A0Q("The context passed in the HomeDrawerFolderFragmentCreatorInterface.newBuilder() is null.\nIf you have other questions, please post it to group Android Messenger Modularity.");
                                            }
                                            c4Uz.A03 = C1v5.A01;
                                            c4Uz.A0G = true;
                                        }
                                    }
                                }
                            };
                        }
                    };
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1211476666:
                if (str.equals("com_facebook_messaging_threadsettings_plugins_interfaces_colorscheme_ThreadSettingsColorSchemeInterfaceSpec")) {
                    bar = new Bb8(context, (ThreadKey) objArr[0], (ThreadSummary) objArr[1], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1215621262:
                if (str.equals("com_facebook_messaging_threadsettings_plugins_interfaces_secondarydata_ThreadSettingsSecondaryDataInterfaceSpec")) {
                    bar = new BbE(context, (FbUserSession) objArr[3], (ThreadKey) objArr[0], (C1x) objArr[1], (ParcelableSecondaryData) objArr[2], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1219447260:
                if (str.equals("com_facebook_messaging_rtc_incall_impl_active_drawer_ui_plugins_interfaces_abovedrawercontent_AboveDrawerContentInterfaceSpec")) {
                    bar = new HPW(context, (FbUserSession) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1260238817:
                if (str.equals("com_facebook_messaging_composer_plugins_interfaces_hotlike_HotLikeExtensionInterfaceSpec")) {
                    6Qb r0150 = (6Qb) objArr[0];
                    6Qc r0151 = (6Qc) objArr[1];
                    bar = new 6RO(context, (FbUserSession) objArr[4], (6Qd) objArr[2], r0151, r0150, (6Qf) objArr[3], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1267300210:
                if (str.equals("com_facebook_messaging_threadlist_plugins_interfaces_threadsnippet_ThreadSnippetInterfaceSpec")) {
                    bar = new 2mP(context, (FbUserSession) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1300763714:
                if (str.equals("com_facebook_messaging_auth_plugins_interfaces_sessionexpiredhandler_SessionExpiredHandlerInterfaceSpec")) {
                    bar = new BaO(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1322630191:
                if (str.equals("com_facebook_presence_plugins_interfaces_msysmessenger_UnifiedPresenceMsysMessengerMailboxInterfaceSpec")) {
                    bar = new HPe(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1324201903:
                if (str.equals("com_facebook_presence_plugins_interfaces_msysmessaginginblue_UnifiedPresenceMsysMessagingInBlueMailboxInterfaceSpec")) {
                    bar = new HPd(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1378321308:
                if (str.equals("com_facebook_messaging_composer_plugins_interfaces_appendmessagefield_ComposerAppendMessageFieldsOnSendInterfaceSpec")) {
                    2S4 r0152 = (2S4) objArr[0];
                    6Qb r0153 = (6Qb) objArr[1];
                    bar = new 6RJ(context, (FbUserSession) objArr[3], r0152, (6QZ) objArr[2], r0153, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1383848961:
                if (str.equals("com_facebook_messaging_notify_plugins_interfaces_sound_MessageNotificationSoundInterfaceSpec")) {
                    bar = new Object(context, str2) { // from class: X.4a8
                        public final C04194aA A00;

                        /* JADX WARN: Type inference failed for: r0v7, types: [X.4aA] */
                        {
                            if (!str2.equals("All")) {
                                throw 1BL.A0l(str2);
                            }
                            this.A00 = new Object(context) { // from class: X.4aA
                                public final 1YC A00 = 1YC.A03;
                                public final Context A01;

                                {
                                    this.A01 = context;
                                }
                            };
                        }
                    };
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1401332225:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_hintcardoverride_HintCardOverrideInterfaceSpec")) {
                    final 06Z r0154 = (06Z) objArr[0];
                    final 5zD r0155 = (5zD) objArr[2];
                    final FbUserSession fbUserSession21 = (FbUserSession) objArr[3];
                    final 5Sh r0156 = (5Sh) objArr[4];
                    final C6m3 c6m3 = (C6m3) objArr[5];
                    bar = new Object(context, r0154, fbUserSession21, r0155, r0156, c6m3, str2) { // from class: X.6m4
                        public final C6m5 A00;

                        /* JADX WARN: Type inference failed for: r0v7, types: [X.6m5] */
                        {
                            if (!str2.equals("All")) {
                                throw 1BL.A0l(str2);
                            }
                            this.A00 = new Object(context, r0154, fbUserSession21, r0155, r0156, c6m3) { // from class: X.6m5
                                public final 1YC A00 = 1YC.A03;
                                public final Context A01;
                                public final 06Z A02;
                                public final FbUserSession A03;
                                public final 5zD A04;
                                public final 5Sh A05;
                                public final C6m3 A06;

                                {
                                    this.A01 = context;
                                    this.A02 = r0154;
                                    this.A04 = r0155;
                                    this.A03 = fbUserSession21;
                                    this.A05 = r0156;
                                    this.A06 = c6m3;
                                }
                            };
                        }
                    };
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1402325322:
                if (str.equals("com_facebook_messaging_msys_thread_admin_plugins_interfaces_actiongetter_ActionInterfaceSpec")) {
                    bar = new Object(context, str2) { // from class: X.5vz
                        public final C5w0 A00;

                        /* JADX WARN: Type inference failed for: r0v7, types: [X.5w0] */
                        {
                            if (!str2.equals("All")) {
                                throw 1BL.A0l(str2);
                            }
                            this.A00 = new Object(context) { // from class: X.5w0
                                public SharedAlbumAdditionAction A00;
                                public C1v5 A01;
                                public C1gs A02;
                                public Object A03;
                                public Object A04;
                                public Object A05;
                                public Object A06;
                                public Object A07;
                                public Object A08;
                                public Object A09;
                                public Object A0A;
                                public Object A0B;
                                public Object A0C;
                                public Object A0D;
                                public Object A0E;
                                public Object A0F;
                                public Object A0G;
                                public Object A0H;
                                public Object A0I;
                                public Object A0J;
                                public Object A0K;
                                public Object A0L;
                                public Object A0M;
                                public Object A0N;
                                public C1gs A0O;
                                public boolean A0P;
                                public final Context A0Q;
                                public final 1YC A0R = 1YC.A03;

                                {
                                    this.A0Q = context;
                                }

                                public static C1gs A00(C5w0 c5w0) {
                                    C1gs c1gs = c5w0.A0O;
                                    if (c1gs == null) {
                                        c1gs = (C1gs) 1Bn.A0E(c5w0.A0Q, (1BY) null, 66804);
                                        c5w0.A0O = c1gs;
                                    }
                                    return c1gs;
                                }

                                public static void A01(C5w0 c5w0) {
                                    synchronized (c5w0) {
                                        if (!c5w0.A0P) {
                                            if (c5w0.A0Q == null) {
                                                throw AnonymousClass001.A0Q("The context passed in the ActionInterface.newBuilder() is null.\nIf you have other questions, please post it to group Android Messenger Modularity.");
                                            }
                                            c5w0.A01 = C1v5.A01;
                                            c5w0.A0P = true;
                                        }
                                    }
                                }
                            };
                        }
                    };
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1413765964:
                if (str.equals("com_facebook_messaging_inbox_plugins_interfaces_itemviewbinder_ItemViewBinderInterfaceSpec")) {
                    1Iw r0157 = (1Iw) objArr[0];
                    CallerContext callerContext = (CallerContext) objArr[1];
                    String str19 = (String) objArr[2];
                    2SI r0158 = (2SI) objArr[3];
                    2S4 r0159 = (2S4) objArr[4];
                    FbUserSession fbUserSession22 = (FbUserSession) objArr[5];
                    2YD r0160 = (2YD) objArr[6];
                    2YH r0161 = (2YH) objArr[7];
                    bar = new 2YY(context, (06Z) objArr[8], (LifecycleOwner) objArr[9], fbUserSession22, callerContext, r0159, (1pI) objArr[10], r0157, r0161, r0160, (2YQ) objArr[12], r0158, (2YX) objArr[13], (1Va) objArr[11], str2, str19);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1417401846:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_contactmenu_MenuItemInterfaceSpec")) {
                    final 5Sh r0162 = (5Sh) objArr[0];
                    final User user14 = (User) objArr[1];
                    final 06Z r0163 = (06Z) objArr[2];
                    final 1pI r0164 = (1pI) objArr[3];
                    bar = new Object(context, r0163, r0164, r0162, user14, str2) { // from class: X.7nV
                        public final C9gS A00;

                        /* JADX WARN: Type inference failed for: r0v7, types: [X.9gS] */
                        {
                            if (!str2.equals("CommunityChannelMenuItems")) {
                                throw 1BL.A0l(str2);
                            }
                            this.A00 = new Object(context, r0163, r0164, r0162, user14) { // from class: X.9gS
                                public C1v5 A00;
                                public ViewProfileImplementation A01;
                                public 9Kq A02;
                                public Object A03;
                                public boolean A04;
                                public final Context A05;
                                public final 06Z A06;
                                public final 1YC A07 = 1YC.A03;
                                public final 5Sh A08;
                                public final User A09;
                                public final 1pI A0A;

                                {
                                    this.A05 = context;
                                    this.A08 = r0162;
                                    this.A09 = user14;
                                    this.A06 = r0163;
                                    this.A0A = r0164;
                                }

                                public static void A00(C9gS c9gS) {
                                    synchronized (c9gS) {
                                        if (!c9gS.A04) {
                                            if (c9gS.A05 == null) {
                                                throw AnonymousClass001.A0Q(AbE.A00(349));
                                            }
                                            c9gS.A00 = C1v5.A01;
                                            c9gS.A04 = true;
                                        }
                                    }
                                }
                            };
                        }
                    };
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1434802949:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_message_spannable_MessageTextSpannableInterfaceSpec")) {
                    final Spannable spannable = (Spannable) objArr[0];
                    final AnonymousClass622 anonymousClass62211 = (AnonymousClass622) objArr[1];
                    final Context context8 = (Context) objArr[2];
                    final 63D r0165 = (63D) objArr[3];
                    final Capabilities capabilities21 = (Capabilities) objArr[4];
                    final ThreadKey threadKey20 = (ThreadKey) objArr[5];
                    final FbUserSession fbUserSession23 = (FbUserSession) objArr[6];
                    bar = new Object(context, context8, spannable, fbUserSession23, threadKey20, r0165, anonymousClass62211, capabilities21, str2) { // from class: X.6mw
                        public final C6mx A00;

                        /* JADX WARN: Type inference failed for: r0v7, types: [X.6mx] */
                        {
                            if (!str2.equals("All")) {
                                throw 1BL.A0l(str2);
                            }
                            this.A00 = new Object(context, context8, spannable, fbUserSession23, threadKey20, r0165, anonymousClass62211, capabilities21) { // from class: X.6mx
                                public MagicWordMessageSpannable A01;
                                public 61N A02;
                                public 61N A03;
                                public PollUpsellSpannable A04;
                                public NoteMentionSpannable A05;
                                public C1v5 A06;
                                public Object A07;
                                public Object A08;
                                public Object A09;
                                public boolean A0A;
                                public final Context A0B;
                                public final Context A0C;
                                public final Spannable A0D;
                                public final ThreadKey A0E;
                                public final 63D A0G;
                                public final AnonymousClass622 A0H;
                                public final FbUserSession A0I;
                                public final Capabilities A0J;
                                public int A00 = -1;
                                public final 1YC A0F = 1YC.A03;

                                {
                                    this.A0C = context;
                                    this.A0D = spannable;
                                    this.A0H = anonymousClass62211;
                                    this.A0B = context8;
                                    this.A0G = r0165;
                                    this.A0J = capabilities21;
                                    this.A0E = threadKey20;
                                    this.A0I = fbUserSession23;
                                }

                                public static void A00(C6mx c6mx) {
                                    synchronized (c6mx) {
                                        if (!c6mx.A0A) {
                                            if (c6mx.A0C == null) {
                                                throw AnonymousClass001.A0Q("The context passed in the MessageTextSpannableInterface.newBuilder() is null.\nIf you have other questions, please post it to group Android Messenger Modularity.");
                                            }
                                            c6mx.A06 = C1v5.A01;
                                            c6mx.A0A = true;
                                        }
                                    }
                                }

                                /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
                                /* JADX WARN: Removed duplicated region for block: B:34:0x0133  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A01(X.C6mx r301) {
                                    /*
                                        Method dump skipped, instructions count: 348
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C6mx.A01(X.6mx):boolean");
                                }

                                /* JADX WARN: Code restructure failed: missing block: B:97:0x0116, code lost:
                                
                                    if (X.61N.A00(r316).AZk(36316018662057605L) == false) goto L53;
                                 */
                                /* JADX WARN: Removed duplicated region for block: B:20:0x026b  */
                                /* JADX WARN: Removed duplicated region for block: B:22:0x0174 A[Catch: Exception -> 0x021c, all -> 0x0233, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x021c, blocks: (B:5:0x004b, B:9:0x0055, B:12:0x005f, B:15:0x016c, B:17:0x0214, B:22:0x0174, B:23:0x017a, B:26:0x0185, B:28:0x0192, B:29:0x0199, B:31:0x01a1, B:34:0x01ad, B:35:0x01b3, B:37:0x01bd, B:40:0x01c9, B:43:0x01d5, B:45:0x01e3, B:48:0x01f1, B:50:0x01fe, B:51:0x0204, B:53:0x020a, B:54:0x020e, B:54:0x020e, B:56:0x0068, B:57:0x006d, B:60:0x0079, B:63:0x0081, B:64:0x008a, B:67:0x0095, B:69:0x00a2, B:70:0x00a9, B:72:0x00b1, B:73:0x00b6, B:73:0x00b6, B:77:0x00be, B:80:0x015a, B:80:0x015a, B:82:0x015e, B:83:0x00ca, B:85:0x00db, B:104:0x0155, B:114:0x013c, B:116:0x0147, B:118:0x014e), top: B:4:0x004b, outer: #1 }] */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A02(X.C6mx r301) {
                                    /*
                                        Method dump skipped, instructions count: 670
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C6mx.A02(X.6mx):boolean");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
                                /* JADX WARN: Removed duplicated region for block: B:35:0x013d  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public static boolean A03(X.C6mx r301) {
                                    /*
                                        Method dump skipped, instructions count: 358
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C6mx.A03(X.6mx):boolean");
                                }
                            };
                        }
                    };
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1467348082:
                if (str.equals("com_facebook_messaging_graph_plugins_interfaces_contactmanagement_ContactManagementLifeCycleInterfaceSpec")) {
                    bar = new Bad(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1495273577:
                if (str.equals("com_facebook_messaging_communitymessaging_plugins_interfaces_communitycreationaccessory_CommunityCreationInterfaceSpec")) {
                    1Iw r0166 = (1Iw) objArr[0];
                    CPh cPh = (CPh) objArr[1];
                    1pI r0167 = (1pI) objArr[2];
                    LifecycleOwner lifecycleOwner4 = (LifecycleOwner) objArr[3];
                    bar = new BaU(context, (06Z) objArr[4], lifecycleOwner4, r0167, r0166, cPh, (2MX) objArr[6], (Long) objArr[7], str2, (String) objArr[5]);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1495435180:
                if (str.equals("com_facebook_messaging_threadview_initparams_plugins_interfaces_threadinitparamsmetadataprovider_ThreadInitParamsMetadataProviderInterfaceSpec")) {
                    bar = new 7R1(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1499118547:
                if (str.equals("com_facebook_messaging_cowatch_plugins_interfaces_amdclickhandler_AmdClickHandlerInterfaceSpec")) {
                    bar = new 3Ih(context, (Context) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1526019514:
                if (str.equals("com_facebook_messaging_threadlist_plugins_interfaces_threaditemdata_ThreadItemDataInterfaceSpec")) {
                    bar = new 2V6(context, (FbUserSession) objArr[1], (2SI) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1529591149:
                if (str.equals("com_facebook_messaging_inbox_plugins_interfaces_fragment_navigationlistener_NavigationListenerInterfaceSpec")) {
                    bar = new 2YS(context, (2S4) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1544826311:
                if (str.equals("com_facebook_messaging_stella_plugins_interfaces_incomingmessageconfig_IncomingMessageConfigInterfaceSpec")) {
                    bar = new C03883zP(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1576012053:
                if (str.equals("com_facebook_messaging_communitymessaging_plugins_interfaces_hiddencommunitieslist_HiddenCommunitiesListInterfaceSpec")) {
                    MigColorScheme migColorScheme12 = (MigColorScheme) objArr[0];
                    1pI r0168 = (1pI) objArr[1];
                    FbUserSession fbUserSession24 = (FbUserSession) objArr[2];
                    bar = new 3Ie(context, (Context) objArr[4], (06Z) objArr[3], fbUserSession24, r0168, migColorScheme12, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1601222008:
                if (str.equals("com_facebook_messaging_contactstab_plugins_interfaces_loader_ContactsTabLoaderInterfaceSpec")) {
                    9Wz r0169 = (9Wz) objArr[0];
                    bar = new 9Gg(context, (FbUserSession) objArr[2], (C2xg) objArr[1], r0169, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1615039989:
                if (str.equals("com_facebook_messaging_polling_plugins_interfaces_pollmutation_PollMutationHandlerInterfaceSpec")) {
                    bar = new HPT(context, (Context) objArr[0], (ThreadKey) objArr[2], (PollMutationHandlerInterfaceSpec$MutationHandlerOverride) objArr[1], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1651857181:
                if (str.equals("com_facebook_messaging_inbox_plugins_interfaces_impressiontracker_InboxImpressionTrackListenerInterfaceSpec")) {
                    bar = new Object(context, str2) { // from class: X.2c8
                        public final C2cA A00;

                        {
                            C2cA c2cA;
                            if (str2.equals("Inbox")) {
                                c2cA = new C2cA(context) { // from class: X.2c9
                                    public InboxFollowupImpressionTracker A00;
                                    public Object A01;
                                    public Object A02;
                                    public final Context A03;
                                    public final 1YC A04 = 1YC.A03;

                                    {
                                        this.A03 = context;
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:169:0x0373 A[Catch: Exception -> 0x093d, all -> 0x0942, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x093d, blocks: (B:101:0x0226, B:102:0x022b, B:103:0x0230, B:105:0x0236, B:106:0x023d, B:109:0x0251, B:111:0x025e, B:112:0x0265, B:113:0x026c, B:116:0x0278, B:117:0x027f, B:122:0x028d, B:127:0x0296, B:130:0x02a2, B:131:0x02a9, B:134:0x02b7, B:135:0x02c0, B:136:0x02c7, B:137:0x02ce, B:138:0x02d5, B:139:0x02de, B:140:0x02e5, B:142:0x02f0, B:144:0x02fb, B:145:0x0302, B:146:0x0309, B:147:0x0310, B:150:0x031c, B:154:0x032e, B:155:0x0335, B:157:0x0342, B:161:0x0354, B:165:0x0360, B:166:0x0367, B:169:0x0373, B:173:0x0385, B:174:0x038c, B:179:0x03b2, B:182:0x03bc, B:183:0x03c3, B:185:0x03ca, B:186:0x03d3, B:189:0x03e5, B:192:0x03f1, B:194:0x03fa, B:271:0x0406, B:272:0x040d, B:274:0x041b, B:277:0x0429, B:279:0x0432, B:267:0x0445, B:284:0x0514, B:285:0x051b, B:287:0x0522, B:288:0x0527, B:289:0x052e, B:290:0x0537, B:239:0x0545, B:243:0x0551, B:244:0x0558, B:245:0x055f, B:246:0x0568, B:247:0x056f, B:249:0x057c, B:250:0x0583, B:251:0x058a, B:253:0x0595, B:254:0x059c, B:255:0x05a3, B:257:0x05b0, B:259:0x05bb, B:261:0x05c5, B:197:0x044d, B:199:0x0454, B:200:0x045d, B:203:0x0469, B:206:0x0475, B:208:0x047e, B:217:0x048a, B:218:0x0491, B:220:0x049f, B:223:0x04ad, B:225:0x04b6, B:230:0x04da, B:231:0x04e1, B:233:0x04e8, B:234:0x04ed, B:235:0x04f4, B:236:0x04fd, B:213:0x05d4, B:374:0x077f, B:375:0x0786, B:378:0x079a, B:380:0x07a7, B:381:0x07ae, B:382:0x07b5, B:385:0x07c1, B:386:0x07c8, B:393:0x07eb, B:398:0x07fe, B:402:0x080c, B:405:0x0818, B:406:0x081f, B:409:0x082b, B:413:0x083e, B:414:0x0845, B:415:0x084c, B:419:0x085f, B:420:0x0866, B:422:0x0874, B:423:0x087b, B:425:0x0887, B:428:0x08a7, B:429:0x08ae, B:430:0x08b5, B:431:0x08bc, B:432:0x08c3, B:434:0x08d1, B:436:0x08e7, B:438:0x0919, B:439:0x0920, B:443:0x092c), top: B:100:0x0226, outer: #1 }] */
                                    /* JADX WARN: Removed duplicated region for block: B:181:0x03bc A[SYNTHETIC] */
                                    /* JADX WARN: Removed duplicated region for block: B:197:0x044d A[Catch: Exception -> 0x093d, all -> 0x0942, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x093d, blocks: (B:101:0x0226, B:102:0x022b, B:103:0x0230, B:105:0x0236, B:106:0x023d, B:109:0x0251, B:111:0x025e, B:112:0x0265, B:113:0x026c, B:116:0x0278, B:117:0x027f, B:122:0x028d, B:127:0x0296, B:130:0x02a2, B:131:0x02a9, B:134:0x02b7, B:135:0x02c0, B:136:0x02c7, B:137:0x02ce, B:138:0x02d5, B:139:0x02de, B:140:0x02e5, B:142:0x02f0, B:144:0x02fb, B:145:0x0302, B:146:0x0309, B:147:0x0310, B:150:0x031c, B:154:0x032e, B:155:0x0335, B:157:0x0342, B:161:0x0354, B:165:0x0360, B:166:0x0367, B:169:0x0373, B:173:0x0385, B:174:0x038c, B:179:0x03b2, B:182:0x03bc, B:183:0x03c3, B:185:0x03ca, B:186:0x03d3, B:189:0x03e5, B:192:0x03f1, B:194:0x03fa, B:271:0x0406, B:272:0x040d, B:274:0x041b, B:277:0x0429, B:279:0x0432, B:267:0x0445, B:284:0x0514, B:285:0x051b, B:287:0x0522, B:288:0x0527, B:289:0x052e, B:290:0x0537, B:239:0x0545, B:243:0x0551, B:244:0x0558, B:245:0x055f, B:246:0x0568, B:247:0x056f, B:249:0x057c, B:250:0x0583, B:251:0x058a, B:253:0x0595, B:254:0x059c, B:255:0x05a3, B:257:0x05b0, B:259:0x05bb, B:261:0x05c5, B:197:0x044d, B:199:0x0454, B:200:0x045d, B:203:0x0469, B:206:0x0475, B:208:0x047e, B:217:0x048a, B:218:0x0491, B:220:0x049f, B:223:0x04ad, B:225:0x04b6, B:230:0x04da, B:231:0x04e1, B:233:0x04e8, B:234:0x04ed, B:235:0x04f4, B:236:0x04fd, B:213:0x05d4, B:374:0x077f, B:375:0x0786, B:378:0x079a, B:380:0x07a7, B:381:0x07ae, B:382:0x07b5, B:385:0x07c1, B:386:0x07c8, B:393:0x07eb, B:398:0x07fe, B:402:0x080c, B:405:0x0818, B:406:0x081f, B:409:0x082b, B:413:0x083e, B:414:0x0845, B:415:0x084c, B:419:0x085f, B:420:0x0866, B:422:0x0874, B:423:0x087b, B:425:0x0887, B:428:0x08a7, B:429:0x08ae, B:430:0x08b5, B:431:0x08bc, B:432:0x08c3, B:434:0x08d1, B:436:0x08e7, B:438:0x0919, B:439:0x0920, B:443:0x092c), top: B:100:0x0226, outer: #1 }] */
                                    /* JADX WARN: Removed duplicated region for block: B:21:0x0114 A[Catch: Exception -> 0x0176, all -> 0x0190, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x0176, blocks: (B:11:0x0072, B:12:0x0077, B:15:0x0083, B:18:0x008d, B:21:0x0114, B:22:0x011b, B:24:0x0122, B:25:0x0129, B:26:0x012e, B:26:0x012e, B:29:0x013d, B:30:0x0142, B:37:0x0136, B:38:0x0097, B:43:0x0103, B:43:0x0103, B:45:0x0108, B:46:0x00a8, B:48:0x00b8, B:60:0x00fe, B:68:0x0161, B:70:0x016e, B:72:0x0175), top: B:10:0x0072, outer: #0 }] */
                                    /* JADX WARN: Removed duplicated region for block: B:242:0x0551 A[SYNTHETIC] */
                                    /* JADX WARN: Removed duplicated region for block: B:263:0x02a9 A[SYNTHETIC] */
                                    /* JADX WARN: Removed duplicated region for block: B:270:0x0406 A[SYNTHETIC] */
                                    /* JADX WARN: Removed duplicated region for block: B:296:0x02a9 A[SYNTHETIC] */
                                    /* JADX WARN: Removed duplicated region for block: B:332:0x06ed  */
                                    /* JADX WARN: Removed duplicated region for block: B:34:0x0154  */
                                    /* JADX WARN: Removed duplicated region for block: B:37:0x0136 A[Catch: Exception -> 0x0176, all -> 0x0190, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x0176, blocks: (B:11:0x0072, B:12:0x0077, B:15:0x0083, B:18:0x008d, B:21:0x0114, B:22:0x011b, B:24:0x0122, B:25:0x0129, B:26:0x012e, B:26:0x012e, B:29:0x013d, B:30:0x0142, B:37:0x0136, B:38:0x0097, B:43:0x0103, B:43:0x0103, B:45:0x0108, B:46:0x00a8, B:48:0x00b8, B:60:0x00fe, B:68:0x0161, B:70:0x016e, B:72:0x0175), top: B:10:0x0072, outer: #0 }] */
                                    @Override // X.C2cA
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                                    */
                                    public void Bbu(java.util.List r302) {
                                        /*
                                            Method dump skipped, instructions count: 2471
                                            To view this dump change 'Code comments level' option to 'DEBUG'
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: X.C2c9.Bbu(java.util.List):void");
                                    }

                                    @Override // X.C2cA
                                    public void Bfy(C2k8 c2k8) {
                                        int andIncrement = C1Y6.A04.getAndIncrement();
                                        1YC r0170 = this.A04;
                                        r0170.A08("com.facebook.messaging.inbox.plugins.interfaces.impressiontracker.InboxImpressionTrackListenerInterfaceSpec", "messaging.inbox.impressiontracker.InboxImpressionTrackListenerInterfaceSpec", "notifyItemInViewport", andIncrement);
                                        r0170.A02((Exception) null, "messaging.inbox.impressiontracker.InboxImpressionTrackListenerInterfaceSpec", "notifyItemInViewport", andIncrement);
                                    }

                                    @Override // X.C2cA
                                    public void Bfz(C2k8 c2k8) {
                                        int andIncrement = C1Y6.A04.getAndIncrement();
                                        1YC r0170 = this.A04;
                                        r0170.A08("com.facebook.messaging.inbox.plugins.interfaces.impressiontracker.InboxImpressionTrackListenerInterfaceSpec", "messaging.inbox.impressiontracker.InboxImpressionTrackListenerInterfaceSpec", "notifyItemNotInViewport", andIncrement);
                                        r0170.A02((Exception) null, "messaging.inbox.impressiontracker.InboxImpressionTrackListenerInterfaceSpec", "notifyItemNotInViewport", andIncrement);
                                    }

                                    @Override // X.C2cA
                                    public void CqK(boolean z) {
                                        int andIncrement = C1Y6.A04.getAndIncrement();
                                        1YC r0170 = this.A04;
                                        r0170.A08("com.facebook.messaging.inbox.plugins.interfaces.impressiontracker.InboxImpressionTrackListenerInterfaceSpec", "messaging.inbox.impressiontracker.InboxImpressionTrackListenerInterfaceSpec", "setIsVisibleToUser", andIncrement);
                                        r0170.A02((Exception) null, "messaging.inbox.impressiontracker.InboxImpressionTrackListenerInterfaceSpec", "setIsVisibleToUser", andIncrement);
                                    }

                                    @Override // X.C2cA
                                    public void D79(C00p c00p, boolean z) {
                                        int andIncrement = C1Y6.A04.getAndIncrement();
                                        1YC r0170 = this.A04;
                                        r0170.A08("com.facebook.messaging.inbox.plugins.interfaces.impressiontracker.InboxImpressionTrackListenerInterfaceSpec", "messaging.inbox.impressiontracker.InboxImpressionTrackListenerInterfaceSpec", "updateItemsForPageVisibility", andIncrement);
                                        r0170.A02((Exception) null, "messaging.inbox.impressiontracker.InboxImpressionTrackListenerInterfaceSpec", "updateItemsForPageVisibility", andIncrement);
                                    }
                                };
                            } else {
                                if (!str2.equals("CommunityChannelList")) {
                                    throw 1BL.A0l(str2);
                                }
                                c2cA = new C2cA(context) { // from class: X.3W3
                                    public CommunityMessagingImpressionTracker A00;
                                    public Object A01;
                                    public final Context A02;
                                    public final 1YC A03 = 1YC.A03;

                                    {
                                        this.A02 = context;
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:136:0x02a5  */
                                    /* JADX WARN: Removed duplicated region for block: B:205:0x0409  */
                                    /* JADX WARN: Removed duplicated region for block: B:206:0x0411 A[Catch: Exception -> 0x0488, all -> 0x048d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0488, blocks: (B:69:0x0180, B:71:0x018b, B:74:0x0198, B:75:0x019c, B:77:0x01a7, B:80:0x01bb, B:99:0x01cf, B:102:0x0222, B:84:0x01d7, B:85:0x01e0, B:86:0x01e7, B:87:0x01ee, B:90:0x01fa, B:91:0x0201, B:95:0x020e, B:105:0x0225, B:107:0x022a, B:110:0x0236, B:114:0x0246, B:117:0x043c, B:119:0x0250, B:120:0x0258, B:121:0x025f, B:122:0x0266, B:125:0x0272, B:129:0x0284, B:130:0x028b, B:131:0x0290, B:133:0x0299, B:137:0x02ab, B:138:0x02b2, B:140:0x02bb, B:142:0x02c6, B:143:0x02cd, B:145:0x02d6, B:147:0x02e1, B:149:0x02ec, B:151:0x02f7, B:152:0x02fc, B:152:0x02fc, B:154:0x0301, B:158:0x0311, B:160:0x0319, B:161:0x0322, B:164:0x0330, B:165:0x0339, B:166:0x0340, B:167:0x0347, B:170:0x0353, B:174:0x0365, B:175:0x036c, B:177:0x0379, B:179:0x0382, B:181:0x0435, B:184:0x038b, B:185:0x0392, B:189:0x03ab, B:191:0x03b6, B:193:0x03cc, B:196:0x03d9, B:198:0x03e2, B:199:0x03e9, B:200:0x03f0, B:201:0x03f6, B:202:0x03fd, B:206:0x0411, B:211:0x043f, B:213:0x0449, B:215:0x046c, B:216:0x0473), top: B:68:0x0180, outer: #4 }] */
                                    /* JADX WARN: Removed duplicated region for block: B:21:0x009d A[Catch: Exception -> 0x00dc, all -> 0x00f6, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00dc, blocks: (B:11:0x0066, B:12:0x006b, B:15:0x0077, B:18:0x0081, B:21:0x009d, B:23:0x00c6, B:24:0x00cb, B:30:0x00a5, B:31:0x00ac, B:33:0x00b3, B:34:0x00ba, B:35:0x00bf, B:35:0x00bf, B:38:0x008e), top: B:10:0x0066, outer: #1 }] */
                                    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5 A[Catch: Exception -> 0x00dc, all -> 0x00f6, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00dc, blocks: (B:11:0x0066, B:12:0x006b, B:15:0x0077, B:18:0x0081, B:21:0x009d, B:23:0x00c6, B:24:0x00cb, B:30:0x00a5, B:31:0x00ac, B:33:0x00b3, B:34:0x00ba, B:35:0x00bf, B:35:0x00bf, B:38:0x008e), top: B:10:0x0066, outer: #1 }] */
                                    @Override // X.C2cA
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                                    */
                                    public void Bbu(java.util.List r302) {
                                        /*
                                            Method dump skipped, instructions count: 1229
                                            To view this dump change 'Code comments level' option to 'DEBUG'
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: X.C3W3.Bbu(java.util.List):void");
                                    }

                                    @Override // X.C2cA
                                    public void Bfy(C2k8 c2k8) {
                                        int A002 = 1BK.A00();
                                        1YC r0170 = this.A03;
                                        r0170.A08("com.facebook.messaging.inbox.plugins.interfaces.impressiontracker.InboxImpressionTrackListenerInterfaceSpec", "messaging.inbox.impressiontracker.InboxImpressionTrackListenerInterfaceSpec", "notifyItemInViewport", A002);
                                        r0170.A06("messaging.inbox.impressiontracker.InboxImpressionTrackListenerInterfaceSpec", "notifyItemInViewport", A002);
                                    }

                                    @Override // X.C2cA
                                    public void Bfz(C2k8 c2k8) {
                                        int A002 = 1BK.A00();
                                        1YC r0170 = this.A03;
                                        r0170.A08("com.facebook.messaging.inbox.plugins.interfaces.impressiontracker.InboxImpressionTrackListenerInterfaceSpec", "messaging.inbox.impressiontracker.InboxImpressionTrackListenerInterfaceSpec", "notifyItemNotInViewport", A002);
                                        r0170.A06("messaging.inbox.impressiontracker.InboxImpressionTrackListenerInterfaceSpec", "notifyItemNotInViewport", A002);
                                    }

                                    @Override // X.C2cA
                                    public void CqK(boolean z) {
                                        int A002 = 1BK.A00();
                                        1YC r0170 = this.A03;
                                        r0170.A08("com.facebook.messaging.inbox.plugins.interfaces.impressiontracker.InboxImpressionTrackListenerInterfaceSpec", "messaging.inbox.impressiontracker.InboxImpressionTrackListenerInterfaceSpec", "setIsVisibleToUser", A002);
                                        r0170.A06("messaging.inbox.impressiontracker.InboxImpressionTrackListenerInterfaceSpec", "setIsVisibleToUser", A002);
                                    }

                                    @Override // X.C2cA
                                    public void D79(C00p c00p, boolean z) {
                                        int A002 = 1BK.A00();
                                        1YC r0170 = this.A03;
                                        r0170.A08("com.facebook.messaging.inbox.plugins.interfaces.impressiontracker.InboxImpressionTrackListenerInterfaceSpec", "messaging.inbox.impressiontracker.InboxImpressionTrackListenerInterfaceSpec", "updateItemsForPageVisibility", A002);
                                        r0170.A06("messaging.inbox.impressiontracker.InboxImpressionTrackListenerInterfaceSpec", "updateItemsForPageVisibility", A002);
                                    }
                                };
                            }
                            this.A00 = c2cA;
                        }
                    };
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1658990889:
                if (str.equals("com_facebook_messaging_msys_pushnotifications_plugins_interfaces_armadillonotificationclient_ArmadilloNotificationClientInterfaceSpec")) {
                    bar = new 21Q(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1663421645:
                if (str.equals("com_facebook_messaging_polling_plugins_interfaces_polldetailsdata_PollDetailsDataInterfaceSpec")) {
                    bar = new HPS(context, (Context) objArr[0], (FbUserSession) objArr[1], (ThreadKey) objArr[5], (PollDetailsDataInterfaceSpec$DataSourceOverride) objArr[2], (Capabilities) objArr[3], (ImmutableList) objArr[4], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1711705563:
                if (str.equals("com_facebook_messaging_sup_plugins_interfaces_videocalling_SUPVideoCallingSpec")) {
                    bar = new C06164g4(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1713851233:
                if (str.equals("com_facebook_messaging_navigation_home_tabs_plugins_interfaces_badge_BadgeHandlerInterfaceSpec")) {
                    bar = new C5x4(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1735129284:
                if (str.equals("com_facebook_messaging_settings_plugins_interfaces_mesettings_unseencount_MeSettingsUnseenCountProviderSpec")) {
                    bar = new C4I5(context, (FbUserSession) objArr[1], (C4I3) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1735804778:
                if (str.equals("com_facebook_messaging_inboxfolders_plugins_interfaces_emptystate_FoldersEmptyStateInterfaceSpec")) {
                    1pI r0170 = (1pI) objArr[0];
                    bar = new 3Ij(context, (06Z) objArr[1], (FbUserSession) objArr[3], r0170, (C2xf) objArr[2], (Long) objArr[4], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1738724351:
                if (str.equals("com_facebook_messaging_threadsettings_plugins_interfaces_actionbutton_ActionButtonInterfaceSpec")) {
                    ThreadKey threadKey21 = (ThreadKey) objArr[0];
                    06Z r0171 = (06Z) objArr[1];
                    User user15 = (User) objArr[2];
                    Capabilities capabilities22 = (Capabilities) objArr[4];
                    ThreadSummary threadSummary23 = (ThreadSummary) objArr[5];
                    2Sh r0172 = (2Sh) objArr[6];
                    DHb dHb2 = (DHb) objArr[7];
                    bar = new Bb6(context, r0171, (FbUserSession) objArr[11], threadKey21, threadSummary23, (DJX) objArr[8], dHb2, (DHc) objArr[12], (DHd) objArr[9], user15, capabilities22, r0172, str2, (String) objArr[10]);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1744379448:
                if (str.equals("com_facebook_messaging_polling_plugins_interfaces_pollvoterslistdata_PollVotersListDataProviderInterfaceSpec")) {
                    Context context9 = (Context) objArr[0];
                    String str20 = (String) objArr[1];
                    PollVotersListDataProviderInterfaceSpec$DataSourceOverride pollVotersListDataProviderInterfaceSpec$DataSourceOverride = (PollVotersListDataProviderInterfaceSpec$DataSourceOverride) objArr[2];
                    MigColorScheme migColorScheme13 = (MigColorScheme) objArr[3];
                    PollingPublishedOption pollingPublishedOption = (PollingPublishedOption) objArr[4];
                    bar = new Bax(context, context9, (06Z) objArr[7], (1F9) objArr[5], (ThreadKey) objArr[6], pollingPublishedOption, pollVotersListDataProviderInterfaceSpec$DataSourceOverride, (C1G) objArr[8], migColorScheme13, str2, str20);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1750449791:
                if (str.equals("com_facebook_messaging_msys_thread_plugins_interfaces_banner_actionhandler_ThreadViewBannerActionHandlerInterfaceSpec")) {
                    ThreadKey threadKey22 = (ThreadKey) objArr[0];
                    bar = new 9Gm(context, (FbUserSession) objArr[3], (1pK) objArr[1], threadKey22, (C6ri) objArr[4], (6tF) objArr[2], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1762701574:
                if (str.equals("com_facebook_messaging_groups_plugins_interfaces_memberlistconfig_MemberListConfigInterfaceSpec")) {
                    bar = new Bag(context, (06Z) objArr[2], (CommunityMemberListSource) objArr[0], (ParcelableSecondaryData) objArr[1], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1772073155:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_participantmetadataprovider_ThreadParticipantMetadataProviderInterfaceSpec")) {
                    bar = new 5pN(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1802717441:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_adminmessagewithlink_AdminMessageWithLinkInterfaceSpec")) {
                    GenericAdminMessageInfo genericAdminMessageInfo = (GenericAdminMessageInfo) objArr[1];
                    String str21 = (String) objArr[2];
                    ThreadKey threadKey23 = (ThreadKey) objArr[4];
                    ThreadSummary threadSummary24 = (ThreadSummary) objArr[5];
                    06Z r0173 = (06Z) objArr[6];
                    63D r0174 = (63D) objArr[7];
                    bar = new 7nU(context, r0173, (FbUserSession) objArr[9], (5zD) objArr[8], genericAdminMessageInfo, threadKey23, threadSummary24, r0174, str2, str21);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1813518800:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_message_decorations_expandableadminmessage_ExpandableAdminMessageWrapperDecorationInterfaceSpec")) {
                    bar = new 8A6(context, (5zD) objArr[2], (C89p) objArr[0], (Capabilities) objArr[1], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1859209138:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_backpresshandler_ThreadViewBackpressHandlerInterfaceSpec")) {
                    bar = new 7SJ(context, (ThreadKey) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1865695615:
                if (str.equals("com_facebook_xapp_messaging_linkhandling_plugins_interfaces_listener_LinkHandlerListenerInterfaceSpec")) {
                    bar = new KeZ(context, (Uri) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1869972413:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_messagelist_freeformtransformation_FreeformListTransformationInterfaceSpec")) {
                    bar = new 62V(context, (60I) objArr[0], (60W) objArr[1], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1892067564:
                if (str.equals("com_facebook_messaging_inbox_plugins_interfaces_promotionbanner_PromotionBannerInterfaceSpec")) {
                    2Ws r0175 = (2Ws) objArr[0];
                    LifecycleOwner lifecycleOwner5 = (LifecycleOwner) objArr[1];
                    bar = new 2Wx(context, (06Z) objArr[2], lifecycleOwner5, (FbUserSession) objArr[5], (2S4) objArr[3], r0175, (2Wv) objArr[4], (ParcelableSecondaryData) objArr[6], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1903212208:
                if (str.equals("com_facebook_mig_scheme_plugins_interfaces_themepreferencesmodesetter_ThemePreferencesModeSetterInterfaceSpec")) {
                    bar = new C1oz(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1904535147:
                if (str.equals("com_facebook_messaging_contextbanner_plugins_interfaces_fetcher_ContextItemFetcherInterfaceSpec")) {
                    final ThreadKey threadKey24 = (ThreadKey) objArr[0];
                    final ThreadSummary threadSummary25 = (ThreadSummary) objArr[1];
                    final User user16 = (User) objArr[2];
                    final FbUserSession fbUserSession25 = (FbUserSession) objArr[3];
                    bar = new Object(context, fbUserSession25, threadKey24, threadSummary25, user16, str2) { // from class: X.7ak
                        public final 8BK A00;

                        {
                            if (!str2.equals("All")) {
                                throw 1BL.A0l(str2);
                            }
                            this.A00 = new 8BK(context, fbUserSession25, threadKey24, threadSummary25, user16);
                        }
                    };
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1945777381:
                if (str.equals("com_facebook_messaging_highlightstab_immersiveuicomponents_footer_plugins_interfaces_inlinereplybar_HTImmersiveInlineReplyBarInterfaceSpec")) {
                    bar = new 9Gi(context, (HighlightsFeedContent) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1957937253:
                if (str.equals("com_facebook_messaging_xma_template_plugins_interfaces_media_GenericXmaMediaSpec")) {
                    AnonymousClass622 anonymousClass62212 = (AnonymousClass622) objArr[0];
                    6Az r0176 = (6Az) objArr[1];
                    bar = new 7zW(context, (5zD) objArr[2], r0176, anonymousClass62212, (7Z0) objArr[4], (Float) objArr[3], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1979451687:
                if (str.equals("com_facebook_messaging_communitymessaging_plugins_interfaces_channeleditingoperation_ChannelEditingOperationInterfaceSpec")) {
                    boolean booleanValue10 = ((Boolean) objArr[0]).booleanValue();
                    bar = new BaS(context, (LifecycleOwner) objArr[2], (FbUserSession) objArr[3], (DGm) objArr[1], str2, booleanValue10);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1983767982:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_imagerequest_ImageRequestTransformerInterfaceSpec")) {
                    bar = new 7YQ(context, (ImageAttachmentData) objArr[0], (AnonymousClass622) objArr[1], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 1993277214:
                if (str.equals("com_facebook_messaging_settings_plugins_interfaces_mesettings_lifecycle_MeSettingsLifecycleInterfaceSpec")) {
                    bar = new Bb0(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 2010269199:
                if (str.equals("com_facebook_messaging_threadview_plugins_interfaces_banner_dismissbutton_ThreadViewBannerDismissButtonClickListenerInterfaceSpec")) {
                    bar = new BbI(context, (FbUserSession) objArr[0], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 2014766182:
                if (str.equals("com_facebook_messaging_groups_plugins_interfaces_memberlistitem_MemberListItemInterfaceSpec")) {
                    MigColorScheme migColorScheme14 = (MigColorScheme) objArr[0];
                    GF4 gf4 = (GF4) objArr[1];
                    1F9 r0177 = (1F9) objArr[2];
                    Integer num2 = (Integer) objArr[3];
                    ParcelableSecondaryData parcelableSecondaryData4 = (ParcelableSecondaryData) objArr[4];
                    bar = new Baj(context, (06Z) objArr[5], gf4, r0177, (ThreadSummary) objArr[7], (D55) objArr[6], migColorScheme14, parcelableSecondaryData4, num2, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 2028571013:
                if (str.equals("com_facebook_messaging_polling_plugins_interfaces_pollplanningactions_PollDetailsPlanningActionsInterfaceSpec")) {
                    Context context10 = (Context) objArr[0];
                    ThreadKey threadKey25 = (ThreadKey) objArr[1];
                    bar = new Baw(context, context10, (View) objArr[2], (FbUserSession) objArr[4], threadKey25, str2, (String) objArr[3]);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 2053837081:
                if (str.equals("com_facebook_messaging_navigation_home_tabs_plugins_interfaces_profileshortcut_ProfileShortcutHandlerInterfaceSpec")) {
                    bar = new 4FZ(context, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 2060635129:
                if (str.equals("com_facebook_messaging_suggestedkeyboard_plugins_interfaces_suggestionrow_SuggestedRowInterfaceSpec")) {
                    FbUserSession fbUserSession26 = (FbUserSession) objArr[0];
                    I8b i8b = (I8b) objArr[1];
                    C00m c00m = (C00m) objArr[2];
                    bar = new HPa(context, (EditText) objArr[5], (06Z) objArr[3], (LifecycleOwner) objArr[4], fbUserSession26, i8b, str2, c00m);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 2104821006:
                if (str.equals("com_facebook_messaging_tray_plugins_interfaces_processor_InboxTrayLoaderResultProcessorInterfaceSpec")) {
                    final FbUserSession fbUserSession27 = (FbUserSession) objArr[0];
                    bar = new Object(context, fbUserSession27, str2) { // from class: X.3uV
                        public final 3uW A00;

                        {
                            if (!str2.equals("All")) {
                                throw 1BL.A0l(str2);
                            }
                            this.A00 = new 3uW(context, fbUserSession27);
                        }
                    };
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 2107903268:
                if (str.equals("com_facebook_messaging_business_common_calltoaction_plugins_interfaces_linkhandlingwhitelist_LinkHandlingWhitelistInterfaceSpec")) {
                    bar = new EcT(context, (Uri) objArr[0], (Message) objArr[1], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 2126489604:
                if (str.equals("com_facebook_messaging_msys_thread_plugins_interfaces_processor_ProcessorMetadataFactoryInterfaceSpec")) {
                    bar = new 5oA(context, (Context) objArr[0], (FbUserSession) objArr[1], (ThreadKey) objArr[2], str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            case 2127531995:
                if (str.equals("com_facebook_messaging_navigation_plugins_interfaces_drawer_folder_folderclick_HomeDrawerFolderClickHandlerInterfaceSpec")) {
                    Bfk bfk = (Bfk) objArr[0];
                    bar = new Bar(context, (06Z) objArr[2], (FbUserSession) objArr[3], (1pI) objArr[1], bfk, str2);
                    break;
                }
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
            default:
                throw new RuntimeException(0Pz.A0W(str, " is not a known interface name"));
        }
        return bar;
    }
}
