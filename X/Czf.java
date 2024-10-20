package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.advancedcryptotransport.mca.MailboxAdvancedCryptoTransportJNI;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.core.mca.MailboxCoreJNI;
import com.facebook.messaging.communitymessaging.plugins.insights.insightsdashboardentrypointitemsupplier.InsightsDashboardEntryPointItemSupplierImplementation;
import com.facebook.messaging.integrity.frx.ui.fragment.FeedbackReportFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.HashMap;

/* loaded from: Czf.class */
public final class Czf implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;

    public Czf(int i, long j, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = j;
    }

    public Czf(AnonymousClass206 anonymousClass206, MailboxFutureImpl mailboxFutureImpl, int i, long j) {
        this.A00 = i;
        this.A02 = anonymousClass206;
        this.A03 = mailboxFutureImpl;
        this.A01 = j;
    }

    public static Czf A00(Object obj, Object obj2, int i, long j) {
        return new Czf(i, j, obj, obj2);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v544, types: [com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.SettableFuture] */
    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox;
        MailboxFutureImpl mailboxFutureImpl;
        MailboxNullable A0T;
        MailboxFeature.DbConnectionResolutionCallback A02;
        String str;
        String str2;
        Mailbox mailbox2;
        MailboxFutureImpl mailboxFutureImpl2;
        Boolean bool;
        MailboxFeature.DbConnectionResolutionCallback A022;
        String str3;
        String str4;
        Mailbox mailbox3;
        MailboxFutureImpl mailboxFutureImpl3;
        Boolean bool2;
        Czm A023;
        String str5;
        String str6;
        short s;
        Object obj2;
        switch (this.A00) {
            case 0:
                MailboxFutureImpl mailboxFutureImpl4 = (MailboxFutureImpl) this.A03;
                MailboxNullable A0T2 = 1BL.A0T();
                Czm A024 = Czm.A02(this, 3);
                C1qL c1qL = AnonymousClass206.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl4, A0T2, 0, 1, "MCAMailboxAdvancedCryptoTransport", "SecureMessageFetchTotalPeerDeviceChangeAlertCount", A024);
                return;
            case 1:
                AccountSession accountSession = (AccountSession) obj;
                String A1D = 7zM.A1D(AnonymousClass206.A00, 5);
                NotificationScope A00 = Czn.A00(accountSession.getSessionedNotificationCenterCallbackManager(), this, A1D, 0);
                7zL.A1O(A00, this.A03, A1D);
                MailboxAdvancedCryptoTransportJNI.dispatchVJOO(3, this.A01, accountSession, A00);
                return;
            case 2:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                A0T = 1BL.A0T();
                A02 = Czm.A02(this, 6);
                str = "MCAMailboxAIBots";
                str2 = "AIBotFacebookProfile";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, 0, str, str2, A02);
                return;
            case 3:
                mailbox2 = (Mailbox) obj;
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A03;
                bool = false;
                A022 = Czm.A02(this, 17);
                str3 = "MCAMailboxBusinessInbox";
                str4 = "OptimisticallyDeleteBusinessCatalogProduct";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox2, mailboxFutureImpl2, bool, 0, 1, str3, str4, A022);
                return;
            case 4:
                mailbox2 = (Mailbox) obj;
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A03;
                bool = false;
                A022 = Czm.A02(this, 18);
                str3 = "MCAMailboxBusinessInbox";
                str4 = "OptimisticallyDeleteBusinessSavedReplies";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox2, mailboxFutureImpl2, bool, 0, 1, str3, str4, A022);
                return;
            case 5:
                mailbox3 = (Mailbox) obj;
                mailboxFutureImpl3 = (MailboxFutureImpl) this.A03;
                bool2 = false;
                A023 = Czm.A02(this, 30);
                str5 = "MCAMailboxCommunity";
                str6 = "DeletePoll";
                C1qL c1qL2 = 22I.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox3, mailboxFutureImpl3, bool2, 0, 1, str5, str6, A023);
                return;
            case 6:
                mailbox3 = (Mailbox) obj;
                mailboxFutureImpl3 = (MailboxFutureImpl) this.A03;
                bool2 = false;
                A023 = Czm.A02(this, 31);
                str5 = "MCAMailboxCommunity";
                str6 = "FetchAllThreadPendingMemberRequestsCountsForCommunity";
                C1qL c1qL22 = 22I.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox3, mailboxFutureImpl3, bool2, 0, 1, str5, str6, A023);
                return;
            case 7:
                mailbox3 = (Mailbox) obj;
                mailboxFutureImpl3 = (MailboxFutureImpl) this.A03;
                bool2 = false;
                A023 = Czm.A02(this, 36);
                str5 = "MCAMailboxCommunity";
                str6 = "IssueCommunityChatTemplatesFetch";
                C1qL c1qL222 = 22I.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox3, mailboxFutureImpl3, bool2, 0, 1, str5, str6, A023);
                return;
            case 8:
                mailbox3 = (Mailbox) obj;
                mailboxFutureImpl3 = (MailboxFutureImpl) this.A03;
                bool2 = false;
                A023 = Czm.A02(this, 42);
                str5 = "MCAMailboxCommunity";
                str6 = "IssueFetchChatAdminAssistCommandSequences";
                C1qL c1qL2222 = 22I.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox3, mailboxFutureImpl3, bool2, 0, 1, str5, str6, A023);
                return;
            case 9:
                mailbox3 = (Mailbox) obj;
                mailboxFutureImpl3 = (MailboxFutureImpl) this.A03;
                bool2 = false;
                A023 = Czm.A02(this, 43);
                str5 = "MCAMailboxCommunity";
                str6 = "IssueMarkAdminAssistUpsellSeen";
                C1qL c1qL22222 = 22I.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox3, mailboxFutureImpl3, bool2, 0, 1, str5, str6, A023);
                return;
            case 10:
                mailbox3 = (Mailbox) obj;
                mailboxFutureImpl3 = (MailboxFutureImpl) this.A03;
                bool2 = false;
                A023 = Czm.A02(this, 47);
                str5 = "MCAMailboxCommunity";
                str6 = "LocalOptimisticDeleteCommunityChannel";
                C1qL c1qL222222 = 22I.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox3, mailboxFutureImpl3, bool2, 0, 1, str5, str6, A023);
                return;
            case 11:
                mailbox3 = (Mailbox) obj;
                mailboxFutureImpl3 = (MailboxFutureImpl) this.A03;
                bool2 = false;
                A023 = Czm.A02(this, 70);
                str5 = "MCAMailboxCommunity";
                str6 = "UpdateCommunityCapabilitiesV2";
                C1qL c1qL2222222 = 22I.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox3, mailboxFutureImpl3, bool2, 0, 1, str5, str6, A023);
                return;
            case 12:
                MailboxFutureImpl mailboxFutureImpl5 = (MailboxFutureImpl) this.A03;
                MailboxNullable A0T3 = 1BL.A0T();
                Czm A025 = Czm.A02(this, 74);
                C1qL c1qL3 = 22I.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl5, A0T3, 0, 0, "MCAMailboxCommunity", "GetChatCreationUserVisibleErrorByTaskId", A025);
                return;
            case 13:
                MailboxFutureImpl mailboxFutureImpl6 = (MailboxFutureImpl) this.A03;
                MailboxNullable A0T4 = 1BL.A0T();
                Czm A026 = Czm.A02(this, 87);
                C1qL c1qL4 = 22I.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl6, A0T4, 0, 0, "MCAMailboxCommunity", "GetCommunityFolderByGroupId", A026);
                return;
            case 14:
                mailbox3 = (Mailbox) obj;
                mailboxFutureImpl3 = (MailboxFutureImpl) this.A03;
                bool2 = false;
                A023 = Czm.A02(this, ActionId.DATA_LOAD_START);
                str5 = "MCAMailboxCommunity";
                str6 = "AddCommunityToInbox";
                C1qL c1qL22222222 = 22I.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox3, mailboxFutureImpl3, bool2, 0, 1, str5, str6, A023);
                return;
            case 15:
                mailbox3 = (Mailbox) obj;
                mailboxFutureImpl3 = (MailboxFutureImpl) this.A03;
                bool2 = false;
                A023 = Czm.A02(this, ActionId.LEGACY_MARKER);
                str5 = "MCAMailboxCommunity";
                str6 = "AddThreadToInbox";
                C1qL c1qL222222222 = 22I.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox3, mailboxFutureImpl3, bool2, 0, 1, str5, str6, A023);
                return;
            case 16:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                A0T = 1BL.A0T();
                A02 = Czm.A02(this, ActionId.TIMEOUT);
                str = "MCAMailboxCommunityMessagingSearch";
                str2 = "CmUniversalSearchGetCommunity";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, 0, str, str2, A02);
                return;
            case 17:
                mailbox2 = (Mailbox) obj;
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A03;
                bool = false;
                A022 = Czm.A02(this, ActionId.VIDEO_SET_RENDERER_CONTEXT);
                str3 = MRk.A00(37);
                str4 = "VerifyPersistentMenuExists";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox2, mailboxFutureImpl2, bool, 0, 1, str3, str4, A022);
                return;
            case 18:
                AccountSession accountSession2 = (AccountSession) obj;
                String A1D2 = 7zM.A1D(1xC.A00, 0);
                NotificationScope A002 = Czo.A00(accountSession2.getSessionedNotificationCenterCallbackManager(), this, A1D2, 6);
                7zL.A1O(A002, this.A03, A1D2);
                MailboxCoreJNI.dispatchVIJOO(7, 22, this.A01, accountSession2, A002);
                return;
            case 19:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                A0T = 1BL.A0T();
                A02 = Czm.A02(this, ActionId.CARD_DATA_LOADED);
                str = "MCAMailboxCutover";
                str2 = "CutoverFetchOtherContactFbidFromMessagePk";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, 0, str, str2, A02);
                return;
            case 20:
                mailbox2 = (Mailbox) obj;
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A03;
                bool = false;
                A022 = Czm.A02(this, ActionId.VIEW_WILL_APPEAR_BEGIN);
                str3 = "MCAMailboxCutoverInternal";
                str4 = "CutoverOpenThread";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox2, mailboxFutureImpl2, bool, 0, 1, str3, str4, A022);
                return;
            case 21:
                mailbox2 = (Mailbox) obj;
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A03;
                bool = false;
                A022 = Czm.A02(this, ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES);
                str3 = "MCAMailboxFilteredThreadsRanges";
                str4 = "ClearFilteredThreadsRanges";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox2, mailboxFutureImpl2, bool, 0, 1, str3, str4, A022);
                return;
            case 22:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                A0T = 1BL.A0T();
                A02 = Czm.A02(this, ActionId.MESSENGER_QUEUE_CREATION);
                str = "MCAMailboxFRX";
                str2 = "FrxDecryptedRecentMessages";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, 0, str, str2, A02);
                return;
            case 23:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                A0T = 1BL.A0T();
                A02 = Czm.A02(this, ActionId.MESSENGER_DELTA_REQUEST);
                str = "MCAMailboxGroupThread";
                str2 = "HasGroupThreadCreatedInServer";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, 0, str, str2, A02);
                return;
            case 24:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                A0T = 1BL.A0T();
                A02 = Czm.A02(this, ActionId.ACTIVITY_RESUME);
                str = "MCAMailboxMagicWords";
                str2 = "ThreadMagicWords";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, 0, str, str2, A02);
                return;
            case 25:
                5Qb r0 = (5Qb) obj;
                D25 d25 = (D25) this.A03;
                MailboxFeature mailboxFeature = (MailboxFeature) this.A02;
                long j = this.A01;
                String valueOf = String.valueOf(j);
                1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
                MailboxFutureImpl A0P = 1BK.A0P(AQV);
                1Um.A02(AQV, new Cxq(mailboxFeature, A0P, valueOf, 4), A0P, false);
                CMx cMx = (CMx) 1Br.A0B(d25.A03);
                boolean A1O = AnonymousClass001.A1O(r0.A00);
                String str7 = r0.A02;
                Long valueOf2 = Long.valueOf(j);
                1Br r02 = cMx.A00;
                7zP.A0e(r02).markerPoint(973799425, CMx.A00(cMx, valueOf2), "preview_fetch_completed");
                7zP.A0e(r02).markerAnnotate(973799425, CMx.A00(cMx, valueOf2), "preview_fetch_task_state", A1O);
                QuickPerformanceLogger A0e = 7zP.A0e(r02);
                int A003 = CMx.A00(cMx, valueOf2);
                if (A1O) {
                    s = 2;
                } else {
                    A0e.markerAnnotate(973799425, A003, "preview_fetch_task_error", str7);
                    A0e = 7zP.A0e(r02);
                    A003 = CMx.A00(cMx, valueOf2);
                    s = 3;
                }
                A0e.markerEnd(973799425, A003, s);
                return;
            case 26:
                if (((5Qb) obj).A00 == 0) {
                    ?? A0j = 4YU.A0j();
                    22I r03 = (22I) this.A02;
                    long j2 = this.A01;
                    InsightsDashboardEntryPointItemSupplierImplementation insightsDashboardEntryPointItemSupplierImplementation = (InsightsDashboardEntryPointItemSupplierImplementation) this.A03;
                    r03.A02(new Czk((SettableFuture) A0j, 36), AbL.A0S(insightsDashboardEntryPointItemSupplierImplementation.A04), j2);
                    1Br.A0D(insightsDashboardEntryPointItemSupplierImplementation.A03, D4q.A00(insightsDashboardEntryPointItemSupplierImplementation, 28), (ListenableFuture) A0j);
                    return;
                }
                return;
            case 27:
                MailboxNullable mailboxNullable = (MailboxNullable) obj;
                if (mailboxNullable == null || (obj2 = mailboxNullable.value) == null) {
                    return;
                }
                int integer = ((1qX) obj2).mResultSet.getInteger(0, 0);
                if (integer == 0) {
                    CQd cQd = (CQd) this.A02;
                    cQd.A08.A03("report_completed");
                    FeedbackReportFragment feedbackReportFragment = cQd.A02;
                    feedbackReportFragment.getClass();
                    feedbackReportFragment.A1J((BLo) this.A03);
                    return;
                }
                if (integer == 1) {
                    CQd.A03((CQd) this.A02, (BLo) this.A03, (Throwable) null);
                    return;
                }
                if (integer == 2) {
                    CQd cQd2 = (CQd) this.A02;
                    6Io r04 = cQd2.A06;
                    FbUserSession fbUserSession = cQd2.A03;
                    ThreadKey threadKey = cQd2.A09;
                    String valueOf3 = String.valueOf(this.A01);
                    r04.A0C(fbUserSession, cQd2.A07, threadKey, cQd2.A01.A09, valueOf3, valueOf3);
                    return;
                }
                return;
            case 28:
                CxV cxV = (CxV) this.A02;
                1FX r05 = (1FX) this.A03;
                long j3 = this.A01;
                if (!Boolean.TRUE.equals(((MailboxNullable) obj).value) || r05.isDone() || cxV.A00.getAndSet(true)) {
                    return;
                }
                C5y4 c5y4 = (C5y4) cxV.A03.A0N.get();
                r05.setFuture(2FP.A01(D3J.A01(c5y4, 25), C5y4.A00(ThreadKey.A0E(j3), c5y4, null, false)));
                return;
            case 29:
                Bqk bqk = (Bqk) this.A02;
                1FX r06 = (1FX) this.A03;
                long j4 = this.A01;
                1qX A0t = 7zL.A0t(obj);
                if (A0t == null) {
                    r06.setException(AnonymousClass001.A0N("Failed to fetch raw group thread names"));
                    0fH.A0S(Bqk.class, "FetchAllRawGroupNames result is null. It took %dms", new Object[]{AnonymousClass001.A0O(j4)});
                    return;
                }
                HashMap A0u = AnonymousClass001.A0u();
                HashMap A0u2 = AnonymousClass001.A0u();
                int A004 = 1qX.A00(A0t);
                for (int i = 0; i < A004; i++) {
                    Long nullableLong = A0t.mResultSet.getNullableLong(i, 1);
                    Long nullableLong2 = A0t.mResultSet.getNullableLong(i, 2);
                    String A11 = 4YU.A11(A0t, i, 0);
                    if (nullableLong != null) {
                        A0u.put(nullableLong, A11);
                    } else if (nullableLong2 != null) {
                        A0u2.put(nullableLong2, A11);
                    } else {
                        0fH.A0T(Bqk.class, "Both thread key and thread pk are null for %s", new Object[]{A11});
                    }
                }
                0fH.A07(Bqk.class, Long.valueOf(bqk.A00.now() - j4), "Fetch group thread names took %dms");
                r06.set(new CEK(bqk, A0u, A0u2));
                return;
            case 30:
                5Qb r07 = (5Qb) obj;
                if (2oI.A06((ThreadSummary) this.A02)) {
                    int i2 = r07.A00;
                    CQo A0b = AbI.A0b(((CHA) this.A03).A00);
                    long j5 = this.A01;
                    if (i2 == 0) {
                        CQo.A0D(BOn.A0F, A0b, Long.valueOf(j5), ActionId.PRIVACY_VIOLATION, 3, 19);
                        return;
                    } else {
                        A0b.A0L(j5, false);
                        return;
                    }
                }
                return;
            case 31:
                5Qb r08 = (5Qb) obj;
                if (2oI.A06((ThreadSummary) this.A02)) {
                    CQo.A0D(BOn.A0F, AbI.A0b(((CHA) this.A03).A00), Long.valueOf(this.A01), r08.A00 == 0 ? 151 : 152, 3, 19);
                    return;
                }
                return;
            case 32:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                A0T = 1BL.A0T();
                A02 = Czm.A02(this, ActionId.APPLY_FINISHED_LIST);
                str = "MCAMailboxMessengerShoppingCartStatus";
                str2 = "GetMessengerShoppingCartStatus";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, 0, str, str2, A02);
                return;
            case 33:
                MailboxFutureImpl mailboxFutureImpl7 = (MailboxFutureImpl) this.A03;
                MailboxNullable A0T5 = 1BL.A0T();
                Czm A027 = Czm.A02(this, ActionId.NOTIFY_SUBSCRIBERS);
                C1qL c1qL5 = GsL.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl7, A0T5, 0, 0, "MCAMailboxPayments", "PaymentsP2mPaymentDetectionData", A027);
                return;
            case 34:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                A0T = 1BL.A0T();
                A02 = Czm.A02(this, ActionId.ASYNC_FAIL);
                str = "MCAMailboxProactiveWarningsNonCore";
                str2 = "ProactiveWarningClientThreadReportingContext";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, 0, str, str2, A02);
                return;
            case 35:
                MailboxFutureImpl mailboxFutureImpl8 = (MailboxFutureImpl) this.A03;
                MailboxNullable A0T6 = 1BL.A0T();
                Czm A028 = Czm.A02(this, ActionId.ASYNC_ACTION_FAIL);
                C1qL c1qL6 = BDc.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl8, A0T6, 0, 0, "MCAMailboxPublicChats", "PublicChatsPersonalInboxInfo", A028);
                return;
            case 36:
                MailboxFutureImpl mailboxFutureImpl9 = (MailboxFutureImpl) this.A03;
                Czl A005 = Czl.A00(this, 0);
                C1qL c1qL7 = BDc.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl9, false, 0, 1, "MCAMailboxPublicChats", "FetchDiscoverableChatsPersonalInboxInfo", A005);
                return;
            case 37:
                mailbox2 = (Mailbox) obj;
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A03;
                bool = false;
                A022 = Czl.A00(this, 9);
                str3 = "MCAMailboxPushNotifications";
                str4 = "OptimisticallyUpdateGlobalMuteUntil";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox2, mailboxFutureImpl2, bool, 0, 1, str3, str4, A022);
                return;
            case 38:
                mailbox2 = (Mailbox) obj;
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A03;
                bool = false;
                A022 = Czl.A00(this, 17);
                str3 = "MCAMailboxQPDebugger";
                str4 = "DebuggerEvaluateAllPromotions";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox2, mailboxFutureImpl2, bool, 0, 1, str3, str4, A022);
                return;
            case 39:
                MailboxFutureImpl mailboxFutureImpl10 = (MailboxFutureImpl) this.A03;
                MailboxNullable A0T7 = 1BL.A0T();
                Czl A006 = Czl.A00(this, 49);
                C1qL c1qL8 = 5Xd.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl10, A0T7, 0, 0, "MCAMailboxSecureMessage", "SecureMessageOurDevices", A006);
                return;
            case 40:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                A0T = 1BL.A0T();
                A02 = Czl.A00(this, 62);
                str = "MCAMailboxStella";
                str2 = "MediaAttachment";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0T, 0, 0, str, str2, A02);
                return;
            default:
                MailboxFutureImpl mailboxFutureImpl11 = (MailboxFutureImpl) this.A03;
                Czl A007 = Czl.A00(this, 95);
                String A008 = 1BJ.A00(785);
                C1qL c1qL9 = C8ya.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl11, false, 0, 1, A008, "UnpauseThread", A007);
                return;
        }
    }
}
