package X;

import android.util.LongSparseArray;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.service.model.FetchMessageParams;
import com.facebook.messaging.service.model.FetchMessageResult;
import com.facebook.messaging.service.model.NewMessageResult;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: Cbg.class */
public final class Cbg implements CallerContextable {
    public static final String __redex_internal_original_name = "MessagesSyncThreadsFetcher";
    public 1BY A00;
    public final C00i A02;
    public final C00i A03;
    public final C00i A06;
    public final C00i A07;
    public final C00i A08;
    public final C00i A0A;
    public final C00i A0D;
    public final C00i A0F;
    public final C00i A0G;
    public final C00i A0H;
    public final C00i A0K;
    public final C00i A0L;
    public final C00i A09 = 1BQ.A02(100043);
    public final C00i A01 = AbH.A0J();
    public final C00i A0B = 1BQ.A02(49492);
    public final C15h A0M = DBe.A00(this, 128);
    public final C00i A0E = AbH.A0O();
    public final C00i A04 = AbH.A0a();
    public final C00i A0J = 1BV.A01((1BY) null, 84569);
    public final C15h A0N = DBe.A00(this, ActionId.MESSENGER_QUEUE_CREATION);
    public final C00i A0C = 1BQ.A01();
    public final C00i A0I = 1BV.A01((1BY) null, 83968);
    public final C00i A05 = 1BQ.A02(67724);

    public Cbg(1BO r302, FbUserSession fbUserSession) {
        this.A00 = 7zL.A0Q(r302);
        this.A08 = AbF.A0B(fbUserSession, (1BY) null, 49390);
        this.A0G = AbF.A0A(fbUserSession, (1BY) null, 84629);
        this.A0A = AbM.A0F(fbUserSession);
        this.A0H = AbF.A0A(fbUserSession, (1BY) null, 84518);
        this.A07 = AbH.A0A(fbUserSession);
        this.A0K = AbF.A0A(fbUserSession, (1BY) null, 84522);
        this.A06 = AbF.A0A(fbUserSession, (1BY) null, 84535);
        this.A0L = AbF.A0A(fbUserSession, (1BY) null, 50000);
        this.A03 = AbM.A0G(fbUserSession);
        this.A02 = AbF.A0A(fbUserSession, (1BY) null, 84636);
        this.A0F = AbF.A0A(fbUserSession, (1BY) null, 67250);
        this.A0D = AbF.A0A(fbUserSession, (1BY) null, 84501);
    }

    public static void A00(CallerContext callerContext, Cbg cbg, Set set, long j) {
        if (set.isEmpty()) {
            return;
        }
        CQW cqw = (CQW) cbg.A0D.get();
        try {
            ImmutableList A04 = CQW.A04(set);
            C30G A0H = AbF.A0H(47);
            A0H.A02(A04, "thread_msg_ids");
            C00i c00i = cqw.A07;
            ((CIn) c00i.get()).A02(A0H);
            C3sa A00 = C3sa.A00(A0H);
            A00.A00 = cqw.A01.BKF();
            A00.A01 = callerContext;
            ((CIn) c00i.get()).A01(A00);
            1Vb r0 = (1Vb) cqw.A0C.get();
            4YU.A1J(A00, 2809349952654335L);
            try {
                ImmutableMap A0C = cqw.A0C((List) 2FP.A01(new D3I(2), r0.A09(A00)).get(), set);
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    FetchMessageResult fetchMessageResult = (FetchMessageResult) A0C.get(((FetchMessageParams) it.next()).A01);
                    if (fetchMessageResult != null) {
                        D4w BZK = ((1To) cbg.A0F.get()).BZK(callerContext, "handleFetchMessageResultFromGraphQL");
                        try {
                            Message message = fetchMessageResult.A00;
                            A01(message.A0V, cbg);
                            AbM.A0e(cbg.A0G).A09(AbM.A0X(cbg.A08).A0V(new NewMessageResult(EnumC08284mf.A06, message, null, null, 1BL.A08(cbg.A04)), C7tn.A02, j, true), null, j);
                            BZK.close();
                        } catch (Throwable th) {
                            try {
                                BZK.close();
                                throw th;
                            } catch (Throwable th2) {
                                7kF.A00(th, th2);
                                throw th;
                            }
                        }
                    }
                }
            } catch (Exception e) {
                1BK.A09(CQW.A03(cqw).A00).softReport("failed_fetch_messages", e);
                throw e;
            }
        } catch (Exception e2) {
            C3TH.A01(CQW.A03(cqw), "failed_fetch_messages_communication", e2, AnonymousClass001.A0u());
            throw CQW.A05(e2);
        }
    }

    public static void A01(ThreadKey threadKey, Cbg cbg) {
        if (threadKey != null) {
            6EB r0 = (6EB) cbg.A0L.get();
            long A0r = threadKey.A0r();
            AbN.A1J(r0);
            LongSparseArray longSparseArray = r0.A01;
            Number number = (Number) longSparseArray.get(A0r);
            longSparseArray.put(A0r, number == null ? 1L : Long.valueOf(number.longValue() + 1));
        }
    }

    public static void A02(Cbg cbg, Set set, Set set2) {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("fetch (sync); ");
        if (!set.isEmpty()) {
            A0k.append("threads ");
            A0k.append(set);
            A0k.append(";");
        }
        if (!set2.isEmpty()) {
            A0k.append("messages ");
            A0k.append(set2);
        }
        String obj = A0k.toString();
        0fH.A0j(__redex_internal_original_name, obj);
        AbM.A0J(cbg.A09).A04(C2rg.A08, obj);
    }
}
