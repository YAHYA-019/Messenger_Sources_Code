package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import java.util.concurrent.Callable;

/* loaded from: G6p.class */
public final class G6p implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    public G6p(Object obj, Object obj2, String str, String str2, int i) {
        this.A00 = i;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        GraphQlQueryParamSet A0N;
        String str;
        Class cls;
        int i;
        long j;
        boolean z;
        int i2;
        String str2;
        switch (this.A00) {
            case 0:
                GraphQlQueryParamSet A0M = 7zL.A0M();
                A0M.A05("context_id", this.A03);
                A0M.A05("game_id", this.A04);
                2Jf r0 = new 2Jf(C2257Did.class, (Class) null, "InstantGameContextPlayersQuery", (String) null, "fbandroid", 956602939, 0, 2323475676L, 2323475676L, false, true);
                r0.A00 = A0M;
                C3sa A0O = DKH.A0O(r0);
                1Vd A0N2 = DKH.A0N(((Em7) this.A02).A00);
                DKH.A1H(A0O);
                return A0N2.A09(A0O);
            case 1:
                07S A0J = 4YU.A0J(GraphQlCallInput.A02, this.A04, "matching_key");
                A0N = 4YU.A0N(A0J, this.A03, "game");
                str = "input";
                4YV.A1A(A0J, A0N, str);
                cls = C2263Dij.class;
                i = -2027618505;
                j = 431442734;
                z = true;
                i2 = 384;
                str2 = "InstantGameMatchPlayerJoinQueueMutation";
                5Dh A00 = 5Dh.A00(A0N, new C01643sd(cls, str2, null, str, "fbandroid", i, i2, j, j, false, z));
                1Vd A0N3 = DKH.A0N(((F5C) this.A02).A00);
                DKH.A1H(A00);
                return A0N3.A08(A00, 5Dj.A01);
            default:
                07S A0J2 = 4YU.A0J(GraphQlCallInput.A02, this.A04, "match_tag");
                A0N = 4YU.A0N(A0J2, this.A03, "app_id");
                str = "input";
                4YV.A1A(A0J2, A0N, str);
                cls = Dkf.class;
                i = 698896094;
                j = 784449737;
                z = true;
                i2 = 384;
                str2 = "InstantGameMatchPlayerOfflineMutation";
                5Dh A002 = 5Dh.A00(A0N, new C01643sd(cls, str2, null, str, "fbandroid", i, i2, j, j, false, z));
                1Vd A0N32 = DKH.A0N(((F5C) this.A02).A00);
                DKH.A1H(A002);
                return A0N32.A08(A002, 5Dj.A01);
        }
    }
}
