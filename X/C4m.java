package X;

import android.R;
import android.content.Context;
import com.facebook.inject.FbInjector;

/* loaded from: C4m.class */
public final class C4m {
    public 1BY A00;
    public final C00i A02 = 1BV.A01((1BY) null, 68463);
    public final C10904ux A03 = (C10904ux) 1Bn.A0E((Context) null, (1BY) null, 49358);
    public final C00i A01 = FbInjector.A00;

    public C4m(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public void A00(String str, String str2) {
        C10904ux c10904ux = this.A03;
        C00i c00i = this.A01;
        C10914uy A00 = c10904ux.A00(1BK.A04(c00i), null, null, 50001);
        A00.A0L(1BK.A0v(1BK.A04(c00i), str, 2131964838));
        A00.A0K(1BK.A0v(1BK.A04(c00i), str2, 2131964837));
        A00.A0B(R.drawable.ic_menu_upload);
        A00.A0N(true);
        ((4aO) this.A02.get()).A02(50001, A00.A07());
    }
}
