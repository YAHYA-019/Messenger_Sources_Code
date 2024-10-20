package X;

import android.content.Context;
import com.facebook.user.model.User;

/* loaded from: Hdw.class */
public final class Hdw {
    public int A00;
    public final 1Br A01;
    public final String A02;

    public Hdw(Context context, User user, int i) {
        this.A00 = i;
        this.A01 = 1HG.A00(context, 99435);
        String A0v = 1BK.A0v(context, user.A0X.A02(), this.A00 == 0 ? 2131957610 : 2131967564);
        11T.A0D(A0v);
        this.A02 = A0v;
    }
}
