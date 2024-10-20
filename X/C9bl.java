package X;

import android.content.Context;
import androidx.lifecycle.LiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.xapp.messaging.publicchats.prompt.model.PromptArgs;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.9bl, reason: invalid class name */
/* loaded from: 9bl.class */
public final class C9bl {
    public LiveData A00;
    public PromptArgs A01;
    public final 1Br A02;
    public final 9cG A03;

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.9cG] */
    public C9bl(Context context) {
        11T.A0F(context, 1);
        this.A02 = 1HG.A00(context, 68123);
        this.A03 = new Object();
    }

    public final void A00(FbUserSession fbUserSession, String str) {
        PromptArgs promptArgs = this.A01;
        if (promptArgs == null) {
            11T.A0L("promptArgs");
            throw 0Q8.createAndThrow();
        }
        String str2 = promptArgs.A03;
        9Rn r0 = (9Rn) 1Br.A0B(this.A02);
        11T.A0F(str2, 0);
        GraphQlQueryParamSet A0M = 7zL.A0M();
        4YV.A1A(4YU.A0J(GraphQlCallInput.A02, str, "submission_id"), A0M, "input");
        ListenableFuture A06 = 1VX.A04(r0.A00, fbUserSession).A06(5Dh.A00(A0M, new C01643sd(8Iw.class, "DeleteResponseMutation", null, null, "fbandroid", 1573239929, 0, 2461061009L, 2461061009L, false, true)));
        1Br.A0D(r0.A01, new AC6(r0, fbUserSession, str2, 8), A06);
    }

    public final void A01(FbUserSession fbUserSession, String str, String str2) {
        String str3 = str2;
        11T.A0F(str, 0);
        PromptArgs promptArgs = this.A01;
        if (promptArgs == null) {
            11T.A0L("promptArgs");
            throw 0Q8.createAndThrow();
        }
        String str4 = promptArgs.A03;
        9Rn r0 = (9Rn) 1Br.A0B(this.A02);
        11T.A0F(str4, 0);
        GraphQlQueryParamSet A0M = 7zL.A0M();
        07S A0J = 4YU.A0J(GraphQlCallInput.A02, str, "submission_id");
        if (str2 == null) {
            str3 = "";
        }
        07S.A00(A0J, str3, "reaction");
        4YV.A1A(A0J, A0M, "data");
        ListenableFuture A06 = 1VX.A04(r0.A00, fbUserSession).A06(5Dh.A00(A0M, new C01643sd(8Ix.class, "MessengerBroadcastChannelPromptSubmissionUpdateReactionMutation", null, null, "fbandroid", -815772663, 0, 3748361909L, 3748361909L, false, true)));
        1Br.A0D(r0.A01, new AC6(r0, fbUserSession, str4, 9), A06);
    }
}
