package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.NotificationSetting;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.service.model.FetchThreadResult;
import com.facebook.messaging.sync.delta.PrefetchedSyncData;
import com.facebook.user.model.UserKey;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.collect.RegularImmutableSet;
import com.google.common.collect.SingletonImmutableSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: D0d.class */
public abstract class D0d implements DHp {
    public static 1F9 A08(Iterator it) {
        return 1F9.A00((String) CNO.A04.get(it.next()));
    }

    public static CQL A09() {
        return (CQL) 1Bi.A03(84646);
    }

    public static SingletonImmutableSet A0A(C00i c00i, D1U d1u) {
        return ((Cbh) c00i.get()).A05(d1u);
    }

    public static SingletonImmutableSet A0B(Number number) {
        return new SingletonImmutableSet(53J.A00(number.longValue()));
    }

    public static void A0C(C00i c00i, ThreadKey threadKey, D0w d0w) {
        1Uv r0 = (1Uv) c00i.get();
        int i = d0w.setField_;
        Intent intent = new Intent("com.facebook.orca.ACTION_COMMUNITY_DELTA_UPDATE");
        intent.putExtra("thread_summary", (Parcelable) null);
        intent.putExtra("thread_key", threadKey);
        intent.putExtra("delta_type", i);
        1Uv.A02(intent, r0);
    }

    public static void A0D(C00i c00i, ThreadSummary threadSummary) {
        CaM.A00(threadSummary.A0n, (CaM) c00i.get());
    }

    public static void A0E(C00i c00i, Object obj, Collection collection) {
        ((1Uv) c00i.get()).A0M((String) null, obj.getClass().toString(), new ArrayList(collection));
    }

    public static boolean A0F(C00i c00i) {
        return 1WY.A01((1WY) c00i.get()).AZk(36315340058010352L);
    }

    public long A0G(C7a c7a) {
        if (this instanceof BAI) {
            return AbK.A05(((D1T) BI8.A01((BI8) c7a.A02, 19)).actionTimestampMs);
        }
        if (!(this instanceof BAY)) {
            return -1;
        }
        D1U d1u = (D1U) BI8.A01((BI8) c7a.A02, 2);
        ((BAY) this).A01.get();
        return AbK.A05(d1u.messageMetadata.timestamp);
    }

