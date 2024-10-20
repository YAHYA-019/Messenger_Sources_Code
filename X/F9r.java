package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: F9r.class */
public final class F9r {
    public 1BY A00;
    public final C00i A02 = AbH.A0F();
    public final Context A01 = 7zP.A0J();

    public F9r(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public static final F9r A00(1BO r301) {
        return new F9r(r301);
    }

    public void A01(FbUserSession fbUserSession, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, 1K9 r306, String str) {
        String str2 = str;
        GraphQlQueryParamSet A0M = 7zL.A0M();
        boolean A1W = DKE.A1W(A0M, "client_mutation_id", 1BK.A0t());
        A0M.A06("accounts_to_sync", immutableList);
        boolean A1T = AnonymousClass001.A1T(immutableList);
        A0M.A06("resources_to_sync", immutableList2);
        boolean A1T2 = AnonymousClass001.A1T(immutableList2);
        A0M.A06("source_of_truth_array", immutableList3);
        boolean A1T3 = AnonymousClass001.A1T(immutableList3);
        if (1JF.A0B(str)) {
            str2 = null;
        }
        A0M.A05("family_device_id", str2);
        Preconditions.checkArgument(A1W);
        Preconditions.checkArgument(A1T);
        Preconditions.checkArgument(A1T2);
        Preconditions.checkArgument(A1T3);
        1Kd.A0D(this.A02, new D4p(r306, this, 23), AbK.A0z(1VX.A07(this.A01, fbUserSession), 5Dh.A00(A0M, new C01643sd(Q7u.class, "FxImSyncResourcesMutation", null, null, "fbandroid", 58690835, 0, 1293597481L, 1293597481L, false, true)), 252356926025912L));
    }

    public void A02(FbUserSession fbUserSession, ImmutableList immutableList, 1K9 r304, String str) {
        GraphQlQueryParamSet A0M = 7zL.A0M();
        boolean A1W = DKE.A1W(A0M, "client_mutation_id", 1BK.A0t());
        boolean A1W2 = DKE.A1W(A0M, "identity_to_unsync", str);
        A0M.A06("resources_to_unsync", immutableList);
        boolean A1T = AnonymousClass001.A1T(immutableList);
        Preconditions.checkArgument(A1W);
        Preconditions.checkArgument(A1W2);
        Preconditions.checkArgument(A1T);
        ListenableFuture A0z = AbK.A0z(1VX.A07(this.A01, fbUserSession), 5Dh.A00(A0M, new C01643sd(Q7v.class, "FxImUnSyncResourcesMutation", null, null, "fbandroid", -439130305, 0, 967994645L, 967994645L, false, true)), 252356926025912L);
        1Kd.A0D(this.A02, new D4p(r304, this, 24), A0z);
    }

    public void A03(C3sa c3sa, 1K9 r303) {
        1Kd.A0D(this.A02, r303, AbK.A0I(this.A00).A09(c3sa));
    }
}
