package X;

import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8nm, reason: invalid class name */
/* loaded from: 8nm.class */
public final class C8nm extends C1rj {
    public static final 5Aw A05 = 5Aw.A02;
    public View.OnClickListener A00;
    public 5Aw A01;
    public MigColorScheme A02;
    public CharSequence A03;
    public boolean A04;

    public C8nm() {
        super("MigFlatSecondaryButton");
        this.A04 = true;
        this.A01 = A05;
    }

    public static 8TU A00(1Iw r301) {
        return new 8TU(r301, new C8nm());
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A02, Boolean.valueOf(this.A04), this.A01, this.A03};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        CharSequence charSequence = this.A03;
        MigColorScheme migColorScheme = this.A02;
        boolean z = this.A04;
        5Aw r0 = this.A01;
        View.OnClickListener onClickListener = this.A00;
        7zT.A1T(charSequence, migColorScheme, r0);
        return new C8di(onClickListener, r0, migColorScheme, 2KV.A06, charSequence, 10, 2132279321, 7zL.A03(), z);
    }
}
