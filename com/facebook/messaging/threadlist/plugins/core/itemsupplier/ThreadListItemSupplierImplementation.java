package com.facebook.messaging.threadlist.plugins.core.itemsupplier;

import X.0QD;
import X.0S2;
import X.0WH;
import X.0fH;
import X.11T;
import X.1BQ;
import X.1BV;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Br;
import X.1CO;
import X.1F9;
import X.1GC;
import X.1Hb;
import X.1Hv;
import X.1I7;
import X.1Lm;
import X.1Lo;
import X.1MV;
import X.1PG;
import X.1Uj;
import X.1Wl;
import X.1XZ;
import X.1YC;
import X.2Gt;
import X.2S4;
import X.2SI;
import X.2Si;
import X.2Sk;
import X.2Um;
import X.2Un;
import X.2Uo;
import X.2Up;
import X.2Uq;
import X.2Ur;
import X.2Uu;
import X.2V3;
import X.2V4;
import X.2V5;
import X.2V9;
import X.2VA;
import X.2VB;
import X.2VC;
import X.2VD;
import X.2eS;
import X.2fC;
import X.2fP;
import X.2fV;
import X.3JH;
import X.3JI;
import X.3aA;
import X.7zK;
import X.AV3;
import X.AbU;
import X.C00i;
import X.C00j;
import X.C02113u1;
import X.C06584hc;
import X.C1F6;
import X.C1Y6;
import X.C1fj;
import X.C21N;
import X.C2a2;
import X.C2f1;
import X.C2f3;
import X.C2f5;
import X.C2gs;
import X.C2gt;
import X.C2iD;
import X.C2ij;
import X.C2iu;
import X.C2xd;
import X.C2z5;
import X.C2zd;
import X.C30d;
import X.C3ak;
import X.C54o;
import X.C6ks;
import X.C6qd;
import android.content.Context;
import android.content.Intent;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.util.TriState;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.analytics.perf.MessagingPerformanceLogger;
import com.facebook.messaging.communitymessaging.plugins.communitycontainers.communitycontainerthreadmetadataprovider.CommunityContainerThreadMetadataProviderImplementation;
import com.facebook.messaging.followup.plugins.metadataloader.followup.InboxFollowupsMetadataLoader;
import com.facebook.messaging.inbox.units.StaticUnitConfig;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.model.threads.ThreadsCollection;
import com.facebook.messaging.nativepagereply.plugins.biimthreadactionsystem.inbox.TasMetadataLoader;
import com.facebook.messaging.typingindicator.plugins.metadataloader.inbox.TypingIndicatorMetadataLoader;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: ThreadListItemSupplierImplementation.class */
public final class ThreadListItemSupplierImplementation implements CallerContextable {
    public 2fP A00;
    public 2Un A01;
    public 2VC A02;
    public AbU A03;
    public boolean A04;
    public final C00i A05;
    public final C00i A06;
    public final 2Si A07;
    public final 1F9 A08;
    public final 1Hb A09;
    public final 2Ur A0A;
    public final C2iD A0B;
    public final Map A0C;
    public final C00i A0D;
    public final C00i A0E;
    public final C00i A0F;
    public final 2Uq A0G;
    public final 2Uu A0H;
    public final 2V4 A0I;

