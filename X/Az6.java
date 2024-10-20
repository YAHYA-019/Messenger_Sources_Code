package X;

import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Az6.class */
public final class Az6 extends C1rj {
    public View.OnClickListener A00;
    public MigColorScheme A01;

    public Az6() {
        super("PendingApprovalsIndicator");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        MigColorScheme migColorScheme = this.A01;
        C1u2 A0R = 7zP.A0R();
        C1rq A01 = C1rg.A01(r302, null, 0);
        A01.A2b();
        C2cq A00 = C2cp.A00(r302, 0);
        A00.A2a(A0R.A07(C1u3.A3K));
        A01.A2e(A00);
        C1rs A0X = 7zN.A0X(r302, migColorScheme, 0);
        A0X.A24(C26z.LEFT, 8.0f);
        A0X.A2r(2131965019);
        A0X.A2n();
        A0X.A2e();
        A01.A2e(A0X);
        7zN.A1C(A01, r302, Az6.class, "PendingApprovalsIndicator");
        A01.A0P();
        A01.A1D(7zM.A01());
        return A01.A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1351902487) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        1Is r0 = r302.A00.A01;
        View view = ((3xC) obj).A00;
        View.OnClickListener onClickListener = ((Az6) r0).A00;
        if (onClickListener == null) {
            return null;
        }
        onClickListener.onClick(view);
        return null;
    }
}
