package X;

import java.util.ArrayList;

/* renamed from: X.8ep, reason: invalid class name */
/* loaded from: 8ep.class */
public final class C8ep extends 1LH {
    public final 1Im A00;

    public C8ep() {
        this(null);
    }

    public C8ep(1Im r302) {
        this.A00 = r302;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C2lh A00 = C2lc.A00(c2k5, ALI.A00);
        boolean A1V = 7zP.A1V(A00);
        int A03 = 7zO.A03(c2k5, 7zM.A09(c2k5));
        int i = 0;
        if (A1V) {
            i = A03;
        }
        C1ro c1ro = C1ro.CENTER;
        1Iw r0 = c2k5.A05;
        ArrayList A0s = AnonymousClass001.A0s();
        2yD A0L = 1BK.A0L(16387);
        8Sk A002 = 8oJ.A00(r0);
        int i2 = 2132476027;
        if (A0L.AZk(72341104829272482L)) {
            i2 = 2132475974;
        }
        A002.A2W(i2);
        A002.A0C(i);
        A002.A1L(i);
        A002.A1y(c1ro);
        A002.A1J(2131960287);
        8Sk.A06(A002, 2);
        A002.A2J("MetaAiDonutAmbientSpinComponent");
        1Im r02 = this.A00;
        if (r02 != null) {
            A002.A2T(r02);
            7zL.A1J(A002);
        }
        A002.A0J();
        8oJ r03 = A002.A00;
        11T.A0A(r03);
        A0s.add(r03);
        if (!A1V) {
            AQZ aqz = new AQZ(A00, 35);
            2yD A0L2 = 1BK.A0L(16387);
            8Sk A003 = 8oJ.A00(r0);
            int i3 = 2132476028;
            if (A0L2.AZk(72341104829272482L)) {
                i3 = 2132475975;
            }
            A003.A2W(i3);
            A003.A0C(A03);
            A003.A1L(A03);
            A003.A1y(c1ro);
            A003.A1J(2131960287);
            A003.A2X(new 8JD(A0L2, aqz, 0));
            A003.A2J("MetaAiDonutFlipComponent");
            if (A0L2.AZk(72341104829665701L)) {
                A003.A00.A02 = new IFw(aqz, 0);
            }
            if (r02 != null) {
                A003.A2T(r02);
                7zL.A1J(A003);
            }
            A003.A0J();
            8oJ r04 = A003.A00;
            11T.A0A(r04);
            A0s.add(r04);
        }
        return new C1rh(null, c1ro, null, null, A0s, false);
    }
}
