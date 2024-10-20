package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;

/* loaded from: Ftu.class */
public final class Ftu implements GGj {
    public final EmY A00;

    public Ftu(EmY emY) {
        this.A00 = emY;
    }

    @Override // X.GGj
    public /* bridge */ /* synthetic */ void BhS(3oI r302, Object obj) {
        if (obj instanceof EEN) {
            EmY emY = this.A00;
            FbUserSession A05 = 1Fw.A05(emY.A00);
            C00i c00i = emY.A02;
            ETV A08 = AbM.A0n(c00i).A08(A05, 4YT.A00(1152));
            if (A08 != null) {
                Eod eod = (Eod) emY.A01.get();
                int A052 = AbM.A0n(c00i).A05();
                String str = A08.A02;
                Eww eww = (Eww) eod.A03.get();
                long j = A052;
                1UG A082 = 1BK.A08(1BK.A07(eww.A00), "fos_headwind_side_effects_start");
                if (A082.isSampled()) {
                    DKD.A1D(A082, j);
                    A082.A7R("extra", (String) null);
                    A082.BZL();
                }
                String A0z = AbJ.A0z(eod.A04);
                07S A0J = 4YU.A0J(GraphQlCallInput.A02, str, "encrypted_subno");
                GraphQlQueryParamSet A0N = 4YU.A0N(A0J, A0z, 4YT.A00(1226));
                4YV.A1A(A0J, A0N, "data");
                1Kd.A0D(eod.A01, new Fvv(A052, 1, eod), AbK.A0J(eod.A02).A08(5Dh.A00(A0N, new C01643sd(Q7W.class, "ZeroHeadersServerSideEffectsMutaton", null, "data", "fbandroid", 557988639, 96, 444926010L, 444926010L, false, true)), 5Dj.A01));
            }
        }
    }
}
