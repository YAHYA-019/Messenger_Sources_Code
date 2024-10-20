package X;

import android.content.Context;
import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: C3H.class */
public final class C3H {
    public final 1Br A00;
    public final 1De A01;

    public C3H(1De r302) {
        this.A01 = r302;
        this.A00 = 7zM.A0h(r302, 67784);
    }

    public final void A00(Context context, View view, MigColorScheme migColorScheme) {
        7zT.A1S(view, context, migColorScheme);
        6LF r0 = (6LF) 1Br.A0B(this.A00);
        CharSequence text = context.getText(2131957007);
        11T.A0A(text);
        r0.A02(view, migColorScheme, text);
        view.announceForAccessibility(context.getText(2131957007));
    }
}
