package X;

/* loaded from: Kri.class */
public final class Kri {
    public 1BY A00;
    public final C00i A03 = 1BV.A01((1BY) null, 16428);
    public final C00i A02 = 1BQ.A02(98745);
    public final C00i A01 = 1BV.A01((1BY) null, 131330);

    public Kri(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public Khe A00(String str) {
        Khe khe;
        synchronized (this) {
            this.A01.get();
            khe = (Khe) ((BFP) 1Lo.A09(1Fw.A06(this.A03.get()), this.A00, 82707)).A00(str);
        }
        return khe;
    }

    public Khf A01(String str) {
        Khf khf;
        synchronized (this) {
            BFP bfp = (BFP) 1Lo.A09(1Fw.A06(this.A03.get()), this.A00, 82707);
            synchronized (bfp) {
                khf = (Khf) ((JTp) bfp).A00.A05(str);
            }
        }
        return khf;
    }
}
