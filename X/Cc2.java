package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.inject.FbInjector;

/* loaded from: Cc2.class */
public final class Cc2 implements 2SQ {
    public 2eS A00;
    public 2TV A01;
    public final 1Br A02;
    public final 1Br A03;
    public final CEe A04;
    public final Context A05;
    public final FbUserSession A06;

    public Cc2(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A05 = context;
        this.A06 = fbUserSession;
        1Br A01 = 1Bu.A01(context, 456);
        this.A02 = A01;
        AbR A0J = AbJ.A0J(A01);
        Context A012 = FbInjector.A01();
        AbL.A0y(A0J);
        try {
            CEe cEe = new CEe(A0J, fbUserSession);
            1Bn.A0K();
            FbInjector.A04(A012);
            this.A04 = cEe;
            this.A03 = 7zM.A0O();
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A012);
            throw th;
        }
    }

    public void A00(Bux bux) {
        if (this.A01 != null) {
            CEe cEe = this.A04;
            String str = bux.A02;
            String str2 = bux.A03;
            int i = bux.A00;
            String str3 = bux.A01;
            07S A0J = 4YU.A0J(GraphQlCallInput.A02, str, "query");
            07S.A00(A0J, str2, "thread_fbid");
            C30G A0H = AbF.A0H(84);
            4YV.A1A(A0J, ((2Jf) A0H).A00, "query_params");
            A0H.A06("messages_limit", i);
            A0H.A03(4YT.A00(332), str3);
            C3sa A0L = AbK.A0L(A0H);
            A0L.A0B = false;
            1Vd A0J2 = AbK.A0J(cEe.A02);
            4YU.A1J(A0L, 2971616476299527L);
            1FV A09 = A0J2.A09(A0L);
            2FT A0t = AbJ.A0t(cEe.A01, new D2r(cEe, str2, 0), A09);
            2TV r0 = this.A01;
            if (r0 != null) {
                r0.C4n(A0t, bux);
            }
            C1614Amv c1614Amv = new C1614Amv(this, bux, 16);
            this.A00 = new 2eS(c1614Amv, A0t);
            1Br.A0D(this.A03, c1614Amv, A0t);
        }
    }

    public void AEC() {
        2eS r0 = this.A00;
        if (r0 != null) {
            r0.A00(true);
        }
    }

    public void CmR(2TV r302) {
        this.A01 = r302;
    }

    public /* bridge */ /* synthetic */ void D1t(Object obj) {
        throw 0Q8.createAndThrow();
    }
}
