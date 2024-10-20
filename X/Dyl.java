package X;

import android.content.Context;
import android.content.res.ColorStateList;

/* loaded from: Dyl.class */
public final class Dyl extends C1rj {
    public static final int[][] A03 = DKI.A0l();
    public 1Im A00;
    public boolean A01;
    public boolean A02;

    public Dyl() {
        super("FigSwitchComponent");
    }

    public final Object[] A0k() {
        return 7zN.A1b(Boolean.valueOf(this.A01), this.A02);
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        boolean z = this.A01;
        boolean z2 = this.A02;
        int[][] iArr = A03;
        Context context = r302.A0D;
        2MR r0 = 2MR.A02;
        2Mg r02 = 2Me.A02;
        ColorStateList A07 = DKG.A07(iArr, r02.A03(context, r0), r02.A03(context, 2MR.A0p));
        ColorStateList valueOf = ColorStateList.valueOf(r02.A03(context, 2MR.A0m));
        ColorStateList valueOf2 = ColorStateList.valueOf(r02.A03(context, 2MR.A07));
        ColorStateList A072 = DKG.A07(iArr, r02.A03(context, 2MR.A01), r02.A01(context));
        DrM A00 = DzJ.A00(r302);
        if (z2) {
            valueOf = A072;
        }
        DzJ dzJ = A00.A00;
        dzJ.A00 = valueOf;
        if (!z2) {
            A07 = valueOf2;
        }
        dzJ.A01 = A07;
        dzJ.A05 = z;
        dzJ.A06 = z2;
        1LI r03 = r302.A02;
        dzJ.A04 = r03 == null ? null : ((Dyl) r03).A00;
        A00.A0J();
        return A00.A00;
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return DKF.A0P(c1qp);
    }
}
