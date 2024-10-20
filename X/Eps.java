package X;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* loaded from: Eps.class */
public final class Eps {
    public final Context A00;
    public final FAB A01;
    public final C9i8 A02;
    public final Function1 A03;
    public final 0Xs A04;
    public final C15t A05;

    public Eps(Context context, FAB fab, Function1 function1) {
        this.A00 = context;
        this.A01 = fab;
        this.A03 = function1;
        Integer num = fab.A09 ? 0S2.A00 : 0S2.A0C;
        String string = context.getString(2131960218);
        C9i6 c9i6 = new C9i6(C97h.A0G, null, C97i.A0X, null, 0S2.A00, "Close Bottom Sheet", GBr.A01(this, 35));
        11T.A0D(string);
        C9i8 c9i8 = new C9i8(null, null, null, c9i6, string, null, 0S2.A07, num, 7zQ.A0A(), true, false, true);
        this.A02 = c9i8;
        0Ro r0 = new 0Ro(c9i8);
        this.A04 = r0;
        this.A05 = new 0Xr((C2a2) null, r0);
    }
}
