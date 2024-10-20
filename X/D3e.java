package X;

import android.content.Context;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.secure.secrettypes.SecretString;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: D3e.class */
public final class D3e implements 2eF {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C5xN A01;
    public final /* synthetic */ Message A02;
    public final /* synthetic */ ThreadSummary A03;

    public D3e(Context context, C5xN c5xN, Message message, ThreadSummary threadSummary) {
        this.A01 = c5xN;
        this.A02 = message;
        this.A00 = context;
        this.A03 = threadSummary;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ ListenableFuture A8b(Object obj) {
        SecretString secretString;
        String str;
        ListenableFuture A0A;
        Number number = (Number) obj;
        ParticipantInfo participantInfo = this.A02.A0K;
        if (participantInfo == null || (secretString = participantInfo.A09) == null || (str = secretString.A00) == null) {
            return 1hM.A01;
        }
        C8N c8n = (C8N) this.A01.A04.get();
        Context context = this.A00;
        ThreadSummary threadSummary = this.A03;
        int A05 = 7zR.A05(number);
        BpO bpO = (BpO) c8n.A01.get();
        if (threadSummary.AoK().A01()) {
            return C3o5.A0J(new CjI(context, threadSummary));
        }
        ThreadKey A0f = AbF.A0f(threadSummary);
        if (5OA.A04(threadSummary)) {
            Cb2 cb2 = (Cb2) 1Br.A0B(bpO.A00);
            String A0w = 1BK.A0w(A0f);
            ImmutableList of = ImmutableList.of();
            1BY r0 = cb2.A00;
            1QB r02 = (1QB) 1Bn.A0E((Context) null, r0, 65841);
            GraphQlQueryParamSet A0M = 7zL.A0M();
            A0M.A05("thread_id", A0w);
            Preconditions.checkArgument(AnonymousClass001.A1T(A0w));
            C3sa A0L = 7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "GroupContextQuery", (String) null, "fbandroid", -1232541424, 0, 1159223622L, 1159223622L, false, true));
            SettableFuture A0j = 4YU.A0j();
            r02.A02(new DAQ(1Fw.A05(r0), A0L, cb2, threadSummary, of, A0j, str, A05));
            r02.A04("GroupContextQuery");
            r02.A03 = "GraphQL";
            ((1Qc) cb2.A02.get()).A03(r02.A01(), "None");
            A0A = A0j;
        } else {
            AbR A0J = AbJ.A0J(bpO.A01);
            ImmutableList of2 = ImmutableList.of();
            ImmutableList of3 = ImmutableList.of();
            Context A01 = FbInjector.A01();
            AbL.A0y(A0J);
            try {
                CjL cjL = new CjL(threadSummary, of2, of3, str, A05);
                1Bn.A0K();
                FbInjector.A04(A01);
                11T.A0I(cjL, "null cannot be cast to non-null type com.facebook.messaging.contextbanner.model.ContextItems");
                A0A = 1Kd.A0A(cjL);
            } catch (Throwable th) {
                1Bn.A0K();
                FbInjector.A04(A01);
                throw th;
            }
        }
        11T.A0D(A0A);
        return A0A;
    }
}
