package X;

import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;

/* loaded from: C4c.class */
public final class C4c {
    public LithoView A00;
    public 4LS A01;
    public MigColorScheme A02;
    public C5xv A03;

    public final void A00(2O4 r302, List list, boolean z) {
        String str;
        11T.A0F(r302, 0);
        MigColorScheme migColorScheme = this.A02;
        if (migColorScheme == null) {
            str = "colorScheme";
        } else {
            C5xv c5xv = this.A03;
            if (c5xv == null) {
                str = "migOnUpListener";
            } else {
                4LS r0 = this.A01;
                if (r0 == null) {
                    str = "searchEditTextHandler";
                } else {
                    1LI qhl = new QHL(r302, r0, migColorScheme, c5xv, list, z);
                    LithoView lithoView = this.A00;
                    if (lithoView != null) {
                        lithoView.A0y(qhl);
                        return;
                    }
                    str = "lithoView";
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
