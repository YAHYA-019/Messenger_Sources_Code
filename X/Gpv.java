package X;

/* loaded from: Gpv.class */
public final class Gpv extends HG1 {
    public final int A00;
    public final Object A01;

    public Gpv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A00() {
        switch (this.A00) {
            case 1:
                B7V b7v = (B7V) this.A01;
                B7V.A03(C1797At6.A00(null, b7v.A00, null, null, null, null, null, GOp.A0X(b7v.A06).A00, 30719, false, false, false, false, false, false, false), b7v);
                return;
            case 2:
                Gqs gqs = (Gqs) this.A01;
                HiO A00 = Gqs.A00(gqs);
                A00.A00 = GOp.A0X(gqs.A01).A00;
                gqs.A0Z(new IZU(A00));
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01() {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gpv.A01():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A02() {
        IZy izu;
        Gqs gqs;
        switch (this.A00) {
            case 0:
                GrV grV = (GrV) this.A01;
                I0g A0B = GrV.A0B(grV);
                C00i c00i = grV.A0R.A00;
                A0B.A0g = ((I5k) c00i.get()).A0A;
                A0B.A0D = ((I5k) c00i.get()).A05;
                A0B.A0I = GrV.A0E(grV);
                A0B.A0K = GrV.A0F(grV);
                A0B.A0G = GrV.A0A(grV);
                A0B.A0M = GrV.A0G(grV);
                izu = new IZy(A0B);
                gqs = grV;
                break;
            case 2:
                Gqs gqs2 = (Gqs) this.A01;
                HiO A00 = Gqs.A00(gqs2);
                A00.A04 = GOp.A0X(gqs2.A01).A0A;
                izu = new IZU(A00);
                gqs = gqs2;
                break;
            default:
                return;
        }
        gqs.A0Z(izu);
    }
}
