package X;

/* loaded from: Fu7.class */
public final class Fu7 implements GIp {
    public EmR A00;
    public final GGl A01;

    public Fu7() {
        this.A01 = new FuD(this, 0);
    }

    public Fu7(GGl gGl) {
        this.A01 = gGl;
    }

    public Fu7(Class cls) {
        this.A01 = new FuE(this, cls, 0);
    }

    @Override // X.GIp
    public void ADx(EsZ esZ) {
        EmR emR = this.A00;
        if (emR != null) {
            F5D.A00(esZ.A00.A04.A03).A00.remove(emR);
            this.A00 = null;
        }
    }

    @Override // X.GIp
    public void Civ(GGk gGk, EsZ esZ, S4a s4a) {
        if (s4a != null) {
            throw AnonymousClass001.A0Q("getNextEffectId");
        }
        EmR emR = new EmR(gGk, esZ, this);
        this.A00 = emR;
        F5D.A00(esZ.A00.A04.A03).A00(emR);
    }
}
