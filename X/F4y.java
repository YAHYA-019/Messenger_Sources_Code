package X;

import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: F4y.class */
public final class F4y {
    public C2120DeZ A00;
    public final 1Br A01 = 7zM.A0U();

    public static final void A00(Drawable drawable, MenuItem.OnMenuItemClickListener onMenuItemClickListener, MigColorScheme migColorScheme, C2128Deh c2128Deh, int i) {
        GEa gEa;
        GEa gEa2;
        MenuItem A0J = c2128Deh.A0J(i);
        ((FXN) A0J).A00 = drawable;
        Menu menu = ((FXN) A0J).A02;
        boolean z = menu instanceof GEa;
        if (z && (gEa2 = (GEa) menu) != null) {
            gEa2.C2U(A0J);
        }
        ((FXN) A0J).A01 = C2cn.A02(C0A8.A00(((DSk) c2128Deh).A03, 32.0f) / 2, migColorScheme.B9I());
        if (z && (gEa = (GEa) menu) != null) {
            gEa.C2U(A0J);
        }
        ((FXN) A0J).A03 = onMenuItemClickListener;
    }
}
