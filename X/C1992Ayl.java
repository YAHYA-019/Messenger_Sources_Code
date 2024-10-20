package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;

/* renamed from: X.Ayl, reason: case insensitive filesystem */
/* loaded from: Ayl.class */
public final class C1992Ayl extends C1rj {
    public 2O4 A00;
    public CiO A01;
    public Boq A02;
    public AnonymousClass553 A03;
    public AnonymousClass553 A04;
    public MigColorScheme A05;
    public ImmutableList A06;
    public String A07;
    public boolean A08;

    public C1992Ayl() {
        super("LandingPageRootComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A03, this.A05, this.A04, this.A02, this.A01, this.A06, this.A00, Boolean.valueOf(this.A08), this.A07};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        QIr qIr;
        String str = this.A07;
        ImmutableList immutableList = this.A06;
        Boq boq = this.A02;
        CiO ciO = this.A01;
        AnonymousClass553 anonymousClass553 = this.A04;
        AnonymousClass553 anonymousClass5532 = this.A03;
        2O4 r0 = this.A00;
        boolean z = this.A08;
        MigColorScheme migColorScheme = this.A05;
        11T.A0G(r302, 0, immutableList);
        7zT.A11(3, boq, ciO, anonymousClass553, anonymousClass5532);
        11T.A0F(migColorScheme, 9);
        2cM A00 = 2cK.A00(r302);
        7zM.A1O(A00, migColorScheme);
        A00.A0m(100.0f);
        A00.A10(100.0f);
        if (z) {
            C1815Ato c1815Ato = new C1815Ato(r302, new QIr());
            qIr = c1815Ato.A01;
            qIr.A03 = true;
            BitSet bitSet = c1815Ato.A02;
            bitSet.set(3);
            qIr.A02 = str;
            bitSet.set(2);
            qIr.A00 = anonymousClass5532;
            bitSet.set(0);
            qIr.A01 = migColorScheme;
            bitSet.set(1);
            C1rs.A02(bitSet, c1815Ato.A03);
            c1815Ato.A0J();
        } else {
            qIr = null;
        }
        A00.A2e(qIr);
        C2ki A002 = C2kV.A00(r302);
        A002.A2j(true);
        A002.A0R();
        7zL.A1K(r302);
        8qK r02 = new 8qK();
        r02.A02 = immutableList;
        r02.A00 = boq;
        r02.A01 = migColorScheme;
        A002.A01.A0L = r02;
        A002.A02.set(0);
        A002.A2Z(r0);
        AbG.A1M(A00, A002);
        C1813Atm c1813Atm = new C1813Atm(r302, new C2014Azb());
        C2014Azb c2014Azb = c1813Atm.A01;
        c2014Azb.A00 = ciO;
        BitSet bitSet2 = c1813Atm.A02;
        bitSet2.set(2);
        c2014Azb.A01 = anonymousClass553;
        bitSet2.set(1);
        c2014Azb.A02 = migColorScheme;
        bitSet2.set(0);
        C1rs.A03(bitSet2, c1813Atm.A03);
        c1813Atm.A0J();
        A00.A2e(c2014Azb);
        A00.A2K("landing_page_root_component");
        return A00.A00;
    }
}
