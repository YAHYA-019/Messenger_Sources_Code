package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.jvm.functions.Function1;

/* loaded from: C4k.class */
public final class C4k {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final C61J A03;

    public C4k(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A01 = fbUserSession;
        this.A00 = FbInjector.A00();
        this.A02 = 7zM.A0O();
        this.A03 = (C61J) 1Lo.A08(fbUserSession, 66275);
    }

    public final void A00(ThreadKey threadKey, String str, Function1 function1) {
        C61J c61j = this.A03;
        c61j.A02.put(str, 61K.A04);
        ((1Uv) 1Br.A0B(c61j.A01)).A0A(c61j.A00, threadKey, "PendingPinMessageV2Cache");
        07S A0J = 4YU.A0J(GraphQlCallInput.A02, 1BK.A0w(threadKey), "thread_id");
        07S.A00(A0J, str, "message_id");
        AbstractC05414dq A04 = 1VX.A04(this.A00, this.A01);
        GraphQlQueryParamSet A0M = 7zL.A0M();
        4YV.A1A(A0J, A0M, "input");
        ListenableFuture A0z = AbK.A0z(A04, 5Dh.A00(A0M, new C01643sd(Q8Y.class, "MessengerUnpinMessage", null, "input", "fbandroid", 1922237125, 128, 882308925L, 882308925L, false, true)), 415192073395620L);
        1Br.A0D(this.A02, new AC5(threadKey, this, function1, str, 2), A0z);
    }
}
