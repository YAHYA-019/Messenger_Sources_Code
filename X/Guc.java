package X;

/* loaded from: Guc.class */
public final class Guc extends Ht4 {
    public final /* synthetic */ JGD A00;
    public final /* synthetic */ JGD A01;
    public final /* synthetic */ Ht4 A02;
    public final /* synthetic */ ICm A03;
    public final /* synthetic */ ICm A04;
    public final /* synthetic */ IDE A05;

    public Guc(JGD jgd, JGD jgd2, Ht4 ht4, ICm iCm, ICm iCm2, IDE ide) {
        this.A05 = ide;
        this.A04 = iCm;
        this.A01 = jgd;
        this.A03 = iCm2;
        this.A00 = jgd2;
        this.A02 = ht4;
    }

    @Override // X.Ht4
    public /* bridge */ /* synthetic */ void A04(Object obj) {
        HzC hzC = (HzC) obj;
        ID3.A01("ConcurrentFrontBackController", "Front camera opened successfully");
        IDE ide = this.A05;
        ICm iCm = ide.A0D;
        ICm iCm2 = this.A04;
        if (iCm == iCm2) {
            ide.A00 = hzC.A01;
        }
        JNk jNk = iCm2.A0M;
        jNk.A6q(this.A01);
        jNk.A6r(ide.A0E);
        iCm2.A06(hzC.A01);
        this.A03.A0M.CVp(new Gua(hzC, this, 17), ide.A0F, 0);
    }
}
