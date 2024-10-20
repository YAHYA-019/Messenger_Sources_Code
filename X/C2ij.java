package X;

import com.facebook.acra.asyncbroadcastreceiver.AsyncBroadcastReceiverObserver;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.followup.plugins.metadataloader.followup.InboxFollowupsMetadataLoader;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;

/* renamed from: X.2ij, reason: invalid class name */
/* loaded from: 2ij.class */
public final class C2ij {
    public 3JH A00;
    public String A01;
    public String A02;
    public java.util.Map A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final java.util.Map A0D;
    public final java.util.Map A0E;
    public final java.util.Map A0F;
    public final java.util.Map A0G;
    public final ConcurrentMap A0H;
    public final C01i A0I;
    public final FbUserSession A0J;
    public final 1BP A0K;
    public final 1De A0L;
    public final 1Br A0M;
    public final 1Br A0N;

    public C2ij(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A0L = r303;
        this.A0J = fbUserSession;
        this.A0K = FbInjector.A00;
        1BY r0 = r303.A00;
        this.A06 = 1Bu.A03(r0, 16979);
        this.A05 = 1Bq.A00(99390);
        this.A0C = 1Bq.A00(49709);
        this.A04 = 1Bq.A00(16457);
        this.A09 = 1Lm.A03(fbUserSession, r0, 16686);
        this.A0I = C01g.A00(C03i.A02, new C2xn(this, 7));
        this.A0B = 1Lm.A03(fbUserSession, r0, 66674);
        this.A0N = 1Bq.A00(16520);
        this.A07 = 1Bu.A03(r0, 33242);
        this.A0M = 1Bq.A00(66803);
        this.A08 = 1Bu.A03(r0, 66538);
        this.A0A = 1Lm.A03(fbUserSession, r0, 17028);
        this.A0E = new LinkedHashMap();
        this.A0H = new ConcurrentHashMap();
        this.A0G = new LinkedHashMap();
        this.A0F = new LinkedHashMap();
        C2ik c2ik = C2ik.A03;
        03Y r02 = new 03Y(c2ik, (Object) null);
        C2ik c2ik2 = C2ik.A02;
        this.A0D = 04R.A0A(new 03Y[]{r02, new 03Y(c2ik2, (Object) null)});
        this.A03 = 04R.A0A(new 03Y[]{new 03Y(c2ik, (Object) null), new 03Y(c2ik2, (Object) null)});
    }

    private final QuickPerformanceLogger A00() {
        return (QuickPerformanceLogger) this.A0N.A00.get();
    }

    public static final C2gd A01(C2ij c2ij) {
        return (C2gd) c2ij.A0M.A00.get();
    }

