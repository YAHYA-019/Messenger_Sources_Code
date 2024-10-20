package X;

import android.content.Context;
import android.widget.ProgressBar;

/* renamed from: X.2rs, reason: invalid class name */
/* loaded from: 2rs.class */
public final class C2rs extends C1rj {
    public C2rs() {
        super("IndeterminateProgress");
    }

    public static 36Z A00(1Iw r301) {
        C2rs c2rs = new C2rs();
        C1rs c1rs = new C1rs(c2rs, r301, 0, 0);
        ((36Z) c1rs).A01 = c2rs;
        ((36Z) c1rs).A00 = r301;
        return c1rs;
    }

    public Integer A0m() {
        return 0S2.A0C;
    }

    public Object A0n(Context context) {
        return new ProgressBar(context);
    }
}
