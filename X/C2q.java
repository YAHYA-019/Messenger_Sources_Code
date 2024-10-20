package X;

import android.content.Context;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: C2q.class */
public final class C2q {
    public final Context A00;
    public final 1De A01;

    public C2q(1De r302) {
        this.A01 = r302;
        this.A00 = AbK.A0A(r302);
    }

    public final ListenableFuture A00(2Jd r302, ThreadKey threadKey) {
        07S A0J = 4YU.A0J(GraphQlCallInput.A02, 1BK.A0w(threadKey), "thread_fbid");
        A0J.A0H(r302.A03(), "thread_settings");
        GraphQlQueryParamSet A0M = 7zL.A0M();
        4YV.A1A(A0J, A0M, "input");
        return AbL.A0Z(7zM.A0K(this.A00), 5Dh.A00(A0M, new C01643sd(C1728Aqy.class, "ChangeGroupThreadSettings", null, "input", "fbandroid", -364780657, 96, 127757616L, 127757616L, false, true)), 303646520704038L);
    }
}
