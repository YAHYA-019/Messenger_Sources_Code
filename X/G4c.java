package X;

/* loaded from: G4c.class */
public final class G4c implements Runnable {
    public static final String __redex_internal_original_name = "MicroTimerServiceHandler$1";
    public final /* synthetic */ 3oI A00;
    public final /* synthetic */ EEO A01;
    public final /* synthetic */ Fto A02;

    public G4c(3oI r302, EEO eeo, Fto fto) {
        this.A02 = fto;
        this.A00 = r302;
        this.A01 = eeo;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A00.ANn(new EDN(this.A01));
    }
}
