package X;

/* loaded from: Gyv.class */
public final class Gyv extends 2Qe {
    public final int A00;
    public final Object A01;

    public Gyv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A04() {
        switch (this.A00) {
            case 0:
                IMK imk = (IMK) this.A01;
                imk.A0G = false;
                imk.A0E = false;
                imk.A0C = false;
                return;
            case 1:
                CpD.A02((CpD) this.A01);
                return;
            default:
                CJ5 cj5 = (CJ5) this.A01;
                cj5.A09.clear();
                cj5.A0A.clear();
                cj5.A0D.clear();
                cj5.A0C.clear();
                cj5.A00 = null;
                cj5.A01 = 0S2.A0C;
                cj5.A0B.clear();
                I2V i2v = (I2V) 1Br.A0B(cj5.A07);
                0G2 r0 = i2v.A04;
                C06z[] c06zArr = I2V.A06;
                r0.Cvy(i2v, false, c06zArr[0]);
                i2v.A05.Cvy(i2v, false, c06zArr[1]);
                i2v.A03.Cvy(i2v, false, c06zArr[2]);
                return;
        }
    }
}
