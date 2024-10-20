package X;

import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8jj, reason: invalid class name */
/* loaded from: 8jj.class */
public final class C8jj extends C1rj {
    public View.OnClickListener A00;
    public View.OnClickListener A01;
    public MigColorScheme A02;
    public String A03;
    public String A04;
    public boolean A05;

    public C8jj() {
        super("FxCalButtonGroup");
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, this.A03, this.A00, Boolean.valueOf(this.A05), this.A04, this.A01};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        1LI A2W;
        MigColorScheme migColorScheme = this.A02;
        String str = this.A03;
        View.OnClickListener onClickListener = this.A00;
        String str2 = this.A04;
        View.OnClickListener onClickListener2 = this.A01;
        boolean z = this.A05;
        11T.A0F(r302, 0);
        1BL.A1H(migColorScheme, str, onClickListener);
        2cM A00 = 2cK.A00(r302);
        8TZ A002 = C8nr.A00(r302);
        A002.A0e();
        A002.A2b(str);
        A002.A2a(migColorScheme);
        A002.A2Z(onClickListener);
        A002.A2K("button_group_primary");
        A00.A2e(A002.A2W());
        if (str2 != null && str2.length() != 0 && onClickListener2 != null) {
            if (z) {
                8TU A003 = C8nm.A00(r302);
                A003.A2Z(str2);
                A003.A2Y(migColorScheme);
                A003.A01.A00 = onClickListener2;
                4YU.A1N(A003, 2RH.A04);
                A003.A0e();
                A003.A2K("button_group_secondary");
                A2W = A003.A2W();
            } else {
                8TV A004 = C8ns.A00(r302);
                A004.A0e();
                A004.A2Z(str2);
                A004.A2Y(migColorScheme);
                A004.A01.A03 = onClickListener2;
                4YU.A1N(A004, 2RH.A04);
                A004.A2K("button_group_secondary");
                A2W = A004.A2W();
            }
            A00.A2e(A2W);
        }
        4YU.A1L(A00, 2RH.A03);
        7zO.A1E(A00, 2RH.A05);
        return A00.A00;
    }
}
