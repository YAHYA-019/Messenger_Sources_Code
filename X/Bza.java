package X;

import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: Bza.class */
public final class Bza {
    public final void A00(Context context, View view, FbUserSession fbUserSession, 1F9 r305, MigColorScheme migColorScheme, long j) {
        11T.A0F(migColorScheme, 3);
        if (view != null) {
            ((6LF) 1Bn.A0E(context, (1BY) null, 67784)).A00((View.OnClickListener) null, view, (View) null, migColorScheme, (KT3) null, 1BK.A0u(context, 2131960485), (CharSequence) null, -1, 1);
        }
        1Br A00 = 1Lm.A00(context, fbUserSession, 67412);
        Integer A01 = r305.A01();
        if (A01 != null) {
            int intValue = A01.intValue();
            MailboxFeature A0d = 7zP.A0d(A00);
            long j2 = intValue;
            1Um AQV = A0d.mMailboxApiHandleMetaProvider.AQV(0);
            MailboxFutureImpl A0P = 1BK.A0P(AQV);
            1Um.A02(AQV, new A1W(1, j2, j, A0d, A0P), A0P, false);
        }
    }
}
