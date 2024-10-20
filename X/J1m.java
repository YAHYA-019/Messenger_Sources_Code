package X;

/* loaded from: J1m.class */
public final class J1m implements Runnable {
    public static final String __redex_internal_original_name = "CaptureProcessingCoordinator$9";
    public final /* synthetic */ INY A01;
    public final /* synthetic */ Exception A02;
    public final /* synthetic */ int A00 = 1;
    public final /* synthetic */ boolean A03 = true;

    public J1m(INY iny, Exception exc) {
        this.A01 = iny;
        this.A02 = exc;
    }

    @Override // java.lang.Runnable
    public void run() {
        INY iny = this.A01;
        iny.A05.A02.BwX(this.A02, 0S2.A00, iny.A0H);
        INY.A01(iny);
    }
}
