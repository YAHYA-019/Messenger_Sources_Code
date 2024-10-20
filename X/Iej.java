package X;

/* loaded from: Iej.class */
public final class Iej implements JLu {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Iej(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.JLu
    public /* synthetic */ void BqV(HzC hzC, ICm iCm) {
    }

    @Override // X.JLu
    public void Bqi(HzC hzC, ICm iCm) {
        if (this.A00 != 0) {
            ID3.A01("ConcurrentFrontBackController", "Main camera connected successfully");
            IDE ide = (IDE) this.A01;
            ide.A0D.A0B(this);
            ide.A04.getClass();
            ide.A04.A0A(new Iej(hzC, this, 0));
            ID3.A01("ConcurrentFrontBackController", "Calling onResume for the auxiliary camera");
            ide.A04.A0C(false);
            return;
        }
        ID3.A01("ConcurrentFrontBackController", "Auxiliary camera connected successfully");
        Iej iej = (Iej) this.A01;
        ICm iCm2 = ((IDE) iej.A01).A04;
        iCm2.getClass();
        iCm2.A0B(this);
        HzC hzC2 = (HzC) this.A02;
        hzC2.getClass();
        ((Ht4) iej.A02).A04(new HzC(hzC2.A02, hzC, hzC2.A03, hzC2.A01, hzC2.A04));
    }

    @Override // X.JLu
    public void Bqr(ICm iCm, Exception exc) {
        Iej iej;
        String str;
        String A1B;
        if (this.A00 != 0) {
            iej = this;
            ((IDE) this.A01).A0D.A0B(this);
            str = "ConcurrentFrontBackController";
            A1B = "Failed to connect first camera for concurrent front-back mode";
        } else {
            iej = (Iej) this.A01;
            ICm iCm2 = ((IDE) iej.A01).A04;
            iCm2.getClass();
            iCm2.A0B(this);
            str = "ConcurrentFrontBackController";
            A1B = 0Pz.A1B("Failed to connect second camera for concurrent front-back mode: ", exc);
        }
        ID3.A02(str, A1B);
        ((Ht4) iej.A02).A03(exc);
    }

    @Override // X.JLu
    public /* synthetic */ void Btv(ICm iCm) {
    }

    @Override // X.JLu
    public /* synthetic */ void Btx(ICm iCm, Exception exc) {
    }
}
