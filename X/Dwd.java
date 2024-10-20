package X;

import com.facebook.common.callercontext.CallerContext;

/* loaded from: Dwd.class */
public final class Dwd extends C1rj {
    public GL7 A00;
    public FyG A01;

    public Dwd() {
        super("NTFDSContainedIconButtonComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        FIJ A05;
        GL7 gl7 = this.A00;
        FyG fyG = this.A01;
        boolean A1X = 1BL.A1X(r302, gl7);
        FF6 A00 = EVe.A00(r302, gl7.getString(49));
        1LI r306 = null;
        if (A00 != null) {
            C2151Dff c2151Dff = new C2151Dff(r302);
            c2151Dff.A00 = A00;
            ENZ valueOf = ENZ.valueOf(GL7.A09(gl7, "", 55));
            if (valueOf == null) {
                ((ESq) c2151Dff).A00 = A1X;
                valueOf = null;
            }
            c2151Dff.A03 = valueOf;
            GCe gCe = (ERF) GL7.A01(gl7, ERF.class, "", 58).or(ERF.A02);
            if (gCe == null) {
                ((ESq) c2151Dff).A00 = A1X;
                gCe = null;
            }
            c2151Dff.A02 = gCe;
            c2151Dff.A06 = (gl7.getBoolean(44, false) || (A05 = FJ9.A05(gl7, fyG, 56)) == null) ? null : 7zO.A0U(new G7P(A05, 3));
            c2151Dff.A07 = GL7.A07(gl7);
            c2151Dff.A09 = !gl7.getBoolean(44, false);
            c2151Dff.A08 = gl7.getString(50);
            r306 = c2151Dff.A0O(CallerContext.A0B("NTFDSContainedIconButtonComponentSpec"));
        }
        return r306;
    }
}
