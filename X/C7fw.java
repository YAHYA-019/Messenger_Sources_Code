package X;

import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.7fw, reason: invalid class name */
/* loaded from: 7fw.class */
public final class C7fw extends C1rj {
    public View.OnClickListener A00;
    public MigColorScheme A01;
    public CharSequence A02;

    public C7fw() {
        super("IndexRail");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A01, this.A02};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        MigColorScheme migColorScheme = this.A01;
        CharSequence charSequence = this.A02;
        11T.A0F(migColorScheme, 1);
        C1rq A01 = C1rg.A01(r302, null, 0);
        A01.A0e();
        2KD A012 = 2K3.A01(r302, 0);
        A012.A2x(migColorScheme);
        A012.A2z(charSequence);
        A012.A2b();
        A012.A2j();
        A012.A0L();
        A01.A2e(A012);
        A01.A2c();
        A01.A2T(1LI.A09(r302, C7fw.class, "IndexRail", -1755229903));
        return A01.A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1755229903) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        1Is r0 = r302.A00.A01;
        View view = ((3xC) obj).A00;
        View.OnClickListener onClickListener = ((C7fw) r0).A00;
        if (onClickListener == null) {
            return null;
        }
        onClickListener.onClick(view);
        return null;
    }
}
