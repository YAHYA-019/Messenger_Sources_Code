package X;

import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;

/* renamed from: X.8k9, reason: invalid class name */
/* loaded from: 8k9.class */
public final class C8k9 extends C1rj {
    public View.OnClickListener A00;
    public MigColorScheme A01;

    public C8k9() {
        super("PageRTCDisableCallingWarningComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        MigColorScheme migColorScheme = this.A01;
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        A01.A1B(30.0f);
        A01.A0X();
        2KD A0n = 7zQ.A0n(r302, migColorScheme, r302.A0D(2131963547), 0);
        A0n.A2a();
        A0n.A2g();
        A0n.A2b();
        A0n.A18(12.0f);
        4YU.A1K(A01, A0n);
        2KD A0n2 = 7zQ.A0n(r302, migColorScheme, r302.A0E(2131963546, new Object[]{7zL.A13((User) 1Bn.A0A(83430)), r302.A0D.getResources().getString(2131959933)}), 0);
        A0n2.A2a();
        A0n2.A2n();
        A0n2.A2d();
        4YU.A1K(A01, A0n2);
        8TZ A00 = C8nr.A00(r302);
        A00.A17(30.0f);
        A00.A2b(r302.A0D(2131963545));
        7zN.A1D(A00, r302, C8k9.class, "PageRTCDisableCallingWarningComponent", 1446261331);
        A00.A2a(migColorScheme);
        return 7zL.A0V(A01, A00.A2W());
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != 1446261331) {
            return null;
        }
        1Is r0 = r302.A00.A01;
        ((C8k9) r0).A00.onClick(((3xC) obj).A00);
        return null;
    }
}
