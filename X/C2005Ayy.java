package X;

import java.util.BitSet;

/* renamed from: X.Ayy, reason: case insensitive filesystem */
/* loaded from: Ayy.class */
public final class C2005Ayy extends C1rj {
    public C1800At9 A00;

    public C2005Ayy() {
        super("HaloDetailsPagerRootComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        2cL r0;
        C1800At9 c1800At9 = this.A00;
        boolean A1X = 1BL.A1X(r302, c1800At9);
        2cM A00 = 2cK.A00(r302);
        A00.A0R();
        C1ro c1ro = C1ro.STRETCH;
        A00.A2f(c1ro);
        A00.A2g(c1ro);
        for (JOL jol : c1800At9.A03) {
            if (11T.A0O(jol, c1800At9.A00)) {
                2cM A002 = 2cK.A00(r302);
                AvF avF = new AvF(r302, new AzX());
                avF.A0R();
                AzX azX = avF.A01;
                azX.A00 = jol;
                BitSet bitSet = avF.A02;
                bitSet.set(0);
                C1rs.A05(bitSet, avF.A03, A1X ? 1 : 0);
                avF.A0J();
                A002.A2e(azX);
                A002.A0R();
                A002.A2L(String.valueOf(jol.getType()));
                r0 = A002.A00;
            } else {
                r0 = null;
            }
            A00.A2e(r0);
        }
        return A00.A00;
    }

    @Override // X.C1rj
    public C3s9 A13(1Iw r302) {
        C1800At9 c1800At9 = this.A00;
        11T.A0F(c1800At9, 1);
        Boolean bool = c1800At9.A02;
        if (bool == null) {
            return null;
        }
        boolean booleanValue = bool.booleanValue();
        int i = 100;
        int i2 = -100;
        float f = 0.0f / 0.0f;
        if (booleanValue) {
            i2 = 100;
        }
        Integer num = 0S2.A0C;
        C5X1 c5x1 = new C5X1(num, i2);
        if (booleanValue) {
            i = -100;
        }
        C5X1 c5x12 = new C5X1(num, i);
        String valueOf = String.valueOf(c1800At9.A00.getType());
        5Rn r0 = C3s9.A04;
        5X3 A00 = C3s9.A00(r0, valueOf);
        C2jo c2jo = C2jm.A08;
        A00.A03(c2jo);
        5Rm r02 = C3s9.A02;
        ((5X4) A00).A02 = r02;
        A00.A04(c5x1);
        int i3 = 0;
        JOL jol = c1800At9.A01;
        if (jol != null) {
            i3 = jol.getType();
        }
        5X3 A002 = C3s9.A00(r0, String.valueOf(i3));
        A002.A03(c2jo);
        ((5X4) A002).A02 = r02;
        A002.A05(c5x12);
        return new 5XA(new 5X3[]{A00, A002});
    }
}
