package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.LongSparseArray;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.sync.delta.PrefetchedSyncData;
import com.facebook.sync.analytics.FullRefreshReason;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.6E8, reason: invalid class name */
/* loaded from: 6E8.class */
public final class C6E8 implements C54j {
    public final 6E9 A00;
    public final C10654u8 A01;
    public final 6EC A02;
    public final 6ED A03;
    public final 6EB A04;

    public C6E8(FbUserSession fbUserSession) {
        6E9 r0 = (6E9) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 49998);
        6EB r02 = (6EB) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 50000);
        C10654u8 c10654u8 = (C10654u8) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 49346);
        6EC r03 = (6EC) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 50001);
        6ED r04 = (6ED) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 50002);
        this.A00 = r0;
        this.A01 = c10654u8;
        this.A03 = r04;
        this.A02 = r03;
        this.A04 = r02;
    }

    @Override // X.C54j
    public FullRefreshReason Ani() {
        String A01 = this.A00.A01(AbstractC11664x8.A00);
        if (A01 == null) {
            A01 = "";
        }
        return FullRefreshReason.A00(A01);
    }

    @Override // X.C54j
    public long At9() {
        return this.A00.A00(AbstractC11664x8.A02);
    }

    @Override // X.C54j
    public long AtD() {
        return this.A02.A00();
    }

    @Override // X.C54j
    public long AtH() {
        return this.A00.A00(AbstractC11664x8.A04);
    }

    @Override // X.C54j
    public boolean BE2() {
        return this.A00.A04(AbstractC11664x8.A05, false);
    }

    @Override // X.C54j
    public String BE4() {
        return this.A00.A01(AbstractC11664x8.A08);
    }

    @Override // X.C54j
    public /* bridge */ /* synthetic */ Bundle BLu(C7a c7a, Object obj) {
        Bundle A0H;
        PrefetchedSyncData prefetchedSyncData = (PrefetchedSyncData) obj;
        try {
            SQLiteDatabase AUF = this.A01.A00.AUF();
            C01m.A01(AUF, -1428112930);
            try {
                Object obj2 = c7a.A02;
                BI8 bi8 = (BI8) obj2;
                if (bi8.setField_ != 1 || ((Ryz) BI8.A01(bi8, 1)).numNoOps == null || ((Ryz) BI8.A01(bi8, 1)).numNoOps.intValue() <= 1) {
                    D0d A00 = this.A03.A00(bi8);
                    long j = c7a.A00;
                    Long valueOf = Long.valueOf(j);
                    0fH.A0a(valueOf, A00.A0K(obj2), A00, "MessagesSyncDbHandler", "Handle delta in db, sequenceId=%s, threadKey=%s, handler=%s");
                    A0H = A00.A0H(prefetchedSyncData, c7a);
                    PrefetchedSyncData A002 = RVL.A00(A0H, prefetchedSyncData);
                    if (prefetchedSyncData != A002) {
                        A0H.putParcelable(AbE.A00(769), A002);
                    }
                    0fH.A0g(valueOf, "MessagesSyncDbHandler", "setLastSequenceId, %d");
                    0fH.A0g(valueOf, "MessagesSyncDbHandler", "setLastSequenceId, %d");
                    this.A02.A01(j);
                } else {
                    long intValue = (c7a.A00 + ((Ryz) BI8.A01(bi8, 1)).numNoOps.intValue()) - 1;
                    Long valueOf2 = Long.valueOf(intValue);
                    0fH.A0g(valueOf2, "MessagesSyncDbHandler", "setLastSequenceId with no-ops, %d");
                    0fH.A0g(valueOf2, "MessagesSyncDbHandler", "setLastSequenceId, %d");
                    this.A02.A01(intValue);
                    A0H = 1BK.A05();
                }
                AUF.setTransactionSuccessful();
                C01m.A03(AUF, 459286654);
                return A0H;
            } finally {
            }
        } catch (Exception e) {
            0fH.A17("MessagesSyncDbHandler", "Error applying delta type %d seqid %d error: %s", new Object[]{Integer.valueOf(((D0w) c7a.A02).setField_), Long.valueOf(c7a.A00), e});
            throw e;
        }
    }

    @Override // X.C54j
    public void Cbd(C7a c7a) {
        6ED r0 = this.A03;
        Object obj = c7a.A02;
        ImmutableSet A0K = r0.A00((BI8) obj).A0K(obj);
        if (A0K.isEmpty()) {
            return;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = A0K.iterator();
        while (it.hasNext()) {
            A0s.add(4YU.A0l((ThreadKey) it.next()));
        }
        6EB r02 = this.A04;
        02W.A04(((1To) r02.A02.get()).BTu());
        Iterator it2 = A0s.iterator();
        while (it2.hasNext()) {
            long A05 = AnonymousClass001.A05(it2.next());
            LongSparseArray longSparseArray = r02.A01;
            Number number = (Number) longSparseArray.get(A05);
            longSparseArray.put(A05, number == null ? 1L : Long.valueOf(number.longValue() + 1));
        }
    }

    @Override // X.C54j
    public void CqP(long j) {
        this.A00.A03(AbstractC11664x8.A02, Long.toString(j));
    }

    @Override // X.C54j
    public void CqR(long j) {
        this.A00.A03(AbstractC11664x8.A04, Long.toString(j));
    }

    @Override // X.C54j
    public void Cv5(FullRefreshReason fullRefreshReason, boolean z) {
        6E9 r0 = this.A00;
        r0.A03(AbstractC11664x8.A05, z ? ConstantsKt.CAMERA_ID_BACK : ConstantsKt.CAMERA_ID_FRONT);
        r0.A03(AbstractC11664x8.A00, fullRefreshReason.toString());
    }

    @Override // X.C54j
    public boolean CyG(C7a c7a) {
        return this.A03.A00((BI8) c7a.A02).A0O(c7a);
    }
}
