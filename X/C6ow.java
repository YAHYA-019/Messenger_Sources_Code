package X;

import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.6ow, reason: invalid class name */
/* loaded from: 6ow.class */
public final class C6ow {
    public C2120DeZ A00;
    public final C00i A01 = new 1BQ(16839);

    public static void A00(MenuItem.OnMenuItemClickListener onMenuItemClickListener, 2MQ r302, C6ow c6ow, MigColorScheme migColorScheme, C2128Deh c2128Deh, int i) {
        GEa gEa;
        GEa gEa2;
        Drawable A06 = ((C1u2) c6ow.A01.get()).A06(r302, 2Re.A02, migColorScheme.B4h());
        MenuItem A0J = c2128Deh.A0J(i);
        ((FXN) A0J).A00 = A06;
        Menu menu = ((FXN) A0J).A02;
        boolean z = menu instanceof GEa;
        if (z && (gEa2 = (GEa) menu) != null) {
            gEa2.C2U(A0J);
        }
        ((FXN) A0J).A01 = C2cn.A02(C0A8.A00(((DSk) c2128Deh).A03, 32.0f) / 2.0f, migColorScheme.B9I());
        if (z && (gEa = (GEa) menu) != null) {
            gEa.C2U(A0J);
        }
        ((FXN) A0J).A03 = onMenuItemClickListener;
    }
}