    public static final void A02(C2ij c2ij, List list, boolean z) {
        ThreadKey threadKey;
        Object obj;
        Object obj2;
        C2ik c2ik = z ? C2ik.A03 : C2ik.A02;
        java.util.Map map = c2ij.A03;
        ThreadSummary threadSummary = (ThreadSummary) map.get(c2ik);
        if (threadSummary != null) {
            threadKey = threadSummary.A0n;
            if (threadKey != null) {
                C2ge c2ge = (C2ge) c2ij.A08.A00.get();
                String A0u = threadKey.A0u();
                11T.A0A(A0u);
                03Y A01 = C2ge.A01(c2ge, A0u, z);
                if (A01 == null || ((Number) A01.second).intValue() <= 0) {
                    return;
                }
            }
        } else {
            threadKey = null;
        }
        0fH.A0g(z ? "sender" : AsyncBroadcastReceiverObserver.RECEIVER, "InboxFollowupHelperImpl", "compute potential new %s tag candidate thread");
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            ThreadKey threadKey2 = ((ThreadSummary) obj3).A0n;
            if (threadKey2.A1K() || threadKey2.A0x()) {
                arrayList.add(obj3);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (c2ij.A05((ThreadSummary) obj, z)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ThreadSummary threadSummary2 = (ThreadSummary) obj;
        if (threadSummary2 == null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    if (c2ij.A05((ThreadSummary) obj2, z)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            threadSummary2 = (ThreadSummary) obj2;
        }
        java.util.Map map2 = c2ij.A0D;
        ThreadSummary threadSummary3 = (ThreadSummary) map2.get(c2ik);
        if (threadSummary2 == null) {
            if (threadSummary3 != null) {
                A04(c2ij, threadSummary3, z);
                return;
            }
            return;
        }
        ThreadKey threadKey3 = threadSummary2.A0n;
        0fH.A0g(threadKey3, "InboxFollowupHelperImpl", "most recent thread eligible is %s");
        if (11T.A0O(threadKey != null ? threadKey.A0u() : null, threadKey3.A0u())) {
            return;
        }
        0fH.A0j("InboxFollowupHelperImpl", "add to candidate thread tracker");
        map2.put(c2ik, threadSummary2);
        if (threadKey != null) {
            0fH.A0j("InboxFollowupHelperImpl", "invalidate current tag");
            map.put(c2ik, null);
            C2ge c2ge2 = (C2ge) c2ij.A08.A00.get();
            String A0u2 = threadKey.A0u();
            11T.A0A(A0u2);
            c2ge2.A02(A0u2, z);
            C2mr c2mr = (C2mr) c2ij.A0B.A00.get();
            11T.A0F(threadSummary, 0);
            C2mr.A00(z ? C2ms.FOLLOW_UP : C2ms.FOLLOW_UP_RECEIVER, threadSummary, c2mr, 6);
        }
    }

    public static final boolean A03(FbUserSession fbUserSession, 2gW r302, ThreadSummary threadSummary, boolean z, boolean z2, boolean z3) {
        11T.A0F(threadSummary, 1);
        11T.A0F(r302, 2);
        ThreadKey threadKey = threadSummary.A0n;
        boolean z4 = false;
        if (!threadKey.A0x()) {
            if (!threadKey.A1K()) {
                if (threadKey.A1F()) {
                    z = z3;
                }
                return z4;
            }
            z = z2;
        }
        if (z && threadSummary.A0g == 1F9.A0I && !2Gt.A0E(threadSummary) && threadSummary.A2H && (!2Gt.A0F(threadSummary)) && !r302.A01(fbUserSession, threadSummary, false)) {
            z4 = true;
        }
        return z4;
    }

    public static final boolean A04(C2ij c2ij, ThreadSummary threadSummary, boolean z) {
        java.util.Map map = c2ij.A03;
        C2ik c2ik = C2ik.A03;
        ThreadSummary threadSummary2 = (ThreadSummary) map.get(c2ik);
        ThreadKey threadKey = threadSummary2 != null ? threadSummary2.A0n : null;
        ThreadKey threadKey2 = threadSummary.A0n;
        if (!11T.A0O(threadKey, threadKey2)) {
            ThreadSummary threadSummary3 = (ThreadSummary) map.get(C2ik.A02);
            if (!11T.A0O(threadSummary3 != null ? threadSummary3.A0n : null, threadKey2)) {
                return false;
            }
        }
        int i = 2;
        if (!z) {
            c2ik = C2ik.A02;
        }
        C00i c00i = c2ij.A08.A00;
        C2ge c2ge = (C2ge) c00i.get();
        String A0u = threadKey2.A0u();
        11T.A0A(A0u);
        03Y A01 = C2ge.A01(c2ge, A0u, z);
        int intValue = A01 == null ? -1 : ((Number) A01.second).intValue();
        0fH.A0d(Integer.valueOf(intValue), threadKey2, "InboxFollowupHelperImpl", "validateExistingTag - impression count is %d for %s");
        if (intValue >= 0) {
            if (intValue >= 100) {
                i = 4;
            } else if (intValue > A01(c2ij).A01() && intValue < 10) {
                i = 3;
            } else if (!A03(c2ij.A0J, (2gW) c2ij.A07.A00.get(), threadSummary, true, true, true)) {
                if (2Gt.A0F(threadSummary)) {
                    i = 0;
                }
                C2ge c2ge2 = (C2ge) c00i.get();
                String A0u2 = threadKey2.A0u();
                11T.A0A(A0u2);
                c2ge2.A02(A0u2, z);
            } else {
                if (c2ij.A05(threadSummary, z)) {
                    return true;
                }
                i = 5;
                C2ge c2ge3 = (C2ge) c00i.get();
                String A0u3 = threadKey2.A0u();
                11T.A0A(A0u3);
                c2ge3.A02(A0u3, z);
            }
        }
        0fH.A0d(z ? "sender" : AsyncBroadcastReceiverObserver.RECEIVER, threadKey2, "InboxFollowupHelperImpl", "invalidating existing %s tag for %s");
        map.put(c2ik, null);
        C2mr.A00(z ? C2ms.FOLLOW_UP : C2ms.FOLLOW_UP_RECEIVER, threadSummary, (C2mr) c2ij.A0B.A00.get(), i);
        java.util.Map map2 = c2ij.A0D;
        ThreadSummary threadSummary4 = (ThreadSummary) map2.get(c2ik);
        if (!11T.A0O(threadSummary4 != null ? threadSummary4.A0n : null, threadKey2)) {
            return false;
        }
        map2.put(c2ik, null);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0708, code lost:
    
        if ((r0 != null ? r0.floatValue() : 0.0f) >= r0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x00f9, code lost:
    
        if (X.11T.A0O(r0 != null ? r0.A00() : null, r302.A1z) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x07b8, code lost:
    
        if ((r0 != null ? r0.floatValue() : 0.0f) >= r0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02c4, code lost:
    
        if (X.2Gt.A04((com.facebook.messaging.model.threadkey.ThreadKey) null, r302).contains(r0) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x01c5, code lost:
    
        if (r323 >= (r0 * 3600000)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0346, code lost:
    
        if (X.0CU.A0T(r0, r0, false) != true) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0686, code lost:
    
        if ((r0 - r0.longValue()) <= (r0 * 3600000)) goto L112;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean A05(com.facebook.messaging.model.threads.ThreadSummary r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 2161
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2ij.A05(com.facebook.messaging.model.threads.ThreadSummary, boolean):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v282, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public void A06(ImmutableList immutableList) {
        boolean AZk = C2gd.A00(A01(this)).AZk(36323917106793765L);
        boolean AZk2 = C2gd.A00(A01(this)).AZk(36323917108038959L);
        boolean AZk3 = C2gd.A00(A01(this)).AZk(36323917108235569L);
        if (AZk || AZk2 || AZk3) {
            List A0Y = 0QD.A0Y(immutableList, (int) C2gd.A00(A01(this)).Auy(36605392084278400L));
            final ArrayList arrayList = new ArrayList();
            for (Object obj : A0Y) {
                ThreadSummary threadSummary = (ThreadSummary) obj;
                FbUserSession fbUserSession = this.A0J;
                11T.A0D(threadSummary);
                if (A03(fbUserSession, (2gW) this.A07.A00.get(), threadSummary, AZk, AZk2, AZk3)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                0fH.A0j("InboxFollowupHelperImpl", "no thread eligible after common checks in top range");
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            if (C2gd.A00(A01(this)).AZk(2342166926321470764L) && this.A0E.isEmpty()) {
                0fH.A0j("InboxFollowupHelperImpl", "fetch ranking scores");
                final long now = ((C0dp) this.A05.A00.get()).now();
                final ?? obj2 = new Object();
                arrayList2.add(obj2);
                1Kd.A0F(new 1K9() { // from class: X.3dn
                    public void onFailure(Throwable th) {
                        11T.A0F(th, 0);
                        0fH.A0r("InboxFollowupHelperImpl", "getIdToRankingScoreValueMap failed", th);
                        obj2.set(false);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
                    
                        if (r0.isEmpty() != false) goto L6;
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r302) {
                        /*
                            Method dump skipped, instructions count: 298
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C3dn.onSuccess(java.lang.Object):void");
                    }
                }, ((2Tn) this.A0A.A00.get()).A03(2To.A06, C2gd.A00(A01(this)).AZk(36323917107711275L)), (Executor) this.A04.A00.get());
            }
            0fH.A0j("InboxFollowupHelperImpl", "fetch last and third to last message timestamps");
            C00i c00i = this.A05.A00;
            long now2 = ((C0dp) c00i.get()).now();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ThreadKey threadKey = ((ThreadSummary) it.next()).A0n;
                final boolean A0z = threadKey.A0z();
                long A0r = A0z ? threadKey.A01 : threadKey.A0r();
                final C2il c2il = (C2il) this.A0I.getValue();
                1Um AQV = c2il.mMailboxApiHandleMetaProvider.AQV(0);
                final MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
                final long j = A0r;
                if (!AQV.Cj2(new MailboxCallback() { // from class: X.2im
                    @Override // com.facebook.msys.mca.MailboxCallback
                    public /* bridge */ /* synthetic */ void onCompletion(Object obj3) {
                        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj3, mailboxFutureImpl, new MailboxNullable(null), 0, 0, "MCAMailboxRecentMessages", "GetTimestampsForLastThreeMessages", new 30Q(this, 1));
                    }
                })) {
                    mailboxFutureImpl.cancel(false);
                }
                Object obj3 = new Object();
                arrayList2.add(obj3);
                mailboxFutureImpl.addResultCallback((Executor) this.A04.A00.get(), new C3aq(2, now2, obj3, this));
            }
            0fH.A0j("InboxFollowupHelperImpl", "fetch last message type - TAM");
            long now3 = ((C0dp) c00i.get()).now();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj4 : arrayList) {
                if (((ThreadSummary) obj4).A0n.A0x()) {
                    arrayList3.add(obj4);
                }
            }
            ArrayList arrayList4 = new ArrayList(C1A3.A1D(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(Long.valueOf(((ThreadSummary) it2.next()).A0n.A01));
            }
            C01i c01i = this.A0I;
            MailboxFeature mailboxFeature = (MailboxFeature) c01i.getValue();
            1Um AQV2 = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
            MailboxFutureImpl mailboxFutureImpl2 = new MailboxFutureImpl(AQV2);
            if (!AQV2.Cj2(new A0C(8, mailboxFeature, mailboxFutureImpl2, arrayList4))) {
                mailboxFutureImpl2.cancel(false);
            }
            Object obj5 = new Object();
            arrayList2.add(obj5);
            C00i c00i2 = this.A04.A00;
            mailboxFutureImpl2.addResultCallback((Executor) c00i2.get(), new C3aq(3, now3, obj5, this));
            0fH.A0j("InboxFollowupHelperImpl", "fetch last message type - Open");
            long now4 = ((C0dp) c00i.get()).now();
            ArrayList arrayList5 = new ArrayList();
            for (Object obj6 : arrayList) {
                ThreadKey threadKey2 = ((ThreadSummary) obj6).A0n;
                if (threadKey2.A1K() || (threadKey2.A1F() && C2gd.A00(A01(this)).AZk(36323917108235569L))) {
                    arrayList5.add(obj6);
                }
            }
            ArrayList arrayList6 = new ArrayList(C1A3.A1D(arrayList5, 10));
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                arrayList6.add(Long.valueOf(((ThreadSummary) it3.next()).A0n.A0r()));
            }
            MailboxFeature mailboxFeature2 = (MailboxFeature) c01i.getValue();
            1Um AQV3 = mailboxFeature2.mMailboxApiHandleMetaProvider.AQV(0);
            MailboxFutureImpl mailboxFutureImpl3 = new MailboxFutureImpl(AQV3);
            if (!AQV3.Cj2(new A0C(7, mailboxFeature2, mailboxFutureImpl3, arrayList6))) {
                mailboxFutureImpl3.cancel(false);
            }
            Object obj7 = new Object();
            arrayList2.add(obj7);
            mailboxFutureImpl3.addResultCallback((Executor) c00i2.get(), new C3aq(4, now4, obj7, this));
            1Kd.A04(arrayList2).A00(new Runnable() { // from class: X.2in
                public static final String __redex_internal_original_name = "InboxFollowupHelperImpl$onThreadListLoaded$5";

                @Override // java.lang.Runnable
                public final void run() {
                    C2ij c2ij = C2ij.this;
                    List list = arrayList;
                    C2ij.A02(c2ij, list, true);
                    C2ij.A02(c2ij, list, false);
                    3JH r0 = c2ij.A00;
                    if (r0 != null) {
                        java.util.Map map = c2ij.A0D;
                        11T.A0F(map, 0);
                        InboxFollowupsMetadataLoader inboxFollowupsMetadataLoader = r0.A00;
                        AnonymousClass207 anonymousClass207 = InboxFollowupsMetadataLoader.A07;
                        java.util.Map map2 = inboxFollowupsMetadataLoader.A04;
                        if (11T.A0O(map2, map)) {
                            return;
                        }
                        map2.clear();
                        map2.putAll(map);
                        2V3 r02 = inboxFollowupsMetadataLoader.A02;
                        ArrayList A0z2 = 1BL.A0z(list);
                        Iterator it4 = list.iterator();
                        while (it4.hasNext()) {
                            ThreadKey threadKey3 = ((ThreadSummary) it4.next()).A0n;
                            11T.A0A(threadKey3);
                            A0z2.add(threadKey3);
                        }
                        r02.A00("InboxFollowupsMetadataLoader", A0z2);
                    }
                }
            }, (Executor) c00i2.get());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006d, code lost:
    
        if (X.11T.A0O(r0 != null ? r0.A0n : null, r0) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A07(com.facebook.messaging.model.threads.ThreadSummary r302) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2ij.A07(com.facebook.messaging.model.threads.ThreadSummary):boolean");
    }
}
