package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import java.util.BitSet;

/* renamed from: X.Azu, reason: case insensitive filesystem */
/* loaded from: Azu.class */
public final class C2033Azu extends C1rj {
    public static final MigColorScheme A04 = LightColorScheme.A00();
    public Bhj A00;
    public Cst A01;
    public DFy A02;
    public MigColorScheme A03;

    public C2033Azu() {
        super("BroadcastFlowHeaderComponent");
        this.A03 = A04;
    }

    public final Object[] A0k() {
        return new Object[]{this.A03, this.A02, this.A01, this.A00};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        BitSet bitSet;
        String[] strArr;
        C2010Az7 c2010Az7;
        C1876Avd c1876Avd;
        DFy dFy = this.A02;
        Cst cst = this.A01;
        MigColorScheme migColorScheme = this.A03;
        Bhj bhj = this.A00;
        C1rq A01 = C1rg.A01(r302, null, 0);
        2KD A0X = 7zN.A0X(r302, migColorScheme, 0);
        A0X.A0j(1.0f);
        A0X.A2z(cst.A01);
        A0X.A2k();
        A0X.A2c();
        C1ro c1ro = C1ro.CENTER;
        A0X.A1y(c1ro);
        A0X.A2q(1);
        7zO.A1K(A0X, 2RH.A06);
        7zN.A1T(A01, A0X);
        String str = cst.A00;
        if (str != null) {
            if (str.equals("CREATE_GROUP")) {
                C1876Avd c1876Avd2 = new C1876Avd(r302, new C2010Az7());
                C2010Az7 c2010Az72 = c1876Avd2.A01;
                c2010Az72.A00 = dFy;
                bitSet = c1876Avd2.A02;
                bitSet.set(1);
                c2010Az72.A01 = migColorScheme;
                bitSet.set(0);
                strArr = c1876Avd2.A03;
                c1876Avd = c1876Avd2;
                c2010Az7 = c2010Az72;
            } else {
                if (!str.equals("SEE_MORE")) {
                    throw AnonymousClass001.A0N("Invalid HeaderButtonKey");
                }
                C1879Avg c1879Avg = new C1879Avg(r302, new C2011Az8());
                C2011Az8 c2011Az8 = c1879Avg.A01;
                c2011Az8.A00 = bhj;
                bitSet = c1879Avg.A02;
                bitSet.set(1);
                c2011Az8.A01 = migColorScheme;
                bitSet.set(0);
                strArr = c1879Avg.A03;
                c1876Avd = c1879Avg;
                c2010Az7 = c2011Az8;
            }
            C1rs.A00(bitSet, strArr);
            c1876Avd.A0J();
            A01.A2f(c2010Az7);
        }
        A01.A0g(1.0f);
        A01.A2d();
        A01.A2h(c1ro);
        return A01.A00;
    }
}
