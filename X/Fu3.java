package X;

/* loaded from: Fu3.class */
public final class Fu3 implements GIp {
    public Fu7 A00;
    public final EDI A01;
    public final GGl A02;

    public Fu3(EDI edi, Class cls) {
        this.A01 = edi;
        this.A02 = new FuE(this, cls, 1);
    }

    @Override // X.GIp
    public void ADx(EsZ esZ) {
        Fu7 fu7 = this.A00;
        if (fu7 != null) {
            fu7.ADx(esZ);
            this.A00 = null;
        }
    }

    @Override // X.GIp
    public void Civ(GGk gGk, EsZ esZ, S4a s4a) {
        Fu7 fu7 = new Fu7(this.A02);
        this.A00 = fu7;
        fu7.Civ(new Fu9(gGk, this), esZ, s4a);
        new Fu1(this.A01).Civ(new Fu8(this), esZ, s4a);
    }
}
