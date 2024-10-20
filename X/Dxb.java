package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Dxb.class */
public final class Dxb extends C1rj {
    public View.OnClickListener A00;
    public MigColorScheme A01;
    public String A02;
    public boolean A03;
    public boolean A04;

    public Dxb() {
        super("MigListSwitch");
        this.A03 = true;
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A01, Boolean.valueOf(this.A03), Boolean.valueOf(this.A04), this.A02};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        boolean z = this.A04;
        String str = this.A02;
        MigColorScheme migColorScheme = this.A01;
        boolean z2 = this.A03;
        View.OnClickListener onClickListener = this.A00;
        float f = 0.45f;
        if (z2) {
            f = 1.0f;
        }
        C1rq A01 = C1rg.A01(r302, null, 0);
        A01.A0l(26.0f);
        C1rq A012 = C1rg.A01(r302, null, 0);
        A012.A16(1.0f);
        Context context = r302.A0D;
        Drawable mutate = context.getDrawable(2132346765).mutate();
        int BGl = migColorScheme.BGl();
        int BGk = migColorScheme.BGk();
        if (!z) {
            BGl = BGk;
        }
        mutate.setTint(BGl);
        A012.A0D(mutate);
        A012.A0s(33.0f);
        A012.A0r(14.0f);
        A012.A0B(0.45f);
        A01.A2f(A012.A00);
        C2cq A00 = C2cp.A00(r302, 0);
        Drawable mutate2 = context.getDrawable(2132346764).mutate();
        if (z || 0AT.A02(migColorScheme.BDl())) {
            int BFY = migColorScheme.BFY();
            int BFX = migColorScheme.BFX();
            if (!z) {
                BFY = BFX;
            }
            mutate2.setTint(BFY);
        }
        A00.A2a(mutate2);
        A00.A0z(26.0f);
        A00.A0l(26.0f);
        A00.A0c();
        A00.A27(z ? C26z.END : C26z.START, -3.0f);
        A00.A1F(0.0f);
        A00.A2L(str);
        A00.A0d();
        A01.A2f(A00.A2W());
        A01.A0B(f);
        A01.A2T(onClickListener != null ? 1LI.A09(r302, Dxb.class, "MigListSwitch", -192506059) : null);
        A01.A2K(0Pz.A0W("toggle_value_", String.valueOf(z)));
        return A01.A00;
    }

    @Override // X.C1rj
    public C3s9 A13(1Iw r302) {
        5X3 A02 = C3s9.A02(this.A02);
        A02.A03(C2jm.A08);
        return A02;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != -192506059) {
            return null;
        }
        1Is r0 = r302.A00.A01;
        View view = ((3xC) obj).A00;
        View.OnClickListener onClickListener = ((Dxb) r0).A00;
        if (onClickListener == null) {
            return null;
        }
        onClickListener.onClick(view);
        return null;
    }
}
