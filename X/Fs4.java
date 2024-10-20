package X;

/* loaded from: Fs4.class */
public final class Fs4 implements 5To {
    public GHA A00;
    public final 5Tn A01;

    public Fs4(5Tn r302) {
        this.A01 = r302;
    }

    public void A00(GHA gha) {
        synchronized (this) {
            if (this.A00 != gha) {
                return;
            }
            this.A00 = null;
            this.A01.Ceh(this);
        }
    }

    public /* bridge */ /* synthetic */ void CbI(Object obj) {
        Egi egi = (Egi) obj;
        synchronized (this) {
            GHA gha = this.A00;
            if (gha == null) {
                return;
            }
            gha.CHJ(egi);
        }
    }

    public /* bridge */ /* synthetic */ void CbM(Object obj) {
        Egi egi = (Egi) obj;
        if (egi != null) {
            synchronized (this) {
                GHA gha = this.A00;
                if (gha == null) {
                    return;
                }
                gha.CHJ(egi);
            }
        }
    }
}
