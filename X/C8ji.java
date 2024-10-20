package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8ji, reason: invalid class name */
/* loaded from: 8ji.class */
public final class C8ji extends C1rj {
    public Drawable A00;
    public View.OnClickListener A01;
    public MigColorScheme A02;
    public CharSequence A03;
    public boolean A04;

    public C8ji() {
        super("MigAccelerator");
        this.A04 = true;
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A02, Boolean.valueOf(this.A04), this.A00, this.A03};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        int Ahv;
        CharSequence charSequence = this.A03;
        MigColorScheme migColorScheme = this.A02;
        boolean z = this.A04;
        Drawable drawable = this.A00;
        View.OnClickListener onClickListener = this.A01;
        11T.A0F(r302, 0);
        1BL.A1F(charSequence, migColorScheme);
        int A00 = C0A8.A00(7zL.A0A(r302), 18.0f);
        C5Ax A002 = 5Av.A00(r302);
        5Av r0 = A002.A01;
        r0.A00 = A00;
        A002.A2Z(36.0f);
        7zR.A1G(A002, 2RH.A03, charSequence);
        7zR.A1H(A002, 2KV.A07, false);
        r0.A0C = drawable;
        A002.A2b(24.0f);
        r0.A01 = 2132279309;
        r0.A0O = false;
        A002.A2j(z);
        r0.A0E = onClickListener;
        float f = A00;
        if (z) {
            RippleDrawable A0C = 7zR.A0C(migColorScheme, f);
            11T.A0A(A0C);
            A002.A2f(A0C);
            Ahv = migColorScheme.B4i();
        } else {
            A002.A2f(C2cn.A02(f, migColorScheme.Aht()));
            Ahv = migColorScheme.Ahv();
        }
        return 7zM.A0x(A002, Ahv);
    }
}
