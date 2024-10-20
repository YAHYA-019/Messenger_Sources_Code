package X;

/* loaded from: Fcy.class */
public final class Fcy implements C4Av {
    public final 1Br A00 = 1Bu.A00(98680);

    @Override // X.C4Av
    public boolean Ciy(4Yg r302) {
        11T.A0F(r302, 0);
        if (!r302.A01()) {
            return true;
        }
        4oS r0 = (4oS) ((Ecc) 1Br.A0B(this.A00)).A00.get();
        long currentTimeMillis = System.currentTimeMillis() / 86400000;
        1Ql A0V = 1BL.A0V(r0.A01);
        A0V.CaH(4oS.A02, currentTimeMillis);
        A0V.commit();
        return true;
    }
}
