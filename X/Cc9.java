package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.http.interfaces.RequestPriority;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.model.threads.ThreadsCollection;
import com.facebook.messaging.service.model.FetchMoreThreadsParams;
import com.facebook.messaging.service.model.FetchThreadListParams;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.Executor;

/* loaded from: Cc9.class */
public final class Cc9 implements 2SQ, DIa, CallerContextable {
    public static final String __redex_internal_original_name = "SimpleMessageRequestsLoader";
    public 2eS A00;
    public 2eS A01;
    public 2TV A02;
    public Bij A03;
    public final Context A04;
    public final FbUserSession A05;
    public final BlueServiceOperationFactory A06;
    public final C3Na A07;
    public final 2fD A08;
    public final BBm A09;
    public final Executor A0A;
    public final FbUserSession A0B;
    public final 1De A0C;
    public final 1F9 A0D;

    public Cc9(FbUserSession fbUserSession, 1De r303, 1F9 r304) {
        11T.A0F(r304, 2);
        1BY r0 = r303.A00;
        Context context = (Context) 1Bn.A0E((Context) null, r0, 83719);
        BlueServiceOperationFactory blueServiceOperationFactory = (BlueServiceOperationFactory) 1Bn.A0E((Context) null, r0, 33031);
        Executor A1C = AbJ.A1C();
        C3Na c3Na = (C3Na) 1Bn.A0E((Context) null, r0, 84014);
        2fD r02 = (2fD) 1Bi.A03(17063);
        BBm bBm = (BBm) 1Bi.A03(83213);
        11T.A0F(context, 1);
        7zT.A11(3, blueServiceOperationFactory, A1C, c3Na, r02);
        11T.A0F(bBm, 7);
        this.A04 = context;
        this.A05 = fbUserSession;
        this.A06 = blueServiceOperationFactory;
        this.A0A = A1C;
        this.A07 = c3Na;
        this.A08 = r02;
        this.A09 = bBm;
        this.A0C = r303;
        this.A0D = r304;
        this.A0B = fbUserSession;
    }

    private final void A00(1He r302, C4J c4j) {
        1Hb r0 = 1Hb.A02;
        1GC.A01();
        FetchThreadListParams fetchThreadListParams = new FetchThreadListParams(r302, RequestPriority.A00, c4j.A00, r0, null, null, 0S2.A00, null, 8, 0);
        Bundle A05 = 1BK.A05();
        A05.putParcelable("fetchThreadListParams", fetchThreadListParams);
        2fD r02 = this.A08;
        String A00 = 1BJ.A00(1315);
        r02.A00(c4j, A00, "startFetchThreadsOperation", "MessageRequestsLoader");
        1IB A0H = AbK.A0H(A05, CallerContext.A09(getClass(), "message_request"), this.A06, A00);
        11T.A0A(A0H);
        2TV r03 = this.A02;
        if (r03 == null) {
            11T.A0L("callback");
            throw 0Q8.createAndThrow();
        }
        r03.C4n(A0H, c4j);
        C1614Amv c1614Amv = new C1614Amv(this, c4j, 21);
        this.A01 = new 2eS(c1614Amv, A0H);
        1Kd.A0F(c1614Amv, A0H, this.A0A);
    }

    public static final void A01(C4J c4j, Cc9 cc9, String str) {
        BBm bBm;
        boolean z;
        String str2;
        boolean A1W = AnonymousClass001.A1W(0S2.A00, c4j.A01);
        1F9 r0 = 1F9.A0Q;
        1F9 r02 = c4j.A00;
        if (r0 == r02) {
            bBm = cc9.A09;
            z = c4j.A02;
            str2 = A1W ? "thread_fetch_failed_pending" : "thread_fetch_more_failed_pending";
        } else {
            if (1F9.A0O != r02) {
                return;
            }
            bBm = cc9.A09;
            z = c4j.A02;
            str2 = A1W ? "thread_fetch_failed_other" : "thread_fetch_more_failed_other";
        }
        if (str != null) {
            bBm.A02("error_message", str);
        }
        C6ns.A00(bBm, new AKg(bBm, z ? "server" : "cache", str2, 2));
    }

