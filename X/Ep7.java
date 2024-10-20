package X;

import android.content.Context;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.base.Functions$IdentityFunction;
import java.lang.reflect.InvocationTargetException;

/* loaded from: Ep7.class */
public final class Ep7 {
    public final KmA A00;
    public final EpP A01;
    public final GKx A02;
    public final GIz A03;
    public final GIz A04;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v52, types: [X.Ffe, X.GEs] */
    public Ep7(EVP evp, ESp eSp, KmA kmA, EpP epP, GKx gKx) {
        7zT.A1W(kmA, epP, gKx, eSp);
        11T.A0F(evp, 5);
        this.A00 = kmA;
        this.A01 = epP;
        this.A02 = gKx;
        Context A04 = AbF.A04(eSp.A00);
        GraphQlQueryParamSet A0M = 7zL.A0M();
        2Jf r0 = new 2Jf(Q7L.class, QQe.class, "FBFBPayShareableContactInfoQuery", (String) null, "fbandroid", 979952279, 0, 1350803309L, 1350803309L, false, true);
        r0.A00 = A0M;
        C3sa A0L = AbK.A0L(r0);
        A0L.A0B = false;
        4YU.A1J(A0L, 741980206327483L);
        DKG.A1D(A04);
        this.A04 = EYK.A00(S4s.A00((0R3) null, 2FP.A01(new Ley(eSp, 2), AeR.A01(7zR.A0n(A04, A0L)))), new GBn(this, 16));
        ?? r02 = 0;
        try {
            r02 = (Ffe) DKH.A0k((Object) null, F0s.class, "create");
            r02.A01.A05("payment_type", "FBPAY_HUB");
            r02.A02 = true;
            this.A03 = EYK.A00(EH9.A00((0R3) null, C06014fk.A0F().A00.A01, r02.ACe(), new FvR(14), Functions$IdentityFunction.INSTANCE), M6e.A00);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            throw AnonymousClass001.A0U(r02);
        }
    }
}
