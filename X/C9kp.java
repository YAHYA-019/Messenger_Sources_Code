package X;

import android.view.ContextThemeWrapper;
import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.9kp, reason: invalid class name */
/* loaded from: 9kp.class */
public final class C9kp {
    public static final 2qR A00;

    static {
        2qQ A0o = 7zL.A0o();
        7zM.A1V(A0o, 2132607629);
        A00 = 7zQ.A0k(A0o, 2132607628);
    }

    public static final 8Ca A00(View view, MigColorScheme migColorScheme, int i) {
        11T.A0F(migColorScheme, 1);
        return new 8Ca(new ContextThemeWrapper(view.getContext(), 7zS.A02(A00, migColorScheme)), view, i);
    }

    public final 8Ca A01(View view, MigColorScheme migColorScheme) {
        11T.A0H(view, migColorScheme);
        8Ca A002 = A00(view, migColorScheme, 5);
        11T.A0I(A002, "null cannot be cast to non-null type androidx.appcompat.widget.PopupMenu");
        return A002;
    }
}
