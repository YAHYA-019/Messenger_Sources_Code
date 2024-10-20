package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.query.GraphQlQueryParamSet;

/* loaded from: D9c.class */
public final class D9c implements Runnable {
    public static final String __redex_internal_original_name = "CarrierSignalConfigFetcher$2";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ 4jE A01;
    public final /* synthetic */ Bo3 A02;

    public D9c(FbUserSession fbUserSession, 4jE r303, Bo3 bo3) {
        this.A02 = bo3;
        this.A00 = fbUserSession;
        this.A01 = r303;
    }

    @Override // java.lang.Runnable
    public void run() {
        Bo3 bo3 = this.A02;
        Context A04 = AbF.A04(bo3.A00);
        GraphQlQueryParamSet A0M = 7zL.A0M();
        2Jf r0 = new 2Jf(2JX.class, (Class) null, "FetchCarrierSignalConfigV2GraphQL", (String) null, "fbandroid", 1836759423, 0, 4120031868L, 4120031868L, false, true);
        r0.A00 = A0M;
        C3sa A0L = AbK.A0L(r0);
        A0L.A0B = false;
        1Vd A0K = 7zM.A0K(A04);
        4YU.A1J(A0L, 453586272481763L);
        1FV A09 = A0K.A09(A0L);
        1Kd.A0D(bo3.A01, new C1614Amv(this.A01, bo3, 22), A09);
    }
}
