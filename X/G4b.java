package X;

/* loaded from: G4b.class */
public final class G4b implements Runnable {
    public static final String __redex_internal_original_name = "PutEffect$1";
    public final /* synthetic */ GGk A00;
    public final /* synthetic */ EsZ A01;
    public final /* synthetic */ Fu1 A02;

    public G4b(GGk gGk, EsZ esZ, Fu1 fu1) {
        this.A02 = fu1;
        this.A01 = esZ;
        this.A00 = gGk;
    }

    @Override // java.lang.Runnable
    public void run() {
        EsZ esZ = this.A01;
        esZ.A00.A00.ANn(this.A02.A00);
        this.A00.Bvi(null);
    }
}
