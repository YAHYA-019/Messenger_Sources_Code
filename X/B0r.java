package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;

/* loaded from: B0r.class */
public final class B0r extends C1rj {
    public static final 2MG A08 = 2MG.A02;
    public DI6 A00;
    public MigColorScheme A01;
    public 2MG A02;
    public CharSequence A03;
    public CharSequence A04;
    public String A05;
    public boolean A06;
    public boolean A07;

    public B0r() {
        super("OmnipickerHeader");
        this.A02 = A08;
    }

    public static C1909Awa A00(1Iw r301) {
        return new C1909Awa(r301, new B0r());
    }

    public final Object[] A0k() {
        return new Object[]{this.A03, this.A01, this.A05, Boolean.valueOf(this.A06), Boolean.valueOf(this.A07), this.A00, this.A02, 1BK.A0d(), null, this.A04};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        CharSequence charSequence = this.A04;
        CharSequence charSequence2 = this.A03;
        boolean z = this.A06;
        DI6 di6 = this.A00;
        MigColorScheme migColorScheme = this.A01;
        2MG r0 = this.A02;
        String str = this.A05;
        1Bn.A0A(68537);
        C5yw A0b = 7zN.A0b(r302, false);
        A0b.A2f(charSequence);
        A0b.A01.A0A = null;
        CxE.A01(A0b, di6, 75);
        int i = C5yu.A00;
        LightColorScheme.A00();
        11T.A0F(migColorScheme, 0);
        11T.A0F(charSequence2, 0);
        A0b.A2e(new C5z2(Cx1.A01(di6, 29), migColorScheme, charSequence2, null, null, str, z));
        A0b.A2c(r0);
        A0b.A2b(migColorScheme);
        return A0b.A2V();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != -100712182) {
            if (i != 1280007661) {
                return null;
            }
            ((B0r) r302.A00.A01).A00.C8Y();
            return null;
        }
        1Is r0 = r302.A00.A01;
        ((B0r) r0).A00.CQi(((Ehh) obj).A01);
        return null;
    }
}
