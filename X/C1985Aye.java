package X;

import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Aye, reason: case insensitive filesystem */
/* loaded from: Aye.class */
public final class C1985Aye extends C1rj {
    public View.OnClickListener A00;
    public MigColorScheme A01;
    public C5xv A02;
    public String A03;
    public boolean A04;

    public C1985Aye() {
        super("MessageSearchM4SearchToolbar");
    }

    public final Object[] A0k() {
        return new Object[]{Boolean.valueOf(this.A04), this.A01, this.A00, this.A03, this.A02};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C5z2 c5z2;
        String str = this.A03;
        boolean z = this.A04;
        MigColorScheme migColorScheme = this.A01;
        C5xv c5xv = this.A02;
        View.OnClickListener onClickListener = this.A00;
        C5yw A0b = 7zN.A0b(r302, false);
        A0b.A2b(migColorScheme);
        A0b.A2f(str);
        A0b.A2d(c5xv);
        if (z) {
            String A0D = r302.A0D(2131965533);
            C9lC A00 = C9lC.A00();
            11T.A0F(migColorScheme, 0);
            A00.A01 = migColorScheme;
            A00.A04(A0D);
            A00.A02 = 7zN.A0u(r302, A0D, 2131965504);
            c5z2 = Cx1.A00(A00, onClickListener, 39);
        } else {
            c5z2 = null;
        }
        A0b.A2e(c5z2);
        return A0b.A2V();
    }
}
