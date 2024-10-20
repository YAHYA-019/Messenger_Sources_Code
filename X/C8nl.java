package X;

import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8nl, reason: invalid class name */
/* loaded from: 8nl.class */
public final class C8nl extends C1rj {
    public static final 5Aw A05 = 5Aw.A02;
    public View.OnClickListener A00;
    public 5Aw A01;
    public MigColorScheme A02;
    public CharSequence A03;
    public boolean A04;

    public C8nl() {
        super("MigFlatPrimaryButton");
        this.A04 = true;
        this.A01 = A05;
    }

    public static 8TX A00(1Iw r301) {
        return new 8TX(r301, new C8nl());
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
        return new C8di(onClickListener, r0, migColorScheme, 2KV.A06, charSequence, 10, 2132279321, 7zL.A03(), z);
    }
}
