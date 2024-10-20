package X;

/* loaded from: G5d.class */
public final class G5d implements Runnable {
    public static final String __redex_internal_original_name = "InternalFbEffectManagerFactory$1";
    public final /* synthetic */ GEG A00;
    public final /* synthetic */ GEL A01;
    public final /* synthetic */ Ekr A02;
    public final /* synthetic */ F6Y A03;
    public final /* synthetic */ GKc A04;

    public G5d(GEG geg, GEL gel, Ekr ekr, F6Y f6y, GKc gKc) {
        this.A03 = f6y;
        this.A00 = geg;
        this.A02 = ekr;
        this.A01 = gel;
        this.A04 = gKc;
    }

    @Override // java.lang.Runnable
    public void run() {
        F6Y f6y = this.A03;
        if (f6y.A07 == null) {
            F6Y.A00(this.A01, this.A02, f6y, this.A04);
        }
        this.A00.Bvg(f6y.A07);
    }
}
