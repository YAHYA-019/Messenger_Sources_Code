package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.aibot.plugins.core.threadsettings.aibotprofiledata.ThreadSettingsAiBotProfileDataLoader;
import com.facebook.messaging.business.ads.leadgen.plugins.messenger.threadsettingsrow.pageinfoloader.MessengerThreadSettingsPageInfoData;
import com.facebook.messaging.business.ads.orderhistory.plugins.threadorderhistory.threadsettingssecondarydata.ThreadSettingsPlacedOrdersInfoData;
import com.facebook.messaging.business.notificationmessages.plugins.threadsettingrow.notificationmessagestopicsdata.MessengerThreadSettingsTopicsData;
import com.facebook.messaging.business.plugins.p2bdifferentiation.threadsettingsdata.P2BPrivacyDisclosureThreadSettingsData;
import com.facebook.messaging.communitymessaging.model.CommunityExtraData;
import com.facebook.messaging.communitymessaging.plugins.bots.botsthreadsettingdata.BotsThreadSettingDataImplementation;
import com.facebook.messaging.communitymessaging.plugins.communityinfo.admodreview.badging.PendingAdmodReviewBadgeCountFetcher;
import com.facebook.messaging.communitymessaging.plugins.communityinfo.secondarydata.communitydata.CommunityData;
import com.facebook.messaging.communitymessaging.plugins.events.secondarydata.eventsdata.EventsData;
import com.facebook.messaging.communitymessaging.plugins.threadsettings.communitydata.ChannelCommunityData;
import com.facebook.messaging.groups.plugins.core.threadsettingssecondarydata.showmemberrequestsdata.ShowMemberRequestsDataImplementation;
import com.facebook.messaging.mentorship.plugins.core.threadsettingssecondarydata.ThreadSettingsMentorshipInfoData;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.notify.plugins.mutexapp.threadsettingsdata.ThreadSettingsMuteData;
import com.facebook.messaging.payments.plugins.core.threadsettingssecondarydata.ThreadSettingsPaymentInfoData;
import com.facebook.messaging.presence.plugins.core.threadsettingssubtitledata.ThreadSettingsSubtitleData;
import com.facebook.messaging.service.model.FetchThreadMetadataParams;
import com.facebook.messaging.wellbeing.selfremediation.restrict.plugins.threadsettingsdata.RestrictThreadSettingsData;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.presence.plugins.core.threadsettingsdata.ThreadSettingsPresenceData;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;
import com.google.common.collect.ImmutableSet;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Anv, reason: case insensitive filesystem */
/* loaded from: Anv.class */
public final class C1617Anv extends 2bY {
    public ThreadSummary A00;
    public User A01;
    public final 1Br A02;
    public final 1Br A03;
    public final C1w A04;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1617Anv(android.content.Context r302, com.facebook.auth.usersession.FbUserSession r303, com.facebook.messaging.model.threadkey.ThreadKey r304, com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData r305) {
        /*
            r301 = this;
            r0 = r304
            r1 = r305
            X.7zR.A1O(r0, r1)
            X.2Sh r0 = X.2Sh.A01
            r306 = r0
            r0 = r306
            X.11T.A0B(r0)
            r0 = r301
            r1 = r306
            r0.<init>(r1)
            X.1Br r0 = X.7zM.A0Q()
            r306 = r0
            r0 = r301
            r1 = r306
            r0.A02 = r1
            r0 = 83075(0x14483, float:1.16413E-40)
            X.1Br r0 = X.1Bu.A00(r0)
            r306 = r0
            r0 = r301
            r1 = r306
            r0.A03 = r1
            X.C1x r0 = new X.C1x
            r306 = r0
            r0 = r306
            r1 = r301
            r0.<init>(r1)
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = r0
            r2 = r0; r3 = r1; 
            r4 = 0
            r5 = r304
            r3[r4] = r5
            r3 = 1
            r4 = r306
            r2[r3] = r4
            r2 = 2
            r3 = r305
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = r303
            r1[r2] = r3
            r307 = r0
            r0 = r302
            java.lang.String r1 = "com_facebook_messaging_threadsettings_plugins_interfaces_secondarydata_ThreadSettingsSecondaryDataInterfaceSpec"
            java.lang.String r2 = "All"
            r3 = r307
            java.lang.Object r0 = X.C1Y6.A00(r0, r1, r2, r3)
            X.BbE r0 = (X.BbE) r0
            r307 = r0
            X.C1w r0 = new X.C1w
            r306 = r0
            r0 = r306
            r1 = r307
            r0.<init>(r1)
            r0 = r301
            r1 = r306
            r0.A04 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1617Anv.<init>(android.content.Context, com.facebook.auth.usersession.FbUserSession, com.facebook.messaging.model.threadkey.ThreadKey, com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData):void");
    }

    public void onActive() {
        LiveData liveData;
        int andIncrement;
        C1w c1w = this.A04;
        CQp cQp = c1w.A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = cQp.A0c;
        String str = "com.facebook.messaging.threadsettings.plugins.interfaces.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec";
        r0.A08("com.facebook.messaging.threadsettings.plugins.interfaces.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "onSubscribe", andIncrement2);
        try {
            CQp.A00(cQp);
            try {
                if (CQp.A0E(cQp)) {
                    andIncrement = atomicInteger.getAndIncrement();
                    str = "messaging.notify.mutexapp.threadsettingsdata.ThreadSettingsMuteData";
                    r0.A0A("com.facebook.messaging.notify.plugins.mutexapp.threadsettingsdata.ThreadSettingsMuteData", str, "com.facebook.messaging.threadsettings.plugins.interfaces.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", andIncrement, "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "com.facebook.messaging.notify.plugins.mutexapp.NotifyMutexappKillSwitch", "onSubscribe");
                    try {
                        ThreadSettingsMuteData threadSettingsMuteData = cQp.A0D;
                        C1x c1x = threadSettingsMuteData.A05;
                        C00i c00i = threadSettingsMuteData.A03.A00;
                        2Ph r02 = (2Ph) c00i.get();
                        ThreadKey threadKey = threadSettingsMuteData.A04;
                        c1x.A00(7zM.A17(r02.A02(threadKey).A02()), "is_muted");
                        c1x.A00(7zM.A17(((2Ph) c00i.get()).A01(threadKey).A02()), "is_call_muted");
                        1PA r319 = threadSettingsMuteData.A00;
                        if (r319 == null) {
                            D0U d0u = new D0U(threadSettingsMuteData, 22);
                            1P9 A00 = 1P9.A00(threadSettingsMuteData.A02.A00);
                            A00.A05(d0u, 1BJ.A00(ActionId.ASYNC_ACTION_SUCCESS));
                            r319 = 1P9.A01(A00, d0u, 1BJ.A00(6));
                            threadSettingsMuteData.A00 = r319;
                        }
                        if (r319 == null) {
                            throw 1BK.A0h();
                        }
                        r319.A00();
                        r0.A09(str, "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "onSubscribe", andIncrement);
                    } catch (Exception e) {
                        throw e;
                    }
                }
                if (CQp.A0G(cQp)) {
                    int andIncrement3 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.presence.plugins.core.threadsettingssubtitledata.ThreadSettingsSubtitleData", "messaging.presence.core.threadsettingssubtitledata.ThreadSettingsSubtitleData", "com.facebook.messaging.threadsettings.plugins.interfaces.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", andIncrement3, "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "com.facebook.messaging.presence.plugins.core.PresenceCoreKillSwitch", "onSubscribe");
                    ThreadSettingsSubtitleData threadSettingsSubtitleData = cQp.A0F;
                    C1x c1x2 = threadSettingsSubtitleData.A01;
                    5Cz r03 = 5Cz.A08;
                    11T.A0B(r03);
                    c1x2.A00(r03, null);
                    ((C92) 1Br.A0B(threadSettingsSubtitleData.A00)).A02(true);
                    r0.A09("messaging.presence.core.threadsettingssubtitledata.ThreadSettingsSubtitleData", "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "onSubscribe", andIncrement3);
                }
                if (CQp.A0H(cQp)) {
                    int andIncrement4 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.wellbeing.selfremediation.restrict.plugins.threadsettingsdata.RestrictThreadSettingsData", "messaging.wellbeing.selfremediation.restrict.threadsettingsdata.RestrictThreadSettingsData", "com.facebook.messaging.threadsettings.plugins.interfaces.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", andIncrement4, "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "com.facebook.messaging.wellbeing.selfremediation.restrict.plugins.WellbeingSelfremediationRestrictKillSwitch", "onSubscribe");
                    RestrictThreadSettingsData restrictThreadSettingsData = cQp.A0G;
                    restrictThreadSettingsData.A04.A00(RestrictThreadSettingsData.A00(restrictThreadSettingsData), null);
                    restrictThreadSettingsData.A02.A00();
                    r0.A09("messaging.wellbeing.selfremediation.restrict.threadsettingsdata.RestrictThreadSettingsData", "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "onSubscribe", andIncrement4);
                }
                if (CQp.A0D(cQp)) {
                    int andIncrement5 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.mentorship.plugins.core.threadsettingssecondarydata.ThreadSettingsMentorshipInfoData", "messaging.mentorship.core.threadsettingssecondarydata.ThreadSettingsMentorshipInfoData", "com.facebook.messaging.threadsettings.plugins.interfaces.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", andIncrement5, "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "com.facebook.messaging.mentorship.plugins.core.MentorshipCoreKillSwitch", "onSubscribe");
                    ThreadSettingsMentorshipInfoData threadSettingsMentorshipInfoData = cQp.A0C;
                    C00i c00i2 = threadSettingsMentorshipInfoData.A00.A00;
                    ((Cc7) c00i2.get()).A02 = new C1618Anw(threadSettingsMentorshipInfoData, 4);
                    Cc7 cc7 = (Cc7) c00i2.get();
                    C2u c2u = new C2u(11T.A04(threadSettingsMentorshipInfoData.A01), new String[]{"thread_key", "mentorship_data"});
                    if (cc7.A01 != null) {
                        0fH.A0j(Cc7.__redex_internal_original_name, "There is already a task in progress");
                    } else {
                        cc7.A00 = Cc7.A09.getAndIncrement();
                        1BK.A0U(cc7.A07).markerStart(5505187, cc7.A00);
                        20A r04 = cc7.A04;
                        C1cm c1cm = C2rg.A06;
                        ImmutableSet immutableSet = c2u.A00;
                        r04.A05(c1cm, "ThreadsMetadataLoader FETCH_THREAD_METADATA %s", new Object[]{immutableSet});
                        Bundle A05 = 1BK.A05();
                        A05.putParcelable("fetchThreadMetadataParams", new FetchThreadMetadataParams(immutableSet, c2u.A01));
                        1Ho newInstance_DEPRECATED = 4YU.A0L(cc7.A05).newInstance_DEPRECATED(1BJ.A00(1316), A05, 1, CallerContext.A06(Cc7.class));
                        DBF dbf = new DBF(newInstance_DEPRECATED, cc7, 6);
                        1QB r05 = (1QB) 1Bn.A0E((Context) null, cc7.A03, 65841);
                        r05.A05 = dbf;
                        r05.A04(newInstance_DEPRECATED.A0N);
                        r05.A03 = "BlueService";
                        r05.A03("Background");
                        2eH A002 = 2FP.A00(new In5(cc7, 1), ((1Qc) cc7.A06.get()).A03(r05.A01(), "None"), 1JU.A01);
                        2TV r06 = cc7.A02;
                        if (r06 != null) {
                            r06.C4n(A002, c2u);
                        }
                        ApG apG = new ApG(cc7, c2u, 1);
                        cc7.A01 = new 2eS(apG, A002);
                        1Kd.A0D(cc7.A08, apG, A002);
                    }
                    r0.A09("messaging.mentorship.core.threadsettingssecondarydata.ThreadSettingsMentorshipInfoData", "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "onSubscribe", andIncrement5);
                }
                if (CQp.A0I(cQp)) {
                    int andIncrement6 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.presence.plugins.core.threadsettingsdata.ThreadSettingsPresenceData", "presence.core.threadsettingsdata.ThreadSettingsPresenceData", "com.facebook.messaging.threadsettings.plugins.interfaces.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", andIncrement6, "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "com.facebook.presence.plugins.core.CoreKillSwitch", "onSubscribe");
                    ThreadSettingsPresenceData threadSettingsPresenceData = cQp.A0H;
                    1XZ r07 = (1XZ) 1Br.A0B(threadSettingsPresenceData.A00);
                    BFd bFd = threadSettingsPresenceData.A02;
                    r07.A77(bFd);
                    bFd.A02();
                    r0.A09("presence.core.threadsettingsdata.ThreadSettingsPresenceData", "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "onSubscribe", andIncrement6);
                }
                if (CQp.A07(cQp)) {
                    int andIncrement7 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.communitymessaging.plugins.bots.botsthreadsettingdata.BotsThreadSettingDataImplementation", "messaging.communitymessaging.bots.botsthreadsettingdata.BotsThreadSettingDataImplementation", "com.facebook.messaging.threadsettings.plugins.interfaces.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", andIncrement7, "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", 4YT.A00(11), "onSubscribe");
                    BotsThreadSettingDataImplementation botsThreadSettingDataImplementation = cQp.A06;
                    botsThreadSettingDataImplementation.A01 = (BTX) 1Bi.A03(83196);
                    FbUserSession A01 = 1Fw.A01(FbInjector.A00());
                    if (botsThreadSettingDataImplementation.A01 != null) {
                        ThreadKey threadKey2 = botsThreadSettingDataImplementation.A03;
                        11T.A0F(A01, 0);
                        Bde bde = (Bde) 1Bn.A0A(83195);
                        liveData = Transformations.distinctUntilChanged(new 6CU(new AQt(7zL.A0S(A01, bde.A00, 84158), threadKey2, 35), new AV4(bde, 27)));
                    } else {
                        liveData = null;
                    }
                    botsThreadSettingDataImplementation.A00 = liveData;
                    if (liveData != null) {
                        liveData.observeForever(botsThreadSettingDataImplementation.A02);
                    }
                    r0.A09("messaging.communitymessaging.bots.botsthreadsettingdata.BotsThreadSettingDataImplementation", "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "onSubscribe", andIncrement7);
                }
                if (CQp.A09(cQp)) {
                    int andIncrement8 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.communitymessaging.plugins.communityinfo.secondarydata.communitydata.CommunityData", "messaging.communitymessaging.communityinfo.secondarydata.communitydata.CommunityData", "com.facebook.messaging.threadsettings.plugins.interfaces.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", andIncrement8, "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.communityinfo.CommunitymessagingCommunityinfoKillSwitch", "onSubscribe");
                    CommunityData communityData = cQp.A08;
                    communityData.A00.observeForever(communityData.A01);
                    r0.A09("messaging.communitymessaging.communityinfo.secondarydata.communitydata.CommunityData", "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "onSubscribe", andIncrement8);
                }
                if (CQp.A0C(cQp)) {
                    int andIncrement9 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.groups.plugins.core.threadsettingssecondarydata.showmemberrequestsdata.ShowMemberRequestsDataImplementation", "messaging.groups.core.threadsettingssecondarydata.showmemberrequestsdata.ShowMemberRequestsDataImplementation", "com.facebook.messaging.threadsettings.plugins.interfaces.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", andIncrement9, "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "com.facebook.messaging.groups.plugins.core.GroupsCoreKillSwitch", "onSubscribe");
                    ShowMemberRequestsDataImplementation showMemberRequestsDataImplementation = cQp.A0B;
                    showMemberRequestsDataImplementation.A09.set(true);
                    if (1Br.A07(AbK.A0U().A01).AZk(36322078860854336L)) {
                        AbF.A0E(showMemberRequestsDataImplementation.A00, showMemberRequestsDataImplementation.A01).A06(showMemberRequestsDataImplementation.A06.A0r());
                    } else if (((2rT) 1Br.A0B(showMemberRequestsDataImplementation.A03)).A02(showMemberRequestsDataImplementation.A06)) {
                        ShowMemberRequestsDataImplementation.A00(showMemberRequestsDataImplementation);
                        ((C21N) 1Lm.A05(showMemberRequestsDataImplementation.A00, 1Br.A03(showMemberRequestsDataImplementation.A05), 33124)).A00(showMemberRequestsDataImplementation.A08);
                    }
                    r0.A09("messaging.groups.core.threadsettingssecondarydata.showmemberrequestsdata.ShowMemberRequestsDataImplementation", "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "onSubscribe", andIncrement9);
                }
                if (CQp.A08(cQp)) {
                    int andIncrement10 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.communitymessaging.plugins.communityinfo.admodreview.badging.PendingAdmodReviewBadgeCountFetcher", "messaging.communitymessaging.communityinfo.admodreview.badging.PendingAdmodReviewBadgeCountFetcher", "com.facebook.messaging.threadsettings.plugins.interfaces.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", andIncrement10, "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.communityinfo.CommunitymessagingCommunityinfoKillSwitch", "onSubscribe");
                    PendingAdmodReviewBadgeCountFetcher pendingAdmodReviewBadgeCountFetcher = cQp.A07;
                    22I A0E = AbF.A0E(pendingAdmodReviewBadgeCountFetcher.A00, pendingAdmodReviewBadgeCountFetcher.A01);
                    Parcelable A003 = ParcelableSecondaryData.A00(pendingAdmodReviewBadgeCountFetcher.A02, CommunityExtraData.class, null);
                    if (A003 == null) {
                        throw 1BK.A0h();
                    }
                    A0E.A08((MailboxCallback) null, ((CommunityExtraData) A003).A00);
                    r0.A09("messaging.communitymessaging.communityinfo.admodreview.badging.PendingAdmodReviewBadgeCountFetcher", "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "onSubscribe", andIncrement10);
                }
                r0.A02((Exception) null, "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "onSubscribe", andIncrement2);
                ThreadSummary threadSummary = this.A00;
                if (threadSummary == null && this.A01 == null) {
                    return;
                }
                c1w.A00(threadSummary, this.A01);
            } catch (Throwable th) {
                r0.A04((Exception) null, str, "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "onSubscribe", andIncrement);
                throw th;
            }
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "onSubscribe", andIncrement2);
            throw th2;
        }
    }

    public void onInactive() {
        String str;
        int andIncrement;
        CQp cQp = this.A04.A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = cQp.A0c;
        r0.A08("com.facebook.messaging.threadsettings.plugins.interfaces.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "onUnsubscribe", andIncrement2);
        try {
            CQp.A00(cQp);
            try {
                if (CQp.A0E(cQp)) {
                    andIncrement = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.notify.plugins.mutexapp.threadsettingsdata.ThreadSettingsMuteData", "messaging.notify.mutexapp.threadsettingsdata.ThreadSettingsMuteData", "com.facebook.messaging.threadsettings.plugins.interfaces.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", andIncrement, "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "com.facebook.messaging.notify.plugins.mutexapp.NotifyMutexappKillSwitch", "onUnsubscribe");
                    try {
                        1PA r02 = cQp.A0D.A00;
                        if (r02 != null) {
                            r02.A01();
                        }
                        r0.A09("messaging.notify.mutexapp.threadsettingsdata.ThreadSettingsMuteData", "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "onUnsubscribe", andIncrement);
                    } catch (Exception e) {
                        throw e;
                    }
                }
                if (CQp.A0G(cQp)) {
                    int andIncrement3 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.presence.plugins.core.threadsettingssubtitledata.ThreadSettingsSubtitleData", "messaging.presence.core.threadsettingssubtitledata.ThreadSettingsSubtitleData", "com.facebook.messaging.threadsettings.plugins.interfaces.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", andIncrement3, "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "com.facebook.messaging.presence.plugins.core.PresenceCoreKillSwitch", "onUnsubscribe");
                    C00i c00i = cQp.A0F.A00.A00;
                    ((C92) c00i.get()).A02(false);
                    ((C92) c00i.get()).A00(null);
                    r0.A09("messaging.presence.core.threadsettingssubtitledata.ThreadSettingsSubtitleData", "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "onUnsubscribe", andIncrement3);
                }
                if (CQp.A0H(cQp)) {
                    int andIncrement4 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.wellbeing.selfremediation.restrict.plugins.threadsettingsdata.RestrictThreadSettingsData", "messaging.wellbeing.selfremediation.restrict.threadsettingsdata.RestrictThreadSettingsData", "com.facebook.messaging.threadsettings.plugins.interfaces.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", andIncrement4, "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "com.facebook.messaging.wellbeing.selfremediation.restrict.plugins.WellbeingSelfremediationRestrictKillSwitch", "onUnsubscribe");
                    cQp.A0G.A02.A01();
                    r0.A09("messaging.wellbeing.selfremediation.restrict.threadsettingsdata.RestrictThreadSettingsData", "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "onUnsubscribe", andIncrement4);
                }
                if (CQp.A03(cQp)) {
                    int andIncrement5 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.business.ads.leadgen.plugins.messenger.threadsettingsrow.pageinfoloader.MessengerThreadSettingsPageInfoData", "messaging.business.ads.leadgen.messenger.threadsettingsrow.pageinfoloader.MessengerThreadSettingsPageInfoData", "com.facebook.messaging.threadsettings.plugins.interfaces.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", andIncrement5, "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "com.facebook.messaging.business.ads.leadgen.plugins.messenger.BusinessAdsLeadgenMessengerKillSwitch", "onUnsubscribe");
                    MessengerThreadSettingsPageInfoData messengerThreadSettingsPageInfoData = cQp.A02;
                    BcF bcF = (BcF) 1Br.A0B(messengerThreadSettingsPageInfoData.A03);
                    BcG bcG = messengerThreadSettingsPageInfoData.A05;
                    11T.A0F(bcG, 0);
                    bcF.A00.remove(bcG);
                    ((CMI) 1Br.A0B(messengerThreadSettingsPageInfoData.A04)).A05.A02();
                    messengerThreadSettingsPageInfoData.A01 = false;
                    r0.A09("messaging.business.ads.leadgen.messenger.threadsettingsrow.pageinfoloader.MessengerThreadSettingsPageInfoData", "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "onUnsubscribe", andIncrement5);
                }
                if (CQp.A0F(cQp)) {
                    int andIncrement6 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.payments.plugins.core.threadsettingssecondarydata.ThreadSettingsPaymentInfoData", "messaging.payments.core.threadsettingssecondarydata.ThreadSettingsPaymentInfoData", "com.facebook.messaging.threadsettings.plugins.interfaces.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", andIncrement6, "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "com.facebook.messaging.payments.plugins.core.PaymentsCoreKillSwitch", "onUnsubscribe");
                    ThreadSettingsPaymentInfoData threadSettingsPaymentInfoData = cQp.A0E;
                    C00i c00i2 = threadSettingsPaymentInfoData.A01.A00;
                    ((Bwp) c00i2.get()).A00 = null;
                    Bwp bwp = (Bwp) c00i2.get();
                    if (4DQ.A03(bwp.A01)) {
                        bwp.A01.cancel(true);
                    }
                    threadSettingsPaymentInfoData.A00 = false;
                    r0.A09("messaging.payments.core.threadsettingssecondarydata.ThreadSettingsPaymentInfoData", "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "onUnsubscribe", andIncrement6);
                }
                if (CQp.A0D(cQp)) {
                    int andIncrement7 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.mentorship.plugins.core.threadsettingssecondarydata.ThreadSettingsMentorshipInfoData", "messaging.mentorship.core.threadsettingssecondarydata.ThreadSettingsMentorshipInfoData", "com.facebook.messaging.threadsettings.plugins.interfaces.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", andIncrement7, "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "com.facebook.messaging.mentorship.plugins.core.MentorshipCoreKillSwitch", "onUnsubscribe");
                    ((Cc7) 1Br.A0B(cQp.A0C.A00)).AEC();
                    r0.A09("messaging.mentorship.core.threadsettingssecondarydata.ThreadSettingsMentorshipInfoData", "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "onUnsubscribe", andIncrement7);
                }
                if (CQp.A04(cQp)) {
                    int andIncrement8 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.business.ads.orderhistory.plugins.threadorderhistory.threadsettingssecondarydata.ThreadSettingsPlacedOrdersInfoData", "messaging.business.ads.orderhistory.threadorderhistory.threadsettingssecondarydata.ThreadSettingsPlacedOrdersInfoData", "com.facebook.messaging.threadsettings.plugins.interfaces.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", andIncrement8, "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "com.facebook.messaging.business.ads.orderhistory.plugins.threadorderhistory.BusinessAdsOrderhistoryThreadorderhistoryKillSwitch", "onUnsubscribe");
                    ThreadSettingsPlacedOrdersInfoData threadSettingsPlacedOrdersInfoData = cQp.A03;
                    Blw blw = threadSettingsPlacedOrdersInfoData.A01;
                    if (blw != null) {
                        ListenableFuture listenableFuture = blw.A00;
                        if (listenableFuture != null) {
                            str = "fetchPlacedOrdersQueryFuture";
                            if (4DQ.A03(listenableFuture)) {
                                ListenableFuture listenableFuture2 = blw.A00;
                                if (listenableFuture2 != null) {
                                    listenableFuture2.cancel(true);
                                }
                                11T.A0L(str);
                                throw 0Q8.createAndThrow();
                            }
                        }
                    }
                    BkL bkL = threadSettingsPlacedOrdersInfoData.A00;
                    if (bkL != null) {
                        ListenableFuture listenableFuture3 = bkL.A00;
                        if (listenableFuture3 != null) {
                            str = "fetchOrdersQueryFuture";
                            if (4DQ.A03(listenableFuture3)) {
                                ListenableFuture listenableFuture4 = bkL.A00;
                                if (listenableFuture4 != null) {
                                    listenableFuture4.cancel(true);
                                }
                                11T.A0L(str);
                                throw 0Q8.createAndThrow();
                            }
                        }
                    }
                    threadSettingsPlacedOrdersInfoData.A02 = false;
                    r0.A09("messaging.business.ads.orderhistory.threadorderhistory.threadsettingssecondarydata.ThreadSettingsPlacedOrdersInfoData", "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "onUnsubscribe", andIncrement8);
                }
                if (CQp.A0I(cQp)) {
                    int andIncrement9 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.presence.plugins.core.threadsettingsdata.ThreadSettingsPresenceData", "presence.core.threadsettingsdata.ThreadSettingsPresenceData", "com.facebook.messaging.threadsettings.plugins.interfaces.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", andIncrement9, "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "com.facebook.presence.plugins.core.CoreKillSwitch", "onUnsubscribe");
                    ThreadSettingsPresenceData threadSettingsPresenceData = cQp.A0H;
                    ((1XZ) 1Br.A0B(threadSettingsPresenceData.A00)).Cez(threadSettingsPresenceData.A02);
                    r0.A09("presence.core.threadsettingsdata.ThreadSettingsPresenceData", "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "onUnsubscribe", andIncrement9);
                }
                if (CQp.A05(cQp)) {
                    int andIncrement10 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.business.notificationmessages.plugins.threadsettingrow.notificationmessagestopicsdata.MessengerThreadSettingsTopicsData", "messaging.business.notificationmessages.threadsettingrow.notificationmessagestopicsdata.MessengerThreadSettingsTopicsData", "com.facebook.messaging.threadsettings.plugins.interfaces.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", andIncrement10, "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "com.facebook.messaging.business.notificationmessages.plugins.threadsettingrow.BusinessNotificationmessagesThreadsettingrowKillSwitch", "onUnsubscribe");
                    MessengerThreadSettingsTopicsData messengerThreadSettingsTopicsData = cQp.A04;
                    BkV bkV = messengerThreadSettingsTopicsData.A00;
                    if (bkV != null) {
                        ListenableFuture listenableFuture5 = bkV.A00;
                        if (listenableFuture5 != null && 4DQ.A03(listenableFuture5)) {
                            ListenableFuture listenableFuture6 = bkV.A00;
                            if (listenableFuture6 == null) {
                                11T.A0L("fetchNotifMessagesQueryFuture");
                                throw 0Q8.createAndThrow();
                            }
                            listenableFuture6.cancel(true);
                        }
                    }
                    messengerThreadSettingsTopicsData.A01 = false;
                    r0.A09("messaging.business.notificationmessages.threadsettingrow.notificationmessagestopicsdata.MessengerThreadSettingsTopicsData", "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "onUnsubscribe", andIncrement10);
                }
                if (CQp.A0B(cQp)) {
                    int andIncrement11 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.communitymessaging.plugins.threadsettings.communitydata.ChannelCommunityData", "messaging.communitymessaging.threadsettings.communitydata.ChannelCommunityData", "com.facebook.messaging.threadsettings.plugins.interfaces.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", andIncrement11, "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.threadsettings.CommunitymessagingThreadsettingsKillSwitch", "onUnsubscribe");
                    ChannelCommunityData channelCommunityData = cQp.A0A;
                    channelCommunityData.A03.set(false);
                    LiveData liveData = channelCommunityData.A00;
                    if (liveData != null) {
                        liveData.removeObserver(channelCommunityData.A01);
                    }
                    channelCommunityData.A00 = null;
                    r0.A09("messaging.communitymessaging.threadsettings.communitydata.ChannelCommunityData", "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "onUnsubscribe", andIncrement11);
                }
                if (CQp.A07(cQp)) {
                    int andIncrement12 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.communitymessaging.plugins.bots.botsthreadsettingdata.BotsThreadSettingDataImplementation", "messaging.communitymessaging.bots.botsthreadsettingdata.BotsThreadSettingDataImplementation", "com.facebook.messaging.threadsettings.plugins.interfaces.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", andIncrement12, "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", 4YT.A00(11), "onUnsubscribe");
                    BotsThreadSettingDataImplementation botsThreadSettingDataImplementation = cQp.A06;
                    LiveData liveData2 = botsThreadSettingDataImplementation.A00;
                    if (liveData2 != null) {
                        liveData2.removeObserver(botsThreadSettingDataImplementation.A02);
                    }
                    r0.A09("messaging.communitymessaging.bots.botsthreadsettingdata.BotsThreadSettingDataImplementation", "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "onUnsubscribe", andIncrement12);
                }
                if (CQp.A09(cQp)) {
                    int andIncrement13 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.communitymessaging.plugins.communityinfo.secondarydata.communitydata.CommunityData", "messaging.communitymessaging.communityinfo.secondarydata.communitydata.CommunityData", "com.facebook.messaging.threadsettings.plugins.interfaces.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", andIncrement13, "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.communityinfo.CommunitymessagingCommunityinfoKillSwitch", "onUnsubscribe");
                    CommunityData communityData = cQp.A08;
                    communityData.A00.removeObserver(communityData.A01);
                    r0.A09("messaging.communitymessaging.communityinfo.secondarydata.communitydata.CommunityData", "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "onUnsubscribe", andIncrement13);
                }
                if (CQp.A0A(cQp)) {
                    int andIncrement14 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.communitymessaging.plugins.events.secondarydata.eventsdata.EventsData", "messaging.communitymessaging.events.secondarydata.eventsdata.EventsData", "com.facebook.messaging.threadsettings.plugins.interfaces.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", andIncrement14, "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", 4YT.A00(34), "onUnsubscribe");
                    EventsData eventsData = cQp.A09;
                    eventsData.A06.set(false);
                    LiveData liveData3 = eventsData.A00;
                    if (liveData3 != null) {
                        liveData3.removeObserver(eventsData.A02);
                    }
                    eventsData.A00 = null;
                    r0.A09("messaging.communitymessaging.events.secondarydata.eventsdata.EventsData", "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "onUnsubscribe", andIncrement14);
                }
                if (CQp.A06(cQp)) {
                    int andIncrement15 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.business.plugins.p2bdifferentiation.threadsettingsdata.P2BPrivacyDisclosureThreadSettingsData", "messaging.business.p2bdifferentiation.threadsettingsdata.P2BPrivacyDisclosureThreadSettingsData", "com.facebook.messaging.threadsettings.plugins.interfaces.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", andIncrement15, "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", 4YT.A00(33), "onUnsubscribe");
                    P2BPrivacyDisclosureThreadSettingsData p2BPrivacyDisclosureThreadSettingsData = cQp.A05;
                    ListenableFuture listenableFuture7 = p2BPrivacyDisclosureThreadSettingsData.A00;
                    if (listenableFuture7 != null && 4DQ.A03(listenableFuture7)) {
                        ListenableFuture listenableFuture8 = p2BPrivacyDisclosureThreadSettingsData.A00;
                        if (listenableFuture8 == null) {
                            11T.A0L("queryFuture");
                            throw 0Q8.createAndThrow();
                        }
                        listenableFuture8.cancel(true);
                    }
                    r0.A09("messaging.business.p2bdifferentiation.threadsettingsdata.P2BPrivacyDisclosureThreadSettingsData", "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "onUnsubscribe", andIncrement15);
                }
                if (CQp.A0C(cQp)) {
                    int andIncrement16 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.groups.plugins.core.threadsettingssecondarydata.showmemberrequestsdata.ShowMemberRequestsDataImplementation", "messaging.groups.core.threadsettingssecondarydata.showmemberrequestsdata.ShowMemberRequestsDataImplementation", "com.facebook.messaging.threadsettings.plugins.interfaces.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", andIncrement16, "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "com.facebook.messaging.groups.plugins.core.GroupsCoreKillSwitch", "onUnsubscribe");
                    ShowMemberRequestsDataImplementation showMemberRequestsDataImplementation = cQp.A0B;
                    showMemberRequestsDataImplementation.A09.set(false);
                    if (1Br.A07(AbK.A0U().A01).AZk(36322078860854336L)) {
                        AbF.A0E(showMemberRequestsDataImplementation.A00, showMemberRequestsDataImplementation.A01).A06(showMemberRequestsDataImplementation.A06.A0r());
                    } else if (!((2rT) 1Br.A0B(showMemberRequestsDataImplementation.A03)).A02(showMemberRequestsDataImplementation.A06)) {
                        ((C21N) 1Lm.A05(showMemberRequestsDataImplementation.A00, 1Br.A03(showMemberRequestsDataImplementation.A05), 33124)).A01(showMemberRequestsDataImplementation.A08);
                    }
                    r0.A09("messaging.groups.core.threadsettingssecondarydata.showmemberrequestsdata.ShowMemberRequestsDataImplementation", "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "onUnsubscribe", andIncrement16);
                }
                if (CQp.A01(cQp)) {
                    int andIncrement17 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.aibot.plugins.core.threadsettings.aibotprofiledata.ThreadSettingsAiBotProfileDataLoader", "messaging.aibot.core.threadsettings.aibotprofiledata.ThreadSettingsAiBotProfileDataLoader", "com.facebook.messaging.threadsettings.plugins.interfaces.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", andIncrement17, "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "com.facebook.messaging.aibot.plugins.core.AiBotKillSwitch", "onUnsubscribe");
                    ThreadSettingsAiBotProfileDataLoader threadSettingsAiBotProfileDataLoader = cQp.A00;
                    threadSettingsAiBotProfileDataLoader.A04.set(false);
                    1X9 r03 = threadSettingsAiBotProfileDataLoader.A00;
                    if (r03 != null) {
                        r03.removeAllResultCallbacks();
                    }
                    threadSettingsAiBotProfileDataLoader.A00 = null;
                    r0.A09("messaging.aibot.core.threadsettings.aibotprofiledata.ThreadSettingsAiBotProfileDataLoader", "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "onUnsubscribe", andIncrement17);
                }
                if (CQp.A02(cQp)) {
                    int andIncrement18 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.aibot.plugins.core.threadsettings.aipagecustomcommand.data.ThreadSettingsAiPageCustomCommandLoader", "messaging.aibot.core.threadsettings.aipagecustomcommand.data.ThreadSettingsAiPageCustomCommandLoader", "com.facebook.messaging.threadsettings.plugins.interfaces.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", andIncrement18, "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "com.facebook.messaging.aibot.plugins.core.AiBotKillSwitch", "onUnsubscribe");
                    6PZ r04 = (6PZ) 1Br.A0B(cQp.A01.A00);
                    if (4YV.A0V(r04.A01.A00).AZk(36322796123932519L)) {
                        8AY r05 = (8AY) 1Br.A0B(r04.A00);
                        r05.A03.set(false);
                        1X9 r06 = r05.A00;
                        if (r06 != null) {
                            r06.removeAllResultCallbacks();
                        }
                        r05.A00 = null;
                    }
                    r0.A09("messaging.aibot.core.threadsettings.aipagecustomcommand.data.ThreadSettingsAiPageCustomCommandLoader", "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "onUnsubscribe", andIncrement18);
                }
                if (CQp.A08(cQp)) {
                    int andIncrement19 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.communitymessaging.plugins.communityinfo.admodreview.badging.PendingAdmodReviewBadgeCountFetcher", "messaging.communitymessaging.communityinfo.admodreview.badging.PendingAdmodReviewBadgeCountFetcher", "com.facebook.messaging.threadsettings.plugins.interfaces.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", andIncrement19, "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.communityinfo.CommunitymessagingCommunityinfoKillSwitch", "onUnsubscribe");
                    r0.A09("messaging.communitymessaging.communityinfo.admodreview.badging.PendingAdmodReviewBadgeCountFetcher", "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "onUnsubscribe", andIncrement19);
                }
                r0.A02((Exception) null, "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "onUnsubscribe", andIncrement2);
                this.A00 = null;
                this.A01 = null;
            } catch (Throwable th) {
                r0.A04((Exception) null, "messaging.notify.mutexapp.threadsettingsdata.ThreadSettingsMuteData", "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "onUnsubscribe", andIncrement);
                throw th;
            }
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.threadsettings.secondarydata.ThreadSettingsSecondaryDataInterfaceSpec", "onUnsubscribe", andIncrement2);
            throw th2;
        }
    }
}
