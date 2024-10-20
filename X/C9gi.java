package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import kotlin.jvm.functions.Function1;

/* renamed from: X.9gi, reason: invalid class name */
/* loaded from: 9gi.class */
public final class C9gi {
    public static final void A00(Context context, FbUserSession fbUserSession, Function1 function1, long j) {
        if (((C1gs) 1Bn.A0E(context, (1BY) null, 66804)).A02()) {
            function1.invoke(null);
        } else {
            AC8.A03(((CNa) 1Bn.A0E(context, (1BY) null, 82461)).A03(fbUserSession, 7zN.A0d(new 1Kh(), String.valueOf(j)), false), function1, 7zQ.A15(), 27);
        }
    }

    public final void A01(Context context, FbUserSession fbUserSession, Integer num, Function1 function1, long j) {
        11T.A0H(context, fbUserSession);
        1Br A0H = 7zN.A0H(context);
        if (num == null || num.intValue() != 2) {
            A00(context, fbUserSession, new ARA(3, j, function1, A0H), j);
        } else {
            1Br.A0C(A0H);
            function1.invoke(ThreadKey.A08(j));
        }
    }
}
