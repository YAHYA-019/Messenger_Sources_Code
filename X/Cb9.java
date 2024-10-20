package X;

import com.facebook.common.callercontext.CallerContextable;
import java.util.concurrent.Executor;

/* loaded from: Cb9.class */
public final class Cb9 implements CallerContextable {
    public static final String __redex_internal_original_name = "FilteredAudienceFetcherHelper";
    public 1BY A00;
    public final C00i A02 = 1BV.A01((1BY) null, 83719);
    public final Executor A03 = AbJ.A1E();
    public final C00i A01 = 1BV.A01((1BY) null, 84192);

    public Cb9(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public 2eH A00(DGy dGy, String str, long j) {
        C30G AKr = dGy.AKr(str, j);
        ((C0h) this.A01.get()).A00(AKr);
        C3sa A00 = C3sa.A00(AKr);
        A00.A01 = AbH.A0B(this);
        ((C3sb) A00).A03 = 0L;
        A00.A0B = false;
        4YU.A1J(A00, 353464328990974L);
        1Vd A0J = AbK.A0J(this.A02);
        4YU.A1J(A00, 353464328990974L);
        return 2FP.A00(new D3d(dGy, this, 0), AeR.A00(A0J, A00), this.A03);
    }
}