    private void A02(C4J c4j) {
        2fD r310;
        Object obj;
        Integer num = c4j.A01;
        if (num == 0S2.A00 && this.A01 == null) {
            BBm bBm = this.A09;
            1F9 r0 = c4j.A00;
            boolean z = c4j.A02;
            bBm.A06(r0, true, true, z);
            if (r0 == 1F9.A0O) {
                ((5P7) 1Lm.A05(this.A04, this.A05, 49711)).A08();
            }
            A00(z ? 1He.A02 : 1He.A04, c4j);
            return;
        }
        if (num == 0S2.A01) {
            BBm bBm2 = this.A09;
            1F9 r02 = c4j.A00;
            bBm2.A06(r02, true, false, c4j.A02);
            if (this.A01 == null && this.A00 == null) {
                Bij bij = this.A03;
                if (bij != null) {
                    ThreadsCollection threadsCollection = bij.A00;
                    if (threadsCollection.A01.isEmpty()) {
                        return;
                    }
                    ImmutableList immutableList = threadsCollection.A01;
                    ThreadSummary threadSummary = (ThreadSummary) 4YU.A0q(immutableList, immutableList.size() - 1);
                    FetchMoreThreadsParams fetchMoreThreadsParams = new FetchMoreThreadsParams(1He.A02, r02, 1Hb.A02, threadSummary.A0n, 1Hk.A09, immutableList.size() + 6, 6, threadSummary.A0N, -1);
                    Bundle A05 = 1BK.A05();
                    A05.putParcelable("fetchMoreThreadsParams", fetchMoreThreadsParams);
                    2fD r03 = this.A08;
                    String A00 = 1BJ.A00(1306);
                    r03.A00(c4j, A00, "startFetchMoreThreadsOperation", "MessageRequestsLoader");
                    1IB A002 = 1Ho.A00(this.A06.newInstance_DEPRECATED(A00, A05, 0, CallerContext.A09(getClass(), "message_request")), true);
                    11T.A0A(A002);
                    2TV r04 = this.A02;
                    if (r04 == null) {
                        11T.A0L("callback");
                        throw 0Q8.createAndThrow();
                    }
                    r04.C4n(A002, c4j);
                    C1615Amw c1615Amw = new C1615Amw(6, this, threadsCollection, c4j);
                    this.A00 = new 2eS(c1615Amw, A002);
                    1Kd.A0F(c1615Amw, A002, this.A0A);
                    return;
                }
                r310 = this.A08;
                obj = "currentResult is null";
            } else {
                r310 = this.A08;
                obj = "alreadyLoadingMore";
            }
            r310.A00(c4j, obj, "returnFromLoadMoreMessageRequests", "MessageRequestsLoader");
        }
    }

    @Override // X.DIa
    public void AEC() {
        this.A08.A00((Object) null, (Object) null, "cancelLoad", "MessageRequestsLoader");
        2eS r0 = this.A01;
        if (r0 != null) {
            r0.A00(true);
            this.A01 = null;
        }
        2eS r02 = this.A00;
        if (r02 != null) {
            r02.A00(true);
            this.A00 = null;
        }
    }

    @Override // X.DIa
    public void BYt(boolean z) {
        A02(new C4J(this.A0D, 0S2.A01, false));
    }

    @Override // X.DIa
    public void BZ0(boolean z) {
        A02(new C4J(this.A0D, 0S2.A00, z));
    }

    @Override // X.DIa
    public void BZ1(boolean z, boolean z2) {
        1F9 r0;
        if (z2 && ((r0 = this.A0D) == 1F9.A0O || r0 == 1F9.A0V)) {
            A00(1He.A04, new C4J(r0, 0S2.A00, false));
        } else {
            A02(new C4J(this.A0D, 0S2.A00, z));
        }
    }

    public void CmR(2TV r302) {
        if (r302 == null) {
            throw 1BK.A0h();
        }
        this.A02 = r302;
    }

    public /* bridge */ /* synthetic */ void D1t(Object obj) {
        throw 0Q8.createAndThrow();
    }
}
