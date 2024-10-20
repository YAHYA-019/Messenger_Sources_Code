package X;

import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: B0m.class */
public final class B0m extends C1rj {
    public static final 5Aw A05 = 5Aw.A02;
    public View.OnClickListener A00;
    public 5Aw A01;
    public MigColorScheme A02;
    public CharSequence A03;
    public boolean A04;

    public B0m() {
        super("MigFlatTertiaryButton");
        this.A04 = true;
        this.A01 = A05;
    }

    public static AwY A00(1Iw r301) {
        return new AwY(r301, new B0m());
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A02, Boolean.valueOf(this.A04), this.A01, this.A03};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        CharSequence charSequence = this.A03;
        MigColorScheme migColorScheme = this.A02;
        5Aw r0 = this.A01;
        boolean z = this.A04;
        View.OnClickListener onClickListener = this.A00;
        1BL.A1H(charSequence, migColorScheme, r0);
        return new C8di(onClickListener, r0, migColorScheme, 2KV.A05, charSequence, 16, 2132279312, 7zL.A03(), z);
    }
}
