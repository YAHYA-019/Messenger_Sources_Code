package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: Fro.class */
public final class Fro implements C02l {
    public FIT A00;
    public Bj6 A01;

    @Override // X.C02l
    public void CFb(Context context, Intent intent, C01q c01q) {
        String str;
        int A00 = C09o.A00(310884998);
        boolean A1X = 1BL.A1X(context, intent);
        String stringExtra = intent.getStringExtra("shortcut_receiver_game_id");
        if (stringExtra != null) {
            07S A0J = 4YU.A0J(GraphQlCallInput.A02, stringExtra, "app_id");
            this.A01 = (Bj6) 1Bn.A0E(context, (1BY) null, 82744);
            FbSharedPreferences A0W = 1BL.A0W();
            this.A00 = (FIT) 1Hv.A02(context, 98368);
            FbUserSession A0E = 4YV.A0E(context);
            Bj6 bj6 = this.A01;
            if (bj6 == null) {
                str = "instantGamesAddedShortcutMutationHelper";
            } else {
                11T.A0F(A0E, 0);
                GraphQlQueryParamSet A0M = 7zL.A0M();
                4YV.A1A(A0J, A0M, "input");
                5Dh A002 = 5Dh.A00(A0M, new C01643sd(C2288Dj8.class, "InstantGamesAddedShortcutMutation", null, "input", "fbandroid", 156353441, 384, 1305406505L, 1305406505L, false, A1X));
                1Vd A0N = DKH.A0N(bj6.A00);
                DKH.A1H(A002);
                A0N.A08(A002, 5Dj.A01);
                1Ql.A01(A0W.edit(), 1G3.A00(EbH.A05, stringExtra), A1X);
                FIT fit = this.A00;
                if (fit == null) {
                    str = "quicksilverLogger";
                } else {
                    fit.A0C("shortcut_created");
                }
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
        C09o.A01(427597850, A00);
    }
}
