package X;

import android.content.Context;
import android.content.DialogInterface;
import com.facebook.auth.usersession.FbUserSession;
import java.util.Arrays;

/* loaded from: Hya.class */
public final class Hya {
    public JZj A00;
    public final 1Br A01 = AbG.A0a();
    public final JLm A02 = GpZ.A00(this, 36);

    public static final void A00(Context context, FbUserSession fbUserSession, Hya hya, Integer num, Object... objArr) {
        DR6 A02 = ((C5ic) 1Br.A0B(hya.A01)).A02(context);
        A02.A00(2131965275);
        A02.A0J(num != null ? context.getString(num.intValue(), Arrays.copyOf(objArr, objArr.length)) : null);
        A02.A0A((DialogInterface.OnClickListener) null);
        A02.A0H(new IGX(context, fbUserSession, hya, 0));
        JZj A04 = A02.A04();
        hya.A00 = A04;
        ((JOS) 1Lo.A04(context, fbUserSession, (1BY) null, 99475)).A60(hya.A02);
        A04.show();
    }
}
