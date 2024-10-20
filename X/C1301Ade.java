package X;

/* renamed from: X.Ade, reason: case insensitive filesystem */
/* loaded from: Ade.class */
public final class C1301Ade {
    public static final DIg A06 = new CrG(0);
    public final DK4 A00;
    public final BP1 A01;
    public final Buw A02;
    public final Bmu A03;
    public final AcX A04;
    public final Integer A05;

    public C1301Ade(DK4 dk4, BP1 bp1, Buw buw, Bmu bmu, AcX acX, Integer num) {
        this.A00 = dk4;
        this.A04 = acX;
        this.A05 = num;
        this.A02 = buw;
        this.A03 = bmu;
        this.A01 = bp1;
    }

    public static C1301Ade A00(DK4 dk4, Buw buw) {
        return new C1301Ade(dk4, null, buw, null, null, null);
    }

    public static C1301Ade A01(DK4 dk4, AcX acX) {
        return new C1301Ade(dk4, null, null, null, acX, null);
    }

    public static C1301Ade A02(DK4 dk4, Integer num) {
        return new C1301Ade(dk4, null, null, null, null, num);
    }

    public Object A03(DIf dIf, Object obj) {
        AcX acX = this.A04;
        if (acX != null) {
            return dIf.D9n(acX, obj);
        }
        Integer num = this.A05;
        if (num != null) {
            return dIf.DA3(num, obj);
        }
        Buw buw = this.A02;
        if (buw != null) {
            return dIf.D9f(buw, obj);
        }
        Bmu bmu = this.A03;
        if (bmu != null) {
            return dIf.D9l(bmu, obj);
        }
        BP1 bp1 = this.A01;
        if (bp1 != null) {
            return dIf.D9d(bp1, obj);
        }
        throw AnonymousClass001.A0N("No valid item to visit!");
    }

    public Object A04(DIg dIg) {
        AcX acX = this.A04;
        if (acX != null) {
            return dIg.D9m(acX);
        }
        Integer num = this.A05;
        if (num != null) {
            return dIg.DA2(num);
        }
        Buw buw = this.A02;
        if (buw != null) {
            return dIg.D9e(buw);
        }
        Bmu bmu = this.A03;
        if (bmu != null) {
            return dIg.D9k(bmu);
        }
        BP1 bp1 = this.A01;
        if (bp1 != null) {
            return dIg.D9c(bp1);
        }
        throw AnonymousClass001.A0N("No valid item to visit!");
    }
}