    public Bundle A0H(PrefetchedSyncData prefetchedSyncData, C7a c7a) {
        Bundle A0R;
        if (!(this instanceof BBa)) {
            if (this instanceof BA9) {
                return 1BK.A05();
            }
            if (this instanceof BA8) {
                BA8 ba8 = (BA8) this;
                D1E d1e = (D1E) BI8.A01((BI8) c7a.A02, 12);
                FetchThreadResult A0H = ba8.A02.A0H(ba8.A04.A01(d1e.threadKey), 0);
                ThreadSummary threadSummary = A0H.A05;
                if (threadSummary != null) {
                    ThreadKey threadKey = threadSummary.A0n;
                    1G2 r0 = 1NK.A06;
                    1G2 A06 = AbstractC03303xn.A06(threadKey);
                    4yH r02 = ba8.A03;
                    NotificationSetting A00 = C1zh.A00(d1e.expireTime.longValue());
                    long j = A0H.A01;
                    C1zm A0g = AbF.A0g(threadSummary);
                    A0g.A06(A00);
                    r02.A0R(AbF.A0i(A0g), (ThreadSummary) null, j);
                    1Ql edit = ba8.A05.edit();
                    edit.CaH(A06, d1e.expireTime.longValue());
                    edit.commit();
                    AbJ.A1Q(ba8.A01);
                }
                return 1BK.A05();
            }
            if (this instanceof BAW) {
                BAW baw = (BAW) this;
                BI8 bi8 = (BI8) c7a.A02;
                if (!BAW.A00(bi8)) {
                    ThreadKey A01 = baw.A02.A01(((D1L) BI8.A01(bi8, 14)).threadKey);
                    0fH.A0g(A01, "DeltaThreadFolderHandler", "handleDeltaInDb() triggering handleDeleteThread with threadKey:%s");
                    baw.A01.A0a(A01, "DeltaThreadFolderHandler");
                }
                return 1BK.A05();
            }
            if (this instanceof BAC) {
                return 1BK.A05();
            }
            if (this instanceof BAI) {
                BAI bai = (BAI) this;
                D1T d1t = (D1T) BI8.A01((BI8) c7a.A02, 19);
                ThreadKey A012 = bai.A02.A01(d1t.threadKey);
                return bai.A0R(A012, UserKey.A00(A012.A06 == C1yg.ONE_TO_ONE ? Long.valueOf(A012.A02) : d1t.actorFbId), d1t.actionTimestampMs.longValue(), d1t.watermarkTimestampMs.longValue());
            }
            if (!(this instanceof BAE) && !(this instanceof B9y) && !(this instanceof BAS)) {
                if (this instanceof BAQ) {
                    BAQ baq = (BAQ) this;
                    return ((BAO) baq.A01.get()).A0R(BAQ.A00(baq, c7a));
                }
                if (!(this instanceof BA5) && !(this instanceof BA4)) {
                    if (this instanceof BAJ) {
                        BAJ baj = (BAJ) this;
                        BI8 bi82 = (BI8) c7a.A02;
                        D1K d1k = (D1K) BI8.A01(bi82, 6);
                        ThreadKey threadKey2 = (ThreadKey) 2Ri.A0A(AbM.A0o(((D1K) BI8.A01(bi82, 6)).threadKey, baj.A05));
                        long j2 = c7a.A00;
                        Boolean bool = d1k.shouldRetainThreadIfEmpty;
                        return baj.A0R(threadKey2, d1k.messageIds, j2, bool != null ? bool.booleanValue() : false);
                    }
                    if (!(this instanceof BAR)) {
                        if (!(this instanceof BA3) && !(this instanceof BA7) && !(this instanceof BA2) && !(this instanceof BA1) && !(this instanceof BAV) && (this instanceof BA0)) {
                            return 1BK.A05();
                        }
                        return 1BK.A05();
                    }
                    BAR bar = (BAR) this;
                    D1J d1j = (D1J) BI8.A01((BI8) c7a.A02, 4);
                    d1j.watermarkTimestamp.getClass();
                    long longValue = d1j.watermarkTimestamp.longValue();
                    ImmutableList A02 = bar.A05.A02(d1j.threadKeys);
                    ((5I5) bar.A02.get()).A08(A02, true);
                    long j3 = c7a.A00;
                    A0R = bar.A0R(A02, j3, longValue);
                    List list = d1j.folders;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            1Du it2 = C4yl.A00(bar.A03, A08(it), null, -1, -1).iterator();
                            while (it2.hasNext()) {
                                BAR.A00(AbF.A0j(it2).A0n, bar, longValue, j3);
                            }
                        }
                    }
                }
                return 1BK.A05();
            }
            return 1BK.A05();
        }
        BBa bBa = (BBa) this;
        ImmutableSet A0K = bBa.A0K(c7a.A02);
        A0K.getClass();
        Preconditions.checkArgument(4YV.A1U(A0K.size()), "Classes extending SingleThreadDeltaHandler should not ensure more than one thread.");
        Object next = A0K.iterator().next();
        if (!prefetchedSyncData.A00.contains(next)) {
            if (!prefetchedSyncData.A02.contains(next)) {
                return bBa.A0R((ThreadSummary) prefetchedSyncData.A01.get(next), c7a);
            }
            0fH.A0g(next.toString(), "SingleThreadDeltaHandler", "Thread %s doesn't exist on server. Ignore this delta");
            bBa.A00.get();
            return 1BK.A05();
        }
        0fH.A0g(next.toString(), "SingleThreadDeltaHandler", "Thread %s was fetched in this batch. Ignore this delta.");
        bBa.A00.get();
        ThreadSummary threadSummary2 = (ThreadSummary) prefetchedSyncData.A01.get(next);
        threadSummary2.getClass();
        bBa.A0S(threadSummary2, c7a);
        A0R = 1BK.A05();
        A0R.putParcelable("threadSummary", threadSummary2);
        return A0R;
    }

    public ThreadSummary A0I(ThreadKey threadKey, Object obj) {
        return null;
    }

    public ImmutableMap A0J(Object obj) {
        return RegularImmutableMap.A03;
    }

    public ImmutableSet A0K(Object obj) {
        if (!(this instanceof BA8)) {
            if (this instanceof BAW) {
                ThreadKey A01 = ((BAW) this).A02.A01(((D1L) BI8.A01((BI8) obj, 14)).threadKey);
                0fH.A0g(A01, "DeltaThreadFolderHandler", "getAllThreadKeys() processing threadKey:%s");
                return AbF.A11(A01);
            }
            if (this instanceof BAI) {
                D1T d1t = (D1T) BI8.A01((BI8) obj, 19);
                return AbM.A0o(d1t.threadKey, ((BAI) this).A02);
            }
            if (!(this instanceof B9y) && !(this instanceof BAD) && !(this instanceof BA5) && !(this instanceof BA4)) {
                if (this instanceof BAJ) {
                    D1K d1k = (D1K) BI8.A01((BI8) obj, 6);
                    return AbM.A0o(d1k.threadKey, ((BAJ) this).A05);
                }
                if (this instanceof BAR) {
                    return ImmutableSet.A07(((BAR) this).A05.A02(((D1J) BI8.A01((BI8) obj, 4)).threadKeys));
                }
                if (!(this instanceof BAA) && !(this instanceof BA3) && !(this instanceof BA7) && !(this instanceof BA2) && !(this instanceof BA1) && !(this instanceof BAB) && !(this instanceof BAN) && !(this instanceof BA0)) {
                    if (this instanceof BAP) {
                        return BAP.A00((BAP) this, (BI8) obj);
                    }
                    if (!(this instanceof B9z) && !(this instanceof BA6)) {
                        if (this instanceof BAY) {
                            return A0A(((BAY) this).A01, (D1U) BI8.A01((BI8) obj, 2));
                        }
                        D1I d1i = (D1I) BI8.A01((BI8) obj, 17);
                        return AbN.A0g(d1i.messageMetadata, ((BAZ) this).A03);
                    }
                }
            }
        }
        return RegularImmutableSet.A05;
    }

    public ImmutableSet A0L(Object obj) {
        if (!(this instanceof BA9) && !(this instanceof BA8)) {
            if (this instanceof BAW) {
                BAW baw = (BAW) this;
                BI8 bi8 = (BI8) obj;
                if (BAW.A00(bi8)) {
                    ThreadKey A01 = baw.A02.A01(((D1L) BI8.A01(bi8, 14)).threadKey);
                    0fH.A0g(A01, "DeltaThreadFolderHandler", "getAllThreadKeys() processing threadKey:%s");
                    return AbF.A11(A01);
                }
            } else if (!(this instanceof BAO) && !(this instanceof BAU) && !(this instanceof BAC) && !(this instanceof BAI) && !(this instanceof B9y) && !(this instanceof BAQ) && !(this instanceof BAH) && !(this instanceof BAD) && !(this instanceof BAG) && !(this instanceof BAF) && !(this instanceof BA5) && !(this instanceof BA4) && !(this instanceof BAJ) && !(this instanceof BAK) && !(this instanceof BAR) && !(this instanceof BAA) && !(this instanceof BA3) && !(this instanceof BA7) && !(this instanceof BA2) && !(this instanceof BA1) && !(this instanceof BAB) && !(this instanceof BAN) && !(this instanceof BA0)) {
                if (this instanceof BAP) {
                    return BAP.A00((BAP) this, (BI8) obj);
                }
                if (!(this instanceof B9z) && !(this instanceof BA6) && !(this instanceof BB5) && !(this instanceof BAt) && !(this instanceof BAs) && !(this instanceof BAr) && !(this instanceof BBU) && !(this instanceof BB8) && !(this instanceof BAb) && !(this instanceof BB4) && !(this instanceof BB3) && !(this instanceof BBA) && !(this instanceof BAq) && !(this instanceof BAp) && !(this instanceof BB2) && !(this instanceof BB1) && !(this instanceof BB0) && !(this instanceof BAo) && !(this instanceof BAn) && !(this instanceof BAm) && !(this instanceof BAe) && !(this instanceof BAz) && !(this instanceof BBN) && !(this instanceof BAy)) {
                    if (this instanceof BAY) {
                        return A0A(((BAY) this).A01, (D1U) BI8.A01((BI8) obj, 2));
                    }
                    if (!(this instanceof BAd) && !(this instanceof BAg) && !(this instanceof BAl) && !(this instanceof BB7) && !(this instanceof BBZ) && !(this instanceof BB9) && !(this instanceof BAX) && !(this instanceof BAk) && !(this instanceof BAc) && !(this instanceof BAx) && !(this instanceof BAw) && !(this instanceof BBV) && !(this instanceof BAj) && !(this instanceof BBH) && !(this instanceof BB6)) {
                        if (this instanceof BAZ) {
                            BAZ baz = (BAZ) this;
                            BI8 bi82 = (BI8) obj;
                            Boolean bool = ((D1I) BI8.A01(bi82, 17)).messageMetadata.skipBumpThread;
                            if (bool == null || !bool.booleanValue()) {
                                D1I d1i = (D1I) BI8.A01(bi82, 17);
                                return AbN.A0g(d1i.messageMetadata, baz.A03);
                            }
                        } else if ((this instanceof BAi) || (this instanceof BAh)) {
                        }
                    }
                }
            }
        }
        return RegularImmutableSet.A05;
    }

    @Override // X.DHp
    /* renamed from: A0M, reason: merged with bridge method [inline-methods] */
    public void BLw(Bundle bundle, PrefetchedSyncData prefetchedSyncData, C7a c7a) {
    }

    public void A0N(C7a c7a) {
        if (this instanceof BAI) {
            BAI bai = (BAI) this;
            D1T d1t = (D1T) BI8.A01((BI8) c7a.A02, 19);
            C45d c45d = bai.A01;
            ThreadKey A01 = bai.A02.A01(d1t.threadKey);
            long longValue = d1t.actionTimestampMs.longValue();
            11T.A0F(A01, 0);
            c45d.A01.A0D("read_receipt_received", C45m.A00("thread_fbid", 1BK.A0w(A01), "user_fbid", 4YU.A0z(A01), "timestamp", String.valueOf(longValue)));
        }
    }

    public boolean A0O(C7a c7a) {
        if (this instanceof BA8) {
            return true;
        }
        if (this instanceof BAW) {
            0fH.A0g(c7a, "DeltaThreadFolderHandler", "shouldPutConsistencyLock deltaWithSequenceId:%s");
            return true;
        }
        if ((this instanceof BAO) || (this instanceof BAU) || (this instanceof BAM) || (this instanceof BAI) || (this instanceof BAL) || (this instanceof BAJ) || (this instanceof BAK) || (this instanceof BAR) || (this instanceof BAN) || (this instanceof BAP) || (this instanceof BB5) || (this instanceof BBF) || (this instanceof BAt) || (this instanceof BBD) || (this instanceof BAs) || (this instanceof BAr) || (this instanceof BBU) || (this instanceof BB8) || (this instanceof BAb) || (this instanceof BB4) || (this instanceof BB3) || (this instanceof BBA) || (this instanceof BBM) || (this instanceof BAq) || (this instanceof BAp) || (this instanceof BBL) || (this instanceof BBY) || (this instanceof BBO) || (this instanceof BBS) || (this instanceof BB2) || (this instanceof BB1) || (this instanceof BB0) || (this instanceof BAo) || (this instanceof BBK) || (this instanceof BAn) || (this instanceof BAm) || (this instanceof BAz)) {
            return true;
        }
        return this instanceof BBW ? !BBW.A00((BBW) this, (BI8) c7a.A02) : (this instanceof BBN) || (this instanceof BAy) || (this instanceof BBI) || (this instanceof BBQ) || (this instanceof BAY) || (this instanceof BAd) || (this instanceof BAg) || (this instanceof BAl) || (this instanceof BB7) || (this instanceof BBR) || (this instanceof BBJ) || (this instanceof BBZ) || (this instanceof BBX) || (this instanceof BB9) || (this instanceof BBE) || (this instanceof BAk) || (this instanceof BAc) || (this instanceof BAx) || (this instanceof BAw) || (this instanceof BBC) || (this instanceof BBV) || (this instanceof BB6) || (this instanceof BAZ) || (this instanceof BAi) || (this instanceof BAh) || (this instanceof BAv) || (this instanceof BAa) || (this instanceof BAu) || (this instanceof BAf);
    }

    public boolean A0P(Object obj) {
        return false;
    }

    public boolean A0Q(Object obj) {
        if (this instanceof BAW) {
            return BAW.A00((BI8) obj);
        }
        if (this instanceof BBY) {
            BBY bby = (BBY) this;
            return AnonymousClass001.A1U(BBY.A01(1Fw.A05(bby.A00), bby, (BI7) obj));
        }
        if (this instanceof BBW) {
            return BBW.A00((BBW) this, (BI8) obj);
        }
        if (this instanceof BAV) {
            return BAV.A01((BAV) this, (BI8) obj);
        }
        return false;
    }
}
