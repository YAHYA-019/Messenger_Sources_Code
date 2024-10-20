package X;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.http.interfaces.RequestPriority;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.service.model.FetchThreadListParams;
import com.facebook.messaging.service.model.FetchThreadListResult;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.sync.analytics.FullRefreshReason;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;

/* loaded from: D0n.class */
public final class D0n implements GIg {
    public final /* synthetic */ CallerContext A00;
    public final /* synthetic */ C54q A01;
    public final /* synthetic */ FullRefreshReason A02;

    public D0n(CallerContext callerContext, C54q c54q, FullRefreshReason fullRefreshReason) {
        this.A01 = c54q;
        this.A00 = callerContext;
        this.A02 = fullRefreshReason;
    }

    /* JADX WARN: Type inference failed for: r0v165, types: [X.Aoi, java.lang.Object, X.2V0] */
    @Override // X.GIg
    public Ejf ARL() {
        boolean z;
        Long l;
        C54q c54q;
        CallerContext callerContext;
        FullRefreshReason fullRefreshReason;
        int i;
        short s;
        try {
            c54q = this.A01;
            callerContext = this.A00;
            fullRefreshReason = this.A02;
            i = 250;
            s = 1;
        } catch (BPU | 2L0 e) {
            0fH.A0u("MessagesSyncConnectionHandler", "doInitialFetch", e);
        }
        do {
            Cbg cbg = (Cbg) c54q.A08.get();
            AbM.A0J(cbg.A09).A04(C2rg.A08, "fetchThreadList (Sync)");
            FetchThreadListResult A00 = ((C5B) cbg.A0K.get()).A00(callerContext, new FetchThreadListParams(null, RequestPriority.A00, 1F9.A0I, 1Hb.A02, null, null, 0S2.A00, null, 1GC.A01(), 0));
            A00.getClass();
            D4w BZK = ((1To) cbg.A0F.get()).BZK(callerContext, "fetchThreadList");
            try {
                6EB r0 = (6EB) cbg.A0L.get();
                AbN.A1J(r0);
                r0.A00++;
                4yH A0X = AbM.A0X(cbg.A08);
                String obj = fullRefreshReason.A00.toString();
                String str = fullRefreshReason.A01;
                C00i c00i = A0X.A0G;
                SQLiteDatabase A002 = C10654u8.A00(c00i);
                C01m.A01(A002, 1571401826);
                try {
                    C00i c00i2 = A0X.A07;
                    6E9 r02 = (6E9) c00i2.get();
                    A002.delete("folders", null, null);
                    r02.A02(AbstractC11664x8.A01);
                    if (A002.delete("threads", ConstantsKt.CAMERA_ID_BACK, null) == 0) {
                        A0X.A09.get();
                        4uE.A00((ThreadKey) null, "full-refresh-already-empty", obj, str);
                    } else {
                        A0X.A09.get();
                        4uE.A00((ThreadKey) null, "full-refresh", obj, str);
                    }
                    2V0 r03 = new 4sQ(TraceFieldType.MsgType, Arrays.asList(Integer.toString(C1q8.A0M.dbKeyValue), Integer.toString(C1q8.A0A.dbKeyValue)));
                    ImmutableList.Builder builder = ImmutableList.builder();
                    ImmutableList immutableList = A00.A07.A01;
                    1Du it = immutableList.iterator();
                    while (it.hasNext()) {
                        builder.m11011add((Object) AbF.A0j(it).A0n.A0u());
                    }
                    4cN A003 = 4cM.A00(new 2V0[]{r03, new 4sQ("thread_key", builder.build())});
                    ?? obj2 = new Object();
                    obj2.A00 = A003;
                    0fH.A0g(builder.build(), "DbInsertThreadsHandler", "handleFetchThreadListResultAfterCreateQueue, delete messages for threads, %s");
                    int delete = A002.delete("messages", obj2.A02(), obj2.A03());
                    2fJ r04 = (2fJ) A0X.A0E.get();
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("DbInsertThreadsHandler, ");
                    String A0a = AnonymousClass001.A0a(obj2.A03(), A0k);
                    synchronized (r04) {
                        try {
                            if (2fJ.A05(r04)) {
                                r04.A02.clear();
                                2fJ.A03(2fJ.A01((3Kb) null, r04, (ThreadKey) null, "deleteAllThreadMessagesInDb", 0Pz.A0c(A0a, AnonymousClass000.A00(ActionId.MESSENGER_QUEUE_CREATION), delete)), r04);
                            }
                        } catch (Throwable th) {
                            th = th;
                        }
                    }
                    SQLiteDatabase A004 = C10654u8.A00(c00i);
                    C01m.A01(A004, 451785660);
                    try {
                        try {
                            A004.delete("virtual_folders", "", new String[0]);
                            A004.setTransactionSuccessful();
                            C01m.A03(A004, 1672936967);
                            for (1Hk r05 : 1Hk.values()) {
                                ((6E9) c00i2.get()).A02(AbstractC11664x8.A02(r05));
                            }
                            ((6E9) c00i2.get()).A02(AbstractC11664x8.A01(1F9.A0M));
                            A0X.A0U(A00);
                            A002.setTransactionSuccessful();
                            C01m.A03(A002, -1049529670);
                            C00i c00i3 = cbg.A03;
                            AbG.A0h(c00i3).A04.A0a();
                            AbG.A0h(c00i3).A09(A00);
                            AbM.A0V(cbg.A07).A01 = true;
                            BZK.close();
                            AbF.A0a(cbg.A0E).A0L(Cbg.__redex_internal_original_name);
                            ((CQF) cbg.A0J.get()).A07(immutableList, "FETCH_THREAD_LIST");
                            BtW btW = ((CIU) cbg.A0H.get()).A03;
                            btW.A00.AAq();
                            if (!immutableList.isEmpty()) {
                                long j = ((ThreadSummary) 4YU.A0q(immutableList, 0)).A0N;
                                if (btW.A02.compareAndSet(-1, j)) {
                                    btW.A01.A03(Ba6.A01, Long.toString(j));
                                }
                            }
                            long j2 = A00.A01;
                            if (immutableList.size() > 0) {
                                String A0s = 0Pz.A0s("Initial fetch finished, mid=", ((ThreadSummary) immutableList.get(0)).A1x, ", sid=", j2);
                                0fH.A0n("MessagesSyncConnectionHandler", A0s);
                                c54q.A0A.A0F(A0s);
                            } else {
                                C3sa A0L = 7zM.A0L(7zL.A0M(), new 2Jf(2JX.class, (Class) null, "InitialThreadListDataQuery", (String) null, "fbandroid", -1891230360, 0, 2164040020L, 2164040020L, false, true));
                                FbUserSession fbUserSession = c54q.A01;
                                A0L.A00 = fbUserSession.BKF();
                                AbstractC05414dq A03 = 1VX.A03(1BK.A04(c54q.A05), fbUserSession);
                                4YU.A1J(A0L, 798981217579266L);
                                Object obj3 = A03.A03(A0L).get();
                                obj3.getClass();
                                Object obj4 = ((AbstractC08294mh) obj3).A03;
                                obj4.getClass();
                                2JY A0K = AbF.A0K((2JY) obj4, 2JX.class, -1195216881);
                                A0K.getClass();
                                2JY A0B = 1BK.A0B(A0K, 2JX.class, 1754948465, 1533503818);
                                A0B.getClass();
                                String A0r = A0B.A0r(-1037975883);
                                A0r.getClass();
                                j2 = Long.parseLong(A0r);
                                if (AbG.A01(A0B) != 0) {
                                    Thread.sleep(i);
                                    i *= 2;
                                    s = (short) (((short) (s + 1)) + 1);
                                }
                            }
                            if (j2 >= 0) {
                                z = false;
                                l = Long.valueOf(j2);
                                return new Ejf(z, l);
                            }
                            z = true;
                            l = null;
                            return new Ejf(z, l);
                        } catch (SQLException e2) {
                            4yH.A0A(e2);
                            throw 0Q8.createAndThrow();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        C01m.A03(A004, -1029794086);
                        throw th;
                    }
                } catch (Throwable th3) {
                    C01m.A03(A002, 1643633429);
                    throw th3;
                }
            } catch (Throwable th4) {
                try {
                    BZK.close();
                } catch (Throwable th5) {
                    7kF.A00(th4, th5);
                }
                throw th4;
            }
        } while (s <= 3);
        z = true;
        l = null;
        return new Ejf(z, l);
    }

    @Override // X.GIg
    public void BxQ(long j) {
        0fH.A17("MessagesSyncConnectionHandler", "Failed to do initial fetch, backing off by %d ms.", 1BK.A1Z(j));
    }
}
