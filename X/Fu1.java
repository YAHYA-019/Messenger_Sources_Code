package X;

/* loaded from: Fu1.class */
public final class Fu1 implements GIp {
    public final Object A00;

    public Fu1(Object obj) {
        this.A00 = obj;
    }

    @Override // X.GIp
    public void ADx(EsZ esZ) {
    }

    @Override // X.GIp
    public void Civ(GGk gGk, EsZ esZ, S4a s4a) {
        if (s4a != null) {
            throw AnonymousClass001.A0Q("getNextEffectId");
        }
        G4b g4b = new G4b(gGk, esZ, this);
        Ejy ejy = esZ.A00.A04.A05;
        Eme eme = new Eme(ejy, g4b);
        Eme eme2 = ejy.A01;
        if (eme2 == null) {
            ejy.A01 = eme;
            ejy.A00 = eme;
        } else {
            eme2.A00 = eme;
            ejy.A01 = eme;
        }
    }
}
