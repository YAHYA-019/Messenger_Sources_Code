package X;

/* loaded from: Ev2.class */
public final class Ev2 {
    public Ey5 A00;
    public final EkU A01;
    public final F91 A02;
    public final F91 A03;
    public final Object A04 = AnonymousClass001.A0R();

    public Ev2(EkU ekU, F91 f91, F91 f912) {
        this.A02 = f91;
        this.A03 = f912;
        this.A01 = ekU;
    }

    public final F91 A00(String str) {
        EkU ekU;
        F91 f91 = this.A03;
        if (f91 != null && (ekU = this.A01) != null) {
            Esi esi = ekU.A00;
            if (esi.A00(str) != null || esi.A00.get(str) != null) {
                return f91;
            }
        }
        return this.A02;
    }
}
