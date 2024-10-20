package X;

import android.graphics.drawable.Drawable;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Gl4, reason: case insensitive filesystem */
/* loaded from: Gl4.class */
public final class C2686Gl4 extends C1rj {
    public int A00;
    public 1Im A01;
    public MigColorScheme A02;
    public H9o A03;

    public C2686Gl4() {
        super("RecordingControlsBaseButton");
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, this.A01, Integer.valueOf(this.A00), this.A03};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        Drawable A08;
        MigColorScheme migColorScheme = this.A02;
        1Im r0 = this.A01;
        H9o h9o = this.A03;
        int i = this.A00;
        11T.A0F(r302, 0);
        7zS.A16(1, migColorScheme, r0, h9o);
        C1u2 A0I = 4YV.A0I();
        int ordinal = h9o.ordinal();
        if (ordinal == 0) {
            A08 = A0I.A08(C1u3.A6a, 0);
            i = migColorScheme.Ahe();
        } else {
            if (ordinal != 1) {
                throw 1BK.A1F();
            }
            A08 = A0I.A08(C1u3.A5Q, 0);
        }
        3yK r02 = new 3yK(i, i);
        2zB A00 = 2cP.A00(r302);
        A00.A2a(migColorScheme);
        A00.A2Z(A08);
        A00.A2X(32.0f);
        C1td c1td = C1td.A0D;
        2cP r03 = A00.A01;
        r03.A05 = c1td;
        r03.A04 = r02;
        A00.A2T(r0);
        return A00.A2W();
    }
}
