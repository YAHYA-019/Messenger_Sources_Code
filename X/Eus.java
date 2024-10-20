package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: Eus.class */
public final class Eus {
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final F9o A04;

    public Eus(Context context) {
        11T.A0F(context, 1);
        this.A00 = context;
        this.A01 = 7zM.A0P();
        this.A03 = 1Bq.A00(32817);
        this.A02 = AbG.A0M();
        this.A04 = (F9o) 1Hv.A02(context, 99496);
    }

    public final void A00(Context context, FbUserSession fbUserSession, EKw eKw, String str, String str2, String str3, List list, List list2, Function1 function1, boolean z) {
        11T.A0F(fbUserSession, 0);
        11T.A0F(str2, 5);
        if (str == null) {
            7zN.A1a(function1, false);
            return;
        }
        Fw1 fw1 = new Fw1(5, function1, context, this);
        String valueOf = String.valueOf(eKw);
        GraphQlQueryParamSet A0M = 7zL.A0M();
        2Jd A0Q = DKC.A0Q();
        A0Q.A09("app_id", str);
        A0Q.A0A("selected_permissions", list);
        A0Q.A0A("requested_permissions", list2);
        A0Q.A09("selected_privacy_option", str2);
        A0Q.A09("tracking_preference", "INSTALL_FROM_FIRST_PARTY_SURFACE");
        A0Q.A09("selected_profile_type", String.valueOf(valueOf));
        A0Q.A09("gaming_user_name", str3);
        A0Q.A06("is_coplay", Boolean.valueOf(z));
        DKF.A1N(A0Q, A0M);
        DKF.A1R(A0M, this.A03);
        2Jf r0 = new 2Jf(DhX.class, (Class) null, "GamingLoginOpenWinbackExperienceDialogActionQuery", (String) null, "fbandroid", -2145185551, 0, 1146558804L, 1146558804L, false, true);
        DKF.A1Q(A0M, r0);
        C3sa A00 = C3sa.A00(r0);
        11T.A0D(A00);
        1Br.A0D(this.A01, fw1, 7zR.A0n(this.A00, A00));
    }
}
