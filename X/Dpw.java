package X;

/* loaded from: Dpw.class */
public final class Dpw extends FiZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public Dpw(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj4;
        this.A01 = obj3;
        this.A02 = obj2;
        this.A03 = obj;
    }

    public void C7J(5IO r302) {
        AZC azc;
        AZC azc2;
        if (this.A00 == 0) {
            try {
                ENt eNt = (ENt) this.A04;
                Object obj = this.A01;
                EzJ ezJ = (EzJ) this.A02;
                2Me r0 = ezJ.A03;
                boolean A00 = EVf.A00(r0 != null ? r0.A00 : 7zL.A0A(ezJ.A05), 2Mg.A00);
                Integer num = 0S2.A00;
                if (A00) {
                    num = 0S2.A01;
                } else if (obj == ENk.A03) {
                    num = 0S2.A0C;
                }
                int ordinal = eNt.ordinal();
                if (ordinal == 0) {
                    new Object();
                } else if (ordinal == 1) {
                    new Object();
                } else if (ordinal == 2) {
                    new Object();
                } else {
                    if (ordinal != 3) {
                        throw AnonymousClass002.A0C(eNt, "Invalid FDSFailedLoadingState Style: ", AnonymousClass001.A0k());
                    }
                    new Object();
                }
                azc.A0C(num);
                azc.Beo(r302);
                return;
            } catch (IllegalAccessException e) {
                ((C01s) this.A03).D0v("FDSFailedLoadingState_keyFrameIconException", e.getMessage() == null ? "" : e.getMessage());
                return;
            }
        }
        11T.A0F(r302, 0);
        try {
            ENA ena = (ENA) this.A02;
            Object obj2 = this.A01;
            EzJ ezJ2 = (EzJ) this.A03;
            2Me r02 = ezJ2.A03;
            boolean A002 = EVf.A00(r02 != null ? r02.A00 : 7zL.A0A(ezJ2.A05), 2Mg.A00);
            Integer num2 = 0S2.A00;
            if (obj2 == ENQ.A03) {
                num2 = 0S2.A0C;
            } else if (A002) {
                num2 = 0S2.A01;
            }
            switch (ena.ordinal()) {
                case 0:
                    new Object();
                    break;
                case 1:
                    new Object();
                    break;
                case 2:
                    new Object();
                    break;
                case 3:
                    new Object();
                    break;
                case 4:
                    new Object();
                    break;
                case 5:
                    new Object();
                    break;
                case 6:
                    new Object();
                    break;
                case 7:
                    new Object();
                    break;
                default:
                    throw 1BK.A1F();
            }
            azc2.A0C(num2);
            azc2.Beo(r302);
        } catch (IllegalAccessException e2) {
            ((C01s) this.A04).softReport("FDSNullState_keyFrameIconException", e2);
        }
    }
}
