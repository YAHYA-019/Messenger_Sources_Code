package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.rtc.calllog.database.api.RtcCallLogInfo;
import com.facebook.user.model.User;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: Cbj.class */
public final class Cbj implements CallerContextable {
    public static final int[] A09 = {1, 2, 3, 4};
    public static final String __redex_internal_original_name = "CallLogsDbHandlerImpl";
    public final AtomicBoolean A07 = new AtomicBoolean();
    public final 1Br A03 = 7zM.A0Q();
    public final 1Br A04 = AbG.A0J();
    public final 1R7 A01 = (1R7) 1Bi.A03(33053);
    public final C33 A05 = (C33) 1Bi.A03(85010);
    public final 1Br A08 = 1Bu.A00(33031);
    public final C0et A02 = (C0et) 1Bi.A03(83604);
    public int A00 = -1;
    public final Object A06 = new Object();

    public static final int A00(ThreadKey threadKey, int[] iArr) {
        SQLiteDatabase A01 = A01();
        ContentValues A07 = 4YU.A07();
        A07.put("seen_or_played", 7zN.A0i());
        4cN r0 = new 4cN();
        4cO.A00(r0, "seen_or_played", ConstantsKt.CAMERA_ID_FRONT);
        4cO.A00(r0, "thread_key", threadKey.toString());
        int[] copyOf = Arrays.copyOf(iArr, 4);
        int length = copyOf.length;
        r0.A04(new 4sQ("call_type", length == 0 ? Collections.emptyList() : new C4i0(copyOf, 0, length)));
        if (A01 != null && A01.isOpen()) {
            return A01.update("user_table", A07, r0.A02(), r0.A03());
        }
        0fH.A0B(Cbj.class, "Unable to acquire db for markCallLogSeenOrPlayedInternal");
        return 0;
    }

    public static final SQLiteDatabase A01() {
        User Auc;
        Bw8 bw8 = (Bw8) 1Bi.A03(85008);
        1Ex r0 = bw8.A01;
        SQLiteDatabase sQLiteDatabase = null;
        if (r0.BTw() && !r0.BU1() && (Auc = r0.Auc()) != null) {
            AtomicReference atomicReference = bw8.A05;
            if (atomicReference.get() == null || !11T.A0O(Auc.A13, atomicReference.get())) {
                1DV r02 = bw8.A00;
                if (r02 != null) {
                    r02.AGH();
                }
                bw8.A00 = null;
                atomicReference.set(Auc.A13);
            }
            1DV r302 = bw8.A00;
            if (r302 == null) {
                r302 = new C1653Aov(1BK.A04(bw8.A03), bw8.A02, ImmutableList.of((Object) bw8.A04), AnonymousClass001.A0Z(atomicReference, "call_logs_db_", AnonymousClass001.A0k()));
                bw8.A00 = r302;
            }
            sQLiteDatabase = r302.AUF();
        }
        return sQLiteDatabase;
    }

    public static final void A02(2V0 r301, Cbj cbj) {
        7zP.A0N(cbj.A03).AAr("Call logs DB accessed from UI Thread");
        SQLiteDatabase A01 = A01();
        if (A01 == null || !A01.isOpen() || A01.delete("user_table", r301.A02(), r301.A03()) <= 0) {
            return;
        }
        A03(cbj);
        cbj.A05.A00();
    }

    public static final void A03(Cbj cbj) {
        int i;
        Object obj = cbj.A06;
        synchronized (obj) {
            cbj.A00 = -1;
        }
        synchronized (obj) {
            i = cbj.A00;
        }
        if (i < 0) {
            0fH.A0A(Cbj.class, "getNumberOfUnseenMissedCalls");
            cbj.A01.execute(new D6B(cbj));
        }
    }

    public void A04(ThreadKey threadKey, Collection collection) {
        11T.A0H(threadKey, collection);
        if (collection.isEmpty()) {
            return;
        }
        4cN A00 = 4cM.A00(new 2V0[]{AbF.A0G("thread_key", threadKey.toString()), new 4sQ("message_id", collection)});
        11T.A0D(A00);
        A02(A00, this);
    }

    public void A05(RtcCallLogInfo rtcCallLogInfo) {
        11T.A0F(rtcCallLogInfo, 0);
        0fH.A0A(Cbj.class, "insertCall");
        4YV.A11(this.A04).execute(new D8D(rtcCallLogInfo, this));
    }
}
