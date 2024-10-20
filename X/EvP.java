package X;

/* loaded from: EvP.class */
public final class EvP {
    public long A00;
    public long A01;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A05 = 1Bq.A00(16922);
    public final 1Br A02 = 7zM.A0d();

    public EvP() {
        1Br A0C = 1BK.A0C();
        this.A07 = A0C;
        this.A04 = 1BK.A0E();
        this.A03 = 1Bq.A00(16449);
        this.A06 = 1Bu.A00(83719);
        this.A00 = 1Br.A07(A0C).Auy(36605336248917064L);
        this.A01 = 1BL.A0A(1Br.A09(this.A04), DKC.A0b(((1Ky) 1Bn.A0A(98565)).A06));
    }

    public final Integer A00(Integer num) {
        if (!1Br.A07(this.A07).AZk(num.intValue() != 1 ? 36323861272349964L : 36323861272284427L)) {
            return null;
        }
        for (Integer num2 : DKD.A1a()) {
            if (((2BQ) 1Br.A0B(this.A05)).A04(3GC.A00(num2))) {
                long j = (this.A00 * 1000) + this.A01;
                C00i c00i = this.A02.A00;
                if (j < ((C0dp) c00i.get()).now()) {
                    this.A01 = ((C0dp) c00i.get()).now();
                    1Ql A08 = 1Br.A08(this.A04);
                    A08.CaH(DKC.A0b(((1Ky) 1Bn.A0A(98565)).A06), this.A01);
                    A08.commit();
                    return num2;
                }
            }
        }
        return null;
    }
}
