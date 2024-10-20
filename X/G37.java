package X;

/* loaded from: G37.class */
public final class G37 implements Runnable {
    public static final String __redex_internal_original_name = "RemixNativeIntegrationOperation$2";
    public final /* synthetic */ FHC A00;
    public final /* synthetic */ DLL A01;

    public G37(FHC fhc, DLL dll) {
        this.A01 = dll;
        this.A00 = fhc;
    }

    @Override // java.lang.Runnable
    public void run() {
        DLL dll = this.A01;
        dll.A02.D0N(dll.A00(true), this.A00, true);
        1BK.A0U(dll.A07).markerPoint(20774913, "Survey Builder Called");
    }
}
