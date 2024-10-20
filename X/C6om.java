package X;

import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.6om, reason: invalid class name */
/* loaded from: 6om.class */
public final class C6om extends C1rj {
    public int A00;
    public View.OnClickListener A01;
    public MigColorScheme A02;

    public C6om() {
        super("M4GutterIconButton");
    }

    public final Object[] A0k() {
        return 1BK.A1a(this.A01, this.A02, this.A00);
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        int i = this.A00;
        MigColorScheme migColorScheme = this.A02;
        11T.A0F(r302, 0);
        11T.A0F(migColorScheme, 2);
        2zB A00 = 2cP.A00(r302);
        A00.A2a(migColorScheme);
        A00.A2X(36.0f);
        A00.A2Y(i);
        A00.A2T(1LI.A02(r302, C6om.class, 0S2.A01, "M4GutterIconButton", (Object[]) null, -1321154314));
        return A00.A2W();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1321154314) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        1Is r0 = r302.A00.A01;
        View view = ((3xC) obj).A00;
        View.OnClickListener onClickListener = ((C6om) r0).A01;
        1BL.A1F(onClickListener, view);
        onClickListener.onClick(view);
        return null;
    }
}
