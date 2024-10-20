package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.UserKey;
import kotlin.jvm.functions.Function1;

/* renamed from: X.9iD, reason: invalid class name */
/* loaded from: 9iD.class */
public final class C9iD {
    public C8t A00;
    public final Context A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 2ZG A07;
    public final 06Z A08;

    public C9iD(Context context, 06Z r303, 2ZG r304) {
        1BL.A1H(context, r303, r304);
        this.A01 = context;
        this.A08 = r303;
        this.A07 = r304;
        this.A05 = 7zN.A0H(context);
        this.A03 = 7zM.A0R();
        this.A06 = 7zM.A0O();
        this.A04 = 1Bu.A00(68383);
        this.A02 = 1Bu.A01(context, 68473);
    }

    public static final void A00(FbUserSession fbUserSession, C9iD c9iD, UserKey userKey, Function1 function1) {
        4iI r0 = (4iI) 1Br.A0B(c9iD.A05);
        11T.A0F(userKey, 0);
        ThreadKey A00 = 4iI.A00(r0, userKey);
        if (A00 == null) {
            throw 1BK.A0h();
        }
        Context context = c9iD.A01;
        ((AnonymousClass472) 1Bu.A06(context, 67579)).A00(userKey).A02(new 9uV(0, c9iD, fbUserSession, userKey, 1Bu.A01(context, 82461), function1, A00));
    }

    public final void A01(final FbUserSession fbUserSession, final 85T r303, MigColorScheme migColorScheme, final C00m c00m) {
        11T.A0F(fbUserSession, 0);
        DG3 dg3 = new DG3() { // from class: X.9xq
            @Override // X.DG3
            public final void CAG(DJd dJd) {
                C9iD c9iD = this;
                2ZG r0 = c9iD.A07;
                85T r02 = r303;
                r0.A01(r02);
                c9iD.A02(fbUserSession, r02.A06);
                C8t c8t = c9iD.A00;
                if (c8t != null) {
                    c8t.A00();
                }
                c9iD.A00 = null;
                c00m.invoke();
            }
        };
        06Z r0 = this.A08;
        Bwz A00 = 9DO.A00(r0);
        A00.A03 = migColorScheme;
        A00.A04 = 7zN.A0e(new C9xn(C1u3.A3E, 1BK.A0u(this.A01, 2131963187), 60));
        A00.A02 = dg3;
        C8t c8t = new C8t(A00);
        this.A00 = c8t;
        c8t.A02();
        r0.A0t();
        C8t c8t2 = this.A00;
        if (c8t2 != null) {
            c8t2.A01();
        }
    }

    public final void A02(FbUserSession fbUserSession, String str) {
        boolean A1X = 1BL.A1X(fbUserSession, str);
        07S A0J = 4YU.A0J(GraphQlCallInput.A02, str, "people_you_may_know_id");
        GraphQlQueryParamSet A0N = 4YU.A0N(A0J, "PYMK_MESSENGER_INBOX", "people_you_may_know_location");
        4YV.A1A(A0J, A0N, "input");
        1FV A0n = 7zR.A0n(this.A01, 5Dh.A00(A0N, new C01643sd(8Ig.class, "MsgrPeopleYouMayKnowBlacklistCoreMutation", null, "input", "fbandroid", -792942076, 384, 3844547545L, 3844547545L, false, A1X)));
        1Br.A0D(this.A03, new ABi(0), A0n);
    }

    public final void A03(FbUserSession fbUserSession, String str, int i) {
        11T.A0F(fbUserSession, 0);
        ((C9cm) 1Br.A0B(this.A02)).A01(fbUserSession, A1D.A00, i, Long.parseLong(str));
    }

    public final void A04(FbUserSession fbUserSession, String str, int i) {
        11T.A0F(fbUserSession, 0);
        ((C9cm) 1Br.A0B(this.A02)).A03(fbUserSession, A1E.A00, i, Long.parseLong(str));
    }

    public final void A05(String str) {
        11T.A0F(str, 0);
        UserKey A0X = 1BK.A0X(str);
        11T.A0D(A0X);
        A00(null, this, A0X, AVJ.A01(this, 35));
    }
}
