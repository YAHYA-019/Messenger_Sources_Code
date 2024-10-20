package X;

import androidx.fragment.app.Fragment;
import com.facebook.acra.constants.ActionId;
import com.facebook.litho.LithoView;
import com.facebook.messaging.accountswitch.SwitchAccountActivity;
import com.facebook.messaging.appupdatesetting.plugins.appupdateitem.appupdatesetting.AppUpdateSetting;
import com.facebook.messaging.communitymessaging.model.Community;
import com.facebook.messaging.communitymessaging.plugins.takedowns.bottomsheet.ChatTakedownBottomSheetDialogFragment;
import com.facebook.messaging.customthreads.name.dialog.ThreadNameSettingDialogFragment;
import com.facebook.messaging.profile.bottomsheet.dialog.AcceptFriendRequestBottomSheetDialogFragment;
import com.facebook.messaging.publicchats.banuser.banuserconfirmation.BanUserConfirmationFragment;
import com.facebook.messaging.rtc.incall.impl.active.lobby.views.LobbyRootView;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function2;

/* loaded from: D4q.class */
public final class D4q implements 1K9 {
    public final int A00;
    public final Object A01;

    public D4q(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static D4q A00(Object obj, int i) {
        return new D4q(obj, i);
    }

    public static Object A01(D4q d4q, Object obj) {
        11T.A0F(obj, 0);
        return d4q.A01;
    }

    public static void A02(ListenableFuture listenableFuture, Object obj, Executor executor, int i) {
        1Kd.A0F(new D4q(obj, i), listenableFuture, executor);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v46, types: [androidx.fragment.app.Fragment, X.Alc] */
    /* JADX WARN: Type inference failed for: r0v469, types: [com.facebook.messaging.publicchats.banuser.banuserconfirmation.BanUserConfirmationFragment, androidx.fragment.app.Fragment] */
    public void onFailure(Throwable th) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C01s A04;
        String str7;
        String str8;
        SettableFuture settableFuture;
        1Br r305;
        DFY dfy;
        1Kn r3052;
        switch (this.A00) {
            case 0:
                ((BJB) this.A01).A1c();
                return;
            case 1:
                0fH.A0w(B2x.__redex_internal_original_name, "Failed to get secure family id", th);
                B2x b2x = (B2x) this.A01;
                CfG cfG = b2x.A01;
                if (cfG != null) {
                    cfG.D2v();
                }
                B2x.A0A(b2x, "");
                return;
            case 2:
                B2c b2c = (B2c) this.A01;
                1G2 r0 = B2c.A0X;
                AbM.A1M(b2c, b2c.A0M);
                return;
            case 3:
                B2c b2c2 = (B2c) this.A01;
                AbI.A0Q(b2c2).A0A(BMG.A0h);
                AbM.A1M(b2c2, b2c2.A0L);
                return;
            case 4:
                str = "AccountStatusHelper";
                str2 = "Failed to send account status to server";
                0fH.A0j(str, str2);
                return;
            case 5:
                COX.A00((COX) this.A01).A00(0S2.A06);
                return;
            case 6:
            case 8:
            case 9:
            case 10:
            case 17:
            case 23:
            case 24:
            case 28:
            case 34:
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
            case ActionId.QUEUEING_FAIL /* 56 */:
            case ActionId.PHOTO_CAPTURED /* 59 */:
            case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
            case ActionId.COUNTER /* 61 */:
            case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
            case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
            default:
                return;
            case 7:
                SwitchAccountActivity switchAccountActivity = (SwitchAccountActivity) this.A01;
                1G2 r02 = SwitchAccountActivity.A0I;
                AbF.A0V(switchAccountActivity.A00).A0H(BMG.A3U, (String) null);
                return;
            case 11:
                11T.A0F(th, 0);
                str3 = "AdvancedCryptoSessionRepository";
                str4 = "Failed to get security alerts count";
                0fH.A0r(str3, str4, th);
                return;
            case 12:
                11T.A0F(th, 0);
                str3 = "AdvancedCryptoSessionRepository";
                str4 = "Failed to fetch peer devices";
                0fH.A0r(str3, str4, th);
                return;
            case 13:
                11T.A0F(th, 0);
                str3 = "AdvancedCryptoSessionRepository";
                str4 = "Failed to inject SecureMessageOverWAMailbox";
                0fH.A0r(str3, str4, th);
                return;
            case 14:
                11T.A0F(th, 0);
                str3 = "AdvancedCryptoSessionRepository";
                str4 = "Failed to remove peer device";
                0fH.A0r(str3, str4, th);
                return;
            case 15:
                0fH.A0v("MontageShareUtil", AnonymousClass001.A0Z(th, "Callback for msysAdvancedCryptoLookupService.getThreadsForParticipantsAsync() failed : ", 7zO.A0x(th, 0)), th);
                AbM.A1R(this.A01);
                return;
            case 16:
                11T.A0F(th, 0);
                AppUpdateSetting appUpdateSetting = (AppUpdateSetting) this.A01;
                appUpdateSetting.A01 = false;
                A04 = 1Br.A04(appUpdateSetting.A03);
                str7 = "IS_MANAGED_APP_CACHE";
                str8 = "Failed to fetch isManagedAppCache value";
                A04.softReport(str7, str8, th);
                return;
            case 18:
                ((C3e) this.A01).A00();
                return;
            case 19:
                AfV afV = ((BkC) this.A01).A01;
                BkB bkB = (BkB) afV.A04.getValue();
                1Br r03 = bkB.A01;
                QuickPerformanceLogger A0e = 7zP.A0e(r03);
                int i = bkB.A00;
                A0e.markerAnnotate(744820896, i, "fail_reason", "upload");
                7zP.A0e(r03).markerEnd(744820896, i, (short) 3);
                ((C1x1) afV.A02.getValue()).A00(afV.A00, BLT.A02);
                return;
            case 20:
                B90 b90 = (B90) this.A01;
                b90.A02 = null;
                b90.A05 = true;
                return;
            case 21:
                throw AnonymousClass001.A0N("should not reached");
            case 22:
                C04614bh.A00((C04614bh) this.A01, false);
                return;
            case 25:
                ?? r04 = ((Bd0) this.A01).A00;
                LithoView lithoView = r04.A01;
                String str9 = "lithoView";
                String str10 = null;
                if (lithoView != null) {
                    lithoView.A0x(C1558Alc.A03(AbF.A0U(lithoView), r04));
                    if (r04.A04 == null) {
                        str9 = "alertDialogBuilderFactory";
                    } else {
                        DR6 A0K = AbL.A0K(r04.requireContext(), r04.A07);
                        A0K.A00(2131956596);
                        A0K.A06(2131963911);
                        A0K.A0D(CRf.A00, 2131963907);
                        A0K.A05();
                        CMt cMt = r04.A03;
                        if (cMt != null) {
                            C01i c01i = r04.A09;
                            long A07 = 7zU.A07((Community) c01i.getValue());
                            long A0C = 7zQ.A0C((Community) c01i.getValue());
                            long A0H = 7zQ.A0H(AbJ.A0n(r04.A06));
                            boolean z = r04.A05;
                            if (th != null) {
                                str10 = th.getMessage();
                            }
                            int i2 = 2;
                            if (z) {
                                i2 = 1;
                            }
                            CMt.A00(cMt, str10, (String) null, 18, i2, A07, A0C, A0H);
                            return;
                        }
                        str9 = "communityProfileLogger";
                    }
                }
                11T.A0L(str9);
                throw 0Q8.createAndThrow();
            case 26:
                ((DGk) this.A01).BxV();
                return;
            case 27:
                11T.A0F(th, 0);
                0fH.A0k("CommunityMemberFragment", th.getLocalizedMessage());
                C6I c6i = (C6I) this.A01;
                7zP.A0O(c6i.A07).A01(c6i.A04, false);
                return;
            case 29:
                ChatTakedownBottomSheetDialogFragment chatTakedownBottomSheetDialogFragment = (ChatTakedownBottomSheetDialogFragment) this.A01;
                94S r05 = MigBottomSheetDialogFragment.A01;
                11T.A0A(chatTakedownBottomSheetDialogFragment.A1L().A09);
                chatTakedownBottomSheetDialogFragment.A1L().A0y(ChatTakedownBottomSheetDialogFragment.A05(chatTakedownBottomSheetDialogFragment, false));
                return;
            case 30:
                4zJ r06 = 4zI.A03;
                if (th == null) {
                    throw 1BK.A0h();
                }
                r06.A02("CoplaySetArmadilloDisclaimerOptOutStatsuMutationHandler", "Armadillo status mutation failed with an exception.", th, AnonymousClass001.A1Z());
                return;
            case 31:
                str = "ThreadMessageBroadcastReceiver";
                str2 = "onFailure";
                0fH.A0j(str, str2);
                return;
            case 32:
                0fH.A0g(th.getMessage(), "ThreadNameSettingFrag", "Failed to get AB prop value for group length name %s");
                AbN.A0v(((ThreadNameSettingDialogFragment) this.A01).A01, 25);
                return;
            case 33:
                str = "ChannelListResource";
                str2 = "communityPresenceFetcher.getChannelListActiveCountWithFolderId() fail";
                0fH.A0j(str, str2);
                return;
            case 35:
            case ActionId.SEARCH_TYPEAHEAD /* 92 */:
                ((Function2) A01(this, th)).invoke(null, th);
                return;
            case 36:
                0fH.A0u(C1555AlG.__redex_internal_original_name, "Failed to load main contacts", th);
                return;
            case 37:
                Bwg bwg = (Bwg) this.A01;
                AbN.A1Q(AbF.A0v(bwg.A04), 2131957336);
                ((2Iq) bwg.A02.get()).A01("AddChatMembersController fetchThreadWhitelistAudienceList() failed");
                return;
            case 38:
                B99 b99 = (B99) this.A01;
                b99.A02 = false;
                b99.Bkd();
                C0r c0r = b99.A00;
                if (c0r != null) {
                    c0r.A00();
                    return;
                }
                return;
            case 39:
                try {
                    if (((2L0) th).A00().A00() == 1357006) {
                        ChH.A00((ChH) this.A01);
                        return;
                    } else {
                        ChH.A01((ChH) this.A01, th);
                        return;
                    }
                } catch (ClassCastException unused) {
                    ChH.A01((ChH) this.A01, th);
                    return;
                }
            case 40:
            case 41:
            case 42:
                ((DH7) this.A01).BxV();
                return;
            case 43:
                A04 = 1BK.A09(((CEE) A01(this, th)).A00);
                str7 = "EphemeralMediaActionMutationHelper";
                str8 = "Failed to execute ephemeral media action by GraphQL request. ";
                A04.softReport(str7, str8, th);
                return;
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                A04 = 1BK.A09(((Cfn) A01(this, th)).A00);
                str7 = "EphemeralMediaActionOfflineMutationFactory";
                str8 = "Failed to execute ephemeral media action by pending GraphQL request. ";
                A04.softReport(str7, str8, th);
                return;
            case 46:
                11T.A0F(th, 0);
                str3 = "SecurityAlertsViewModel";
                str4 = "Failed to fetch unread security alerts on init";
                0fH.A0r(str3, str4, th);
                return;
            case ActionId.ON_START_END /* 47 */:
                11T.A0F(th, 0);
                str3 = "SecurityAlertsViewModel";
                str4 = "Failed to fetch peer devices";
                0fH.A0r(str3, str4, th);
                return;
            case ActionId.QUEUED /* 48 */:
                11T.A0F(th, 0);
                str3 = "SecurityAlertsViewModel";
                str4 = "Failed to inject SecureMessageOverWAMailbox";
                0fH.A0r(str3, str4, th);
                return;
            case ActionId.IN_PROGRESS /* 49 */:
                11T.A0F(th, 0);
                str3 = "SecurityAlertsViewModel";
                str4 = "Failed to get total security alerts count";
                0fH.A0r(str3, str4, th);
                return;
            case 50:
                11T.A0F(th, 0);
                str3 = "SecurityAlertsViewModel";
                str4 = "Failed to fetch unread security alerts";
                0fH.A0r(str3, str4, th);
                return;
            case ActionId.UNKNOWN /* 51 */:
                CMe cMe = (CMe) this.A01;
                cMe.A05 = false;
                1Ql.A01(1BL.A0V(cMe.A09), Ba5.A03, false);
                CMe.A01(cMe);
                return;
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                str = "MontageMentionSendReceiver";
                str2 = "sendXMAToE2EEThread fail";
                0fH.A0j(str, str2);
                return;
            case ActionId.QUEUEING_BEGIN /* 54 */:
                str3 = "M4MontagePreferenceFragment";
                str4 = "error fetching stories_data_audience_mode_list";
                0fH.A0r(str3, str4, th);
                return;
            case ActionId.QUEUEING_SUCCESS /* 55 */:
                0fH.A0k("MessageExpirationFragment", "Failed to set message expiration setting");
                return;
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
                0fH.A0p("PageNotificationSettingGlobalNotificationSettingsGraphQLQuery", "Query page notification setting global notification settings failed.", th);
                return;
            case ActionId.MESSAGE_UPDATE_END /* 58 */:
                11T.A0F(th, 0);
                str5 = "UnseenFBNotificationsBadgeController";
                str6 = "Server FB badge count query request failed";
                0fH.A0s(str5, str6, th);
                return;
            case 63:
                0fH.A0j("OmnipickerGroupCentricFrag", "Failed to inject SecureMessageOverWAMailbox");
                ((B7D) this.A01).A00 = 25;
                return;
            case 64:
                0fH.A0g(th.getMessage(), "OmnipickerGroupCentricFrag", "Failed to get AB prop value for group length name %s");
                ((B7D) this.A01).A00 = 25;
                return;
            case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                ((B7D) this.A01).A1e(true);
                return;
            case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                0fH.A0g(th.getMessage(), "OmnipickrNameChatFrag", "Failed to get AB prop value for group length name %s");
                ((B79) this.A01).A00 = 25;
                return;
            case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                C1578Alx.A03((C1578Alx) this.A01);
                return;
            case ActionId.INTERACTION_OPEN_MEDIA_PICKER /* 69 */:
                11T.A0F(th, 0);
                str3 = "privacy_checkups_fragment";
                str4 = "Failed to fetch two factor authentication setting";
                0fH.A0r(str3, str4, th);
                return;
            case ActionId.INTERACTION_OPEN_PHOTO_GALLERY /* 70 */:
            case ActionId.INTERACTION_OPEN_CHECK_IN /* 71 */:
                dfy = ((AcceptFriendRequestBottomSheetDialogFragment) this.A01).A04;
                if (dfy != null) {
                    r3052 = 1Kn.A04;
                    dfy.Bzw(r3052);
                    return;
                }
                return;
            case ActionId.INTERACTION_LOAD_WEB_VIEW /* 72 */:
                dfy = (DFY) this.A01;
                if (dfy != null) {
                    r3052 = 1Kn.A05;
                    dfy.Bzw(r3052);
                    return;
                }
                return;
            case ActionId.INTENT_MAPPED /* 73 */:
                dfy = (DFY) this.A01;
                if (dfy != null) {
                    r3052 = 1Kn.A03;
                    dfy.Bzw(r3052);
                    return;
                }
                return;
            case ActionId.ACTIVITY_LAUNCHED /* 74 */:
                settableFuture = (1FX) this.A01;
                settableFuture.set(1BK.A0d());
                return;
            case ActionId.ACTIVITY_PAUSED /* 75 */:
                11T.A0F(th, 0);
                str3 = "protect_ip_address_setting_fragment";
                str4 = "Failed to fetch IP address protection setting";
                0fH.A0r(str3, str4, th);
                return;
            case ActionId.ACTIVITY_STARTED /* 76 */:
                ?? r07 = ((Bgb) A01(this, th)).A00;
                94S r08 = MigBottomSheetDialogFragment.A01;
                CfG cfG2 = r07.A01;
                if (cfG2 != null) {
                    cfG2.D2v();
                }
                C1306Adj c1306Adj = r07.A02;
                if (c1306Adj != null) {
                    C1306Adj.A0B(c1306Adj, AbI.A10(r07.requireArguments(), "thread_id"), null, 7zU.A0r(7zQ.A0H(BanUserConfirmationFragment.A05(r07))), null, 73, 1, 12, 14, 1);
                }
                C5ic c5ic = r07.A04;
                if (c5ic != null) {
                    DR6 A02 = c5ic.A02(r07.requireContext());
                    A02.A03(AbI.A15((Fragment) r07, BanUserConfirmationFragment.A05(r07).A0X.A01(), 2131963986));
                    A02.A0J(AbI.A15((Fragment) r07, AbF.A1B(BanUserConfirmationFragment.A05(r07)), 2131963985));
                    A02.A0K(true);
                    A02.A09(CSA.A00);
                    A02.A05();
                    return;
                }
                return;
            case ActionId.ACTIVITY_RESUMED /* 77 */:
                r305 = ((LobbyRootView) A01(this, th)).A0P;
                1Br.A0C(r305);
                return;
            case ActionId.FRAGMENT_CREATED /* 78 */:
                r305 = ((LobbyRootView) A01(this, th)).A0K;
                1Br.A0C(r305);
                return;
            case ActionId.FRAGMENT_RESUMED /* 79 */:
                r305 = ((LobbyRootView) A01(this, th)).A0U;
                1Br.A0C(r305);
                return;
            case 80:
                r305 = ((LobbyRootView) A01(this, th)).A0J;
                1Br.A0C(r305);
                return;
            case ActionId.INTENT_MAPPING_BEGIN /* 81 */:
                Cc3 cc3 = (Cc3) A01(this, th);
                2TV r09 = cc3.A00;
                if (r09 != null) {
                    Long l = cc3.A01;
                    if (l == null) {
                        throw 1BK.A0h();
                    }
                    r09.C47(String.valueOf(l.longValue()), new RuntimeException(th));
                    return;
                }
                return;
            case ActionId.FRAGMENT_ON_CREATE /* 82 */:
                str3 = "MessagingTabbedSearchFragment";
                str4 = "Failed to fetch QP";
                0fH.A0r(str3, str4, th);
                return;
            case ActionId.FRAGMENT_NEW_INSTANCE /* 83 */:
                ((C1531Akk) this.A01).A0N = true;
                return;
            case ActionId.MARKER_SWAPPED /* 84 */:
                7zR.A1M((F8q) 7zO.A0p(this.A01), 2131952924);
                return;
            case ActionId.FRAGMENT_INSTANCE_CREATED /* 85 */:
                11T.A0F(th, 0);
                return;
            case ActionId.PREV_ACTIVITY_PAUSED /* 86 */:
                Ct9 ct9 = (Ct9) this.A01;
                ct9.A01.set(ImmutableList.of());
                settableFuture = ct9.A02;
                settableFuture.set(1BK.A0d());
                return;
            case ActionId.ERROR /* 87 */:
                0fH.A0w("BroadcastFlowIntentModelParseEnvironment", "Error loading intent model", th);
                ((CtD) this.A01).A07.CoW("ERROR_GENERIC");
                return;
            case ActionId.METHOD_INVOKE /* 88 */:
                0fH.A18("SpeakeasyRoomShareSender", "Failed to send message %s", new Object[]{th.getMessage()});
                return;
            case ActionId.FINALLY /* 89 */:
                Bt8 bt8 = ((CFW) A01(this, th)).A00;
                if (bt8 != null) {
                    0fH.A0r("FriendUpdatesHelper", "Unable to load fb friend updates.", th);
                    CFW cfw = bt8.A02;
                    C21S.A01(cfw.A09, AbI.A0f(cfw.A04));
                    return;
                }
                return;
            case ActionId.PHOTO_DOWNLOAD_COMPLETE /* 90 */:
                6Gz r010 = (6Gz) ((Cn1) this.A01).A00.A01;
                ImmutableSet immutableSet = 6Gz.A0W;
                A04 = 1BK.A09(r010.A05);
                str7 = "MessageClickHandler";
                str8 = "Remove contact failed for New contact thread bump remove thread and contact CTA";
                A04.softReport(str7, str8, th);
                return;
            case ActionId.MINIPREVIEW_COMPLETE /* 91 */:
                ((C27) this.A01).A00(th);
                return;
            case ActionId.ANIMATION_END /* 93 */:
                11T.A0F(th, 0);
                str3 = "ReportMenuItemImplementation";
                str4 = "Error fetching thread key for report note";
                0fH.A0r(str3, str4, th);
                return;
            case ActionId.UDP_REQUEST_SEND /* 94 */:
                11T.A0F(th, 0);
                str5 = C1566All.__redex_internal_original_name;
                str6 = "statusFetcher.fetchStatusForOwner() failed";
                0fH.A0s(str5, str6, th);
                return;
            case ActionId.MAIN_COMPLETE /* 95 */:
                DGN dgn = (DGN) this.A01;
                if (dgn != null) {
                    dgn.CGq(false);
                    return;
                }
                return;
            case ActionId.INTERRUPTED /* 96 */:
            case ActionId.NETWORK_FAILED /* 97 */:
                ((DHo) this.A01).BxV();
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:183:0x086c, code lost:
    
        if (X.C00673oa.A00(X.4YU.A0T(r0, 0)) == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0892, code lost:
    
        if (X.C1q7.A0e(r0) != false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x08f5, code lost:
    
        if (r0.isEmpty() == false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x3166, code lost:
    
        if (r0 == X.BMK.A05) goto L1045;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x044a, code lost:
    
        if (r0.A02 == false) goto L52;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:122:0x05eb. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:1297:0x33ba  */
    /* JADX WARN: Removed duplicated region for block: B:1300:0x33e0  */
    /* JADX WARN: Removed duplicated region for block: B:1301:0x3412  */
    /* JADX WARN: Type inference failed for: r0v20, types: [androidx.fragment.app.Fragment, X.Alc] */
    /* JADX WARN: Type inference failed for: r0v2184, types: [X.Bg7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 13472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D4q.onSuccess(java.lang.Object):void");
    }
}