    public ThreadListItemSupplierImplementation(Context context, FbUserSession fbUserSession, 2S4 r304, 2Si r305, 2Sk r306) {
        1BV r0 = new 1BV(1102);
        this.A0F = r0;
        this.A05 = new 1BV(17062);
        this.A0E = new 1BQ(85048);
        this.A0D = new 1BQ(66265);
        this.A03 = AbU.A05;
        this.A01 = 2Un.A04;
        this.A0C = new HashMap();
        this.A00 = null;
        2Uq r02 = new 2Up(this);
        this.A0G = r02;
        this.A0A = ((C2xd) 1Bn.A0E(context, (1BY) null, 17151)).A0J(fbUserSession);
        Integer num = 1Lo.A05;
        this.A06 = new 1MV(context, fbUserSession, 17083);
        this.A0H = ((C2xd) 1Bn.A0E(context, (1BY) null, 1101)).A0H(fbUserSession, r02);
        this.A07 = r305;
        this.A09 = r306.A01();
        this.A04 = r306.A07;
        1F9 A00 = r306.A00();
        this.A08 = A00;
        C1F6 c1f6 = (C1F6) r0.get();
        C2z5 c2z5 = C2z5.$redex_init_class;
        2SI r315 = this.A08.ordinal() != 4 ? 2SI.A09 : 2SI.A03;
        Context A01 = FbInjector.A01();
        FbInjector.A04(c1f6.A00.B92().Aqm());
        1Bn.A0M(c1f6);
        try {
            2V4 r03 = new 2V4(context, fbUserSession, r315);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A0I = r03;
            this.A02 = new 2VC((2VA) C1Y6.A00(null, "com_facebook_messaging_threadlist_plugins_interfaces_threadmetadataloader_ThreadMetadataLoaderInterfaceSpec", "Inbox", new Object[]{context, fbUserSession, new 2V3(this), A00}));
            2Ur r04 = this.A0A;
            r04.A09(this.A08);
            1Hb r05 = this.A09;
            if (r04.A05 != r05) {
                r04.A05 = r05;
                2Ur.A08(r04, false);
            }
            r04.CmR(new 2VD(this));
            r04.A06 = new 2V9(this);
            11T.A0F(r304, 1);
            C2iD c2iD = (C2iD) r304.A00(66668);
            this.A0B = c2iD;
            c2iD.A00 = new 3aA(this, 1);
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    private void A00(Context context, ImmutableList immutableList) {
        0WH r0 = this.A0B.A02;
        ImmutableSet A07 = ImmutableSet.A07(r0);
        11T.A0A(A07);
        int size = A07.size();
        ImmutableSet A072 = ImmutableSet.A07(r0);
        11T.A0A(A072);
        boolean z = false;
        if (!A072.isEmpty()) {
            int size2 = immutableList.size();
            int i = 0;
            while (true) {
                if (i >= size2) {
                    break;
                }
                ThreadSummary threadSummary = (ThreadSummary) immutableList.get(i);
                if (A072.contains(threadSummary.A0n) && 2Gt.A0F(threadSummary)) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        11T.A0F(context, 0);
        Intent intent = new Intent("INBOX_MULTI_SELECT_THREAD_SELECTED");
        intent.putExtra(7zK.A00(378), true);
        intent.putExtra("multi_select_unread_threads_selected", z);
        intent.putExtra("multi_select_selected_threads_count", size);
        ((1I7) 1Hv.A02(context, 65728)).CkS(intent);
    }

    public static void A01(C2f5 c2f5, ThreadListItemSupplierImplementation threadListItemSupplierImplementation, String str) {
        0fH.A0d(c2f5, str, "ThreadListItemSupplierImplementation", "startRefreshThreadList: refreshType=%s, callingClass=%s");
        2Ur r0 = threadListItemSupplierImplementation.A0A;
        1Hb r02 = threadListItemSupplierImplementation.A09;
        boolean A05 = ((1PG) threadListItemSupplierImplementation.A0D.get()).A05();
        11T.A0F(r02, 0);
        r0.A0A(c2f5.A00(r02, str, A05));
    }

    public static boolean A02(2Sk r301) {
        1PG r0 = (1PG) 1Bi.A03(66265);
        1Wl r02 = (1Wl) 1Bi.A03(68669);
        if ((r301.A00() == 1F9.A06 && r0.A05()) || r02.A09(r301)) {
            return false;
        }
        return !2Um.A01(r301.A01());
    }

    public ImmutableList A03(Context context) {
        C00j.A05("ThreadListItemSupplierImplementation.getInboxItems", -1493952973);
        try {
            0fH.A0g(this.A03, "ThreadListItemSupplierImplementation", "getInboxItems with %s");
            C00i c00i = this.A0E;
            ((MessagingPerformanceLogger) c00i.get()).A0e("ThreadListItemSupplier_getInboxItems_begin");
            ThreadsCollection threadsCollection = this.A01.A02;
            C2iD c2iD = this.A0B;
            boolean z = c2iD.A01;
            try {
                2V4 r0 = this.A0I;
                AbU abU = this.A03;
                ImmutableMap copyOf = ImmutableMap.copyOf(this.A0C);
                ImmutableSet A07 = ImmutableSet.A07(c2iD.A02);
                11T.A0A(A07);
                ImmutableList.Builder builder = ImmutableList.builder();
                ImmutableList immutableList = threadsCollection.A01;
                C2zd A01 = ((2fV) r0.A00.get()).A01(immutableList);
                int size = immutableList.size();
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= size) {
                        break;
                    }
                    ThreadSummary threadSummary = (ThreadSummary) immutableList.get(i2);
                    StaticUnitConfig staticUnitConfig = threadSummary.A2j ? 2V4.A04 : A01.apply(threadSummary) ? 2V4.A05 : 2V4.A06;
                    HeterogeneousMap heterogeneousMap = (HeterogeneousMap) copyOf.get(threadSummary.A0n);
                    2V5 r02 = r0.A02;
                    if (heterogeneousMap == null) {
                        heterogeneousMap = C2f1.A00;
                    }
                    builder.m11011add((Object) r02.A02(z ? A07.contains(threadSummary.A0n) ? TriState.YES : TriState.NO : TriState.UNSET, staticUnitConfig, threadSummary, heterogeneousMap));
                    i = i2 + 1;
                }
                C2gt A00 = ((C2gs) r0.A01.get()).A00(2V4.A06, abU);
                if (A00 != null) {
                    builder.m11011add((Object) A00);
                }
                ImmutableList build = builder.build();
                ((MessagingPerformanceLogger) c00i.get()).A0e("ThreadListItemSupplier_getInboxItems_end");
                if (z) {
                    A00(context, immutableList);
                }
                C00j.A01(237889658);
                return build;
            } catch (Throwable th) {
                ((MessagingPerformanceLogger) c00i.get()).A0e("ThreadListItemSupplier_getInboxItems_end");
                if (z) {
                    A00(context, threadsCollection.A01);
                }
                throw th;
            }
        } catch (Throwable th2) {
            C00j.A01(1820073147);
            throw th2;
        }
    }

    public void A04() {
        0fH.A0j("ThreadListItemSupplierImplementation", "legacyStartLoadMoreThreads");
        this.A0A.A0A(new 2fC(CallerContext.A0A(ThreadListItemSupplierImplementation.class, "messages", "thread_list_load_more"), this.A09, 2Uo.A01, 1GC.A01(), false, true, false));
    }

    public void A05() {
        int i;
        C2f5 c2f5;
        C00j.A05("ThreadListItemSupplierImplementation.onSubscribe", -1533284174);
        try {
            0fH.A0j("ThreadListItemSupplierImplementation", "onSubscribe");
            this.A0H.A00();
            String str = this.A02.A00;
            2VB r0 = ((2VA) str).A00;
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r02 = r0.A0A;
            r02.A08("com.facebook.messaging.threadlist.plugins.interfaces.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", "messaging.threadlist.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", "onSubscribe", andIncrement);
            try {
                try {
                    if (2VB.A03(r0)) {
                        i = atomicInteger.getAndIncrement();
                        str = "messaging.nativepagereply.biimthreadactionsystem.inbox.TasMetadataLoader";
                        r02.A0A("com.facebook.messaging.nativepagereply.plugins.biimthreadactionsystem.inbox.TasMetadataLoader", str, "com.facebook.messaging.threadlist.plugins.interfaces.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", i, "messaging.threadlist.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", "com.facebook.messaging.nativepagereply.plugins.biimthreadactionsystem.ThreadActionSystemKillSwitch", "onSubscribe");
                        try {
                            TasMetadataLoader tasMetadataLoader = r0.A03;
                            ((C02113u1) 1Lm.A05(tasMetadataLoader.A00, tasMetadataLoader.A01, 65930)).A01(tasMetadataLoader.A02);
                            r02.A04((Exception) null, str, "messaging.threadlist.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", "onSubscribe", i);
                        } catch (Exception e) {
                            throw e;
                        }
                    }
                    if (2VB.A04(r0)) {
                        int andIncrement2 = atomicInteger.getAndIncrement();
                        r02.A0A("com.facebook.messaging.typingindicator.plugins.metadataloader.inbox.TypingIndicatorMetadataLoader", "messaging.typingindicator.metadataloader.inbox.TypingIndicatorMetadataLoader", "com.facebook.messaging.threadlist.plugins.interfaces.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", andIncrement2, "messaging.threadlist.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", "com.facebook.messaging.typingindicator.plugins.metadataloader.TypingindicatorMetadataloaderKillSwitch", "onSubscribe");
                        TypingIndicatorMetadataLoader typingIndicatorMetadataLoader = r0.A04;
                        C30d c30d = (C30d) typingIndicatorMetadataLoader.A00.A00.get();
                        AV3 av3 = new AV3(typingIndicatorMetadataLoader, 49);
                        ((1Uj) c30d.A02.A00.get()).A06(new C3ak(c30d, 5));
                        c30d.A00 = av3;
                        r02.A04((Exception) null, "messaging.typingindicator.metadataloader.inbox.TypingIndicatorMetadataLoader", "messaging.threadlist.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", "onSubscribe", andIncrement2);
                    }
                    if (2VB.A02(r0)) {
                        int andIncrement3 = atomicInteger.getAndIncrement();
                        r02.A0A("com.facebook.messaging.followup.plugins.metadataloader.followup.InboxFollowupsMetadataLoader", "messaging.followup.metadataloader.followup.InboxFollowupsMetadataLoader", "com.facebook.messaging.threadlist.plugins.interfaces.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", andIncrement3, "messaging.threadlist.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", "com.facebook.messaging.followup.plugins.metadataloader.FollowupMetadataloaderKillSwitch", "onSubscribe");
                        InboxFollowupsMetadataLoader inboxFollowupsMetadataLoader = r0.A02;
                        ((C2ij) 1Br.A0B(inboxFollowupsMetadataLoader.A01)).A00 = new 3JH(inboxFollowupsMetadataLoader);
                        ((C6qd) 1Br.A0B(inboxFollowupsMetadataLoader.A00)).A00 = new 3JI(inboxFollowupsMetadataLoader);
                        r02.A09("messaging.followup.metadataloader.followup.InboxFollowupsMetadataLoader", "messaging.threadlist.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", "onSubscribe", andIncrement3);
                    }
                    if (2VB.A00(r0)) {
                        int andIncrement4 = atomicInteger.getAndIncrement();
                        r02.A0A("com.facebook.messaging.avatar.presence.plugins.metadataloader.inbox.AvatarMetadataLoader", "messaging.avatar.presence.metadataloader.inbox.AvatarMetadataLoader", "com.facebook.messaging.threadlist.plugins.interfaces.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", andIncrement4, "messaging.threadlist.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", "com.facebook.messaging.avatar.presence.plugins.metadataloader.AvatarPresenceMetadataloaderKillSwitch", "onSubscribe");
                        1Br.A0C(r0.A00.A00);
                        r02.A09("messaging.avatar.presence.metadataloader.inbox.AvatarMetadataLoader", "messaging.threadlist.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", "onSubscribe", andIncrement4);
                    }
                    if (2VB.A01(r0)) {
                        i = atomicInteger.getAndIncrement();
                        str = "messaging.communitymessaging.communitycontainers.communitycontainerthreadmetadataprovider.CommunityContainerThreadMetadataProviderImplementation";
                        r02.A0A("com.facebook.messaging.communitymessaging.plugins.communitycontainers.communitycontainerthreadmetadataprovider.CommunityContainerThreadMetadataProviderImplementation", str, "com.facebook.messaging.threadlist.plugins.interfaces.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", i, "messaging.threadlist.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.communitycontainers.CommunitymessagingCommunitycontainersKillSwitch", "onSubscribe");
                        CommunityContainerThreadMetadataProviderImplementation communityContainerThreadMetadataProviderImplementation = r0.A01;
                        CommunityContainerThreadMetadataProviderImplementation.A00(communityContainerThreadMetadataProviderImplementation, 0QD.A0V(communityContainerThreadMetadataProviderImplementation.A00.keySet()));
                        r02.A09(str, "messaging.threadlist.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", "onSubscribe", i);
                    }
                    r02.A02((Exception) null, "messaging.threadlist.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", "onSubscribe", andIncrement);
                    if (this.A01 == 2Un.A04) {
                        C2f3 c2f3 = (C2f3) this.A05.get();
                        c2f3.A04 = false;
                        ((C1fj) c2f3.A00.get()).A01(0S2.A0H, c2f3.A02);
                        ((ScheduledExecutorService) c2f3.A01.get()).schedule(c2f3.A03, 2, TimeUnit.SECONDS);
                    }
                    if (this.A08 == 1F9.A06) {
                        c2f5 = C2f5.A03;
                    } else if (this.A04) {
                        this.A04 = false;
                        c2f5 = C2f5.A05;
                    } else {
                        c2f5 = C2f5.A07;
                    }
                    A01(c2f5, this, "ThreadListItemSupplierImplementation");
                    C00j.A01(-961959675);
                } catch (Throwable th) {
                    r02.A04((Exception) null, str, "messaging.threadlist.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", "onSubscribe", i);
                    throw th;
                }
            } catch (Throwable th2) {
                r02.A02((Exception) null, "messaging.threadlist.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", "onSubscribe", andIncrement);
                throw th2;
            }
        } catch (Throwable th3) {
            C00j.A01(-2141217106);
            throw th3;
        }
    }

    public void A06() {
        int andIncrement;
        String str;
        C00j.A05("ThreadListItemSupplierImplementation.onUnsubscribe", -206065584);
        try {
            0fH.A0j("ThreadListItemSupplierImplementation", "onUnsubscribe");
            this.A0H.A01();
            2VB r0 = this.A02.A00.A00;
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement2 = atomicInteger.getAndIncrement();
            1YC r02 = r0.A0A;
            r02.A08("com.facebook.messaging.threadlist.plugins.interfaces.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", "messaging.threadlist.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", "onUnsubscribe", andIncrement2);
            Exception e = null;
            try {
                if (2VB.A03(r0)) {
                    andIncrement = atomicInteger.getAndIncrement();
                    str = "messaging.nativepagereply.biimthreadactionsystem.inbox.TasMetadataLoader";
                    r02.A0A("com.facebook.messaging.nativepagereply.plugins.biimthreadactionsystem.inbox.TasMetadataLoader", str, "com.facebook.messaging.threadlist.plugins.interfaces.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", andIncrement, "messaging.threadlist.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", "com.facebook.messaging.nativepagereply.plugins.biimthreadactionsystem.ThreadActionSystemKillSwitch", "onUnsubscribe");
                    try {
                        try {
                            TasMetadataLoader tasMetadataLoader = r0.A03;
                            C02113u1 c02113u1 = (C02113u1) 1Lm.A05(tasMetadataLoader.A00, tasMetadataLoader.A01, 65930);
                            c02113u1.A05.clear();
                            ((C21N) c02113u1.A03.A00.get()).A01(c02113u1.A04);
                            c02113u1.A00 = null;
                            r02.A04((Exception) null, str, "messaging.threadlist.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", "onUnsubscribe", andIncrement);
                        } catch (Exception e2) {
                            e = e2;
                            throw e;
                        }
                    } catch (Throwable th) {
                        r02.A04(e, str, "messaging.threadlist.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", "onUnsubscribe", andIncrement);
                        throw th;
                    }
                }
                if (2VB.A04(r0)) {
                    int andIncrement3 = atomicInteger.getAndIncrement();
                    r02.A0A("com.facebook.messaging.typingindicator.plugins.metadataloader.inbox.TypingIndicatorMetadataLoader", "messaging.typingindicator.metadataloader.inbox.TypingIndicatorMetadataLoader", "com.facebook.messaging.threadlist.plugins.interfaces.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", andIncrement3, "messaging.threadlist.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", "com.facebook.messaging.typingindicator.plugins.metadataloader.TypingindicatorMetadataloaderKillSwitch", "onUnsubscribe");
                    C30d c30d = (C30d) r0.A04.A00.A00.get();
                    if (((1CO) c30d.A03.A00.get()).AZk(72341285217767997L)) {
                        Set set = c30d.A0D;
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            ((1XZ) c30d.A04.A00.get()).Cek((ThreadKey) it.next(), c30d.A07);
                        }
                        c30d.A0B.clear();
                        set.clear();
                    }
                    ((1Uj) c30d.A02.A00.get()).A06(new C3ak(c30d, 4));
                    c30d.A0C.clear();
                    c30d.A0A.clear();
                    c30d.A00 = null;
                    r02.A04((Exception) null, "messaging.typingindicator.metadataloader.inbox.TypingIndicatorMetadataLoader", "messaging.threadlist.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", "onUnsubscribe", andIncrement3);
                }
                if (2VB.A02(r0)) {
                    int andIncrement4 = atomicInteger.getAndIncrement();
                    r02.A0A("com.facebook.messaging.followup.plugins.metadataloader.followup.InboxFollowupsMetadataLoader", "messaging.followup.metadataloader.followup.InboxFollowupsMetadataLoader", "com.facebook.messaging.threadlist.plugins.interfaces.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", andIncrement4, "messaging.threadlist.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", "com.facebook.messaging.followup.plugins.metadataloader.FollowupMetadataloaderKillSwitch", "onUnsubscribe");
                    InboxFollowupsMetadataLoader inboxFollowupsMetadataLoader = r0.A02;
                    ((C2ij) 1Br.A0B(inboxFollowupsMetadataLoader.A01)).A00 = null;
                    ((C6qd) 1Br.A0B(inboxFollowupsMetadataLoader.A00)).A00 = null;
                    r02.A09("messaging.followup.metadataloader.followup.InboxFollowupsMetadataLoader", "messaging.threadlist.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", "onUnsubscribe", andIncrement4);
                }
                if (2VB.A00(r0)) {
                    int andIncrement5 = atomicInteger.getAndIncrement();
                    r02.A0A("com.facebook.messaging.avatar.presence.plugins.metadataloader.inbox.AvatarMetadataLoader", "messaging.avatar.presence.metadataloader.inbox.AvatarMetadataLoader", "com.facebook.messaging.threadlist.plugins.interfaces.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", andIncrement5, "messaging.threadlist.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", "com.facebook.messaging.avatar.presence.plugins.metadataloader.AvatarPresenceMetadataloaderKillSwitch", "onUnsubscribe");
                    C6ks c6ks = (C6ks) 1Br.A0B(r0.A00.A00);
                    c6ks.A07.clear();
                    c6ks.A08.clear();
                    r02.A09("messaging.avatar.presence.metadataloader.inbox.AvatarMetadataLoader", "messaging.threadlist.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", "onUnsubscribe", andIncrement5);
                }
                if (2VB.A01(r0)) {
                    andIncrement = atomicInteger.getAndIncrement();
                    str = "messaging.communitymessaging.communitycontainers.communitycontainerthreadmetadataprovider.CommunityContainerThreadMetadataProviderImplementation";
                    r02.A0A("com.facebook.messaging.communitymessaging.plugins.communitycontainers.communitycontainerthreadmetadataprovider.CommunityContainerThreadMetadataProviderImplementation", str, "com.facebook.messaging.threadlist.plugins.interfaces.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", andIncrement, "messaging.threadlist.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.communitycontainers.CommunitymessagingCommunitycontainersKillSwitch", "onUnsubscribe");
                    CommunityContainerThreadMetadataProviderImplementation communityContainerThreadMetadataProviderImplementation = r0.A01;
                    Future future = (Future) communityContainerThreadMetadataProviderImplementation.A06.getAndSet(null);
                    if (future != null) {
                        future.cancel(true);
                    }
                    C2a2 c2a2 = (C2a2) communityContainerThreadMetadataProviderImplementation.A07.getAndSet(null);
                    if (c2a2 != null) {
                        c2a2.AE0(null);
                    }
                    r02.A09(str, "messaging.threadlist.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", "onUnsubscribe", andIncrement);
                }
                r02.A02((Exception) null, "messaging.threadlist.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", "onUnsubscribe", andIncrement2);
                ((C2f3) this.A05.get()).A00();
                this.A0A.AEC();
                C2iu c2iu = (C2iu) this.A06.get();
                2eS r03 = c2iu.A00;
                if (r03 != null) {
                    r03.A00(true);
                    c2iu.A00 = null;
                }
                C00j.A01(-1121339940);
            } catch (Throwable th2) {
                r02.A02(e, "messaging.threadlist.threadmetadataloader.ThreadMetadataLoaderInterfaceSpec", "onUnsubscribe", andIncrement2);
                throw th2;
            }
        } catch (Throwable th3) {
            C00j.A01(1025632851);
            throw th3;
        }
    }

    public void A07() {
        0fH.A0j("ThreadListItemSupplierImplementation", "refreshOnUserRequest");
        C2iu c2iu = (C2iu) this.A06.get();
        C2iu.A00(((C06584hc) c2iu.A02.get()).A00(C54o.REFRESH_CONNECTION), c2iu);
    }
}
